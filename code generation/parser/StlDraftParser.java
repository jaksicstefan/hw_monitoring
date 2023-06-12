// Generated from LTL_grammar/StlDraftParser.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StlDraftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, LBRACE=3, RBRACE=4, LBRACK=5, RBRACK=6, SEMI=7, COMMA=8, 
		DOT=9, ASSIGN=10, GT=11, LT=12, EQUAL=13, LE=14, GE=15, NOTEQUAL=16, ADD=17, 
		SUB=18, MUL=19, DIV=20, TILDE=21, QUESTION=22, COLON=23, BANG=24, FLOAT_LITERAL=25, 
		ASSERTION=26, ALIAS=27, ALWAYS=28, PREVIOUS=29, EVENTUALLY=30, UNTIL=31, 
		HISTORICALLY=32, ONCE=33, SINCE=34, CONST=35, REAL=36, BOOL=37, INPUT=38, 
		OUTPUT=39, INTERNAL=40, TRUE=41, FALSE=42, OP_LOG_AND=43, OP_LOG_OR=44, 
		OP_LOG_XOR=45, OP_LOG_IMPLIES=46, OP_LOG_IIFF=47, OP_LOG_NOT=48, IDENTIFIER=49, 
		WS=50, COMMENT=51, LINE_COMMENT=52;
	public static final int
		RULE_stl_input = 0, RULE_assertion_decl = 1, RULE_bool_expression = 2, 
		RULE_all_range_float_literal = 3, RULE_open_float_literal_range = 4, RULE_close_float_literal_range = 5, 
		RULE_left_open_float_literal_range = 6, RULE_left_closed_float_literal_range = 7, 
		RULE_float_literal_range = 8, RULE_realComparison = 9, RULE_realExpression = 10, 
		RULE_constDeclaration = 11, RULE_varDeclaration = 12, RULE_floatNumber = 13, 
		RULE_boolValue = 14;
	public static final String[] ruleNames = {
		"stl_input", "assertion_decl", "bool_expression", "all_range_float_literal", 
		"open_float_literal_range", "close_float_literal_range", "left_open_float_literal_range", 
		"left_closed_float_literal_range", "float_literal_range", "realComparison", 
		"realExpression", "constDeclaration", "varDeclaration", "floatNumber", 
		"boolValue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", 
		"'>'", "'<'", "'=='", "'<='", "'>='", "'!='", "'+'", "'-'", "'*'", "'/'", 
		"'~'", "'?'", "':'", "'!'", null, "'assertion'", "'alias'", "'always'", 
		"'prev'", "'eventually'", "'until'", "'historically'", "'once'", "'since'", 
		"'const'", "'real'", "'bool'", "'input'", "'output'", "'internal'", "'true'", 
		"'false'", null, null, null, null, null, "'not'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", 
		"COMMA", "DOT", "ASSIGN", "GT", "LT", "EQUAL", "LE", "GE", "NOTEQUAL", 
		"ADD", "SUB", "MUL", "DIV", "TILDE", "QUESTION", "COLON", "BANG", "FLOAT_LITERAL", 
		"ASSERTION", "ALIAS", "ALWAYS", "PREVIOUS", "EVENTUALLY", "UNTIL", "HISTORICALLY", 
		"ONCE", "SINCE", "CONST", "REAL", "BOOL", "INPUT", "OUTPUT", "INTERNAL", 
		"TRUE", "FALSE", "OP_LOG_AND", "OP_LOG_OR", "OP_LOG_XOR", "OP_LOG_IMPLIES", 
		"OP_LOG_IIFF", "OP_LOG_NOT", "IDENTIFIER", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "StlDraftParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StlDraftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Stl_inputContext extends ParserRuleContext {
		public List<ConstDeclarationContext> constDeclaration() {
			return getRuleContexts(ConstDeclarationContext.class);
		}
		public ConstDeclarationContext constDeclaration(int i) {
			return getRuleContext(ConstDeclarationContext.class,i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<Assertion_declContext> assertion_decl() {
			return getRuleContexts(Assertion_declContext.class);
		}
		public Assertion_declContext assertion_decl(int i) {
			return getRuleContext(Assertion_declContext.class,i);
		}
		public List<Bool_expressionContext> bool_expression() {
			return getRuleContexts(Bool_expressionContext.class);
		}
		public Bool_expressionContext bool_expression(int i) {
			return getRuleContext(Bool_expressionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(StlDraftParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(StlDraftParser.SEMI, i);
		}
		public List<RealExpressionContext> realExpression() {
			return getRuleContexts(RealExpressionContext.class);
		}
		public RealExpressionContext realExpression(int i) {
			return getRuleContext(RealExpressionContext.class,i);
		}
		public Stl_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stl_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterStl_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitStl_input(this);
		}
	}

	public final Stl_inputContext stl_input() throws RecognitionException {
		Stl_inputContext _localctx = new Stl_inputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stl_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(39);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(30);
					constDeclaration();
					}
					break;
				case 2:
					{
					setState(31);
					varDeclaration();
					}
					break;
				case 3:
					{
					setState(32);
					assertion_decl();
					}
					break;
				case 4:
					{
					setState(33);
					bool_expression(0);
					setState(34);
					match(SEMI);
					}
					break;
				case 5:
					{
					setState(36);
					realExpression(0);
					setState(37);
					match(SEMI);
					}
					break;
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << SUB) | (1L << FLOAT_LITERAL) | (1L << ASSERTION) | (1L << ALWAYS) | (1L << PREVIOUS) | (1L << EVENTUALLY) | (1L << HISTORICALLY) | (1L << ONCE) | (1L << CONST) | (1L << REAL) | (1L << BOOL) | (1L << TRUE) | (1L << FALSE) | (1L << OP_LOG_NOT) | (1L << IDENTIFIER))) != 0) );
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

	public static class Assertion_declContext extends ParserRuleContext {
		public TerminalNode ASSERTION() { return getToken(StlDraftParser.ASSERTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(StlDraftParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(StlDraftParser.COLON, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(StlDraftParser.SEMI, 0); }
		public Assertion_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterAssertion_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitAssertion_decl(this);
		}
	}

	public final Assertion_declContext assertion_decl() throws RecognitionException {
		Assertion_declContext _localctx = new Assertion_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assertion_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(ASSERTION);
			setState(44);
			match(IDENTIFIER);
			setState(45);
			match(COLON);
			setState(46);
			bool_expression(0);
			setState(47);
			match(SEMI);
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

	public static class Bool_expressionContext extends ParserRuleContext {
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
	 
		public Bool_expressionContext() { }
		public void copyFrom(Bool_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogOnceContext extends Bool_expressionContext {
		public TerminalNode ONCE() { return getToken(StlDraftParser.ONCE, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public All_range_float_literalContext all_range_float_literal() {
			return getRuleContext(All_range_float_literalContext.class,0);
		}
		public LogOnceContext(Bool_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterLogOnce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitLogOnce(this);
		}
	}
	public static class LogHistoricallyContext extends Bool_expressionContext {
		public TerminalNode HISTORICALLY() { return getToken(StlDraftParser.HISTORICALLY, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public All_range_float_literalContext all_range_float_literal() {
			return getRuleContext(All_range_float_literalContext.class,0);
		}
		public LogHistoricallyContext(Bool_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterLogHistorically(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitLogHistorically(this);
		}
	}
	public static class LogEventuallyContext extends Bool_expressionContext {
		public TerminalNode EVENTUALLY() { return getToken(StlDraftParser.EVENTUALLY, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public All_range_float_literalContext all_range_float_literal() {
			return getRuleContext(All_range_float_literalContext.class,0);
		}
		public LogEventuallyContext(Bool_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterLogEventually(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitLogEventually(this);
		}
	}
	public static class LogUntilContext extends Bool_expressionContext {
		public List<Bool_expressionContext> bool_expression() {
			return getRuleContexts(Bool_expressionContext.class);
		}
		public Bool_expressionContext bool_expression(int i) {
			return getRuleContext(Bool_expressionContext.class,i);
		}
		public TerminalNode UNTIL() { return getToken(StlDraftParser.UNTIL, 0); }
		public All_range_float_literalContext all_range_float_literal() {
			return getRuleContext(All_range_float_literalContext.class,0);
		}
		public LogUntilContext(Bool_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterLogUntil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitLogUntil(this);
		}
	}
	public static class LogXorContext extends Bool_expressionContext {
		public List<Bool_expressionContext> bool_expression() {
			return getRuleContexts(Bool_expressionContext.class);
		}
		public Bool_expressionContext bool_expression(int i) {
			return getRuleContext(Bool_expressionContext.class,i);
		}
		public TerminalNode OP_LOG_XOR() { return getToken(StlDraftParser.OP_LOG_XOR, 0); }
		public LogXorContext(Bool_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterLogXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitLogXor(this);
		}
	}
	public static class LogSinceContext extends Bool_expressionContext {
		public List<Bool_expressionContext> bool_expression() {
			return getRuleContexts(Bool_expressionContext.class);
		}
		public Bool_expressionContext bool_expression(int i) {
			return getRuleContext(Bool_expressionContext.class,i);
		}
		public TerminalNode SINCE() { return getToken(StlDraftParser.SINCE, 0); }
		public All_range_float_literalContext all_range_float_literal() {
			return getRuleContext(All_range_float_literalContext.class,0);
		}
		public LogSinceContext(Bool_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterLogSince(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitLogSince(this);
		}
	}
	public static class LogImpliesContext extends Bool_expressionContext {
		public List<Bool_expressionContext> bool_expression() {
			return getRuleContexts(Bool_expressionContext.class);
		}
		public Bool_expressionContext bool_expression(int i) {
			return getRuleContext(Bool_expressionContext.class,i);
		}
		public TerminalNode OP_LOG_IMPLIES() { return getToken(StlDraftParser.OP_LOG_IMPLIES, 0); }
		public LogImpliesContext(Bool_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterLogImplies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitLogImplies(this);
		}
	}
	public static class LogAlwaysContext extends Bool_expressionContext {
		public TerminalNode ALWAYS() { return getToken(StlDraftParser.ALWAYS, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public All_range_float_literalContext all_range_float_literal() {
			return getRuleContext(All_range_float_literalContext.class,0);
		}
		public LogAlwaysContext(Bool_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterLogAlways(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitLogAlways(this);
		}
	}
	public static class BoolLiteralContext extends Bool_expressionContext {
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public BoolLiteralContext(Bool_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitBoolLiteral(this);
		}
	}
	public static class BoolExprRealComparisonContext extends Bool_expressionContext {
		public RealComparisonContext realComparison() {
			return getRuleContext(RealComparisonContext.class,0);
		}
		public BoolExprRealComparisonContext(Bool_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterBoolExprRealComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitBoolExprRealComparison(this);
		}
	}
	public static class LogAndContext extends Bool_expressionContext {
		public List<Bool_expressionContext> bool_expression() {
			return getRuleContexts(Bool_expressionContext.class);
		}
		public Bool_expressionContext bool_expression(int i) {
			return getRuleContext(Bool_expressionContext.class,i);
		}
		public TerminalNode OP_LOG_AND() { return getToken(StlDraftParser.OP_LOG_AND, 0); }
		public LogAndContext(Bool_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterLogAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitLogAnd(this);
		}
	}
	public static class LogNotContext extends Bool_expressionContext {
		public TerminalNode OP_LOG_NOT() { return getToken(StlDraftParser.OP_LOG_NOT, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public LogNotContext(Bool_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterLogNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitLogNot(this);
		}
	}
	public static class LogIffContext extends Bool_expressionContext {
		public List<Bool_expressionContext> bool_expression() {
			return getRuleContexts(Bool_expressionContext.class);
		}
		public Bool_expressionContext bool_expression(int i) {
			return getRuleContext(Bool_expressionContext.class,i);
		}
		public TerminalNode OP_LOG_IIFF() { return getToken(StlDraftParser.OP_LOG_IIFF, 0); }
		public LogIffContext(Bool_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterLogIff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitLogIff(this);
		}
	}
	public static class BoolIdContext extends Bool_expressionContext {
		public TerminalNode IDENTIFIER() { return getToken(StlDraftParser.IDENTIFIER, 0); }
		public BoolIdContext(Bool_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterBoolId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitBoolId(this);
		}
	}
	public static class BoolParensContext extends Bool_expressionContext {
		public TerminalNode LPAREN() { return getToken(StlDraftParser.LPAREN, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(StlDraftParser.RPAREN, 0); }
		public BoolParensContext(Bool_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterBoolParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitBoolParens(this);
		}
	}
	public static class LogPreviousContext extends Bool_expressionContext {
		public TerminalNode PREVIOUS() { return getToken(StlDraftParser.PREVIOUS, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public All_range_float_literalContext all_range_float_literal() {
			return getRuleContext(All_range_float_literalContext.class,0);
		}
		public LogPreviousContext(Bool_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterLogPrevious(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitLogPrevious(this);
		}
	}
	public static class LogOrContext extends Bool_expressionContext {
		public List<Bool_expressionContext> bool_expression() {
			return getRuleContexts(Bool_expressionContext.class);
		}
		public Bool_expressionContext bool_expression(int i) {
			return getRuleContext(Bool_expressionContext.class,i);
		}
		public TerminalNode OP_LOG_OR() { return getToken(StlDraftParser.OP_LOG_OR, 0); }
		public LogOrContext(Bool_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterLogOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitLogOr(this);
		}
	}
	public static class LogAssignContext extends Bool_expressionContext {
		public List<Bool_expressionContext> bool_expression() {
			return getRuleContexts(Bool_expressionContext.class);
		}
		public Bool_expressionContext bool_expression(int i) {
			return getRuleContext(Bool_expressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(StlDraftParser.ASSIGN, 0); }
		public LogAssignContext(Bool_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterLogAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitLogAssign(this);
		}
	}

	public final Bool_expressionContext bool_expression() throws RecognitionException {
		return bool_expression(0);
	}

	private Bool_expressionContext bool_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, _parentState);
		Bool_expressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_bool_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new LogNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(50);
				match(OP_LOG_NOT);
				setState(51);
				bool_expression(13);
				}
				break;
			case 2:
				{
				_localctx = new LogEventuallyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(EVENTUALLY);
				setState(54);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(53);
					all_range_float_literal();
					}
					break;
				}
				setState(56);
				bool_expression(5);
				}
				break;
			case 3:
				{
				_localctx = new LogOnceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				match(ONCE);
				setState(59);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(58);
					all_range_float_literal();
					}
					break;
				}
				setState(61);
				bool_expression(4);
				}
				break;
			case 4:
				{
				_localctx = new LogAlwaysContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				match(ALWAYS);
				setState(64);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(63);
					all_range_float_literal();
					}
					break;
				}
				setState(66);
				bool_expression(3);
				}
				break;
			case 5:
				{
				_localctx = new LogPreviousContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(PREVIOUS);
				setState(69);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(68);
					all_range_float_literal();
					}
					break;
				}
				setState(71);
				bool_expression(2);
				}
				break;
			case 6:
				{
				_localctx = new LogHistoricallyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				match(HISTORICALLY);
				setState(74);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(73);
					all_range_float_literal();
					}
					break;
				}
				setState(76);
				bool_expression(1);
				}
				break;
			case 7:
				{
				_localctx = new BoolParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(LPAREN);
				setState(78);
				bool_expression(0);
				setState(79);
				match(RPAREN);
				}
				break;
			case 8:
				{
				_localctx = new BoolIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(IDENTIFIER);
				}
				break;
			case 9:
				{
				_localctx = new BoolLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				boolValue();
				}
				break;
			case 10:
				{
				_localctx = new BoolExprRealComparisonContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				realComparison();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(116);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new LogAssignContext(new Bool_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
						setState(86);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(87);
						match(ASSIGN);
						setState(88);
						bool_expression(15);
						}
						break;
					case 2:
						{
						_localctx = new LogAndContext(new Bool_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
						setState(89);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(90);
						match(OP_LOG_AND);
						setState(91);
						bool_expression(13);
						}
						break;
					case 3:
						{
						_localctx = new LogOrContext(new Bool_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
						setState(92);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(93);
						match(OP_LOG_OR);
						setState(94);
						bool_expression(12);
						}
						break;
					case 4:
						{
						_localctx = new LogXorContext(new Bool_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
						setState(95);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(96);
						match(OP_LOG_XOR);
						setState(97);
						bool_expression(11);
						}
						break;
					case 5:
						{
						_localctx = new LogImpliesContext(new Bool_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
						setState(98);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(99);
						match(OP_LOG_IMPLIES);
						setState(100);
						bool_expression(10);
						}
						break;
					case 6:
						{
						_localctx = new LogIffContext(new Bool_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
						setState(101);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(102);
						match(OP_LOG_IIFF);
						setState(103);
						bool_expression(9);
						}
						break;
					case 7:
						{
						_localctx = new LogUntilContext(new Bool_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
						setState(104);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(105);
						match(UNTIL);
						setState(107);
						switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
						case 1:
							{
							setState(106);
							all_range_float_literal();
							}
							break;
						}
						setState(109);
						bool_expression(8);
						}
						break;
					case 8:
						{
						_localctx = new LogSinceContext(new Bool_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
						setState(110);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(111);
						match(SINCE);
						setState(113);
						switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
						case 1:
							{
							setState(112);
							all_range_float_literal();
							}
							break;
						}
						setState(115);
						bool_expression(7);
						}
						break;
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class All_range_float_literalContext extends ParserRuleContext {
		public Open_float_literal_rangeContext open_float_literal_range() {
			return getRuleContext(Open_float_literal_rangeContext.class,0);
		}
		public Close_float_literal_rangeContext close_float_literal_range() {
			return getRuleContext(Close_float_literal_rangeContext.class,0);
		}
		public Left_open_float_literal_rangeContext left_open_float_literal_range() {
			return getRuleContext(Left_open_float_literal_rangeContext.class,0);
		}
		public Left_closed_float_literal_rangeContext left_closed_float_literal_range() {
			return getRuleContext(Left_closed_float_literal_rangeContext.class,0);
		}
		public All_range_float_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_range_float_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterAll_range_float_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitAll_range_float_literal(this);
		}
	}

	public final All_range_float_literalContext all_range_float_literal() throws RecognitionException {
		All_range_float_literalContext _localctx = new All_range_float_literalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_all_range_float_literal);
		try {
			setState(125);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				open_float_literal_range();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				close_float_literal_range();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				left_open_float_literal_range();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				left_closed_float_literal_range();
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

	public static class Open_float_literal_rangeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(StlDraftParser.LPAREN, 0); }
		public Float_literal_rangeContext float_literal_range() {
			return getRuleContext(Float_literal_rangeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(StlDraftParser.RPAREN, 0); }
		public Open_float_literal_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_float_literal_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterOpen_float_literal_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitOpen_float_literal_range(this);
		}
	}

	public final Open_float_literal_rangeContext open_float_literal_range() throws RecognitionException {
		Open_float_literal_rangeContext _localctx = new Open_float_literal_rangeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_open_float_literal_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(LPAREN);
			setState(128);
			float_literal_range();
			setState(129);
			match(RPAREN);
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

	public static class Close_float_literal_rangeContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(StlDraftParser.LBRACK, 0); }
		public Float_literal_rangeContext float_literal_range() {
			return getRuleContext(Float_literal_rangeContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(StlDraftParser.RBRACK, 0); }
		public Close_float_literal_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_float_literal_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterClose_float_literal_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitClose_float_literal_range(this);
		}
	}

	public final Close_float_literal_rangeContext close_float_literal_range() throws RecognitionException {
		Close_float_literal_rangeContext _localctx = new Close_float_literal_rangeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_close_float_literal_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(LBRACK);
			setState(132);
			float_literal_range();
			setState(133);
			match(RBRACK);
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

	public static class Left_open_float_literal_rangeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(StlDraftParser.LPAREN, 0); }
		public Float_literal_rangeContext float_literal_range() {
			return getRuleContext(Float_literal_rangeContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(StlDraftParser.RBRACK, 0); }
		public Left_open_float_literal_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_open_float_literal_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterLeft_open_float_literal_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitLeft_open_float_literal_range(this);
		}
	}

	public final Left_open_float_literal_rangeContext left_open_float_literal_range() throws RecognitionException {
		Left_open_float_literal_rangeContext _localctx = new Left_open_float_literal_rangeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_left_open_float_literal_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(LPAREN);
			setState(136);
			float_literal_range();
			setState(137);
			match(RBRACK);
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

	public static class Left_closed_float_literal_rangeContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(StlDraftParser.LBRACK, 0); }
		public Float_literal_rangeContext float_literal_range() {
			return getRuleContext(Float_literal_rangeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(StlDraftParser.RPAREN, 0); }
		public Left_closed_float_literal_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_closed_float_literal_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterLeft_closed_float_literal_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitLeft_closed_float_literal_range(this);
		}
	}

	public final Left_closed_float_literal_rangeContext left_closed_float_literal_range() throws RecognitionException {
		Left_closed_float_literal_rangeContext _localctx = new Left_closed_float_literal_rangeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_left_closed_float_literal_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(LBRACK);
			setState(140);
			float_literal_range();
			setState(141);
			match(RPAREN);
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

	public static class Float_literal_rangeContext extends ParserRuleContext {
		public List<FloatNumberContext> floatNumber() {
			return getRuleContexts(FloatNumberContext.class);
		}
		public FloatNumberContext floatNumber(int i) {
			return getRuleContext(FloatNumberContext.class,i);
		}
		public TerminalNode COLON() { return getToken(StlDraftParser.COLON, 0); }
		public Float_literal_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_literal_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterFloat_literal_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitFloat_literal_range(this);
		}
	}

	public final Float_literal_rangeContext float_literal_range() throws RecognitionException {
		Float_literal_rangeContext _localctx = new Float_literal_rangeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_float_literal_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			floatNumber();
			setState(144);
			match(COLON);
			setState(145);
			floatNumber();
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

	public static class RealComparisonContext extends ParserRuleContext {
		public RealComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realComparison; }
	 
		public RealComparisonContext() { }
		public void copyFrom(RealComparisonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RealLessEqualContext extends RealComparisonContext {
		public List<RealExpressionContext> realExpression() {
			return getRuleContexts(RealExpressionContext.class);
		}
		public RealExpressionContext realExpression(int i) {
			return getRuleContext(RealExpressionContext.class,i);
		}
		public TerminalNode LE() { return getToken(StlDraftParser.LE, 0); }
		public RealLessEqualContext(RealComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterRealLessEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitRealLessEqual(this);
		}
	}
	public static class RealEqualContext extends RealComparisonContext {
		public List<RealExpressionContext> realExpression() {
			return getRuleContexts(RealExpressionContext.class);
		}
		public RealExpressionContext realExpression(int i) {
			return getRuleContext(RealExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(StlDraftParser.EQUAL, 0); }
		public RealEqualContext(RealComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterRealEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitRealEqual(this);
		}
	}
	public static class RealNotEqualContext extends RealComparisonContext {
		public List<RealExpressionContext> realExpression() {
			return getRuleContexts(RealExpressionContext.class);
		}
		public RealExpressionContext realExpression(int i) {
			return getRuleContext(RealExpressionContext.class,i);
		}
		public TerminalNode NOTEQUAL() { return getToken(StlDraftParser.NOTEQUAL, 0); }
		public RealNotEqualContext(RealComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterRealNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitRealNotEqual(this);
		}
	}
	public static class RealGreaterEqualContext extends RealComparisonContext {
		public List<RealExpressionContext> realExpression() {
			return getRuleContexts(RealExpressionContext.class);
		}
		public RealExpressionContext realExpression(int i) {
			return getRuleContext(RealExpressionContext.class,i);
		}
		public TerminalNode GE() { return getToken(StlDraftParser.GE, 0); }
		public RealGreaterEqualContext(RealComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterRealGreaterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitRealGreaterEqual(this);
		}
	}
	public static class RealLessThanContext extends RealComparisonContext {
		public List<RealExpressionContext> realExpression() {
			return getRuleContexts(RealExpressionContext.class);
		}
		public RealExpressionContext realExpression(int i) {
			return getRuleContext(RealExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(StlDraftParser.LT, 0); }
		public RealLessThanContext(RealComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterRealLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitRealLessThan(this);
		}
	}
	public static class RealGreaterThanContext extends RealComparisonContext {
		public List<RealExpressionContext> realExpression() {
			return getRuleContexts(RealExpressionContext.class);
		}
		public RealExpressionContext realExpression(int i) {
			return getRuleContext(RealExpressionContext.class,i);
		}
		public TerminalNode GT() { return getToken(StlDraftParser.GT, 0); }
		public RealGreaterThanContext(RealComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterRealGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitRealGreaterThan(this);
		}
	}

	public final RealComparisonContext realComparison() throws RecognitionException {
		RealComparisonContext _localctx = new RealComparisonContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_realComparison);
		try {
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new RealEqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				realExpression(0);
				setState(148);
				match(EQUAL);
				setState(149);
				realExpression(0);
				}
				break;
			case 2:
				_localctx = new RealNotEqualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				realExpression(0);
				setState(152);
				match(NOTEQUAL);
				setState(153);
				realExpression(0);
				}
				break;
			case 3:
				_localctx = new RealLessEqualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				realExpression(0);
				setState(156);
				match(LE);
				setState(157);
				realExpression(0);
				}
				break;
			case 4:
				_localctx = new RealGreaterEqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				realExpression(0);
				setState(160);
				match(GE);
				setState(161);
				realExpression(0);
				}
				break;
			case 5:
				_localctx = new RealGreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				realExpression(0);
				setState(164);
				match(GT);
				setState(165);
				realExpression(0);
				}
				break;
			case 6:
				_localctx = new RealLessThanContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				realExpression(0);
				setState(168);
				match(LT);
				setState(169);
				realExpression(0);
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

	public static class RealExpressionContext extends ParserRuleContext {
		public RealExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realExpression; }
	 
		public RealExpressionContext() { }
		public void copyFrom(RealExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RealIdContext extends RealExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(StlDraftParser.IDENTIFIER, 0); }
		public RealIdContext(RealExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterRealId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitRealId(this);
		}
	}
	public static class RealLiteralContext extends RealExpressionContext {
		public FloatNumberContext floatNumber() {
			return getRuleContext(FloatNumberContext.class,0);
		}
		public RealLiteralContext(RealExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterRealLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitRealLiteral(this);
		}
	}
	public static class RealDivideContext extends RealExpressionContext {
		public List<RealExpressionContext> realExpression() {
			return getRuleContexts(RealExpressionContext.class);
		}
		public RealExpressionContext realExpression(int i) {
			return getRuleContext(RealExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(StlDraftParser.DIV, 0); }
		public RealDivideContext(RealExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterRealDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitRealDivide(this);
		}
	}
	public static class RealAddContext extends RealExpressionContext {
		public List<RealExpressionContext> realExpression() {
			return getRuleContexts(RealExpressionContext.class);
		}
		public RealExpressionContext realExpression(int i) {
			return getRuleContext(RealExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(StlDraftParser.ADD, 0); }
		public RealAddContext(RealExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterRealAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitRealAdd(this);
		}
	}
	public static class RealSubtractContext extends RealExpressionContext {
		public List<RealExpressionContext> realExpression() {
			return getRuleContexts(RealExpressionContext.class);
		}
		public RealExpressionContext realExpression(int i) {
			return getRuleContext(RealExpressionContext.class,i);
		}
		public TerminalNode SUB() { return getToken(StlDraftParser.SUB, 0); }
		public RealSubtractContext(RealExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterRealSubtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitRealSubtract(this);
		}
	}
	public static class RealParensContext extends RealExpressionContext {
		public TerminalNode LPAREN() { return getToken(StlDraftParser.LPAREN, 0); }
		public RealExpressionContext realExpression() {
			return getRuleContext(RealExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(StlDraftParser.RPAREN, 0); }
		public RealParensContext(RealExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterRealParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitRealParens(this);
		}
	}
	public static class RealAssignContext extends RealExpressionContext {
		public List<RealExpressionContext> realExpression() {
			return getRuleContexts(RealExpressionContext.class);
		}
		public RealExpressionContext realExpression(int i) {
			return getRuleContext(RealExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(StlDraftParser.ASSIGN, 0); }
		public RealAssignContext(RealExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterRealAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitRealAssign(this);
		}
	}
	public static class RealMultiplyContext extends RealExpressionContext {
		public List<RealExpressionContext> realExpression() {
			return getRuleContexts(RealExpressionContext.class);
		}
		public RealExpressionContext realExpression(int i) {
			return getRuleContext(RealExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(StlDraftParser.MUL, 0); }
		public RealMultiplyContext(RealExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterRealMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitRealMultiply(this);
		}
	}

	public final RealExpressionContext realExpression() throws RecognitionException {
		return realExpression(0);
	}

	private RealExpressionContext realExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RealExpressionContext _localctx = new RealExpressionContext(_ctx, _parentState);
		RealExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_realExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new RealParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(174);
				match(LPAREN);
				setState(175);
				realExpression(0);
				setState(176);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new RealIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(IDENTIFIER);
				}
				break;
			case SUB:
			case FLOAT_LITERAL:
				{
				_localctx = new RealLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				floatNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(197);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new RealMultiplyContext(new RealExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_realExpression);
						setState(182);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(183);
						match(MUL);
						setState(184);
						realExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new RealDivideContext(new RealExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_realExpression);
						setState(185);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(186);
						match(DIV);
						setState(187);
						realExpression(5);
						}
						break;
					case 3:
						{
						_localctx = new RealAddContext(new RealExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_realExpression);
						setState(188);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(189);
						match(ADD);
						setState(190);
						realExpression(4);
						}
						break;
					case 4:
						{
						_localctx = new RealSubtractContext(new RealExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_realExpression);
						setState(191);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(192);
						match(SUB);
						setState(193);
						realExpression(3);
						}
						break;
					case 5:
						{
						_localctx = new RealAssignContext(new RealExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_realExpression);
						setState(194);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(195);
						match(ASSIGN);
						setState(196);
						realExpression(2);
						}
						break;
					}
					} 
				}
				setState(201);
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(StlDraftParser.CONST, 0); }
		public TerminalNode BOOL() { return getToken(StlDraftParser.BOOL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(StlDraftParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(StlDraftParser.ASSIGN, 0); }
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(StlDraftParser.SEMI, 0); }
		public TerminalNode REAL() { return getToken(StlDraftParser.REAL, 0); }
		public FloatNumberContext floatNumber() {
			return getRuleContext(FloatNumberContext.class,0);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitConstDeclaration(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constDeclaration);
		try {
			setState(216);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(CONST);
				setState(203);
				match(BOOL);
				setState(204);
				match(IDENTIFIER);
				setState(205);
				match(ASSIGN);
				setState(206);
				boolValue();
				setState(207);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(CONST);
				setState(210);
				match(REAL);
				setState(211);
				match(IDENTIFIER);
				setState(212);
				match(ASSIGN);
				setState(213);
				floatNumber();
				setState(214);
				match(SEMI);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(StlDraftParser.BOOL, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(StlDraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(StlDraftParser.IDENTIFIER, i);
		}
		public TerminalNode SEMI() { return getToken(StlDraftParser.SEMI, 0); }
		public TerminalNode ALIAS() { return getToken(StlDraftParser.ALIAS, 0); }
		public TerminalNode REAL() { return getToken(StlDraftParser.REAL, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varDeclaration);
		int _la;
		try {
			setState(232);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(BOOL);
				setState(219);
				match(IDENTIFIER);
				setState(222);
				_la = _input.LA(1);
				if (_la==ALIAS) {
					{
					setState(220);
					match(ALIAS);
					setState(221);
					match(IDENTIFIER);
					}
				}

				setState(224);
				match(SEMI);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(REAL);
				setState(226);
				match(IDENTIFIER);
				setState(229);
				_la = _input.LA(1);
				if (_la==ALIAS) {
					{
					setState(227);
					match(ALIAS);
					setState(228);
					match(IDENTIFIER);
					}
				}

				setState(231);
				match(SEMI);
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

	public static class FloatNumberContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(StlDraftParser.FLOAT_LITERAL, 0); }
		public TerminalNode SUB() { return getToken(StlDraftParser.SUB, 0); }
		public FloatNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterFloatNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitFloatNumber(this);
		}
	}

	public final FloatNumberContext floatNumber() throws RecognitionException {
		FloatNumberContext _localctx = new FloatNumberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_floatNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(234);
				match(SUB);
				}
			}

			setState(237);
			match(FLOAT_LITERAL);
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

	public static class BoolValueContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(StlDraftParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(StlDraftParser.TRUE, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitBoolValue(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_boolValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return bool_expression_sempred((Bool_expressionContext)_localctx, predIndex);
		case 10:
			return realExpression_sempred((RealExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bool_expression_sempred(Bool_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean realExpression_sempred(RealExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\66\u00f4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\6\2*\n\2\r\2\16\2+\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\5\49\n\4\3\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\4\5\4C\n\4\3\4\3"+
		"\4\3\4\5\4H\n\4\3\4\3\4\3\4\5\4M\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4W\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4n\n\4\3\4\3\4\3\4\3\4\5\4t\n\4\3\4\7\4w\n\4"+
		"\f\4\16\4z\13\4\3\5\3\5\3\5\3\5\5\5\u0080\n\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ae\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00b7\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\7\f\u00c8\n\f\f\f\16\f\u00cb\13\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00db\n\r\3\16\3\16\3\16\3\16\5"+
		"\16\u00e1\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e8\n\16\3\16\5\16\u00eb"+
		"\n\16\3\17\5\17\u00ee\n\17\3\17\3\17\3\20\3\20\3\20\2\4\6\26\21\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36\2\3\3\2+,\u0115\2)\3\2\2\2\4-\3\2\2"+
		"\2\6V\3\2\2\2\b\177\3\2\2\2\n\u0081\3\2\2\2\f\u0085\3\2\2\2\16\u0089\3"+
		"\2\2\2\20\u008d\3\2\2\2\22\u0091\3\2\2\2\24\u00ad\3\2\2\2\26\u00b6\3\2"+
		"\2\2\30\u00da\3\2\2\2\32\u00ea\3\2\2\2\34\u00ed\3\2\2\2\36\u00f1\3\2\2"+
		"\2 *\5\30\r\2!*\5\32\16\2\"*\5\4\3\2#$\5\6\4\2$%\7\t\2\2%*\3\2\2\2&\'"+
		"\5\26\f\2\'(\7\t\2\2(*\3\2\2\2) \3\2\2\2)!\3\2\2\2)\"\3\2\2\2)#\3\2\2"+
		"\2)&\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\3\3\2\2\2-.\7\34\2\2./\7\63"+
		"\2\2/\60\7\31\2\2\60\61\5\6\4\2\61\62\7\t\2\2\62\5\3\2\2\2\63\64\b\4\1"+
		"\2\64\65\7\62\2\2\65W\5\6\4\17\668\7 \2\2\679\5\b\5\28\67\3\2\2\289\3"+
		"\2\2\29:\3\2\2\2:W\5\6\4\7;=\7#\2\2<>\5\b\5\2=<\3\2\2\2=>\3\2\2\2>?\3"+
		"\2\2\2?W\5\6\4\6@B\7\36\2\2AC\5\b\5\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DW"+
		"\5\6\4\5EG\7\37\2\2FH\5\b\5\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IW\5\6\4\4"+
		"JL\7\"\2\2KM\5\b\5\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NW\5\6\4\3OP\7\3\2\2"+
		"PQ\5\6\4\2QR\7\4\2\2RW\3\2\2\2SW\7\63\2\2TW\5\36\20\2UW\5\24\13\2V\63"+
		"\3\2\2\2V\66\3\2\2\2V;\3\2\2\2V@\3\2\2\2VE\3\2\2\2VJ\3\2\2\2VO\3\2\2\2"+
		"VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2Wx\3\2\2\2XY\f\20\2\2YZ\7\f\2\2Zw\5\6\4"+
		"\21[\\\f\16\2\2\\]\7-\2\2]w\5\6\4\17^_\f\r\2\2_`\7.\2\2`w\5\6\4\16ab\f"+
		"\f\2\2bc\7/\2\2cw\5\6\4\rde\f\13\2\2ef\7\60\2\2fw\5\6\4\fgh\f\n\2\2hi"+
		"\7\61\2\2iw\5\6\4\13jk\f\t\2\2km\7!\2\2ln\5\b\5\2ml\3\2\2\2mn\3\2\2\2"+
		"no\3\2\2\2ow\5\6\4\npq\f\b\2\2qs\7$\2\2rt\5\b\5\2sr\3\2\2\2st\3\2\2\2"+
		"tu\3\2\2\2uw\5\6\4\tvX\3\2\2\2v[\3\2\2\2v^\3\2\2\2va\3\2\2\2vd\3\2\2\2"+
		"vg\3\2\2\2vj\3\2\2\2vp\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\7\3\2\2"+
		"\2zx\3\2\2\2{\u0080\5\n\6\2|\u0080\5\f\7\2}\u0080\5\16\b\2~\u0080\5\20"+
		"\t\2\177{\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\t\3\2\2"+
		"\2\u0081\u0082\7\3\2\2\u0082\u0083\5\22\n\2\u0083\u0084\7\4\2\2\u0084"+
		"\13\3\2\2\2\u0085\u0086\7\7\2\2\u0086\u0087\5\22\n\2\u0087\u0088\7\b\2"+
		"\2\u0088\r\3\2\2\2\u0089\u008a\7\3\2\2\u008a\u008b\5\22\n\2\u008b\u008c"+
		"\7\b\2\2\u008c\17\3\2\2\2\u008d\u008e\7\7\2\2\u008e\u008f\5\22\n\2\u008f"+
		"\u0090\7\4\2\2\u0090\21\3\2\2\2\u0091\u0092\5\34\17\2\u0092\u0093\7\31"+
		"\2\2\u0093\u0094\5\34\17\2\u0094\23\3\2\2\2\u0095\u0096\5\26\f\2\u0096"+
		"\u0097\7\17\2\2\u0097\u0098\5\26\f\2\u0098\u00ae\3\2\2\2\u0099\u009a\5"+
		"\26\f\2\u009a\u009b\7\22\2\2\u009b\u009c\5\26\f\2\u009c\u00ae\3\2\2\2"+
		"\u009d\u009e\5\26\f\2\u009e\u009f\7\20\2\2\u009f\u00a0\5\26\f\2\u00a0"+
		"\u00ae\3\2\2\2\u00a1\u00a2\5\26\f\2\u00a2\u00a3\7\21\2\2\u00a3\u00a4\5"+
		"\26\f\2\u00a4\u00ae\3\2\2\2\u00a5\u00a6\5\26\f\2\u00a6\u00a7\7\r\2\2\u00a7"+
		"\u00a8\5\26\f\2\u00a8\u00ae\3\2\2\2\u00a9\u00aa\5\26\f\2\u00aa\u00ab\7"+
		"\16\2\2\u00ab\u00ac\5\26\f\2\u00ac\u00ae\3\2\2\2\u00ad\u0095\3\2\2\2\u00ad"+
		"\u0099\3\2\2\2\u00ad\u009d\3\2\2\2\u00ad\u00a1\3\2\2\2\u00ad\u00a5\3\2"+
		"\2\2\u00ad\u00a9\3\2\2\2\u00ae\25\3\2\2\2\u00af\u00b0\b\f\1\2\u00b0\u00b1"+
		"\7\3\2\2\u00b1\u00b2\5\26\f\2\u00b2\u00b3\7\4\2\2\u00b3\u00b7\3\2\2\2"+
		"\u00b4\u00b7\7\63\2\2\u00b5\u00b7\5\34\17\2\u00b6\u00af\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00c9\3\2\2\2\u00b8\u00b9\f\7"+
		"\2\2\u00b9\u00ba\7\25\2\2\u00ba\u00c8\5\26\f\b\u00bb\u00bc\f\6\2\2\u00bc"+
		"\u00bd\7\26\2\2\u00bd\u00c8\5\26\f\7\u00be\u00bf\f\5\2\2\u00bf\u00c0\7"+
		"\23\2\2\u00c0\u00c8\5\26\f\6\u00c1\u00c2\f\4\2\2\u00c2\u00c3\7\24\2\2"+
		"\u00c3\u00c8\5\26\f\5\u00c4\u00c5\f\3\2\2\u00c5\u00c6\7\f\2\2\u00c6\u00c8"+
		"\5\26\f\4\u00c7\u00b8\3\2\2\2\u00c7\u00bb\3\2\2\2\u00c7\u00be\3\2\2\2"+
		"\u00c7\u00c1\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\27\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cd\7%\2\2\u00cd\u00ce\7\'\2\2\u00ce\u00cf\7\63\2\2\u00cf\u00d0\7\f"+
		"\2\2\u00d0\u00d1\5\36\20\2\u00d1\u00d2\7\t\2\2\u00d2\u00db\3\2\2\2\u00d3"+
		"\u00d4\7%\2\2\u00d4\u00d5\7&\2\2\u00d5\u00d6\7\63\2\2\u00d6\u00d7\7\f"+
		"\2\2\u00d7\u00d8\5\34\17\2\u00d8\u00d9\7\t\2\2\u00d9\u00db\3\2\2\2\u00da"+
		"\u00cc\3\2\2\2\u00da\u00d3\3\2\2\2\u00db\31\3\2\2\2\u00dc\u00dd\7\'\2"+
		"\2\u00dd\u00e0\7\63\2\2\u00de\u00df\7\35\2\2\u00df\u00e1\7\63\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00eb\7\t"+
		"\2\2\u00e3\u00e4\7&\2\2\u00e4\u00e7\7\63\2\2\u00e5\u00e6\7\35\2\2\u00e6"+
		"\u00e8\7\63\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3"+
		"\2\2\2\u00e9\u00eb\7\t\2\2\u00ea\u00dc\3\2\2\2\u00ea\u00e3\3\2\2\2\u00eb"+
		"\33\3\2\2\2\u00ec\u00ee\7\24\2\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2"+
		"\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7\33\2\2\u00f0\35\3\2\2\2\u00f1\u00f2"+
		"\t\2\2\2\u00f2\37\3\2\2\2\30)+8=BGLVmsvx\177\u00ad\u00b6\u00c7\u00c9\u00da"+
		"\u00e0\u00e7\u00ea\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}