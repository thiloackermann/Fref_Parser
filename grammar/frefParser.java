// Generated from fref.g4 by ANTLR 4.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class frefParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LINEBREAK=1, FUNCTION=2, IFLEXER=3, IFCLOSE=4, IFTHEN=5, ELSELEXER=6, 
		DOLEXER=7, DOCLOSE=8, WHILELEXER=9, FUNCDEF=10, VARIABLETYPE=11, VARIABLE=12, 
		FUNCTNAME=13, NUMBER=14, WHITE=15, STRING=16, OA=17, OS=18, OM=19, OD=20, 
		EXPRBRACKOPEN=21, EXPRBRACKCLOSE=22, BRACKOPEN=23, BRACKCLOSE=24, EQ=25, 
		EQUALS=26, PARAKOMMA=27, LT=28, GT=29;
	public static final String[] tokenNames = {
		"<INVALID>", "'!'", "'function'", "'if'", "'fi'", "'then:'", "'else:'", 
		"'do'", "'od'", "'while'", "'#'", "'Number'", "VARIABLE", "FUNCTNAME", 
		"NUMBER", "WHITE", "STRING", "'+'", "'-'", "'*'", "'/'", "'<<'", "'>>'", 
		"'('", "')'", "'=='", "'='", "','", "'<'", "'>'"
	};
	public static final int
		RULE_start = 0, RULE_code = 1, RULE_dclrtn = 2, RULE_dclrtndfntn = 3, 
		RULE_dfntn = 4, RULE_compareKeyword = 5, RULE_condition = 6, RULE_ifelseclause = 7, 
		RULE_ifclause = 8, RULE_dowhileclause = 9, RULE_fnctnPrm = 10, RULE_fnctn = 11, 
		RULE_fnctcall = 12, RULE_emptyExpression = 13, RULE_expression = 14;
	public static final String[] ruleNames = {
		"start", "code", "dclrtn", "dclrtndfntn", "dfntn", "compareKeyword", "condition", 
		"ifelseclause", "ifclause", "dowhileclause", "fnctnPrm", "fnctn", "fnctcall", 
		"emptyExpression", "expression"
	};

	@Override
	public String getGrammarFileName() { return "fref.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public frefParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30); code();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINEBREAK) | (1L << IFLEXER) | (1L << DOLEXER) | (1L << FUNCDEF) | (1L << VARIABLETYPE) | (1L << VARIABLE) | (1L << FUNCTNAME))) != 0) );
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

	public static class CodeContext extends ParserRuleContext {
		public DclrtndfntnContext dclrtndfntn(int i) {
			return getRuleContext(DclrtndfntnContext.class,i);
		}
		public List<FnctnContext> fnctn() {
			return getRuleContexts(FnctnContext.class);
		}
		public List<IfclauseContext> ifclause() {
			return getRuleContexts(IfclauseContext.class);
		}
		public TerminalNode LINEBREAK(int i) {
			return getToken(frefParser.LINEBREAK, i);
		}
		public List<DclrtnContext> dclrtn() {
			return getRuleContexts(DclrtnContext.class);
		}
		public List<FnctcallContext> fnctcall() {
			return getRuleContexts(FnctcallContext.class);
		}
		public IfclauseContext ifclause(int i) {
			return getRuleContext(IfclauseContext.class,i);
		}
		public DowhileclauseContext dowhileclause(int i) {
			return getRuleContext(DowhileclauseContext.class,i);
		}
		public List<DclrtndfntnContext> dclrtndfntn() {
			return getRuleContexts(DclrtndfntnContext.class);
		}
		public IfelseclauseContext ifelseclause(int i) {
			return getRuleContext(IfelseclauseContext.class,i);
		}
		public List<IfelseclauseContext> ifelseclause() {
			return getRuleContexts(IfelseclauseContext.class);
		}
		public EmptyExpressionContext emptyExpression(int i) {
			return getRuleContext(EmptyExpressionContext.class,i);
		}
		public DfntnContext dfntn(int i) {
			return getRuleContext(DfntnContext.class,i);
		}
		public List<DfntnContext> dfntn() {
			return getRuleContexts(DfntnContext.class);
		}
		public List<EmptyExpressionContext> emptyExpression() {
			return getRuleContexts(EmptyExpressionContext.class);
		}
		public List<DowhileclauseContext> dowhileclause() {
			return getRuleContexts(DowhileclauseContext.class);
		}
		public List<TerminalNode> LINEBREAK() { return getTokens(frefParser.LINEBREAK); }
		public DclrtnContext dclrtn(int i) {
			return getRuleContext(DclrtnContext.class,i);
		}
		public FnctcallContext fnctcall(int i) {
			return getRuleContext(FnctcallContext.class,i);
		}
		public FnctnContext fnctn(int i) {
			return getRuleContext(FnctnContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(44);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(35); emptyExpression();
						}
						break;

					case 2:
						{
						setState(36); ifelseclause();
						}
						break;

					case 3:
						{
						setState(37); ifclause();
						}
						break;

					case 4:
						{
						setState(38); dowhileclause();
						}
						break;

					case 5:
						{
						setState(39); fnctn();
						}
						break;

					case 6:
						{
						setState(40); dclrtndfntn();
						}
						break;

					case 7:
						{
						setState(41); dclrtn();
						}
						break;

					case 8:
						{
						setState(42); dfntn();
						}
						break;

					case 9:
						{
						setState(43); fnctcall();
						}
						break;
					}
					setState(46); match(LINEBREAK);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(50); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class DclrtnContext extends ParserRuleContext {
		public DclrtnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dclrtn; }
	 
		public DclrtnContext() { }
		public void copyFrom(DclrtnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationContext extends DclrtnContext {
		public Token type;
		public Token name;
		public TerminalNode VARIABLE() { return getToken(frefParser.VARIABLE, 0); }
		public TerminalNode VARIABLETYPE() { return getToken(frefParser.VARIABLETYPE, 0); }
		public DeclarationContext(DclrtnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).exitDeclaration(this);
		}
	}

	public final DclrtnContext dclrtn() throws RecognitionException {
		DclrtnContext _localctx = new DclrtnContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dclrtn);
		try {
			_localctx = new DeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(52); ((DeclarationContext)_localctx).type = match(VARIABLETYPE);
			setState(53); ((DeclarationContext)_localctx).name = match(VARIABLE);
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

	public static class DclrtndfntnContext extends ParserRuleContext {
		public DclrtndfntnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dclrtndfntn; }
	 
		public DclrtndfntnContext() { }
		public void copyFrom(DclrtndfntnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationDefinitionContext extends DclrtndfntnContext {
		public Token type;
		public Token name;
		public TerminalNode VARIABLE() { return getToken(frefParser.VARIABLE, 0); }
		public TerminalNode EQUALS() { return getToken(frefParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VARIABLETYPE() { return getToken(frefParser.VARIABLETYPE, 0); }
		public DeclarationDefinitionContext(DclrtndfntnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).enterDeclarationDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).exitDeclarationDefinition(this);
		}
	}

	public final DclrtndfntnContext dclrtndfntn() throws RecognitionException {
		DclrtndfntnContext _localctx = new DclrtndfntnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dclrtndfntn);
		try {
			_localctx = new DeclarationDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(55); ((DeclarationDefinitionContext)_localctx).type = match(VARIABLETYPE);
			setState(56); ((DeclarationDefinitionContext)_localctx).name = match(VARIABLE);
			setState(57); match(EQUALS);
			setState(58); expression(0);
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

	public static class DfntnContext extends ParserRuleContext {
		public DfntnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dfntn; }
	 
		public DfntnContext() { }
		public void copyFrom(DfntnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefinitionContext extends DfntnContext {
		public Token name;
		public TerminalNode VARIABLE() { return getToken(frefParser.VARIABLE, 0); }
		public TerminalNode EQUALS() { return getToken(frefParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefinitionContext(DfntnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).exitDefinition(this);
		}
	}

	public final DfntnContext dfntn() throws RecognitionException {
		DfntnContext _localctx = new DfntnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dfntn);
		try {
			_localctx = new DefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(60); ((DefinitionContext)_localctx).name = match(VARIABLE);
			setState(61); match(EQUALS);
			setState(62); expression(0);
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

	public static class CompareKeywordContext extends ParserRuleContext {
		public Token kw;
		public TerminalNode LT() { return getToken(frefParser.LT, 0); }
		public TerminalNode GT() { return getToken(frefParser.GT, 0); }
		public TerminalNode EQ() { return getToken(frefParser.EQ, 0); }
		public CompareKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).enterCompareKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).exitCompareKeyword(this);
		}
	}

	public final CompareKeywordContext compareKeyword() throws RecognitionException {
		CompareKeywordContext _localctx = new CompareKeywordContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_compareKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			((CompareKeywordContext)_localctx).kw = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LT) | (1L << GT))) != 0)) ) {
				((CompareKeywordContext)_localctx).kw = (Token)_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelCondContext extends ConditionContext {
		public ExpressionContext left;
		public CompareKeywordContext operator;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CompareKeywordContext compareKeyword() {
			return getRuleContext(CompareKeywordContext.class,0);
		}
		public RelCondContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).enterRelCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).exitRelCond(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		try {
			_localctx = new RelCondContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(66); ((RelCondContext)_localctx).left = expression(0);
			setState(67); ((RelCondContext)_localctx).operator = compareKeyword();
			setState(68); ((RelCondContext)_localctx).right = expression(0);
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

	public static class IfelseclauseContext extends ParserRuleContext {
		public ConditionContext cond;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode IFLEXER() { return getToken(frefParser.IFLEXER, 0); }
		public TerminalNode IFCLOSE() { return getToken(frefParser.IFCLOSE, 0); }
		public TerminalNode IFTHEN() { return getToken(frefParser.IFTHEN, 0); }
		public TerminalNode ELSELEXER() { return getToken(frefParser.ELSELEXER, 0); }
		public TerminalNode EXPRBRACKCLOSE() { return getToken(frefParser.EXPRBRACKCLOSE, 0); }
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public TerminalNode EXPRBRACKOPEN() { return getToken(frefParser.EXPRBRACKOPEN, 0); }
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public IfelseclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelseclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).enterIfelseclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).exitIfelseclause(this);
		}
	}

	public final IfelseclauseContext ifelseclause() throws RecognitionException {
		IfelseclauseContext _localctx = new IfelseclauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifelseclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(IFLEXER);
			setState(71); match(EXPRBRACKOPEN);
			setState(72); ((IfelseclauseContext)_localctx).cond = condition();
			setState(73); match(EXPRBRACKCLOSE);
			setState(74); match(IFTHEN);
			setState(75); code();
			setState(76); match(ELSELEXER);
			setState(77); code();
			setState(78); match(IFCLOSE);
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

	public static class IfclauseContext extends ParserRuleContext {
		public ConditionContext cond;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode IFLEXER() { return getToken(frefParser.IFLEXER, 0); }
		public TerminalNode IFCLOSE() { return getToken(frefParser.IFCLOSE, 0); }
		public TerminalNode IFTHEN() { return getToken(frefParser.IFTHEN, 0); }
		public TerminalNode EXPRBRACKCLOSE() { return getToken(frefParser.EXPRBRACKCLOSE, 0); }
		public TerminalNode EXPRBRACKOPEN() { return getToken(frefParser.EXPRBRACKOPEN, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public IfclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).enterIfclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).exitIfclause(this);
		}
	}

	public final IfclauseContext ifclause() throws RecognitionException {
		IfclauseContext _localctx = new IfclauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(IFLEXER);
			setState(81); match(EXPRBRACKOPEN);
			setState(82); ((IfclauseContext)_localctx).cond = condition();
			setState(83); match(EXPRBRACKCLOSE);
			setState(84); match(IFTHEN);
			setState(85); code();
			setState(86); match(IFCLOSE);
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

	public static class DowhileclauseContext extends ParserRuleContext {
		public ConditionContext cond;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode DOLEXER() { return getToken(frefParser.DOLEXER, 0); }
		public TerminalNode DOCLOSE() { return getToken(frefParser.DOCLOSE, 0); }
		public TerminalNode EXPRBRACKCLOSE() { return getToken(frefParser.EXPRBRACKCLOSE, 0); }
		public TerminalNode WHILELEXER() { return getToken(frefParser.WHILELEXER, 0); }
		public TerminalNode EXPRBRACKOPEN() { return getToken(frefParser.EXPRBRACKOPEN, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public DowhileclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhileclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).enterDowhileclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).exitDowhileclause(this);
		}
	}

	public final DowhileclauseContext dowhileclause() throws RecognitionException {
		DowhileclauseContext _localctx = new DowhileclauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dowhileclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(DOLEXER);
			setState(89); code();
			setState(90); match(WHILELEXER);
			setState(91); match(EXPRBRACKOPEN);
			setState(92); ((DowhileclauseContext)_localctx).cond = condition();
			setState(93); match(EXPRBRACKCLOSE);
			setState(94); match(DOCLOSE);
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

	public static class FnctnPrmContext extends ParserRuleContext {
		public FnctnPrmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnctnPrm; }
	 
		public FnctnPrmContext() { }
		public void copyFrom(FnctnPrmContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionParameterContext extends FnctnPrmContext {
		public Token type;
		public Token name;
		public TerminalNode VARIABLE() { return getToken(frefParser.VARIABLE, 0); }
		public TerminalNode VARIABLETYPE() { return getToken(frefParser.VARIABLETYPE, 0); }
		public FunctionParameterContext(FnctnPrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).enterFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).exitFunctionParameter(this);
		}
	}

	public final FnctnPrmContext fnctnPrm() throws RecognitionException {
		FnctnPrmContext _localctx = new FnctnPrmContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fnctnPrm);
		try {
			_localctx = new FunctionParameterContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(96); ((FunctionParameterContext)_localctx).type = match(VARIABLETYPE);
			setState(97); ((FunctionParameterContext)_localctx).name = match(VARIABLE);
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

	public static class FnctnContext extends ParserRuleContext {
		public Token functionname;
		public Token ret;
		public TerminalNode EXPRBRACKOPEN(int i) {
			return getToken(frefParser.EXPRBRACKOPEN, i);
		}
		public FnctnPrmContext fnctnPrm(int i) {
			return getRuleContext(FnctnPrmContext.class,i);
		}
		public List<TerminalNode> PARAKOMMA() { return getTokens(frefParser.PARAKOMMA); }
		public TerminalNode EXPRBRACKCLOSE(int i) {
			return getToken(frefParser.EXPRBRACKCLOSE, i);
		}
		public TerminalNode PARAKOMMA(int i) {
			return getToken(frefParser.PARAKOMMA, i);
		}
		public TerminalNode FUNCDEF(int i) {
			return getToken(frefParser.FUNCDEF, i);
		}
		public List<TerminalNode> EXPRBRACKCLOSE() { return getTokens(frefParser.EXPRBRACKCLOSE); }
		public TerminalNode FUNCTNAME() { return getToken(frefParser.FUNCTNAME, 0); }
		public List<TerminalNode> EXPRBRACKOPEN() { return getTokens(frefParser.EXPRBRACKOPEN); }
		public List<FnctnPrmContext> fnctnPrm() {
			return getRuleContexts(FnctnPrmContext.class);
		}
		public TerminalNode VARIABLETYPE() { return getToken(frefParser.VARIABLETYPE, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public List<TerminalNode> FUNCDEF() { return getTokens(frefParser.FUNCDEF); }
		public FnctnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnctn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).enterFnctn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).exitFnctn(this);
		}
	}

	public final FnctnContext fnctn() throws RecognitionException {
		FnctnContext _localctx = new FnctnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fnctn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(FUNCDEF);
			setState(100); ((FnctnContext)_localctx).functionname = match(FUNCTNAME);
			setState(101); match(EXPRBRACKOPEN);
			setState(110);
			_la = _input.LA(1);
			if (_la==VARIABLETYPE) {
				{
				setState(102); fnctnPrm();
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PARAKOMMA) {
					{
					{
					setState(103); match(PARAKOMMA);
					setState(104); fnctnPrm();
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(112); match(EXPRBRACKCLOSE);
			setState(113); match(EXPRBRACKOPEN);
			setState(114); ((FnctnContext)_localctx).ret = match(VARIABLETYPE);
			setState(115); match(EXPRBRACKCLOSE);
			setState(116); code();
			setState(117); match(FUNCDEF);
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

	public static class FnctcallContext extends ParserRuleContext {
		public Token functionname;
		public FnctnPrmContext fnctnPrm(int i) {
			return getRuleContext(FnctnPrmContext.class,i);
		}
		public List<TerminalNode> PARAKOMMA() { return getTokens(frefParser.PARAKOMMA); }
		public TerminalNode PARAKOMMA(int i) {
			return getToken(frefParser.PARAKOMMA, i);
		}
		public TerminalNode EXPRBRACKCLOSE() { return getToken(frefParser.EXPRBRACKCLOSE, 0); }
		public TerminalNode FUNCTNAME() { return getToken(frefParser.FUNCTNAME, 0); }
		public TerminalNode EXPRBRACKOPEN() { return getToken(frefParser.EXPRBRACKOPEN, 0); }
		public List<FnctnPrmContext> fnctnPrm() {
			return getRuleContexts(FnctnPrmContext.class);
		}
		public FnctcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnctcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).enterFnctcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).exitFnctcall(this);
		}
	}

	public final FnctcallContext fnctcall() throws RecognitionException {
		FnctcallContext _localctx = new FnctcallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fnctcall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); ((FnctcallContext)_localctx).functionname = match(FUNCTNAME);
			setState(120); match(EXPRBRACKOPEN);
			setState(129);
			_la = _input.LA(1);
			if (_la==VARIABLETYPE) {
				{
				setState(121); fnctnPrm();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PARAKOMMA) {
					{
					{
					setState(122); match(PARAKOMMA);
					setState(123); fnctnPrm();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(131); match(EXPRBRACKCLOSE);
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

	public static class EmptyExpressionContext extends ParserRuleContext {
		public EmptyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyExpression; }
	 
		public EmptyExpressionContext() { }
		public void copyFrom(EmptyExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionWithoutStatementContext extends EmptyExpressionContext {
		public ExpressionWithoutStatementContext(EmptyExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).enterExpressionWithoutStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).exitExpressionWithoutStatement(this);
		}
	}

	public final EmptyExpressionContext emptyExpression() throws RecognitionException {
		EmptyExpressionContext _localctx = new EmptyExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_emptyExpression);
		try {
			_localctx = new ExpressionWithoutStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubtractionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode OS() { return getToken(frefParser.OS, 0); }
		public SubtractionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).exitSubtraction(this);
		}
	}
	public static class VariableContext extends ExpressionContext {
		public Token variable;
		public TerminalNode VARIABLE() { return getToken(frefParser.VARIABLE, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).exitVariable(this);
		}
	}
	public static class NumberContext extends ExpressionContext {
		public Token number;
		public TerminalNode NUMBER() { return getToken(frefParser.NUMBER, 0); }
		public NumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).exitNumber(this);
		}
	}
	public static class EmptyContext extends ExpressionContext {
		public EmptyExpressionContext empex;
		public EmptyExpressionContext emptyExpression() {
			return getRuleContext(EmptyExpressionContext.class,0);
		}
		public EmptyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).exitEmpty(this);
		}
	}
	public static class FuncCallContext extends ExpressionContext {
		public FnctcallContext func;
		public FnctcallContext fnctcall() {
			return getRuleContext(FnctcallContext.class,0);
		}
		public FuncCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).exitFuncCall(this);
		}
	}
	public static class MultDivisionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OM() { return getToken(frefParser.OM, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode OD() { return getToken(frefParser.OD, 0); }
		public MultDivisionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).enterMultDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).exitMultDivision(this);
		}
	}
	public static class BracketsContext extends ExpressionContext {
		public ExpressionContext inBrackets;
		public TerminalNode BRACKOPEN() { return getToken(frefParser.BRACKOPEN, 0); }
		public TerminalNode BRACKCLOSE() { return getToken(frefParser.BRACKCLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracketsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).enterBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).exitBrackets(this);
		}
	}
	public static class AdditionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OA() { return getToken(frefParser.OA, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AdditionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof frefListener ) ((frefListener)listener).exitAddition(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new BracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(136); match(BRACKOPEN);
				setState(137); ((BracketsContext)_localctx).inBrackets = expression(0);
				setState(138); match(BRACKCLOSE);
				}
				break;

			case 2:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140); ((NumberContext)_localctx).number = match(NUMBER);
				}
				break;

			case 3:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141); ((VariableContext)_localctx).variable = match(VARIABLE);
				}
				break;

			case 4:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142); ((FuncCallContext)_localctx).func = fnctcall();
				}
				break;

			case 5:
				{
				_localctx = new EmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143); ((EmptyContext)_localctx).empex = emptyExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(158);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivisionContext(new ExpressionContext(_parentctx, _parentState));
						((MultDivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(146);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(149);
						switch (_input.LA(1)) {
						case OM:
							{
							setState(147); ((MultDivisionContext)_localctx).operator = match(OM);
							}
							break;
						case OD:
							{
							setState(148); ((MultDivisionContext)_localctx).operator = match(OD);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(151); ((MultDivisionContext)_localctx).right = expression(5);
						}
						break;

					case 2:
						{
						_localctx = new SubtractionContext(new ExpressionContext(_parentctx, _parentState));
						((SubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(152);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(153); ((SubtractionContext)_localctx).operator = match(OS);
						setState(154); ((SubtractionContext)_localctx).right = expression(4);
						}
						break;

					case 3:
						{
						_localctx = new AdditionContext(new ExpressionContext(_parentctx, _parentState));
						((AdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(155);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(156); ((AdditionContext)_localctx).operator = match(OA);
						setState(157); ((AdditionContext)_localctx).right = expression(3);
						}
						break;
					}
					} 
				}
				setState(162);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);

		case 1: return precpred(_ctx, 3);

		case 2: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u00a6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2"+
		"\16\2#\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\3\3\3\6\3\63\n\3"+
		"\r\3\16\3\64\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\7\rl\n\r\f\r\16\ro\13\r\5\rq\n\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\177\n\16\f\16\16\16\u0082"+
		"\13\16\5\16\u0084\n\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\5\20\u0093\n\20\3\20\3\20\3\20\5\20\u0098\n\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00a1\n\20\f\20\16\20\u00a4\13\20"+
		"\3\20\2\3\36\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\3\4\2\33\33\36"+
		"\37\u00ac\2!\3\2\2\2\4\62\3\2\2\2\6\66\3\2\2\2\b9\3\2\2\2\n>\3\2\2\2\f"+
		"B\3\2\2\2\16D\3\2\2\2\20H\3\2\2\2\22R\3\2\2\2\24Z\3\2\2\2\26b\3\2\2\2"+
		"\30e\3\2\2\2\32y\3\2\2\2\34\u0087\3\2\2\2\36\u0092\3\2\2\2 \"\5\4\3\2"+
		"! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%/\5\34\17\2&/\5\20"+
		"\t\2\'/\5\22\n\2(/\5\24\13\2)/\5\30\r\2*/\5\b\5\2+/\5\6\4\2,/\5\n\6\2"+
		"-/\5\32\16\2.%\3\2\2\2.&\3\2\2\2.\'\3\2\2\2.(\3\2\2\2.)\3\2\2\2.*\3\2"+
		"\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\60\3\2\2\2\60\61\7\3\2\2\61\63\3\2"+
		"\2\2\62.\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\5\3\2\2"+
		"\2\66\67\7\r\2\2\678\7\16\2\28\7\3\2\2\29:\7\r\2\2:;\7\16\2\2;<\7\34\2"+
		"\2<=\5\36\20\2=\t\3\2\2\2>?\7\16\2\2?@\7\34\2\2@A\5\36\20\2A\13\3\2\2"+
		"\2BC\t\2\2\2C\r\3\2\2\2DE\5\36\20\2EF\5\f\7\2FG\5\36\20\2G\17\3\2\2\2"+
		"HI\7\5\2\2IJ\7\27\2\2JK\5\16\b\2KL\7\30\2\2LM\7\7\2\2MN\5\4\3\2NO\7\b"+
		"\2\2OP\5\4\3\2PQ\7\6\2\2Q\21\3\2\2\2RS\7\5\2\2ST\7\27\2\2TU\5\16\b\2U"+
		"V\7\30\2\2VW\7\7\2\2WX\5\4\3\2XY\7\6\2\2Y\23\3\2\2\2Z[\7\t\2\2[\\\5\4"+
		"\3\2\\]\7\13\2\2]^\7\27\2\2^_\5\16\b\2_`\7\30\2\2`a\7\n\2\2a\25\3\2\2"+
		"\2bc\7\r\2\2cd\7\16\2\2d\27\3\2\2\2ef\7\f\2\2fg\7\17\2\2gp\7\27\2\2hm"+
		"\5\26\f\2ij\7\35\2\2jl\5\26\f\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2"+
		"\2nq\3\2\2\2om\3\2\2\2ph\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\30\2\2st\7\27"+
		"\2\2tu\7\r\2\2uv\7\30\2\2vw\5\4\3\2wx\7\f\2\2x\31\3\2\2\2yz\7\17\2\2z"+
		"\u0083\7\27\2\2{\u0080\5\26\f\2|}\7\35\2\2}\177\5\26\f\2~|\3\2\2\2\177"+
		"\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084\3\2\2\2"+
		"\u0082\u0080\3\2\2\2\u0083{\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3"+
		"\2\2\2\u0085\u0086\7\30\2\2\u0086\33\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\35\3\2\2\2\u0089\u008a\b\20\1\2\u008a\u008b\7\31\2\2\u008b\u008c\5\36"+
		"\20\2\u008c\u008d\7\32\2\2\u008d\u0093\3\2\2\2\u008e\u0093\7\20\2\2\u008f"+
		"\u0093\7\16\2\2\u0090\u0093\5\32\16\2\u0091\u0093\5\34\17\2\u0092\u0089"+
		"\3\2\2\2\u0092\u008e\3\2\2\2\u0092\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0091\3\2\2\2\u0093\u00a2\3\2\2\2\u0094\u0097\f\6\2\2\u0095\u0098\7\25"+
		"\2\2\u0096\u0098\7\26\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u00a1\5\36\20\7\u009a\u009b\f\5\2\2\u009b\u009c\7"+
		"\24\2\2\u009c\u00a1\5\36\20\6\u009d\u009e\f\4\2\2\u009e\u009f\7\23\2\2"+
		"\u009f\u00a1\5\36\20\5\u00a0\u0094\3\2\2\2\u00a0\u009a\3\2\2\2\u00a0\u009d"+
		"\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\37\3\2\2\2\u00a4\u00a2\3\2\2\2\r#.\64mp\u0080\u0083\u0092\u0097\u00a0"+
		"\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}