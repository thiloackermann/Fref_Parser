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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitStart(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitDeclarationDefinition(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitCompareKeyword(this);
			else return visitor.visitChildren(this);
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
	public static class GTCondContext extends ConditionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode GT() { return getToken(frefParser.GT, 0); }
		public GTCondContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitGTCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LTCondContext extends ConditionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(frefParser.LT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public LTCondContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitLTCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EQCondContext extends ConditionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode EQ() { return getToken(frefParser.EQ, 0); }
		public EQCondContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitEQCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		try {
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new EQCondContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66); ((EQCondContext)_localctx).left = expression(0);
				setState(67); ((EQCondContext)_localctx).operator = match(EQ);
				setState(68); ((EQCondContext)_localctx).right = expression(0);
				}
				break;

			case 2:
				_localctx = new LTCondContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70); ((LTCondContext)_localctx).left = expression(0);
				setState(71); ((LTCondContext)_localctx).operator = match(LT);
				setState(72); ((LTCondContext)_localctx).right = expression(0);
				}
				break;

			case 3:
				_localctx = new GTCondContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(74); ((GTCondContext)_localctx).left = expression(0);
				setState(75); ((GTCondContext)_localctx).operator = match(GT);
				setState(76); ((GTCondContext)_localctx).right = expression(0);
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

	public static class IfelseclauseContext extends ParserRuleContext {
		public ConditionContext cond;
		public CodeContext ifcode;
		public CodeContext elsecode;
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitIfelseclause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfelseclauseContext ifelseclause() throws RecognitionException {
		IfelseclauseContext _localctx = new IfelseclauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifelseclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(IFLEXER);
			setState(81); match(EXPRBRACKOPEN);
			setState(82); ((IfelseclauseContext)_localctx).cond = condition();
			setState(83); match(EXPRBRACKCLOSE);
			setState(84); match(IFTHEN);
			setState(85); ((IfelseclauseContext)_localctx).ifcode = code();
			setState(86); match(ELSELEXER);
			setState(87); ((IfelseclauseContext)_localctx).elsecode = code();
			setState(88); match(IFCLOSE);
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
		public CodeContext ifcode;
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitIfclause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfclauseContext ifclause() throws RecognitionException {
		IfclauseContext _localctx = new IfclauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(IFLEXER);
			setState(91); match(EXPRBRACKOPEN);
			setState(92); ((IfclauseContext)_localctx).cond = condition();
			setState(93); match(EXPRBRACKCLOSE);
			setState(94); match(IFTHEN);
			setState(95); ((IfclauseContext)_localctx).ifcode = code();
			setState(96); match(IFCLOSE);
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
		public CodeContext docode;
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitDowhileclause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DowhileclauseContext dowhileclause() throws RecognitionException {
		DowhileclauseContext _localctx = new DowhileclauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dowhileclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(DOLEXER);
			setState(99); ((DowhileclauseContext)_localctx).docode = code();
			setState(100); match(WHILELEXER);
			setState(101); match(EXPRBRACKOPEN);
			setState(102); ((DowhileclauseContext)_localctx).cond = condition();
			setState(103); match(EXPRBRACKCLOSE);
			setState(104); match(DOCLOSE);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnctnPrmContext fnctnPrm() throws RecognitionException {
		FnctnPrmContext _localctx = new FnctnPrmContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fnctnPrm);
		try {
			_localctx = new FunctionParameterContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(106); ((FunctionParameterContext)_localctx).type = match(VARIABLETYPE);
			setState(107); ((FunctionParameterContext)_localctx).name = match(VARIABLE);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitFnctn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnctnContext fnctn() throws RecognitionException {
		FnctnContext _localctx = new FnctnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fnctn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(FUNCDEF);
			setState(110); ((FnctnContext)_localctx).functionname = match(FUNCTNAME);
			setState(111); match(EXPRBRACKOPEN);
			setState(120);
			_la = _input.LA(1);
			if (_la==VARIABLETYPE) {
				{
				setState(112); fnctnPrm();
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PARAKOMMA) {
					{
					{
					setState(113); match(PARAKOMMA);
					setState(114); fnctnPrm();
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(122); match(EXPRBRACKCLOSE);
			setState(123); match(EXPRBRACKOPEN);
			setState(124); ((FnctnContext)_localctx).ret = match(VARIABLETYPE);
			setState(125); match(EXPRBRACKCLOSE);
			setState(126); code();
			setState(127); match(FUNCDEF);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitFnctcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnctcallContext fnctcall() throws RecognitionException {
		FnctcallContext _localctx = new FnctcallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fnctcall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); ((FnctcallContext)_localctx).functionname = match(FUNCTNAME);
			setState(130); match(EXPRBRACKOPEN);
			setState(139);
			_la = _input.LA(1);
			if (_la==VARIABLETYPE) {
				{
				setState(131); fnctnPrm();
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PARAKOMMA) {
					{
					{
					setState(132); match(PARAKOMMA);
					setState(133); fnctnPrm();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(141); match(EXPRBRACKCLOSE);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitExpressionWithoutStatement(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExpressionContext {
		public Token variable;
		public TerminalNode VARIABLE() { return getToken(frefParser.VARIABLE, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ExpressionContext {
		public Token number;
		public TerminalNode NUMBER() { return getToken(frefParser.NUMBER, 0); }
		public NumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyContext extends ExpressionContext {
		public EmptyExpressionContext empex;
		public EmptyExpressionContext emptyExpression() {
			return getRuleContext(EmptyExpressionContext.class,0);
		}
		public EmptyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallContext extends ExpressionContext {
		public FnctcallContext func;
		public FnctcallContext fnctcall() {
			return getRuleContext(FnctcallContext.class,0);
		}
		public FuncCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitMultDivision(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitBrackets(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
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
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new BracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(146); match(BRACKOPEN);
				setState(147); ((BracketsContext)_localctx).inBrackets = expression(0);
				setState(148); match(BRACKCLOSE);
				}
				break;

			case 2:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150); ((NumberContext)_localctx).number = match(NUMBER);
				}
				break;

			case 3:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151); ((VariableContext)_localctx).variable = match(VARIABLE);
				}
				break;

			case 4:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152); ((FuncCallContext)_localctx).func = fnctcall();
				}
				break;

			case 5:
				{
				_localctx = new EmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153); ((EmptyContext)_localctx).empex = emptyExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(168);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivisionContext(new ExpressionContext(_parentctx, _parentState));
						((MultDivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(156);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(159);
						switch (_input.LA(1)) {
						case OM:
							{
							setState(157); ((MultDivisionContext)_localctx).operator = match(OM);
							}
							break;
						case OD:
							{
							setState(158); ((MultDivisionContext)_localctx).operator = match(OD);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(161); ((MultDivisionContext)_localctx).right = expression(5);
						}
						break;

					case 2:
						{
						_localctx = new SubtractionContext(new ExpressionContext(_parentctx, _parentState));
						((SubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(162);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(163); ((SubtractionContext)_localctx).operator = match(OS);
						setState(164); ((SubtractionContext)_localctx).right = expression(4);
						}
						break;

					case 3:
						{
						_localctx = new AdditionContext(new ExpressionContext(_parentctx, _parentState));
						((AdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(166); ((AdditionContext)_localctx).operator = match(OA);
						setState(167); ((AdditionContext)_localctx).right = expression(3);
						}
						break;
					}
					} 
				}
				setState(172);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u00b0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2"+
		"\16\2#\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\3\3\3\6\3\63\n\3"+
		"\r\3\16\3\64\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bQ\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\rv"+
		"\n\r\f\r\16\ry\13\r\5\r{\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u0089\n\16\f\16\16\16\u008c\13\16\5\16\u008e\n\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u009d"+
		"\n\20\3\20\3\20\3\20\5\20\u00a2\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u00ab\n\20\f\20\16\20\u00ae\13\20\3\20\2\3\36\21\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36\2\3\4\2\33\33\36\37\u00b8\2!\3\2\2\2\4\62\3\2"+
		"\2\2\6\66\3\2\2\2\b9\3\2\2\2\n>\3\2\2\2\fB\3\2\2\2\16P\3\2\2\2\20R\3\2"+
		"\2\2\22\\\3\2\2\2\24d\3\2\2\2\26l\3\2\2\2\30o\3\2\2\2\32\u0083\3\2\2\2"+
		"\34\u0091\3\2\2\2\36\u009c\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"#\3\2\2\2#!\3"+
		"\2\2\2#$\3\2\2\2$\3\3\2\2\2%/\5\34\17\2&/\5\20\t\2\'/\5\22\n\2(/\5\24"+
		"\13\2)/\5\30\r\2*/\5\b\5\2+/\5\6\4\2,/\5\n\6\2-/\5\32\16\2.%\3\2\2\2."+
		"&\3\2\2\2.\'\3\2\2\2.(\3\2\2\2.)\3\2\2\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2"+
		".-\3\2\2\2/\60\3\2\2\2\60\61\7\3\2\2\61\63\3\2\2\2\62.\3\2\2\2\63\64\3"+
		"\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\5\3\2\2\2\66\67\7\r\2\2\678\7\16"+
		"\2\28\7\3\2\2\29:\7\r\2\2:;\7\16\2\2;<\7\34\2\2<=\5\36\20\2=\t\3\2\2\2"+
		">?\7\16\2\2?@\7\34\2\2@A\5\36\20\2A\13\3\2\2\2BC\t\2\2\2C\r\3\2\2\2DE"+
		"\5\36\20\2EF\7\33\2\2FG\5\36\20\2GQ\3\2\2\2HI\5\36\20\2IJ\7\36\2\2JK\5"+
		"\36\20\2KQ\3\2\2\2LM\5\36\20\2MN\7\37\2\2NO\5\36\20\2OQ\3\2\2\2PD\3\2"+
		"\2\2PH\3\2\2\2PL\3\2\2\2Q\17\3\2\2\2RS\7\5\2\2ST\7\27\2\2TU\5\16\b\2U"+
		"V\7\30\2\2VW\7\7\2\2WX\5\4\3\2XY\7\b\2\2YZ\5\4\3\2Z[\7\6\2\2[\21\3\2\2"+
		"\2\\]\7\5\2\2]^\7\27\2\2^_\5\16\b\2_`\7\30\2\2`a\7\7\2\2ab\5\4\3\2bc\7"+
		"\6\2\2c\23\3\2\2\2de\7\t\2\2ef\5\4\3\2fg\7\13\2\2gh\7\27\2\2hi\5\16\b"+
		"\2ij\7\30\2\2jk\7\n\2\2k\25\3\2\2\2lm\7\r\2\2mn\7\16\2\2n\27\3\2\2\2o"+
		"p\7\f\2\2pq\7\17\2\2qz\7\27\2\2rw\5\26\f\2st\7\35\2\2tv\5\26\f\2us\3\2"+
		"\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x{\3\2\2\2yw\3\2\2\2zr\3\2\2\2z{\3\2"+
		"\2\2{|\3\2\2\2|}\7\30\2\2}~\7\27\2\2~\177\7\r\2\2\177\u0080\7\30\2\2\u0080"+
		"\u0081\5\4\3\2\u0081\u0082\7\f\2\2\u0082\31\3\2\2\2\u0083\u0084\7\17\2"+
		"\2\u0084\u008d\7\27\2\2\u0085\u008a\5\26\f\2\u0086\u0087\7\35\2\2\u0087"+
		"\u0089\5\26\f\2\u0088\u0086\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3"+
		"\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008d"+
		"\u0085\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\30"+
		"\2\2\u0090\33\3\2\2\2\u0091\u0092\3\2\2\2\u0092\35\3\2\2\2\u0093\u0094"+
		"\b\20\1\2\u0094\u0095\7\31\2\2\u0095\u0096\5\36\20\2\u0096\u0097\7\32"+
		"\2\2\u0097\u009d\3\2\2\2\u0098\u009d\7\20\2\2\u0099\u009d\7\16\2\2\u009a"+
		"\u009d\5\32\16\2\u009b\u009d\5\34\17\2\u009c\u0093\3\2\2\2\u009c\u0098"+
		"\3\2\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d"+
		"\u00ac\3\2\2\2\u009e\u00a1\f\6\2\2\u009f\u00a2\7\25\2\2\u00a0\u00a2\7"+
		"\26\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00ab\5\36\20\7\u00a4\u00a5\f\5\2\2\u00a5\u00a6\7\24\2\2\u00a6\u00ab"+
		"\5\36\20\6\u00a7\u00a8\f\4\2\2\u00a8\u00a9\7\23\2\2\u00a9\u00ab\5\36\20"+
		"\5\u00aa\u009e\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\37\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\16#.\64Pwz\u008a\u008d\u009c\u00a1\u00aa\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}