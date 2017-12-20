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
		Identifier=32, IntConst=33, Whitespace=34, Newline=35, LineComment=36;
	public static final int
		RULE_start = 0, RULE_includes = 1, RULE_include = 2, RULE_main = 3, RULE_conditionStatement = 4, 
		RULE_expressionStatement = 5, RULE_compoundStatement = 6, RULE_items = 7, 
		RULE_item = 8, RULE_declaration = 9, RULE_multi_declaration = 10, RULE_simple_declaration = 11, 
		RULE_statement = 12, RULE_expression = 13, RULE_assignOperator = 14, RULE_assignExpression = 15, 
		RULE_orCondition = 16, RULE_andCondition = 17, RULE_eqCondition = 18, 
		RULE_relCondition = 19, RULE_additive = 20, RULE_multiple = 21, RULE_unary = 22, 
		RULE_primary = 23, RULE_type = 24, RULE_constant = 25;
	public static final String[] ruleNames = {
		"start", "includes", "include", "main", "conditionStatement", "expressionStatement", 
		"compoundStatement", "items", "item", "declaration", "multi_declaration", 
		"simple_declaration", "statement", "expression", "assignOperator", "assignExpression", 
		"orCondition", "andCondition", "eqCondition", "relCondition", "additive", 
		"multiple", "unary", "primary", "type", "constant"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#include'", "'<'", "'>'", "'.h>'", "'int'", "'main'", "'('", "')'", 
		"'{'", "'}'", "'if'", "'else'", "';'", "','", "'='", "'*='", "'/='", "'||'", 
		"'&&'", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'void'", "'char'", 
		"'short'", "'float'", "'double'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "Identifier", "IntConst", 
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
			setState(52);
			includes();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(53);
				main();
				}
			}

			setState(56);
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
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				include();
				setState(59);
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
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(T__0);
				setState(65);
				match(T__1);
				setState(66);
				((IncludeContext)_localctx).i = match(Identifier);
				setState(67);
				match(T__2);
				write("#include <" + (((IncludeContext)_localctx).i!=null?((IncludeContext)_localctx).i.getText():null) + ">\n");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(T__0);
				setState(70);
				match(T__1);
				setState(71);
				((IncludeContext)_localctx).i = match(Identifier);
				setState(72);
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
			setState(76);
			match(T__4);
			setState(77);
			match(T__5);
			setState(78);
			match(T__6);
			setState(79);
			match(T__7);
			write("\nint main () ");
			setState(81);
			match(T__8);
			write("{\n");
			setState(83);
			items(4);
			setState(84);
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
			setState(87);
			match(T__10);
			setState(88);
			match(T__6);
			write("if (");
			setState(90);
			expression();
			setState(91);
			match(T__7);
			write(")\n");tabs(amount);
			setState(93);
			compoundStatement(amount);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(94);
				match(T__11);
				write("\n");tabs(amount);write("else\n");tabs(amount);
				setState(96);
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
		enterRule(_localctx, 10, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << Identifier) | (1L << IntConst))) != 0)) {
				{
				setState(99);
				expression();
				}
			}

			setState(102);
			match(T__12);
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
		enterRule(_localctx, 12, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__8);
			write("{\n");
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << Identifier) | (1L << IntConst))) != 0)) {
				{
				setState(107);
				items(amount + 4);
				}
			}

			setState(110);
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
		enterRule(_localctx, 14, RULE_items);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				item(amount);
				write("\n");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				item(amount);
				write("\n");
				setState(118);
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
		enterRule(_localctx, 16, RULE_item);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				tabs(amount);
				setState(123);
				declaration();
				}
				break;
			case T__6:
			case T__8:
			case T__10:
			case T__12:
			case Identifier:
			case IntConst:
				enterOuterAlt(_localctx, 2);
				{
				tabs(amount);
				setState(125);
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
		enterRule(_localctx, 18, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			type();
			setState(129);
			multi_declaration();
			setState(130);
			match(T__12);
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
		enterRule(_localctx, 20, RULE_multi_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			simple_declaration();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(134);
				match(T__13);
				write(",");
				setState(136);
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
		enterRule(_localctx, 22, RULE_simple_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			((Simple_declarationContext)_localctx).i = match(Identifier);
			declareIdentifier((((Simple_declarationContext)_localctx).i!=null?((Simple_declarationContext)_localctx).i.getText():null)); write(" " + obfuscate((((Simple_declarationContext)_localctx).i!=null?((Simple_declarationContext)_localctx).i.getText():null))); 
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(141);
				match(T__14);
				write("= ");
				setState(143);
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
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				compoundStatement(amount);
				}
				break;
			case T__6:
			case T__12:
			case Identifier:
			case IntConst:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				expressionStatement(amount);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				conditionStatement(amount);
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
		enterRule(_localctx, 26, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
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
		enterRule(_localctx, 28, RULE_assignOperator);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(T__14);
				write(" = ");
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(T__15);
				write(" *= ");
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(T__16);
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
		enterRule(_localctx, 30, RULE_assignExpression);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				orCondition(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				unary();
				setState(163);
				assignOperator();
				setState(164);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_orCondition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(169);
			andCondition(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_orCondition);
					setState(171);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(172);
					match(T__17);
					write(" || ");
					setState(174);
					andCondition(0);
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_andCondition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(181);
			eqCondition(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andCondition);
					setState(183);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(184);
					match(T__18);
					write(" && ");
					setState(186);
					eqCondition(0);
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_eqCondition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(193);
			relCondition(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new EqConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eqCondition);
						setState(195);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(196);
						match(T__19);
						write(" == ");
						setState(198);
						relCondition(0);
						}
						break;
					case 2:
						{
						_localctx = new EqConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eqCondition);
						setState(199);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(200);
						match(T__20);
						write(" != ");
						setState(202);
						relCondition(0);
						}
						break;
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_relCondition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(209);
			additive(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(219);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new RelConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relCondition);
						setState(211);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(212);
						match(T__1);
						write(" < ");
						setState(214);
						additive(0);
						}
						break;
					case 2:
						{
						_localctx = new RelConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relCondition);
						setState(215);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(216);
						match(T__2);
						write(" > ");
						setState(218);
						additive(0);
						}
						break;
					}
					} 
				}
				setState(223);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_additive, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(225);
			multiple(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(235);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additive);
						setState(227);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(228);
						match(T__21);
						write(" + ");
						setState(230);
						multiple(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additive);
						setState(231);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(232);
						match(T__22);
						write(" - ");
						setState(234);
						multiple(0);
						}
						break;
					}
					} 
				}
				setState(239);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_multiple, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(241);
			unary();
			}
			_ctx.stop = _input.LT(-1);
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(251);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new MultipleContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiple);
						setState(243);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(244);
						match(T__23);
						write(" * ");
						setState(246);
						unary();
						}
						break;
					case 2:
						{
						_localctx = new MultipleContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiple);
						setState(247);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(248);
						match(T__24);
						write(" / ");
						setState(250);
						unary();
						}
						break;
					}
					} 
				}
				setState(255);
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
		enterRule(_localctx, 44, RULE_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
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
		enterRule(_localctx, 46, RULE_primary);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				((PrimaryContext)_localctx).i = match(Identifier);
				write(obfuscate((((PrimaryContext)_localctx).i!=null?((PrimaryContext)_localctx).i.getText():null)));
				}
				break;
			case IntConst:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				constant();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(T__6);
				write("(");
				setState(263);
				expression();
				setState(264);
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
		enterRule(_localctx, 48, RULE_type);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(T__25);
				write("void");
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(T__26);
				write("char");
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				match(T__27);
				write("short");
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
				match(T__4);
				write("int");
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
				match(T__28);
				write("float");
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 6);
				{
				setState(279);
				match(T__29);
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
		enterRule(_localctx, 50, RULE_constant);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				((ConstantContext)_localctx).i = match(IntConst);
				write((((ConstantContext)_localctx).i!=null?((ConstantContext)_localctx).i.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				((ConstantContext)_localctx).i = match(IntConst);
				write((((ConstantContext)_localctx).i!=null?((ConstantContext)_localctx).i.getText():null));
				setState(287);
				match(T__30);
				write(".");
				setState(289);
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
		case 16:
			return orCondition_sempred((OrConditionContext)_localctx, predIndex);
		case 17:
			return andCondition_sempred((AndConditionContext)_localctx, predIndex);
		case 18:
			return eqCondition_sempred((EqConditionContext)_localctx, predIndex);
		case 19:
			return relCondition_sempred((RelConditionContext)_localctx, predIndex);
		case 20:
			return additive_sempred((AdditiveContext)_localctx, predIndex);
		case 21:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0128\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\5\29\n\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3A\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4M\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6d"+
		"\n\6\3\7\5\7g\n\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bo\n\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t{\n\t\3\n\3\n\3\n\3\n\5\n\u0081\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u008c\n\f\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u0093\n\r\3\16\3\16\3\16\5\16\u0098\n\16\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00a2\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u00a9\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00b2\n\22\f\22\16\22\u00b5\13"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00be\n\23\f\23\16\23\u00c1"+
		"\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00ce"+
		"\n\24\f\24\16\24\u00d1\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\7\25\u00de\n\25\f\25\16\25\u00e1\13\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00ee\n\26\f\26\16\26\u00f1"+
		"\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00fe"+
		"\n\27\f\27\16\27\u0101\13\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\5\31\u010e\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u011c\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0126\n\33\3\33\2\b\"$&(*,\34\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\2\2\2\u012e\2\66\3\2\2\2\4@\3\2\2\2\6L\3\2"+
		"\2\2\bN\3\2\2\2\nY\3\2\2\2\ff\3\2\2\2\16k\3\2\2\2\20z\3\2\2\2\22\u0080"+
		"\3\2\2\2\24\u0082\3\2\2\2\26\u0087\3\2\2\2\30\u008d\3\2\2\2\32\u0097\3"+
		"\2\2\2\34\u0099\3\2\2\2\36\u00a1\3\2\2\2 \u00a8\3\2\2\2\"\u00aa\3\2\2"+
		"\2$\u00b6\3\2\2\2&\u00c2\3\2\2\2(\u00d2\3\2\2\2*\u00e2\3\2\2\2,\u00f2"+
		"\3\2\2\2.\u0102\3\2\2\2\60\u010d\3\2\2\2\62\u011b\3\2\2\2\64\u0125\3\2"+
		"\2\2\668\5\4\3\2\679\5\b\5\28\67\3\2\2\289\3\2\2\29:\3\2\2\2:;\7\2\2\3"+
		";\3\3\2\2\2<=\5\6\4\2=>\5\4\3\2>A\3\2\2\2?A\3\2\2\2@<\3\2\2\2@?\3\2\2"+
		"\2A\5\3\2\2\2BC\7\3\2\2CD\7\4\2\2DE\7\"\2\2EF\7\5\2\2FM\b\4\1\2GH\7\3"+
		"\2\2HI\7\4\2\2IJ\7\"\2\2JK\7\6\2\2KM\b\4\1\2LB\3\2\2\2LG\3\2\2\2M\7\3"+
		"\2\2\2NO\7\7\2\2OP\7\b\2\2PQ\7\t\2\2QR\7\n\2\2RS\b\5\1\2ST\7\13\2\2TU"+
		"\b\5\1\2UV\5\20\t\2VW\7\f\2\2WX\b\5\1\2X\t\3\2\2\2YZ\7\r\2\2Z[\7\t\2\2"+
		"[\\\b\6\1\2\\]\5\34\17\2]^\7\n\2\2^_\b\6\1\2_c\5\16\b\2`a\7\16\2\2ab\b"+
		"\6\1\2bd\5\16\b\2c`\3\2\2\2cd\3\2\2\2d\13\3\2\2\2eg\5\34\17\2fe\3\2\2"+
		"\2fg\3\2\2\2gh\3\2\2\2hi\7\17\2\2ij\b\7\1\2j\r\3\2\2\2kl\7\13\2\2ln\b"+
		"\b\1\2mo\5\20\t\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\f\2\2qr\b\b\1\2r\17"+
		"\3\2\2\2st\5\22\n\2tu\b\t\1\2u{\3\2\2\2vw\5\22\n\2wx\b\t\1\2xy\5\20\t"+
		"\2y{\3\2\2\2zs\3\2\2\2zv\3\2\2\2{\21\3\2\2\2|}\b\n\1\2}\u0081\5\24\13"+
		"\2~\177\b\n\1\2\177\u0081\5\32\16\2\u0080|\3\2\2\2\u0080~\3\2\2\2\u0081"+
		"\23\3\2\2\2\u0082\u0083\5\62\32\2\u0083\u0084\5\26\f\2\u0084\u0085\7\17"+
		"\2\2\u0085\u0086\b\13\1\2\u0086\25\3\2\2\2\u0087\u008b\5\30\r\2\u0088"+
		"\u0089\7\20\2\2\u0089\u008a\b\f\1\2\u008a\u008c\5\26\f\2\u008b\u0088\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\27\3\2\2\2\u008d\u008e\7\"\2\2\u008e"+
		"\u0092\b\r\1\2\u008f\u0090\7\21\2\2\u0090\u0091\b\r\1\2\u0091\u0093\5"+
		" \21\2\u0092\u008f\3\2\2\2\u0092\u0093\3\2\2\2\u0093\31\3\2\2\2\u0094"+
		"\u0098\5\16\b\2\u0095\u0098\5\f\7\2\u0096\u0098\5\n\6\2\u0097\u0094\3"+
		"\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\33\3\2\2\2\u0099"+
		"\u009a\5 \21\2\u009a\35\3\2\2\2\u009b\u009c\7\21\2\2\u009c\u00a2\b\20"+
		"\1\2\u009d\u009e\7\22\2\2\u009e\u00a2\b\20\1\2\u009f\u00a0\7\23\2\2\u00a0"+
		"\u00a2\b\20\1\2\u00a1\u009b\3\2\2\2\u00a1\u009d\3\2\2\2\u00a1\u009f\3"+
		"\2\2\2\u00a2\37\3\2\2\2\u00a3\u00a9\5\"\22\2\u00a4\u00a5\5.\30\2\u00a5"+
		"\u00a6\5\36\20\2\u00a6\u00a7\5 \21\2\u00a7\u00a9\3\2\2\2\u00a8\u00a3\3"+
		"\2\2\2\u00a8\u00a4\3\2\2\2\u00a9!\3\2\2\2\u00aa\u00ab\b\22\1\2\u00ab\u00ac"+
		"\5$\23\2\u00ac\u00b3\3\2\2\2\u00ad\u00ae\f\3\2\2\u00ae\u00af\7\24\2\2"+
		"\u00af\u00b0\b\22\1\2\u00b0\u00b2\5$\23\2\u00b1\u00ad\3\2\2\2\u00b2\u00b5"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4#\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b7\b\23\1\2\u00b7\u00b8\5&\24\2\u00b8\u00bf\3"+
		"\2\2\2\u00b9\u00ba\f\3\2\2\u00ba\u00bb\7\25\2\2\u00bb\u00bc\b\23\1\2\u00bc"+
		"\u00be\5&\24\2\u00bd\u00b9\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0%\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3"+
		"\b\24\1\2\u00c3\u00c4\5(\25\2\u00c4\u00cf\3\2\2\2\u00c5\u00c6\f\4\2\2"+
		"\u00c6\u00c7\7\26\2\2\u00c7\u00c8\b\24\1\2\u00c8\u00ce\5(\25\2\u00c9\u00ca"+
		"\f\3\2\2\u00ca\u00cb\7\27\2\2\u00cb\u00cc\b\24\1\2\u00cc\u00ce\5(\25\2"+
		"\u00cd\u00c5\3\2\2\2\u00cd\u00c9\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\'\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d3\b\25\1\2\u00d3\u00d4\5*\26\2\u00d4\u00df\3\2\2\2\u00d5\u00d6\f"+
		"\4\2\2\u00d6\u00d7\7\4\2\2\u00d7\u00d8\b\25\1\2\u00d8\u00de\5*\26\2\u00d9"+
		"\u00da\f\3\2\2\u00da\u00db\7\5\2\2\u00db\u00dc\b\25\1\2\u00dc\u00de\5"+
		"*\26\2\u00dd\u00d5\3\2\2\2\u00dd\u00d9\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0)\3\2\2\2\u00e1\u00df\3\2\2\2"+
		"\u00e2\u00e3\b\26\1\2\u00e3\u00e4\5,\27\2\u00e4\u00ef\3\2\2\2\u00e5\u00e6"+
		"\f\4\2\2\u00e6\u00e7\7\30\2\2\u00e7\u00e8\b\26\1\2\u00e8\u00ee\5,\27\2"+
		"\u00e9\u00ea\f\3\2\2\u00ea\u00eb\7\31\2\2\u00eb\u00ec\b\26\1\2\u00ec\u00ee"+
		"\5,\27\2\u00ed\u00e5\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0+\3\2\2\2\u00f1\u00ef\3\2\2\2"+
		"\u00f2\u00f3\b\27\1\2\u00f3\u00f4\5.\30\2\u00f4\u00ff\3\2\2\2\u00f5\u00f6"+
		"\f\4\2\2\u00f6\u00f7\7\32\2\2\u00f7\u00f8\b\27\1\2\u00f8\u00fe\5.\30\2"+
		"\u00f9\u00fa\f\3\2\2\u00fa\u00fb\7\33\2\2\u00fb\u00fc\b\27\1\2\u00fc\u00fe"+
		"\5.\30\2\u00fd\u00f5\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100-\3\2\2\2\u0101\u00ff\3\2\2\2"+
		"\u0102\u0103\5\60\31\2\u0103/\3\2\2\2\u0104\u0105\7\"\2\2\u0105\u010e"+
		"\b\31\1\2\u0106\u010e\5\64\33\2\u0107\u0108\7\t\2\2\u0108\u0109\b\31\1"+
		"\2\u0109\u010a\5\34\17\2\u010a\u010b\7\n\2\2\u010b\u010c\b\31\1\2\u010c"+
		"\u010e\3\2\2\2\u010d\u0104\3\2\2\2\u010d\u0106\3\2\2\2\u010d\u0107\3\2"+
		"\2\2\u010e\61\3\2\2\2\u010f\u0110\7\34\2\2\u0110\u011c\b\32\1\2\u0111"+
		"\u0112\7\35\2\2\u0112\u011c\b\32\1\2\u0113\u0114\7\36\2\2\u0114\u011c"+
		"\b\32\1\2\u0115\u0116\7\7\2\2\u0116\u011c\b\32\1\2\u0117\u0118\7\37\2"+
		"\2\u0118\u011c\b\32\1\2\u0119\u011a\7 \2\2\u011a\u011c\b\32\1\2\u011b"+
		"\u010f\3\2\2\2\u011b\u0111\3\2\2\2\u011b\u0113\3\2\2\2\u011b\u0115\3\2"+
		"\2\2\u011b\u0117\3\2\2\2\u011b\u0119\3\2\2\2\u011c\63\3\2\2\2\u011d\u011e"+
		"\7#\2\2\u011e\u0126\b\33\1\2\u011f\u0120\7#\2\2\u0120\u0121\b\33\1\2\u0121"+
		"\u0122\7!\2\2\u0122\u0123\b\33\1\2\u0123\u0124\7#\2\2\u0124\u0126\b\33"+
		"\1\2\u0125\u011d\3\2\2\2\u0125\u011f\3\2\2\2\u0126\65\3\2\2\2\348@Lcf"+
		"nz\u0080\u008b\u0092\u0097\u00a1\u00a8\u00b3\u00bf\u00cd\u00cf\u00dd\u00df"+
		"\u00ed\u00ef\u00fd\u00ff\u010d\u011b\u0125";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}