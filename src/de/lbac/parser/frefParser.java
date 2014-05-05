// Generated from grammar/fref.g4 by ANTLR 4.2
package de.lbac.parser;
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
		DOLEXER=7, DOCLOSE=8, WHILELEXER=9, RETURNLEXER=10, FUNCDEF=11, VARIABLETYPE=12, 
		VARIABLE=13, FUNCTNAME=14, NUMBER=15, WHITE=16, STRING=17, OA=18, OS=19, 
		OM=20, OD=21, OK=22, EXPRBRACKOPEN=23, EXPRBRACKCLOSE=24, BRACKOPEN=25, 
		BRACKCLOSE=26, EQ=27, EQUALS=28, PARAKOMMA=29, LT=30, GT=31;
	public static final String[] tokenNames = {
		"<INVALID>", "'!'", "'function'", "'if'", "'fi'", "'then:'", "'else:'", 
		"'do'", "'od'", "'while'", "'return'", "'#'", "VARIABLETYPE", "VARIABLE", 
		"FUNCTNAME", "NUMBER", "WHITE", "STRING", "'+'", "'-'", "'*'", "'/'", 
		"'~'", "'<<'", "'>>'", "'('", "')'", "'=='", "'='", "','", "'<'", "'>'"
	};
	public static final int
		RULE_start = 0, RULE_code = 1, RULE_dclrtn = 2, RULE_dclrtndfntn = 3, 
		RULE_dfntn = 4, RULE_compareKeyword = 5, RULE_condition = 6, RULE_ifelseclause = 7, 
		RULE_ifclause = 8, RULE_dowhileclause = 9, RULE_fnctnPrm = 10, RULE_retValue = 11, 
		RULE_fnctn = 12, RULE_fnctcall = 13, RULE_expList = 14, RULE_emptyExpression = 15, 
		RULE_expression = 16;
	public static final String[] ruleNames = {
		"start", "code", "dclrtn", "dclrtndfntn", "dfntn", "compareKeyword", "condition", 
		"ifelseclause", "ifclause", "dowhileclause", "fnctnPrm", "retValue", "fnctn", 
		"fnctcall", "expList", "emptyExpression", "expression"
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
		public List<FnctnContext> fnctn() {
			return getRuleContexts(FnctnContext.class);
		}
		public FnctnContext fnctn(int i) {
			return getRuleContext(FnctnContext.class,i);
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
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34); fnctn();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNCDEF );
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(39); emptyExpression();
					}
					break;

				case 2:
					{
					setState(40); ifelseclause();
					}
					break;

				case 3:
					{
					setState(41); ifclause();
					}
					break;

				case 4:
					{
					setState(42); dowhileclause();
					}
					break;

				case 5:
					{
					setState(43); dclrtndfntn();
					}
					break;

				case 6:
					{
					setState(44); dclrtn();
					}
					break;

				case 7:
					{
					setState(45); dfntn();
					}
					break;

				case 8:
					{
					setState(46); fnctcall();
					}
					break;
				}
				setState(49); match(LINEBREAK);
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINEBREAK) | (1L << IFLEXER) | (1L << DOLEXER) | (1L << VARIABLETYPE) | (1L << VARIABLE) | (1L << FUNCTNAME))) != 0) );
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
			setState(55); ((DeclarationContext)_localctx).type = match(VARIABLETYPE);
			setState(56); ((DeclarationContext)_localctx).name = match(VARIABLE);
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
			setState(58); ((DeclarationDefinitionContext)_localctx).type = match(VARIABLETYPE);
			setState(59); ((DeclarationDefinitionContext)_localctx).name = match(VARIABLE);
			setState(60); match(EQUALS);
			setState(61); expression(0);
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
			setState(63); ((DefinitionContext)_localctx).name = match(VARIABLE);
			setState(64); match(EQUALS);
			setState(65); expression(0);
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
			setState(67);
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
			setState(81);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new EQCondContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69); ((EQCondContext)_localctx).left = expression(0);
				setState(70); ((EQCondContext)_localctx).operator = match(EQ);
				setState(71); ((EQCondContext)_localctx).right = expression(0);
				}
				break;

			case 2:
				_localctx = new LTCondContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73); ((LTCondContext)_localctx).left = expression(0);
				setState(74); ((LTCondContext)_localctx).operator = match(LT);
				setState(75); ((LTCondContext)_localctx).right = expression(0);
				}
				break;

			case 3:
				_localctx = new GTCondContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(77); ((GTCondContext)_localctx).left = expression(0);
				setState(78); ((GTCondContext)_localctx).operator = match(GT);
				setState(79); ((GTCondContext)_localctx).right = expression(0);
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
			setState(83); match(IFLEXER);
			setState(84); match(EXPRBRACKOPEN);
			setState(85); ((IfelseclauseContext)_localctx).cond = condition();
			setState(86); match(EXPRBRACKCLOSE);
			setState(87); match(IFTHEN);
			setState(88); ((IfelseclauseContext)_localctx).ifcode = code();
			setState(89); match(ELSELEXER);
			setState(90); ((IfelseclauseContext)_localctx).elsecode = code();
			setState(91); match(IFCLOSE);
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
			setState(93); match(IFLEXER);
			setState(94); match(EXPRBRACKOPEN);
			setState(95); ((IfclauseContext)_localctx).cond = condition();
			setState(96); match(EXPRBRACKCLOSE);
			setState(97); match(IFTHEN);
			setState(98); ((IfclauseContext)_localctx).ifcode = code();
			setState(99); match(IFCLOSE);
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
			setState(101); match(DOLEXER);
			setState(102); ((DowhileclauseContext)_localctx).docode = code();
			setState(103); match(WHILELEXER);
			setState(104); match(EXPRBRACKOPEN);
			setState(105); ((DowhileclauseContext)_localctx).cond = condition();
			setState(106); match(EXPRBRACKCLOSE);
			setState(107); match(DOCLOSE);
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
		public DclrtnContext dclrtn;
		public List<DclrtnContext> declarations = new ArrayList<DclrtnContext>();
		public List<DclrtnContext> dclrtn() {
			return getRuleContexts(DclrtnContext.class);
		}
		public List<TerminalNode> PARAKOMMA() { return getTokens(frefParser.PARAKOMMA); }
		public TerminalNode PARAKOMMA(int i) {
			return getToken(frefParser.PARAKOMMA, i);
		}
		public DclrtnContext dclrtn(int i) {
			return getRuleContext(DclrtnContext.class,i);
		}
		public FunctionParameterContext(FnctnPrmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyParamContext extends FnctnPrmContext {
		public EmptyExpressionContext emptyExpression() {
			return getRuleContext(EmptyExpressionContext.class,0);
		}
		public EmptyParamContext(FnctnPrmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitEmptyParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnctnPrmContext fnctnPrm() throws RecognitionException {
		FnctnPrmContext _localctx = new FnctnPrmContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fnctnPrm);
		int _la;
		try {
			setState(118);
			switch (_input.LA(1)) {
			case VARIABLETYPE:
				_localctx = new FunctionParameterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(109); ((FunctionParameterContext)_localctx).dclrtn = dclrtn();
				((FunctionParameterContext)_localctx).declarations.add(((FunctionParameterContext)_localctx).dclrtn);
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PARAKOMMA) {
					{
					{
					setState(110); match(PARAKOMMA);
					setState(111); ((FunctionParameterContext)_localctx).dclrtn = dclrtn();
					((FunctionParameterContext)_localctx).declarations.add(((FunctionParameterContext)_localctx).dclrtn);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case EXPRBRACKCLOSE:
				_localctx = new EmptyParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117); emptyExpression();
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

	public static class RetValueContext extends ParserRuleContext {
		public Token name;
		public TerminalNode VARIABLE() { return getToken(frefParser.VARIABLE, 0); }
		public TerminalNode LINEBREAK() { return getToken(frefParser.LINEBREAK, 0); }
		public TerminalNode RETURNLEXER() { return getToken(frefParser.RETURNLEXER, 0); }
		public RetValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitRetValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetValueContext retValue() throws RecognitionException {
		RetValueContext _localctx = new RetValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_retValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(RETURNLEXER);
			setState(122);
			_la = _input.LA(1);
			if (_la==VARIABLE) {
				{
				setState(121); ((RetValueContext)_localctx).name = match(VARIABLE);
				}
			}

			setState(124); match(LINEBREAK);
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
		public FnctnPrmContext fp;
		public Token ret;
		public CodeContext funcode;
		public RetValueContext retv;
		public TerminalNode EXPRBRACKOPEN(int i) {
			return getToken(frefParser.EXPRBRACKOPEN, i);
		}
		public TerminalNode EXPRBRACKCLOSE(int i) {
			return getToken(frefParser.EXPRBRACKCLOSE, i);
		}
		public RetValueContext retValue() {
			return getRuleContext(RetValueContext.class,0);
		}
		public TerminalNode LINEBREAK() { return getToken(frefParser.LINEBREAK, 0); }
		public TerminalNode FUNCDEF(int i) {
			return getToken(frefParser.FUNCDEF, i);
		}
		public List<TerminalNode> EXPRBRACKCLOSE() { return getTokens(frefParser.EXPRBRACKCLOSE); }
		public TerminalNode FUNCTNAME() { return getToken(frefParser.FUNCTNAME, 0); }
		public List<TerminalNode> EXPRBRACKOPEN() { return getTokens(frefParser.EXPRBRACKOPEN); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode VARIABLETYPE() { return getToken(frefParser.VARIABLETYPE, 0); }
		public FnctnPrmContext fnctnPrm() {
			return getRuleContext(FnctnPrmContext.class,0);
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
		enterRule(_localctx, 24, RULE_fnctn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(FUNCDEF);
			setState(127); ((FnctnContext)_localctx).functionname = match(FUNCTNAME);
			setState(128); match(EXPRBRACKOPEN);
			setState(129); ((FnctnContext)_localctx).fp = fnctnPrm();
			setState(130); match(EXPRBRACKCLOSE);
			setState(131); match(EXPRBRACKOPEN);
			setState(132); ((FnctnContext)_localctx).ret = match(VARIABLETYPE);
			setState(133); match(EXPRBRACKCLOSE);
			setState(134); ((FnctnContext)_localctx).funcode = code();
			setState(136);
			_la = _input.LA(1);
			if (_la==RETURNLEXER) {
				{
				setState(135); ((FnctnContext)_localctx).retv = retValue();
				}
			}

			setState(138); match(FUNCDEF);
			setState(139); match(LINEBREAK);
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
		public ExpListContext el;
		public ExpListContext expList() {
			return getRuleContext(ExpListContext.class,0);
		}
		public TerminalNode EXPRBRACKCLOSE() { return getToken(frefParser.EXPRBRACKCLOSE, 0); }
		public TerminalNode FUNCTNAME() { return getToken(frefParser.FUNCTNAME, 0); }
		public TerminalNode EXPRBRACKOPEN() { return getToken(frefParser.EXPRBRACKOPEN, 0); }
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
		enterRule(_localctx, 26, RULE_fnctcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); ((FnctcallContext)_localctx).functionname = match(FUNCTNAME);
			setState(142); match(EXPRBRACKOPEN);
			setState(143); ((FnctcallContext)_localctx).el = expList();
			setState(144); match(EXPRBRACKCLOSE);
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

	public static class ExpListContext extends ParserRuleContext {
		public ExpListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expList; }
	 
		public ExpListContext() { }
		public void copyFrom(ExpListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionListContext extends ExpListContext {
		public ExpressionContext expression;
		public List<ExpressionContext> expressions = new ArrayList<ExpressionContext>();
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> PARAKOMMA() { return getTokens(frefParser.PARAKOMMA); }
		public TerminalNode PARAKOMMA(int i) {
			return getToken(frefParser.PARAKOMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ExpListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyListContext extends ExpListContext {
		public EmptyExpressionContext emptyExpression() {
			return getRuleContext(EmptyExpressionContext.class,0);
		}
		public EmptyListContext(ExpListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitEmptyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpListContext expList() throws RecognitionException {
		ExpListContext _localctx = new ExpListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expList);
		int _la;
		try {
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ExpressionListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(146); ((ExpressionListContext)_localctx).expression = expression(0);
				((ExpressionListContext)_localctx).expressions.add(((ExpressionListContext)_localctx).expression);
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PARAKOMMA) {
					{
					{
					setState(147); match(PARAKOMMA);
					setState(148); ((ExpressionListContext)_localctx).expression = expression(0);
					((ExpressionListContext)_localctx).expressions.add(((ExpressionListContext)_localctx).expression);
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				_localctx = new EmptyListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154); emptyExpression();
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
		enterRule(_localctx, 30, RULE_emptyExpression);
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
	public static class KonkatContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OK() { return getToken(frefParser.OK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public KonkatContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof frefVisitor ) return ((frefVisitor<? extends T>)visitor).visitKonkat(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new BracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(160); match(BRACKOPEN);
				setState(161); ((BracketsContext)_localctx).inBrackets = expression(0);
				setState(162); match(BRACKCLOSE);
				}
				break;

			case 2:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164); ((NumberContext)_localctx).number = match(NUMBER);
				}
				break;

			case 3:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165); ((VariableContext)_localctx).variable = match(VARIABLE);
				}
				break;

			case 4:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166); ((FuncCallContext)_localctx).func = fnctcall();
				}
				break;

			case 5:
				{
				_localctx = new EmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167); ((EmptyContext)_localctx).empex = emptyExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(185);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivisionContext(new ExpressionContext(_parentctx, _parentState));
						((MultDivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(170);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(173);
						switch (_input.LA(1)) {
						case OM:
							{
							setState(171); ((MultDivisionContext)_localctx).operator = match(OM);
							}
							break;
						case OD:
							{
							setState(172); ((MultDivisionContext)_localctx).operator = match(OD);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(175); ((MultDivisionContext)_localctx).right = expression(6);
						}
						break;

					case 2:
						{
						_localctx = new SubtractionContext(new ExpressionContext(_parentctx, _parentState));
						((SubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(176);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(177); ((SubtractionContext)_localctx).operator = match(OS);
						setState(178); ((SubtractionContext)_localctx).right = expression(5);
						}
						break;

					case 3:
						{
						_localctx = new AdditionContext(new ExpressionContext(_parentctx, _parentState));
						((AdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(179);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(180); ((AdditionContext)_localctx).operator = match(OA);
						setState(181); ((AdditionContext)_localctx).right = expression(4);
						}
						break;

					case 4:
						{
						_localctx = new KonkatContext(new ExpressionContext(_parentctx, _parentState));
						((KonkatContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(182);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(183); ((KonkatContext)_localctx).operator = match(OK);
						setState(184); ((KonkatContext)_localctx).right = expression(3);
						}
						break;
					}
					} 
				}
				setState(189);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);

		case 1: return precpred(_ctx, 4);

		case 2: return precpred(_ctx, 3);

		case 3: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u00c1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3"+
		"\3\3\3\6\3\66\n\3\r\3\16\3\67\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bT"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\fs\n\f\f"+
		"\f\16\fv\13\f\3\f\5\fy\n\f\3\r\3\r\5\r}\n\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008b\n\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u0098\n\20\f\20\16\20\u009b\13\20"+
		"\3\20\5\20\u009e\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00ab\n\22\3\22\3\22\3\22\5\22\u00b0\n\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00bc\n\22\f\22\16\22\u00bf\13"+
		"\22\3\22\2\3\"\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\4\2\35"+
		"\35 !\u00c9\2%\3\2\2\2\4\65\3\2\2\2\69\3\2\2\2\b<\3\2\2\2\nA\3\2\2\2\f"+
		"E\3\2\2\2\16S\3\2\2\2\20U\3\2\2\2\22_\3\2\2\2\24g\3\2\2\2\26x\3\2\2\2"+
		"\30z\3\2\2\2\32\u0080\3\2\2\2\34\u008f\3\2\2\2\36\u009d\3\2\2\2 \u009f"+
		"\3\2\2\2\"\u00aa\3\2\2\2$&\5\32\16\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'"+
		"(\3\2\2\2(\3\3\2\2\2)\62\5 \21\2*\62\5\20\t\2+\62\5\22\n\2,\62\5\24\13"+
		"\2-\62\5\b\5\2.\62\5\6\4\2/\62\5\n\6\2\60\62\5\34\17\2\61)\3\2\2\2\61"+
		"*\3\2\2\2\61+\3\2\2\2\61,\3\2\2\2\61-\3\2\2\2\61.\3\2\2\2\61/\3\2\2\2"+
		"\61\60\3\2\2\2\62\63\3\2\2\2\63\64\7\3\2\2\64\66\3\2\2\2\65\61\3\2\2\2"+
		"\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\5\3\2\2\29:\7\16\2\2:;\7\17"+
		"\2\2;\7\3\2\2\2<=\7\16\2\2=>\7\17\2\2>?\7\36\2\2?@\5\"\22\2@\t\3\2\2\2"+
		"AB\7\17\2\2BC\7\36\2\2CD\5\"\22\2D\13\3\2\2\2EF\t\2\2\2F\r\3\2\2\2GH\5"+
		"\"\22\2HI\7\35\2\2IJ\5\"\22\2JT\3\2\2\2KL\5\"\22\2LM\7 \2\2MN\5\"\22\2"+
		"NT\3\2\2\2OP\5\"\22\2PQ\7!\2\2QR\5\"\22\2RT\3\2\2\2SG\3\2\2\2SK\3\2\2"+
		"\2SO\3\2\2\2T\17\3\2\2\2UV\7\5\2\2VW\7\31\2\2WX\5\16\b\2XY\7\32\2\2YZ"+
		"\7\7\2\2Z[\5\4\3\2[\\\7\b\2\2\\]\5\4\3\2]^\7\6\2\2^\21\3\2\2\2_`\7\5\2"+
		"\2`a\7\31\2\2ab\5\16\b\2bc\7\32\2\2cd\7\7\2\2de\5\4\3\2ef\7\6\2\2f\23"+
		"\3\2\2\2gh\7\t\2\2hi\5\4\3\2ij\7\13\2\2jk\7\31\2\2kl\5\16\b\2lm\7\32\2"+
		"\2mn\7\n\2\2n\25\3\2\2\2ot\5\6\4\2pq\7\37\2\2qs\5\6\4\2rp\3\2\2\2sv\3"+
		"\2\2\2tr\3\2\2\2tu\3\2\2\2uy\3\2\2\2vt\3\2\2\2wy\5 \21\2xo\3\2\2\2xw\3"+
		"\2\2\2y\27\3\2\2\2z|\7\f\2\2{}\7\17\2\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2"+
		"~\177\7\3\2\2\177\31\3\2\2\2\u0080\u0081\7\r\2\2\u0081\u0082\7\20\2\2"+
		"\u0082\u0083\7\31\2\2\u0083\u0084\5\26\f\2\u0084\u0085\7\32\2\2\u0085"+
		"\u0086\7\31\2\2\u0086\u0087\7\16\2\2\u0087\u0088\7\32\2\2\u0088\u008a"+
		"\5\4\3\2\u0089\u008b\5\30\r\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2"+
		"\u008b\u008c\3\2\2\2\u008c\u008d\7\r\2\2\u008d\u008e\7\3\2\2\u008e\33"+
		"\3\2\2\2\u008f\u0090\7\20\2\2\u0090\u0091\7\31\2\2\u0091\u0092\5\36\20"+
		"\2\u0092\u0093\7\32\2\2\u0093\35\3\2\2\2\u0094\u0099\5\"\22\2\u0095\u0096"+
		"\7\37\2\2\u0096\u0098\5\"\22\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2"+
		"\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009e\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009c\u009e\5 \21\2\u009d\u0094\3\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\37\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0!\3\2\2\2\u00a1\u00a2\b\22\1\2\u00a2"+
		"\u00a3\7\33\2\2\u00a3\u00a4\5\"\22\2\u00a4\u00a5\7\34\2\2\u00a5\u00ab"+
		"\3\2\2\2\u00a6\u00ab\7\21\2\2\u00a7\u00ab\7\17\2\2\u00a8\u00ab\5\34\17"+
		"\2\u00a9\u00ab\5 \21\2\u00aa\u00a1\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a7"+
		"\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00bd\3\2\2\2\u00ac"+
		"\u00af\f\7\2\2\u00ad\u00b0\7\26\2\2\u00ae\u00b0\7\27\2\2\u00af\u00ad\3"+
		"\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00bc\5\"\22\b\u00b2"+
		"\u00b3\f\6\2\2\u00b3\u00b4\7\25\2\2\u00b4\u00bc\5\"\22\7\u00b5\u00b6\f"+
		"\5\2\2\u00b6\u00b7\7\24\2\2\u00b7\u00bc\5\"\22\6\u00b8\u00b9\f\4\2\2\u00b9"+
		"\u00ba\7\30\2\2\u00ba\u00bc\5\"\22\5\u00bb\u00ac\3\2\2\2\u00bb\u00b2\3"+
		"\2\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be#\3\2\2\2\u00bf\u00bd\3\2\2\2"+
		"\20\'\61\67Stx|\u008a\u0099\u009d\u00aa\u00af\u00bb\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}