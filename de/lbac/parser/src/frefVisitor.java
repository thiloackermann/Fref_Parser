// Generated from grammar/fref.g4 by ANTLR 4.2
package de.lbac.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link frefParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface frefVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link frefParser#fnctcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnctcall(@NotNull frefParser.FnctcallContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#compareKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareKeyword(@NotNull frefParser.CompareKeywordContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#FunctionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(@NotNull frefParser.FunctionParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(@NotNull frefParser.EmptyContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#LTCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLTCond(@NotNull frefParser.LTCondContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#Brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(@NotNull frefParser.BracketsContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#Addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(@NotNull frefParser.AdditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#ifclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfclause(@NotNull frefParser.IfclauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#Konkat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKonkat(@NotNull frefParser.KonkatContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#DeclarationDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationDefinition(@NotNull frefParser.DeclarationDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull frefParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#Number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull frefParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#GTCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGTCond(@NotNull frefParser.GTCondContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#FuncCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(@NotNull frefParser.FuncCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#Declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull frefParser.DeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(@NotNull frefParser.CodeContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#fnctn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnctn(@NotNull frefParser.FnctnContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#EQCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEQCond(@NotNull frefParser.EQCondContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#Subtraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(@NotNull frefParser.SubtractionContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#dowhileclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhileclause(@NotNull frefParser.DowhileclauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull frefParser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#ifelseclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelseclause(@NotNull frefParser.IfelseclauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#MultDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivision(@NotNull frefParser.MultDivisionContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#retValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetValue(@NotNull frefParser.RetValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#ExpressionWithoutStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionWithoutStatement(@NotNull frefParser.ExpressionWithoutStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link frefParser#Definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(@NotNull frefParser.DefinitionContext ctx);
}