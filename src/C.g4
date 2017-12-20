grammar C;
@parser :: header {
import java.util.*;
}
@parser :: members {
private static Map<String, String> identifierMap = new HashMap<String, String>();

static void write(String x) {System.out.print(x);}

static void debug(String x) {System.err.print(x);}

static String last_result = "";

static String generateIdentifier() {
    StringBuilder result = new StringBuilder();
    Random r = new Random();

    final String alphabet = "OI10";

    if (!last_result.isEmpty()) {
        if (last_result.contains("0")) {
            last_result = last_result.replace('0', 'O');
            return last_result;
        } else if (last_result.contains("1")) {
            last_result = last_result.replace('1', 'I');
            return last_result;
        }
        last_result = "";
    }

    int min_length = 5;
    result.append(alphabet.charAt(r.nextInt(alphabet.length() - 2)));
    for (int i = 1; i < r.nextInt(13) + min_length; i++) {
        result.append(alphabet.charAt(r.nextInt(alphabet.length())));
    }
    last_result = result.toString();

    return last_result;
}

static void declareIdentifier(String identifier) {
    String new_identifier;

    //    debug("Declare:" + identifier + "\n");
    //    identifierMap.put(identifier, identifier + "NEW");
    //    return;

    do {
        new_identifier = generateIdentifier();
        //debug(new_identifier);
    } while (identifierMap.containsValue(new_identifier));
    identifierMap.put(identifier, new_identifier);
}


static String obfuscate(String identifier) {
    if(!identifierMap.containsKey(identifier)) {
        declareIdentifier(identifier);
    }
    //debug("identifierMap.get:" + identifierMap.get(identifier) + "\n");
    return identifierMap.get(identifier);
}

static void tabs(int amount) {for(int i=0; i<amount; i++) System.out.print(' ');}

}
start
    :   includes main? EOF;

includes
    :   include includes
    |
    ;

include
    :   '#include' '<' i=Identifier '>' {write("#include <" + $i.text + ">\n");}
    |   '#include' '<' i=Identifier '.h>' {write("#include <" + $i.text + ".h>\n");}
    ;

main
    :   'int' 'main' '(' ')'{write("\nint main () ");} '{'{write("{\n");} items[4]'}'{write("}");} ;

conditionStatement[int amount]
    :   'if' '('{write("if (");} expression ')'{write(")\n");tabs(amount);} compoundStatement[amount]  ('else'{write("\n");tabs(amount);write("else\n");tabs(amount);} compoundStatement[amount])?
    ;

forStatement[int amount]
    :   'for' '('{write("for (");} (type simple_declaration)? ';'{write(";");} (expression)?';'{write(";");} (expression)?')'{write(")\n");tabs(amount);}forBody[amount]
    ;

forBody[int amount]
    : '{'{write("{\n");} items[amount + 4]? '}'{tabs(amount);write("}");}
    ;

expressionStatement[int amount]
    :   expression? ';'{write(";");}
    ;

compoundStatement[int amount]
    :   '{'{write("{\n");} items[amount + 4]? '}'{tabs(amount);write("}");}
    ;

items[int amount]
    :   item[amount]{write("\n");}
    |   item[amount]{write("\n");} items[amount]
    ;

item[int amount]
    :   {tabs(amount);}declaration
    |   {tabs(amount);}statement[amount]
    ;

declaration
    :   type multi_declaration';'{write(";");}
    ;

multi_declaration
    : simple_declaration (','{write(",");} multi_declaration)?
    ;

simple_declaration
    :   i=Identifier{declareIdentifier($i.text); write(" " + obfuscate($i.text)); } ('='{write(" = ");} assignExpression)?
    ;

statement[int amount]
    :   compoundStatement[amount]
    |   expressionStatement[amount]
    |   conditionStatement[amount]
    |   forStatement[amount]
    ;

expression
    :   assignExpression
    ;

assignOperator
    :   '='{write(" = ");}
    |   '*='{write(" *= ");}
    |   '/='{write(" /= ");}
    ;

assignExpression
    :   orCondition
    |   unary assignOperator assignExpression;

orCondition
    :   andCondition 
    |   orCondition '||'{write(" || ");} andCondition
    ;

andCondition
    :   eqCondition 
    |   andCondition '&&'{write(" && ");} eqCondition
    ;

eqCondition
    :   relCondition 
    |   eqCondition '=='{write(" == ");} relCondition
    |   eqCondition '!='{write(" != ");} relCondition
    ;

relCondition
    :   additive
    |   relCondition '<'{write(" < ");} additive
    |   relCondition '>'{write(" > ");} additive
    ;

additive
    :   multiple
    |   additive '+'{write(" + ");} multiple
    |   additive '-'{write(" - ");} multiple;

multiple
    :   unary
    |   multiple '*'{write(" * ");} unary
    |   multiple '/'{write(" / ");} unary;

unary
    :   primary;

primary
    :   i=Identifier {write(obfuscate($i.text));}
    |   constant
    |   '('{write("(");} expression ')'{write(")");}
    ;

type
    :   'void' {write("void");}
    |   'char' {write("char");}
    |   'short' {write("short");}
    |   'int' {write("int");}
    |   'float' {write("float");}
    |   'double'{write("double");}
    ;

constant
    :   i=IntConst {write($i.text);}
    |   i=IntConst {write($i.text);} '.'{write(".");} i=IntConst {write($i.text);}
    ;

Identifier
    :   [a-zA-Z_] ( [a-zA-Z_] | [0-9] )*;

IntConst
    :   [1-9][0-9]*;

Whitespace
    :   [ \t]+ -> skip
    ;

Newline
    :   ('\r' '\n'?|'\n') -> skip
    ;

LineComment
    :   '//' ~[\r\n]* -> skip
    ;