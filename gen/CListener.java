// Generated from /home/mrfiskerton/Documents/University-tasks/Translation/3rd_lab/С_obfuscator/src/C.g4 by ANTLR 4.7

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CParser}.
 */
public interface CListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#includes}.
	 * @param ctx the parse tree
	 */
	void enterIncludes(CParser.IncludesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#includes}.
	 * @param ctx the parse tree
	 */
	void exitIncludes(CParser.IncludesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(CParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(CParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(CParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(CParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#conditionStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionStatement(CParser.ConditionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#conditionStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionStatement(CParser.ConditionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(CParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(CParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#forBody}.
	 * @param ctx the parse tree
	 */
	void enterForBody(CParser.ForBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#forBody}.
	 * @param ctx the parse tree
	 */
	void exitForBody(CParser.ForBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(CParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(CParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(CParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(CParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#items}.
	 * @param ctx the parse tree
	 */
	void enterItems(CParser.ItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#items}.
	 * @param ctx the parse tree
	 */
	void exitItems(CParser.ItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(CParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(CParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#multi_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMulti_declaration(CParser.Multi_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#multi_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMulti_declaration(CParser.Multi_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#simple_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSimple_declaration(CParser.Simple_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#simple_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSimple_declaration(CParser.Simple_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#assignOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignOperator(CParser.AssignOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#assignOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignOperator(CParser.AssignOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpression(CParser.AssignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpression(CParser.AssignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#orCondition}.
	 * @param ctx the parse tree
	 */
	void enterOrCondition(CParser.OrConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#orCondition}.
	 * @param ctx the parse tree
	 */
	void exitOrCondition(CParser.OrConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#andCondition}.
	 * @param ctx the parse tree
	 */
	void enterAndCondition(CParser.AndConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#andCondition}.
	 * @param ctx the parse tree
	 */
	void exitAndCondition(CParser.AndConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#eqCondition}.
	 * @param ctx the parse tree
	 */
	void enterEqCondition(CParser.EqConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#eqCondition}.
	 * @param ctx the parse tree
	 */
	void exitEqCondition(CParser.EqConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#relCondition}.
	 * @param ctx the parse tree
	 */
	void enterRelCondition(CParser.RelConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#relCondition}.
	 * @param ctx the parse tree
	 */
	void exitRelCondition(CParser.RelConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#additive}.
	 * @param ctx the parse tree
	 */
	void enterAdditive(CParser.AdditiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#additive}.
	 * @param ctx the parse tree
	 */
	void exitAdditive(CParser.AdditiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#multiple}.
	 * @param ctx the parse tree
	 */
	void enterMultiple(CParser.MultipleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#multiple}.
	 * @param ctx the parse tree
	 */
	void exitMultiple(CParser.MultipleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(CParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(CParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(CParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(CParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(CParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(CParser.ConstantContext ctx);
}