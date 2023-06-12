// Generated from LTL_grammar/StlDraftParser.g4 by ANTLR 4.5

package monitor_gen;

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
		RULE_previous_temporal_expression = 3, RULE_all_range_float_literal = 4, 
		RULE_open_float_literal_range = 5, RULE_close_float_literal_range = 6, 
		RULE_left_open_float_literal_range = 7, RULE_left_closed_float_literal_range = 8, 
		RULE_float_literal_range = 9, RULE_realComparison = 10, RULE_realExpression = 11, 
		RULE_constDeclaration = 12, RULE_varDeclaration = 13, RULE_floatNumber = 14, 
		RULE_boolValue = 15;
	public static final String[] ruleNames = {
		"stl_input", "assertion_decl", "bool_expression", "previous_temporal_expression", 
		"all_range_float_literal", "open_float_literal_range", "close_float_literal_range", 
		"left_open_float_literal_range", "left_closed_float_literal_range", "float_literal_range", 
		"realComparison", "realExpression", "constDeclaration", "varDeclaration", 
		"floatNumber", "boolValue"
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
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(41);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(32);
					constDeclaration();
					}
					break;
				case 2:
					{
					setState(33);
					varDeclaration();
					}
					break;
				case 3:
					{
					setState(34);
					assertion_decl();
					}
					break;
				case 4:
					{
					setState(35);
					bool_expression(0);
					setState(36);
					match(SEMI);
					}
					break;
				case 5:
					{
					setState(38);
					realExpression(0);
					setState(39);
					match(SEMI);
					}
					break;
				}
				}
				setState(43); 
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
			setState(45);
			match(ASSERTION);
			setState(46);
			match(IDENTIFIER);
			setState(47);
			match(COLON);
			setState(48);
			bool_expression(0);
			setState(49);
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
		public Previous_temporal_expressionContext previous_temporal_expression() {
			return getRuleContext(Previous_temporal_expressionContext.class,0);
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
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new LogNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(52);
				match(OP_LOG_NOT);
				setState(53);
				bool_expression(13);
				}
				break;
			case 2:
				{
				_localctx = new LogEventuallyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(EVENTUALLY);
				setState(56);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(55);
					all_range_float_literal();
					}
					break;
				}
				setState(58);
				bool_expression(5);
				}
				break;
			case 3:
				{
				_localctx = new LogOnceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(ONCE);
				setState(61);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(60);
					all_range_float_literal();
					}
					break;
				}
				setState(63);
				bool_expression(4);
				}
				break;
			case 4:
				{
				_localctx = new LogAlwaysContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(ALWAYS);
				setState(66);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(65);
					all_range_float_literal();
					}
					break;
				}
				setState(68);
				bool_expression(3);
				}
				break;
			case 5:
				{
				_localctx = new LogHistoricallyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(HISTORICALLY);
				setState(71);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(70);
					all_range_float_literal();
					}
					break;
				}
				setState(73);
				bool_expression(2);
				}
				break;
			case 6:
				{
				_localctx = new BoolParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(LPAREN);
				setState(75);
				bool_expression(0);
				setState(76);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new BoolIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(IDENTIFIER);
				}
				break;
			case 8:
				{
				_localctx = new BoolLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				boolValue();
				}
				break;
			case 9:
				{
				_localctx = new BoolExprRealComparisonContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				realComparison();
				}
				break;
			case 10:
				{
				_localctx = new LogPreviousContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				previous_temporal_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(114);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new LogAssignContext(new Bool_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
						setState(84);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(85);
						match(ASSIGN);
						setState(86);
						bool_expression(15);
						}
						break;
					case 2:
						{
						_localctx = new LogAndContext(new Bool_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
						setState(87);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(88);
						match(OP_LOG_AND);
						setState(89);
						bool_expression(13);
						}
						break;
					case 3:
						{
						_localctx = new LogOrContext(new Bool_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
						setState(90);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(91);
						match(OP_LOG_OR);
						setState(92);
						bool_expression(12);
						}
						break;
					case 4:
						{
						_localctx = new LogXorContext(new Bool_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
						setState(93);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(94);
						match(OP_LOG_XOR);
						setState(95);
						bool_expression(11);
						}
						break;
					case 5:
						{
						_localctx = new LogImpliesContext(new Bool_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
						setState(96);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(97);
						match(OP_LOG_IMPLIES);
						setState(98);
						bool_expression(10);
						}
						break;
					case 6:
						{
						_localctx = new LogIffContext(new Bool_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
						setState(99);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(100);
						match(OP_LOG_IIFF);
						setState(101);
						bool_expression(9);
						}
						break;
					case 7:
						{
						_localctx = new LogUntilContext(new Bool_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
						setState(102);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(103);
						match(UNTIL);
						setState(105);
						switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
						case 1:
							{
							setState(104);
							all_range_float_literal();
							}
							break;
						}
						setState(107);
						bool_expression(8);
						}
						break;
					case 8:
						{
						_localctx = new LogSinceContext(new Bool_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
						setState(108);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(109);
						match(SINCE);
						setState(111);
						switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
						case 1:
							{
							setState(110);
							all_range_float_literal();
							}
							break;
						}
						setState(113);
						bool_expression(7);
						}
						break;
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Previous_temporal_expressionContext extends ParserRuleContext {
		public Previous_temporal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_previous_temporal_expression; }
	 
		public Previous_temporal_expressionContext() { }
		public void copyFrom(Previous_temporal_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrevLeftPteRightContext extends Previous_temporal_expressionContext {
		public TerminalNode PREVIOUS() { return getToken(StlDraftParser.PREVIOUS, 0); }
		public TerminalNode LPAREN() { return getToken(StlDraftParser.LPAREN, 0); }
		public Previous_temporal_expressionContext previous_temporal_expression() {
			return getRuleContext(Previous_temporal_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(StlDraftParser.RPAREN, 0); }
		public PrevLeftPteRightContext(Previous_temporal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterPrevLeftPteRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitPrevLeftPteRight(this);
		}
	}
	public static class PrevIdentifierContext extends Previous_temporal_expressionContext {
		public TerminalNode PREVIOUS() { return getToken(StlDraftParser.PREVIOUS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(StlDraftParser.IDENTIFIER, 0); }
		public PrevIdentifierContext(Previous_temporal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterPrevIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitPrevIdentifier(this);
		}
	}
	public static class PrevPrevPTEContext extends Previous_temporal_expressionContext {
		public TerminalNode PREVIOUS() { return getToken(StlDraftParser.PREVIOUS, 0); }
		public Previous_temporal_expressionContext previous_temporal_expression() {
			return getRuleContext(Previous_temporal_expressionContext.class,0);
		}
		public PrevPrevPTEContext(Previous_temporal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterPrevPrevPTE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitPrevPrevPTE(this);
		}
	}
	public static class PrevLeftBoolExprRightContext extends Previous_temporal_expressionContext {
		public TerminalNode PREVIOUS() { return getToken(StlDraftParser.PREVIOUS, 0); }
		public TerminalNode LPAREN() { return getToken(StlDraftParser.LPAREN, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(StlDraftParser.RPAREN, 0); }
		public PrevLeftBoolExprRightContext(Previous_temporal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).enterPrevLeftBoolExprRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StlDraftParserListener ) ((StlDraftParserListener)listener).exitPrevLeftBoolExprRight(this);
		}
	}

	public final Previous_temporal_expressionContext previous_temporal_expression() throws RecognitionException {
		Previous_temporal_expressionContext _localctx = new Previous_temporal_expressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_previous_temporal_expression);
		try {
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new PrevIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(PREVIOUS);
				setState(120);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new PrevPrevPTEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(PREVIOUS);
				setState(122);
				previous_temporal_expression();
				}
				break;
			case 3:
				_localctx = new PrevLeftPteRightContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(PREVIOUS);
				setState(124);
				match(LPAREN);
				setState(125);
				previous_temporal_expression();
				setState(126);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new PrevLeftBoolExprRightContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				match(PREVIOUS);
				setState(129);
				match(LPAREN);
				setState(130);
				bool_expression(0);
				setState(131);
				match(RPAREN);
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
		enterRule(_localctx, 8, RULE_all_range_float_literal);
		try {
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				open_float_literal_range();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				close_float_literal_range();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				left_open_float_literal_range();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
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
		enterRule(_localctx, 10, RULE_open_float_literal_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(LPAREN);
			setState(142);
			float_literal_range();
			setState(143);
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
		enterRule(_localctx, 12, RULE_close_float_literal_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(LBRACK);
			setState(146);
			float_literal_range();
			setState(147);
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
		enterRule(_localctx, 14, RULE_left_open_float_literal_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(LPAREN);
			setState(150);
			float_literal_range();
			setState(151);
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
		enterRule(_localctx, 16, RULE_left_closed_float_literal_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(LBRACK);
			setState(154);
			float_literal_range();
			setState(155);
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
		enterRule(_localctx, 18, RULE_float_literal_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			floatNumber();
			setState(158);
			match(COLON);
			setState(159);
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
		enterRule(_localctx, 20, RULE_realComparison);
		try {
			setState(185);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new RealEqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				realExpression(0);
				setState(162);
				match(EQUAL);
				setState(163);
				realExpression(0);
				}
				break;
			case 2:
				_localctx = new RealNotEqualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				realExpression(0);
				setState(166);
				match(NOTEQUAL);
				setState(167);
				realExpression(0);
				}
				break;
			case 3:
				_localctx = new RealLessEqualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				realExpression(0);
				setState(170);
				match(LE);
				setState(171);
				realExpression(0);
				}
				break;
			case 4:
				_localctx = new RealGreaterEqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				realExpression(0);
				setState(174);
				match(GE);
				setState(175);
				realExpression(0);
				}
				break;
			case 5:
				_localctx = new RealGreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				realExpression(0);
				setState(178);
				match(GT);
				setState(179);
				realExpression(0);
				}
				break;
			case 6:
				_localctx = new RealLessThanContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				realExpression(0);
				setState(182);
				match(LT);
				setState(183);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_realExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new RealParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(188);
				match(LPAREN);
				setState(189);
				realExpression(0);
				setState(190);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new RealIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(IDENTIFIER);
				}
				break;
			case SUB:
			case FLOAT_LITERAL:
				{
				_localctx = new RealLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				floatNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(211);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new RealMultiplyContext(new RealExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_realExpression);
						setState(196);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(197);
						match(MUL);
						setState(198);
						realExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new RealDivideContext(new RealExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_realExpression);
						setState(199);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(200);
						match(DIV);
						setState(201);
						realExpression(5);
						}
						break;
					case 3:
						{
						_localctx = new RealAddContext(new RealExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_realExpression);
						setState(202);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(203);
						match(ADD);
						setState(204);
						realExpression(4);
						}
						break;
					case 4:
						{
						_localctx = new RealSubtractContext(new RealExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_realExpression);
						setState(205);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(206);
						match(SUB);
						setState(207);
						realExpression(3);
						}
						break;
					case 5:
						{
						_localctx = new RealAssignContext(new RealExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_realExpression);
						setState(208);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(209);
						match(ASSIGN);
						setState(210);
						realExpression(2);
						}
						break;
					}
					} 
				}
				setState(215);
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
		enterRule(_localctx, 24, RULE_constDeclaration);
		try {
			setState(230);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(CONST);
				setState(217);
				match(BOOL);
				setState(218);
				match(IDENTIFIER);
				setState(219);
				match(ASSIGN);
				setState(220);
				boolValue();
				setState(221);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(CONST);
				setState(224);
				match(REAL);
				setState(225);
				match(IDENTIFIER);
				setState(226);
				match(ASSIGN);
				setState(227);
				floatNumber();
				setState(228);
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
		enterRule(_localctx, 26, RULE_varDeclaration);
		int _la;
		try {
			setState(246);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(BOOL);
				setState(233);
				match(IDENTIFIER);
				setState(236);
				_la = _input.LA(1);
				if (_la==ALIAS) {
					{
					setState(234);
					match(ALIAS);
					setState(235);
					match(IDENTIFIER);
					}
				}

				setState(238);
				match(SEMI);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(REAL);
				setState(240);
				match(IDENTIFIER);
				setState(243);
				_la = _input.LA(1);
				if (_la==ALIAS) {
					{
					setState(241);
					match(ALIAS);
					setState(242);
					match(IDENTIFIER);
					}
				}

				setState(245);
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
		enterRule(_localctx, 28, RULE_floatNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(248);
				match(SUB);
				}
			}

			setState(251);
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
		enterRule(_localctx, 30, RULE_boolValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
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
		case 11:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\66\u0102\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2,\n\2\r\2\16\2-\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\4\3\4\3\4\5\4@\n\4\3\4\3\4\3\4\5\4E"+
		"\n\4\3\4\3\4\3\4\5\4J\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4U\n\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4l\n\4\3\4\3\4\3\4\3\4\5\4r\n\4\3\4\7\4u\n\4\f\4\16\4"+
		"x\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0088"+
		"\n\5\3\6\3\6\3\6\3\6\5\6\u008e\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00bc\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c5\n\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00d6\n\r\f\r\16"+
		"\r\u00d9\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00e9\n\16\3\17\3\17\3\17\3\17\5\17\u00ef\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00f6\n\17\3\17\5\17\u00f9\n\17\3\20\5\20\u00fc"+
		"\n\20\3\20\3\20\3\21\3\21\3\21\2\4\6\30\22\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \2\3\3\2+,\u0124\2+\3\2\2\2\4/\3\2\2\2\6T\3\2\2\2\b\u0087"+
		"\3\2\2\2\n\u008d\3\2\2\2\f\u008f\3\2\2\2\16\u0093\3\2\2\2\20\u0097\3\2"+
		"\2\2\22\u009b\3\2\2\2\24\u009f\3\2\2\2\26\u00bb\3\2\2\2\30\u00c4\3\2\2"+
		"\2\32\u00e8\3\2\2\2\34\u00f8\3\2\2\2\36\u00fb\3\2\2\2 \u00ff\3\2\2\2\""+
		",\5\32\16\2#,\5\34\17\2$,\5\4\3\2%&\5\6\4\2&\'\7\t\2\2\',\3\2\2\2()\5"+
		"\30\r\2)*\7\t\2\2*,\3\2\2\2+\"\3\2\2\2+#\3\2\2\2+$\3\2\2\2+%\3\2\2\2+"+
		"(\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2/\60\7\34\2\2\60\61"+
		"\7\63\2\2\61\62\7\31\2\2\62\63\5\6\4\2\63\64\7\t\2\2\64\5\3\2\2\2\65\66"+
		"\b\4\1\2\66\67\7\62\2\2\67U\5\6\4\178:\7 \2\29;\5\n\6\2:9\3\2\2\2:;\3"+
		"\2\2\2;<\3\2\2\2<U\5\6\4\7=?\7#\2\2>@\5\n\6\2?>\3\2\2\2?@\3\2\2\2@A\3"+
		"\2\2\2AU\5\6\4\6BD\7\36\2\2CE\5\n\6\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FU"+
		"\5\6\4\5GI\7\"\2\2HJ\5\n\6\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KU\5\6\4\4L"+
		"M\7\3\2\2MN\5\6\4\2NO\7\4\2\2OU\3\2\2\2PU\7\63\2\2QU\5 \21\2RU\5\26\f"+
		"\2SU\5\b\5\2T\65\3\2\2\2T8\3\2\2\2T=\3\2\2\2TB\3\2\2\2TG\3\2\2\2TL\3\2"+
		"\2\2TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2Uv\3\2\2\2VW\f\20\2\2WX\7"+
		"\f\2\2Xu\5\6\4\21YZ\f\16\2\2Z[\7-\2\2[u\5\6\4\17\\]\f\r\2\2]^\7.\2\2^"+
		"u\5\6\4\16_`\f\f\2\2`a\7/\2\2au\5\6\4\rbc\f\13\2\2cd\7\60\2\2du\5\6\4"+
		"\fef\f\n\2\2fg\7\61\2\2gu\5\6\4\13hi\f\t\2\2ik\7!\2\2jl\5\n\6\2kj\3\2"+
		"\2\2kl\3\2\2\2lm\3\2\2\2mu\5\6\4\nno\f\b\2\2oq\7$\2\2pr\5\n\6\2qp\3\2"+
		"\2\2qr\3\2\2\2rs\3\2\2\2su\5\6\4\ttV\3\2\2\2tY\3\2\2\2t\\\3\2\2\2t_\3"+
		"\2\2\2tb\3\2\2\2te\3\2\2\2th\3\2\2\2tn\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3"+
		"\2\2\2w\7\3\2\2\2xv\3\2\2\2yz\7\37\2\2z\u0088\7\63\2\2{|\7\37\2\2|\u0088"+
		"\5\b\5\2}~\7\37\2\2~\177\7\3\2\2\177\u0080\5\b\5\2\u0080\u0081\7\4\2\2"+
		"\u0081\u0088\3\2\2\2\u0082\u0083\7\37\2\2\u0083\u0084\7\3\2\2\u0084\u0085"+
		"\5\6\4\2\u0085\u0086\7\4\2\2\u0086\u0088\3\2\2\2\u0087y\3\2\2\2\u0087"+
		"{\3\2\2\2\u0087}\3\2\2\2\u0087\u0082\3\2\2\2\u0088\t\3\2\2\2\u0089\u008e"+
		"\5\f\7\2\u008a\u008e\5\16\b\2\u008b\u008e\5\20\t\2\u008c\u008e\5\22\n"+
		"\2\u008d\u0089\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c"+
		"\3\2\2\2\u008e\13\3\2\2\2\u008f\u0090\7\3\2\2\u0090\u0091\5\24\13\2\u0091"+
		"\u0092\7\4\2\2\u0092\r\3\2\2\2\u0093\u0094\7\7\2\2\u0094\u0095\5\24\13"+
		"\2\u0095\u0096\7\b\2\2\u0096\17\3\2\2\2\u0097\u0098\7\3\2\2\u0098\u0099"+
		"\5\24\13\2\u0099\u009a\7\b\2\2\u009a\21\3\2\2\2\u009b\u009c\7\7\2\2\u009c"+
		"\u009d\5\24\13\2\u009d\u009e\7\4\2\2\u009e\23\3\2\2\2\u009f\u00a0\5\36"+
		"\20\2\u00a0\u00a1\7\31\2\2\u00a1\u00a2\5\36\20\2\u00a2\25\3\2\2\2\u00a3"+
		"\u00a4\5\30\r\2\u00a4\u00a5\7\17\2\2\u00a5\u00a6\5\30\r\2\u00a6\u00bc"+
		"\3\2\2\2\u00a7\u00a8\5\30\r\2\u00a8\u00a9\7\22\2\2\u00a9\u00aa\5\30\r"+
		"\2\u00aa\u00bc\3\2\2\2\u00ab\u00ac\5\30\r\2\u00ac\u00ad\7\20\2\2\u00ad"+
		"\u00ae\5\30\r\2\u00ae\u00bc\3\2\2\2\u00af\u00b0\5\30\r\2\u00b0\u00b1\7"+
		"\21\2\2\u00b1\u00b2\5\30\r\2\u00b2\u00bc\3\2\2\2\u00b3\u00b4\5\30\r\2"+
		"\u00b4\u00b5\7\r\2\2\u00b5\u00b6\5\30\r\2\u00b6\u00bc\3\2\2\2\u00b7\u00b8"+
		"\5\30\r\2\u00b8\u00b9\7\16\2\2\u00b9\u00ba\5\30\r\2\u00ba\u00bc\3\2\2"+
		"\2\u00bb\u00a3\3\2\2\2\u00bb\u00a7\3\2\2\2\u00bb\u00ab\3\2\2\2\u00bb\u00af"+
		"\3\2\2\2\u00bb\u00b3\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bc\27\3\2\2\2\u00bd"+
		"\u00be\b\r\1\2\u00be\u00bf\7\3\2\2\u00bf\u00c0\5\30\r\2\u00c0\u00c1\7"+
		"\4\2\2\u00c1\u00c5\3\2\2\2\u00c2\u00c5\7\63\2\2\u00c3\u00c5\5\36\20\2"+
		"\u00c4\u00bd\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00d7"+
		"\3\2\2\2\u00c6\u00c7\f\7\2\2\u00c7\u00c8\7\25\2\2\u00c8\u00d6\5\30\r\b"+
		"\u00c9\u00ca\f\6\2\2\u00ca\u00cb\7\26\2\2\u00cb\u00d6\5\30\r\7\u00cc\u00cd"+
		"\f\5\2\2\u00cd\u00ce\7\23\2\2\u00ce\u00d6\5\30\r\6\u00cf\u00d0\f\4\2\2"+
		"\u00d0\u00d1\7\24\2\2\u00d1\u00d6\5\30\r\5\u00d2\u00d3\f\3\2\2\u00d3\u00d4"+
		"\7\f\2\2\u00d4\u00d6\5\30\r\4\u00d5\u00c6\3\2\2\2\u00d5\u00c9\3\2\2\2"+
		"\u00d5\u00cc\3\2\2\2\u00d5\u00cf\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d6\u00d9"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\31\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00db\7%\2\2\u00db\u00dc\7\'\2\2\u00dc\u00dd\7\63"+
		"\2\2\u00dd\u00de\7\f\2\2\u00de\u00df\5 \21\2\u00df\u00e0\7\t\2\2\u00e0"+
		"\u00e9\3\2\2\2\u00e1\u00e2\7%\2\2\u00e2\u00e3\7&\2\2\u00e3\u00e4\7\63"+
		"\2\2\u00e4\u00e5\7\f\2\2\u00e5\u00e6\5\36\20\2\u00e6\u00e7\7\t\2\2\u00e7"+
		"\u00e9\3\2\2\2\u00e8\u00da\3\2\2\2\u00e8\u00e1\3\2\2\2\u00e9\33\3\2\2"+
		"\2\u00ea\u00eb\7\'\2\2\u00eb\u00ee\7\63\2\2\u00ec\u00ed\7\35\2\2\u00ed"+
		"\u00ef\7\63\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3"+
		"\2\2\2\u00f0\u00f9\7\t\2\2\u00f1\u00f2\7&\2\2\u00f2\u00f5\7\63\2\2\u00f3"+
		"\u00f4\7\35\2\2\u00f4\u00f6\7\63\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3"+
		"\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\7\t\2\2\u00f8\u00ea\3\2\2\2\u00f8"+
		"\u00f1\3\2\2\2\u00f9\35\3\2\2\2\u00fa\u00fc\7\24\2\2\u00fb\u00fa\3\2\2"+
		"\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7\33\2\2\u00fe"+
		"\37\3\2\2\2\u00ff\u0100\t\2\2\2\u0100!\3\2\2\2\30+-:?DITkqtv\u0087\u008d"+
		"\u00bb\u00c4\u00d5\u00d7\u00e8\u00ee\u00f5\u00f8\u00fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}