// Generated from /home/mrfiskerton/Documents/University-tasks/Translation/3rd_lab/С_obfuscator/src/C.g4 by ANTLR 4.7

import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, Identifier=33, IntConst=34, Whitespace=35, Newline=36, LineComment=37;
	public static final int
		RULE_start = 0, RULE_includes = 1, RULE_include = 2, RULE_main = 3, RULE_conditionStatement = 4, 
		RULE_forStatement = 5, RULE_forBody = 6, RULE_expressionStatement = 7, 
		RULE_compoundStatement = 8, RULE_items = 9, RULE_item = 10, RULE_declaration = 11, 
		RULE_multi_declaration = 12, RULE_simple_declaration = 13, RULE_statement = 14, 
		RULE_expression = 15, RULE_assignOperator = 16, RULE_assignExpression = 17, 
		RULE_orCondition = 18, RULE_andCondition = 19, RULE_eqCondition = 20, 
		RULE_relCondition = 21, RULE_additive = 22, RULE_multiple = 23, RULE_unary = 24, 
		RULE_primary = 25, RULE_type = 26, RULE_constant = 27;
	public static final String[] ruleNames = {
		"start", "includes", "include", "main", "conditionStatement", "forStatement", 
		"forBody", "expressionStatement", "compoundStatement", "items", "item", 
		"declaration", "multi_declaration", "simple_declaration", "statement", 
		"expression", "assignOperator", "assignExpression", "orCondition", "andCondition", 
		"eqCondition", "relCondition", "additive", "multiple", "unary", "primary", 
		"type", "constant"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#include'", "'<'", "'>'", "'.h>'", "'int'", "'main'", "'('", "')'", 
		"'{'", "'}'", "'if'", "'else'", "'for'", "';'", "','", "'='", "'*='", 
		"'/='", "'||'", "'&&'", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'void'", 
		"'char'", "'short'", "'float'", "'double'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "Identifier", "IntConst", 
		"Whitespace", "Newline", "LineComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "C.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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


	public CParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public IncludesContext includes() {
			return getRuleContext(IncludesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CParser.EOF, 0); }
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			includes();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(57);
				main();
				}
			}

			setState(60);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncludesContext extends ParserRuleContext {
		public IncludeContext include() {
			return getRuleContext(IncludeContext.class,0);
		}
		public IncludesContext includes() {
			return getRuleContext(IncludesContext.class,0);
		}
		public IncludesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterIncludes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitIncludes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitIncludes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludesContext includes() throws RecognitionException {
		IncludesContext _localctx = new IncludesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_includes);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				include();
				setState(63);
				includes();
				}
				break;
			case EOF:
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncludeContext extends ParserRuleContext {
		public Token i;
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitInclude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_include);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(T__0);
				setState(69);
				match(T__1);
				setState(70);
				((IncludeContext)_localctx).i = match(Identifier);
				setState(71);
				match(T__2);
				write("#include <" + (((IncludeContext)_localctx).i!=null?((IncludeContext)_localctx).i.getText():null) + ">\n");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(T__0);
				setState(74);
				match(T__1);
				setState(75);
				((IncludeContext)_localctx).i = match(Identifier);
				setState(76);
				match(T__3);
				write("#include <" + (((IncludeContext)_localctx).i!=null?((IncludeContext)_localctx).i.getText():null) + ".h>\n");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__4);
			setState(81);
			match(T__5);
			setState(82);
			match(T__6);
			setState(83);
			match(T__7);
			write("\nint main () ");
			setState(85);
			match(T__8);
			write("{\n");
			setState(87);
			items(4);
			setState(88);
			match(T__9);
			write("}");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionStatementContext extends ParserRuleContext {
		public int amount;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<CompoundStatementContext> compoundStatement() {
			return getRuleContexts(CompoundStatementContext.class);
		}
		public CompoundStatementContext compoundStatement(int i) {
			return getRuleContext(CompoundStatementContext.class,i);
		}
		public ConditionStatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ConditionStatementContext(ParserRuleContext parent, int invokingState, int amount) {
			super(parent, invokingState);
			this.amount = amount;
		}
		@Override public int getRuleIndex() { return RULE_conditionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterConditionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitConditionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitConditionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionStatementContext conditionStatement(int amount) throws RecognitionException {
		ConditionStatementContext _localctx = new ConditionStatementContext(_ctx, getState(), amount);
		enterRule(_localctx, 8, RULE_conditionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__10);
			setState(92);
			match(T__6);
			write("if (");
			setState(94);
			expression();
			setState(95);
			match(T__7);
			write(")\n");tabs(amount);
			setState(97);
			compoundStatement(amount);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(98);
				match(T__11);
				write("\n");tabs(amount);write("else\n");tabs(amount);
				setState(100);
				compoundStatement(amount);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public int amount;
		public ForBodyContext forBody() {
			return getRuleContext(ForBodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Simple_declarationContext simple_declaration() {
			return getRuleContext(Simple_declarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ForStatementContext(ParserRuleContext parent, int invokingState, int amount) {
			super(parent, invokingState);
			this.amount = amount;
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement(int amount) throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState(), amount);
		enterRule(_localctx, 10, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__12);
			setState(104);
			match(T__6);
			write("for (");
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) {
				{
				setState(106);
				type();
				setState(107);
				simple_declaration();
				}
			}

			setState(111);
			match(T__13);
			write(";");
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << Identifier) | (1L << IntConst))) != 0)) {
				{
				setState(113);
				expression();
				}
			}

			setState(116);
			match(T__13);
			write(";");
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << Identifier) | (1L << IntConst))) != 0)) {
				{
				setState(118);
				expression();
				}
			}

			setState(121);
			match(T__7);
			write(")\n");tabs(amount);
			setState(123);
			forBody(amount);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForBodyContext extends ParserRuleContext {
		public int amount;
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
		}
		public ForBodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ForBodyContext(ParserRuleContext parent, int invokingState, int amount) {
			super(parent, invokingState);
			this.amount = amount;
		}
		@Override public int getRuleIndex() { return RULE_forBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterForBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitForBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitForBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBodyContext forBody(int amount) throws RecognitionException {
		ForBodyContext _localctx = new ForBodyContext(_ctx, getState(), amount);
		enterRule(_localctx, 12, RULE_forBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__8);
			write("{\n");
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << Identifier) | (1L << IntConst))) != 0)) {
				{
				setState(127);
				items(amount + 4);
				}
			}

			setState(130);
			match(T__9);
			tabs(amount);write("}");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public int amount;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState, int amount) {
			super(parent, invokingState);
			this.amount = amount;
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement(int amount) throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState(), amount);
		enterRule(_localctx, 14, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << Identifier) | (1L << IntConst))) != 0)) {
				{
				setState(133);
				expression();
				}
			}

			setState(136);
			match(T__13);
			write(";");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public int amount;
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState, int amount) {
			super(parent, invokingState);
			this.amount = amount;
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement(int amount) throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState(), amount);
		enterRule(_localctx, 16, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__8);
			write("{\n");
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << Identifier) | (1L << IntConst))) != 0)) {
				{
				setState(141);
				items(amount + 4);
				}
			}

			setState(144);
			match(T__9);
			tabs(amount);write("}");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemsContext extends ParserRuleContext {
		public int amount;
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
		}
		public ItemsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ItemsContext(ParserRuleContext parent, int invokingState, int amount) {
			super(parent, invokingState);
			this.amount = amount;
		}
		@Override public int getRuleIndex() { return RULE_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemsContext items(int amount) throws RecognitionException {
		ItemsContext _localctx = new ItemsContext(_ctx, getState(), amount);
		enterRule(_localctx, 18, RULE_items);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				item(amount);
				write("\n");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				item(amount);
				write("\n");
				setState(152);
				items(amount);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemContext extends ParserRuleContext {
		public int amount;
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ItemContext(ParserRuleContext parent, int invokingState, int amount) {
			super(parent, invokingState);
			this.amount = amount;
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item(int amount) throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState(), amount);
		enterRule(_localctx, 20, RULE_item);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				tabs(amount);
				setState(157);
				declaration();
				}
				break;
			case T__6:
			case T__8:
			case T__10:
			case T__12:
			case T__13:
			case Identifier:
			case IntConst:
				enterOuterAlt(_localctx, 2);
				{
				tabs(amount);
				setState(159);
				statement(amount);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Multi_declarationContext multi_declaration() {
			return getRuleContext(Multi_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			type();
			setState(163);
			multi_declaration();
			setState(164);
			match(T__13);
			write(";");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multi_declarationContext extends ParserRuleContext {
		public Simple_declarationContext simple_declaration() {
			return getRuleContext(Simple_declarationContext.class,0);
		}
		public Multi_declarationContext multi_declaration() {
			return getRuleContext(Multi_declarationContext.class,0);
		}
		public Multi_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterMulti_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitMulti_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitMulti_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multi_declarationContext multi_declaration() throws RecognitionException {
		Multi_declarationContext _localctx = new Multi_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multi_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			simple_declaration();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(168);
				match(T__14);
				write(",");
				setState(170);
				multi_declaration();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_declarationContext extends ParserRuleContext {
		public Token i;
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public Simple_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterSimple_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitSimple_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitSimple_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_declarationContext simple_declaration() throws RecognitionException {
		Simple_declarationContext _localctx = new Simple_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simple_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			((Simple_declarationContext)_localctx).i = match(Identifier);
			declareIdentifier((((Simple_declarationContext)_localctx).i!=null?((Simple_declarationContext)_localctx).i.getText():null)); write(" " + obfuscate((((Simple_declarationContext)_localctx).i!=null?((Simple_declarationContext)_localctx).i.getText():null))); 
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(175);
				match(T__15);
				write(" = ");
				setState(177);
				assignExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public int amount;
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ConditionStatementContext conditionStatement() {
			return getRuleContext(ConditionStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState, int amount) {
			super(parent, invokingState);
			this.amount = amount;
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement(int amount) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), amount);
		enterRule(_localctx, 28, RULE_statement);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				compoundStatement(amount);
				}
				break;
			case T__6:
			case T__13:
			case Identifier:
			case IntConst:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				expressionStatement(amount);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				conditionStatement(amount);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				forStatement(amount);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			assignExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignOperatorContext extends ParserRuleContext {
		public AssignOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAssignOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAssignOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitAssignOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignOperatorContext assignOperator() throws RecognitionException {
		AssignOperatorContext _localctx = new AssignOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignOperator);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(T__15);
				write(" = ");
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(T__16);
				write(" *= ");
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				match(T__17);
				write(" /= ");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignExpressionContext extends ParserRuleContext {
		public OrConditionContext orCondition() {
			return getRuleContext(OrConditionContext.class,0);
		}
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public AssignOperatorContext assignOperator() {
			return getRuleContext(AssignOperatorContext.class,0);
		}
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public AssignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAssignExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignExpressionContext assignExpression() throws RecognitionException {
		AssignExpressionContext _localctx = new AssignExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignExpression);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				orCondition(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				unary();
				setState(198);
				assignOperator();
				setState(199);
				assignExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrConditionContext extends ParserRuleContext {
		public AndConditionContext andCondition() {
			return getRuleContext(AndConditionContext.class,0);
		}
		public OrConditionContext orCondition() {
			return getRuleContext(OrConditionContext.class,0);
		}
		public OrConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterOrCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitOrCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitOrCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrConditionContext orCondition() throws RecognitionException {
		return orCondition(0);
	}

	private OrConditionContext orCondition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OrConditionContext _localctx = new OrConditionContext(_ctx, _parentState);
		OrConditionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_orCondition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(204);
			andCondition(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_orCondition);
					setState(206);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(207);
					match(T__18);
					write(" || ");
					setState(209);
					andCondition(0);
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndConditionContext extends ParserRuleContext {
		public EqConditionContext eqCondition() {
			return getRuleContext(EqConditionContext.class,0);
		}
		public AndConditionContext andCondition() {
			return getRuleContext(AndConditionContext.class,0);
		}
		public AndConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAndCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAndCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitAndCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndConditionContext andCondition() throws RecognitionException {
		return andCondition(0);
	}

	private AndConditionContext andCondition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndConditionContext _localctx = new AndConditionContext(_ctx, _parentState);
		AndConditionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_andCondition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(216);
			eqCondition(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andCondition);
					setState(218);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(219);
					match(T__19);
					write(" && ");
					setState(221);
					eqCondition(0);
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqConditionContext extends ParserRuleContext {
		public RelConditionContext relCondition() {
			return getRuleContext(RelConditionContext.class,0);
		}
		public EqConditionContext eqCondition() {
			return getRuleContext(EqConditionContext.class,0);
		}
		public EqConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterEqCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitEqCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitEqCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqConditionContext eqCondition() throws RecognitionException {
		return eqCondition(0);
	}

	private EqConditionContext eqCondition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqConditionContext _localctx = new EqConditionContext(_ctx, _parentState);
		EqConditionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_eqCondition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(228);
			relCondition(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(238);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new EqConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eqCondition);
						setState(230);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(231);
						match(T__20);
						write(" == ");
						setState(233);
						relCondition(0);
						}
						break;
					case 2:
						{
						_localctx = new EqConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eqCondition);
						setState(234);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(235);
						match(T__21);
						write(" != ");
						setState(237);
						relCondition(0);
						}
						break;
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelConditionContext extends ParserRuleContext {
		public AdditiveContext additive() {
			return getRuleContext(AdditiveContext.class,0);
		}
		public RelConditionContext relCondition() {
			return getRuleContext(RelConditionContext.class,0);
		}
		public RelConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterRelCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitRelCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitRelCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelConditionContext relCondition() throws RecognitionException {
		return relCondition(0);
	}

	private RelConditionContext relCondition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelConditionContext _localctx = new RelConditionContext(_ctx, _parentState);
		RelConditionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_relCondition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(244);
			additive(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(254);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new RelConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relCondition);
						setState(246);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(247);
						match(T__1);
						write(" < ");
						setState(249);
						additive(0);
						}
						break;
					case 2:
						{
						_localctx = new RelConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relCondition);
						setState(250);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(251);
						match(T__2);
						write(" > ");
						setState(253);
						additive(0);
						}
						break;
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveContext extends ParserRuleContext {
		public MultipleContext multiple() {
			return getRuleContext(MultipleContext.class,0);
		}
		public AdditiveContext additive() {
			return getRuleContext(AdditiveContext.class,0);
		}
		public AdditiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAdditive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitAdditive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveContext additive() throws RecognitionException {
		return additive(0);
	}

	private AdditiveContext additive(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveContext _localctx = new AdditiveContext(_ctx, _parentState);
		AdditiveContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_additive, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(260);
			multiple(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(270);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additive);
						setState(262);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(263);
						match(T__22);
						write(" + ");
						setState(265);
						multiple(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additive);
						setState(266);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(267);
						match(T__23);
						write(" - ");
						setState(269);
						multiple(0);
						}
						break;
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultipleContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public MultipleContext multiple() {
			return getRuleContext(MultipleContext.class,0);
		}
		public MultipleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterMultiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitMultiple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitMultiple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleContext multiple() throws RecognitionException {
		return multiple(0);
	}

	private MultipleContext multiple(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultipleContext _localctx = new MultipleContext(_ctx, _parentState);
		MultipleContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_multiple, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(276);
			unary();
			}
			_ctx.stop = _input.LT(-1);
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(286);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new MultipleContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiple);
						setState(278);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(279);
						match(T__24);
						write(" * ");
						setState(281);
						unary();
						}
						break;
					case 2:
						{
						_localctx = new MultipleContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiple);
						setState(282);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(283);
						match(T__25);
						write(" / ");
						setState(285);
						unary();
						}
						break;
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			primary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public Token i;
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_primary);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				((PrimaryContext)_localctx).i = match(Identifier);
				write(obfuscate((((PrimaryContext)_localctx).i!=null?((PrimaryContext)_localctx).i.getText():null)));
				}
				break;
			case IntConst:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				constant();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				match(T__6);
				write("(");
				setState(298);
				expression();
				setState(299);
				match(T__7);
				write(")");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_type);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(T__26);
				write("void");
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(T__27);
				write("char");
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				match(T__28);
				write("short");
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				match(T__4);
				write("int");
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(312);
				match(T__29);
				write("float");
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 6);
				{
				setState(314);
				match(T__30);
				write("double");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public Token i;
		public List<TerminalNode> IntConst() { return getTokens(CParser.IntConst); }
		public TerminalNode IntConst(int i) {
			return getToken(CParser.IntConst, i);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constant);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				((ConstantContext)_localctx).i = match(IntConst);
				write((((ConstantContext)_localctx).i!=null?((ConstantContext)_localctx).i.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				((ConstantContext)_localctx).i = match(IntConst);
				write((((ConstantContext)_localctx).i!=null?((ConstantContext)_localctx).i.getText():null));
				setState(322);
				match(T__31);
				write(".");
				setState(324);
				((ConstantContext)_localctx).i = match(IntConst);
				write((((ConstantContext)_localctx).i!=null?((ConstantContext)_localctx).i.getText():null));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return orCondition_sempred((OrConditionContext)_localctx, predIndex);
		case 19:
			return andCondition_sempred((AndConditionContext)_localctx, predIndex);
		case 20:
			return eqCondition_sempred((EqConditionContext)_localctx, predIndex);
		case 21:
			return relCondition_sempred((RelConditionContext)_localctx, predIndex);
		case 22:
			return additive_sempred((AdditiveContext)_localctx, predIndex);
		case 23:
			return multiple_sempred((MultipleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean orCondition_sempred(OrConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andCondition_sempred(AndConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean eqCondition_sempred(EqConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relCondition_sempred(RelConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additive_sempred(AdditiveContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiple_sempred(MultipleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u014b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\5\2=\n\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\5\3E\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Q\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6h\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7p\n\7\3\7\3\7\3\7\5"+
		"\7u\n\7\3\7\3\7\3\7\5\7z\n\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u0083\n\b"+
		"\3\b\3\b\3\b\3\t\5\t\u0089\n\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u0091\n\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009d\n\13\3\f\3\f"+
		"\3\f\3\f\5\f\u00a3\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00ae"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00b5\n\17\3\20\3\20\3\20\3\20\5\20"+
		"\u00bb\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c5\n\22\3"+
		"\23\3\23\3\23\3\23\3\23\5\23\u00cc\n\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u00d5\n\24\f\24\16\24\u00d8\13\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u00e1\n\25\f\25\16\25\u00e4\13\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00f1\n\26\f\26\16\26\u00f4\13"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0101"+
		"\n\27\f\27\16\27\u0104\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\7\30\u0111\n\30\f\30\16\30\u0114\13\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0121\n\31\f\31\16\31\u0124"+
		"\13\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0131"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u013f\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0149\n\35\3"+
		"\35\2\b&(*,.\60\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668\2\2\2\u0154\2:\3\2\2\2\4D\3\2\2\2\6P\3\2\2\2\bR\3\2\2\2\n]"+
		"\3\2\2\2\fi\3\2\2\2\16\177\3\2\2\2\20\u0088\3\2\2\2\22\u008d\3\2\2\2\24"+
		"\u009c\3\2\2\2\26\u00a2\3\2\2\2\30\u00a4\3\2\2\2\32\u00a9\3\2\2\2\34\u00af"+
		"\3\2\2\2\36\u00ba\3\2\2\2 \u00bc\3\2\2\2\"\u00c4\3\2\2\2$\u00cb\3\2\2"+
		"\2&\u00cd\3\2\2\2(\u00d9\3\2\2\2*\u00e5\3\2\2\2,\u00f5\3\2\2\2.\u0105"+
		"\3\2\2\2\60\u0115\3\2\2\2\62\u0125\3\2\2\2\64\u0130\3\2\2\2\66\u013e\3"+
		"\2\2\28\u0148\3\2\2\2:<\5\4\3\2;=\5\b\5\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2"+
		"\2>?\7\2\2\3?\3\3\2\2\2@A\5\6\4\2AB\5\4\3\2BE\3\2\2\2CE\3\2\2\2D@\3\2"+
		"\2\2DC\3\2\2\2E\5\3\2\2\2FG\7\3\2\2GH\7\4\2\2HI\7#\2\2IJ\7\5\2\2JQ\b\4"+
		"\1\2KL\7\3\2\2LM\7\4\2\2MN\7#\2\2NO\7\6\2\2OQ\b\4\1\2PF\3\2\2\2PK\3\2"+
		"\2\2Q\7\3\2\2\2RS\7\7\2\2ST\7\b\2\2TU\7\t\2\2UV\7\n\2\2VW\b\5\1\2WX\7"+
		"\13\2\2XY\b\5\1\2YZ\5\24\13\2Z[\7\f\2\2[\\\b\5\1\2\\\t\3\2\2\2]^\7\r\2"+
		"\2^_\7\t\2\2_`\b\6\1\2`a\5 \21\2ab\7\n\2\2bc\b\6\1\2cg\5\22\n\2de\7\16"+
		"\2\2ef\b\6\1\2fh\5\22\n\2gd\3\2\2\2gh\3\2\2\2h\13\3\2\2\2ij\7\17\2\2j"+
		"k\7\t\2\2ko\b\7\1\2lm\5\66\34\2mn\5\34\17\2np\3\2\2\2ol\3\2\2\2op\3\2"+
		"\2\2pq\3\2\2\2qr\7\20\2\2rt\b\7\1\2su\5 \21\2ts\3\2\2\2tu\3\2\2\2uv\3"+
		"\2\2\2vw\7\20\2\2wy\b\7\1\2xz\5 \21\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|"+
		"\7\n\2\2|}\b\7\1\2}~\5\16\b\2~\r\3\2\2\2\177\u0080\7\13\2\2\u0080\u0082"+
		"\b\b\1\2\u0081\u0083\5\24\13\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u0085\7\f\2\2\u0085\u0086\b\b\1\2\u0086\17"+
		"\3\2\2\2\u0087\u0089\5 \21\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\7\20\2\2\u008b\u008c\b\t\1\2\u008c\21\3\2\2"+
		"\2\u008d\u008e\7\13\2\2\u008e\u0090\b\n\1\2\u008f\u0091\5\24\13\2\u0090"+
		"\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\f"+
		"\2\2\u0093\u0094\b\n\1\2\u0094\23\3\2\2\2\u0095\u0096\5\26\f\2\u0096\u0097"+
		"\b\13\1\2\u0097\u009d\3\2\2\2\u0098\u0099\5\26\f\2\u0099\u009a\b\13\1"+
		"\2\u009a\u009b\5\24\13\2\u009b\u009d\3\2\2\2\u009c\u0095\3\2\2\2\u009c"+
		"\u0098\3\2\2\2\u009d\25\3\2\2\2\u009e\u009f\b\f\1\2\u009f\u00a3\5\30\r"+
		"\2\u00a0\u00a1\b\f\1\2\u00a1\u00a3\5\36\20\2\u00a2\u009e\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\27\3\2\2\2\u00a4\u00a5\5\66\34\2\u00a5\u00a6\5\32"+
		"\16\2\u00a6\u00a7\7\20\2\2\u00a7\u00a8\b\r\1\2\u00a8\31\3\2\2\2\u00a9"+
		"\u00ad\5\34\17\2\u00aa\u00ab\7\21\2\2\u00ab\u00ac\b\16\1\2\u00ac\u00ae"+
		"\5\32\16\2\u00ad\u00aa\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\33\3\2\2\2\u00af"+
		"\u00b0\7#\2\2\u00b0\u00b4\b\17\1\2\u00b1\u00b2\7\22\2\2\u00b2\u00b3\b"+
		"\17\1\2\u00b3\u00b5\5$\23\2\u00b4\u00b1\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\35\3\2\2\2\u00b6\u00bb\5\22\n\2\u00b7\u00bb\5\20\t\2\u00b8\u00bb\5\n"+
		"\6\2\u00b9\u00bb\5\f\7\2\u00ba\u00b6\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\37\3\2\2\2\u00bc\u00bd\5$\23"+
		"\2\u00bd!\3\2\2\2\u00be\u00bf\7\22\2\2\u00bf\u00c5\b\22\1\2\u00c0\u00c1"+
		"\7\23\2\2\u00c1\u00c5\b\22\1\2\u00c2\u00c3\7\24\2\2\u00c3\u00c5\b\22\1"+
		"\2\u00c4\u00be\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5#"+
		"\3\2\2\2\u00c6\u00cc\5&\24\2\u00c7\u00c8\5\62\32\2\u00c8\u00c9\5\"\22"+
		"\2\u00c9\u00ca\5$\23\2\u00ca\u00cc\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cb\u00c7"+
		"\3\2\2\2\u00cc%\3\2\2\2\u00cd\u00ce\b\24\1\2\u00ce\u00cf\5(\25\2\u00cf"+
		"\u00d6\3\2\2\2\u00d0\u00d1\f\3\2\2\u00d1\u00d2\7\25\2\2\u00d2\u00d3\b"+
		"\24\1\2\u00d3\u00d5\5(\25\2\u00d4\u00d0\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\'\3\2\2\2\u00d8\u00d6\3\2\2\2"+
		"\u00d9\u00da\b\25\1\2\u00da\u00db\5*\26\2\u00db\u00e2\3\2\2\2\u00dc\u00dd"+
		"\f\3\2\2\u00dd\u00de\7\26\2\2\u00de\u00df\b\25\1\2\u00df\u00e1\5*\26\2"+
		"\u00e0\u00dc\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3)\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\b\26\1\2\u00e6"+
		"\u00e7\5,\27\2\u00e7\u00f2\3\2\2\2\u00e8\u00e9\f\4\2\2\u00e9\u00ea\7\27"+
		"\2\2\u00ea\u00eb\b\26\1\2\u00eb\u00f1\5,\27\2\u00ec\u00ed\f\3\2\2\u00ed"+
		"\u00ee\7\30\2\2\u00ee\u00ef\b\26\1\2\u00ef\u00f1\5,\27\2\u00f0\u00e8\3"+
		"\2\2\2\u00f0\u00ec\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3+\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\b\27\1\2"+
		"\u00f6\u00f7\5.\30\2\u00f7\u0102\3\2\2\2\u00f8\u00f9\f\4\2\2\u00f9\u00fa"+
		"\7\4\2\2\u00fa\u00fb\b\27\1\2\u00fb\u0101\5.\30\2\u00fc\u00fd\f\3\2\2"+
		"\u00fd\u00fe\7\5\2\2\u00fe\u00ff\b\27\1\2\u00ff\u0101\5.\30\2\u0100\u00f8"+
		"\3\2\2\2\u0100\u00fc\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103-\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\b\30\1\2"+
		"\u0106\u0107\5\60\31\2\u0107\u0112\3\2\2\2\u0108\u0109\f\4\2\2\u0109\u010a"+
		"\7\31\2\2\u010a\u010b\b\30\1\2\u010b\u0111\5\60\31\2\u010c\u010d\f\3\2"+
		"\2\u010d\u010e\7\32\2\2\u010e\u010f\b\30\1\2\u010f\u0111\5\60\31\2\u0110"+
		"\u0108\3\2\2\2\u0110\u010c\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113/\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116"+
		"\b\31\1\2\u0116\u0117\5\62\32\2\u0117\u0122\3\2\2\2\u0118\u0119\f\4\2"+
		"\2\u0119\u011a\7\33\2\2\u011a\u011b\b\31\1\2\u011b\u0121\5\62\32\2\u011c"+
		"\u011d\f\3\2\2\u011d\u011e\7\34\2\2\u011e\u011f\b\31\1\2\u011f\u0121\5"+
		"\62\32\2\u0120\u0118\3\2\2\2\u0120\u011c\3\2\2\2\u0121\u0124\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\61\3\2\2\2\u0124\u0122\3\2\2"+
		"\2\u0125\u0126\5\64\33\2\u0126\63\3\2\2\2\u0127\u0128\7#\2\2\u0128\u0131"+
		"\b\33\1\2\u0129\u0131\58\35\2\u012a\u012b\7\t\2\2\u012b\u012c\b\33\1\2"+
		"\u012c\u012d\5 \21\2\u012d\u012e\7\n\2\2\u012e\u012f\b\33\1\2\u012f\u0131"+
		"\3\2\2\2\u0130\u0127\3\2\2\2\u0130\u0129\3\2\2\2\u0130\u012a\3\2\2\2\u0131"+
		"\65\3\2\2\2\u0132\u0133\7\35\2\2\u0133\u013f\b\34\1\2\u0134\u0135\7\36"+
		"\2\2\u0135\u013f\b\34\1\2\u0136\u0137\7\37\2\2\u0137\u013f\b\34\1\2\u0138"+
		"\u0139\7\7\2\2\u0139\u013f\b\34\1\2\u013a\u013b\7 \2\2\u013b\u013f\b\34"+
		"\1\2\u013c\u013d\7!\2\2\u013d\u013f\b\34\1\2\u013e\u0132\3\2\2\2\u013e"+
		"\u0134\3\2\2\2\u013e\u0136\3\2\2\2\u013e\u0138\3\2\2\2\u013e\u013a\3\2"+
		"\2\2\u013e\u013c\3\2\2\2\u013f\67\3\2\2\2\u0140\u0141\7$\2\2\u0141\u0149"+
		"\b\35\1\2\u0142\u0143\7$\2\2\u0143\u0144\b\35\1\2\u0144\u0145\7\"\2\2"+
		"\u0145\u0146\b\35\1\2\u0146\u0147\7$\2\2\u0147\u0149\b\35\1\2\u0148\u0140"+
		"\3\2\2\2\u0148\u0142\3\2\2\2\u01499\3\2\2\2 <DPgoty\u0082\u0088\u0090"+
		"\u009c\u00a2\u00ad\u00b4\u00ba\u00c4\u00cb\u00d6\u00e2\u00f0\u00f2\u0100"+
		"\u0102\u0110\u0112\u0120\u0122\u0130\u013e\u0148";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}