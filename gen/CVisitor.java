// Generated from /home/mrfiskerton/Documents/University-tasks/Translation/3rd_lab/С_obfuscator/src/C.g4 by ANTLR 4.7

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(CParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#includes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludes(CParser.IncludesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(CParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(CParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#conditionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionStatement(CParser.ConditionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(CParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(CParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItems(CParser.ItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(CParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#multi_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_declaration(CParser.Multi_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#simple_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_declaration(CParser.Simple_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#assignOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOperator(CParser.AssignOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#assignExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpression(CParser.AssignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#orCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCondition(CParser.OrConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#andCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCondition(CParser.AndConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#eqCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqCondition(CParser.EqConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#relCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelCondition(CParser.RelConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#additive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive(CParser.AdditiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#multiple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple(CParser.MultipleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(CParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(CParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(CParser.ConstantContext ctx);
}