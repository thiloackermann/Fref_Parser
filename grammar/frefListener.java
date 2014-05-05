// Generated from fref.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link frefParser}.
 */
public interface frefListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link frefParser#DeclarationDefinition}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationDefinition(@NotNull frefParser.DeclarationDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link frefParser#DeclarationDefinition}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationDefinition(@NotNull frefParser.DeclarationDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link frefParser#Variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull frefParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link frefParser#Variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull frefParser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link frefParser#Number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull frefParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link frefParser#Number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull frefParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link frefParser#fnctcall}.
	 * @param ctx the parse tree
	 */
	void enterFnctcall(@NotNull frefParser.FnctcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link frefParser#fnctcall}.
	 * @param ctx the parse tree
	 */
	void exitFnctcall(@NotNull frefParser.FnctcallContext ctx);

	/**
	 * Enter a parse tree produced by {@link frefParser#FuncCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(@NotNull frefParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link frefParser#FuncCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(@NotNull frefParser.FuncCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link frefParser#Declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull frefParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link frefParser#Declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull frefParser.DeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link frefParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(@NotNull frefParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link frefParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(@NotNull frefParser.CodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link frefParser#compareKeyword}.
	 * @param ctx the parse tree
	 */
	void enterCompareKeyword(@NotNull frefParser.CompareKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link frefParser#compareKeyword}.
	 * @param ctx the parse tree
	 */
	void exitCompareKeyword(@NotNull frefParser.CompareKeywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link frefParser#RelCond}.
	 * @param ctx the parse tree
	 */
	void enterRelCond(@NotNull frefParser.RelCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link frefParser#RelCond}.
	 * @param ctx the parse tree
	 */
	void exitRelCond(@NotNull frefParser.RelCondContext ctx);

	/**
	 * Enter a parse tree produced by {@link frefParser#fnctn}.
	 * @param ctx the parse tree
	 */
	void enterFnctn(@NotNull frefParser.FnctnContext ctx);
	/**
	 * Exit a parse tree produced by {@link frefParser#fnctn}.
	 * @param ctx the parse tree
	 */
	void exitFnctn(@NotNull frefParser.FnctnContext ctx);

	/**
	 * Enter a parse tree produced by {@link frefParser#Subtraction}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(@NotNull frefParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link frefParser#Subtraction}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(@NotNull frefParser.SubtractionContext ctx);

	/**
	 * Enter a parse tree produced by {@link frefParser#dowhileclause}.
	 * @param ctx the parse tree
	 */
	void enterDowhileclause(@NotNull frefParser.DowhileclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link frefParser#dowhileclause}.
	 * @param ctx the parse tree
	 */
	void exitDowhileclause(@NotNull frefParser.DowhileclauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link frefParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull frefParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link frefParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull frefParser.StartContext ctx);

	/**
	 * Enter a parse tree produced by {@link frefParser#FunctionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(@NotNull frefParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link frefParser#FunctionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(@NotNull frefParser.FunctionParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link frefParser#ifelseclause}.
	 * @param ctx the parse tree
	 */
	void enterIfelseclause(@NotNull frefParser.IfelseclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link frefParser#ifelseclause}.
	 * @param ctx the parse tree
	 */
	void exitIfelseclause(@NotNull frefParser.IfelseclauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link frefParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(@NotNull frefParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link frefParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(@NotNull frefParser.EmptyContext ctx);

	/**
	 * Enter a parse tree produced by {@link frefParser#MultDivision}.
	 * @param ctx the parse tree
	 */
	void enterMultDivision(@NotNull frefParser.MultDivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link frefParser#MultDivision}.
	 * @param ctx the parse tree
	 */
	void exitMultDivision(@NotNull frefParser.MultDivisionContext ctx);

	/**
	 * Enter a parse tree produced by {@link frefParser#Brackets}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(@NotNull frefParser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link frefParser#Brackets}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(@NotNull frefParser.BracketsContext ctx);

	/**
	 * Enter a parse tree produced by {@link frefParser#Addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(@NotNull frefParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link frefParser#Addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(@NotNull frefParser.AdditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link frefParser#ExpressionWithoutStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionWithoutStatement(@NotNull frefParser.ExpressionWithoutStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link frefParser#ExpressionWithoutStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionWithoutStatement(@NotNull frefParser.ExpressionWithoutStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link frefParser#ifclause}.
	 * @param ctx the parse tree
	 */
	void enterIfclause(@NotNull frefParser.IfclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link frefParser#ifclause}.
	 * @param ctx the parse tree
	 */
	void exitIfclause(@NotNull frefParser.IfclauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link frefParser#Definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(@NotNull frefParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link frefParser#Definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(@NotNull frefParser.DefinitionContext ctx);
}