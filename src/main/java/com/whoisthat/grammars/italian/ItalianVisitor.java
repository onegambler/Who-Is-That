// Generated from C:/Users/PC/IdeaProjects/Who Is That/src/main/resources/com.whoisthat/grammars\Italian.g4 by ANTLR 4.5.1
package com.whoisthat.grammars.italian;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ItalianParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ItalianVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ItalianParser#game}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGame(ItalianParser.GameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ItalianParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(ItalianParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ItalianParser#look}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLook(ItalianParser.LookContext ctx);
	/**
	 * Visit a parse tree produced by {@link ItalianParser#eyelook}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEyelook(ItalianParser.EyelookContext ctx);
	/**
	 * Visit a parse tree produced by {@link ItalianParser#eyecolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEyecolor(ItalianParser.EyecolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ItalianParser#eyesize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEyesize(ItalianParser.EyesizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ItalianParser#hairlook}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHairlook(ItalianParser.HairlookContext ctx);
	/**
	 * Visit a parse tree produced by {@link ItalianParser#haircolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaircolor(ItalianParser.HaircolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ItalianParser#noselook}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoselook(ItalianParser.NoselookContext ctx);
	/**
	 * Visit a parse tree produced by {@link ItalianParser#mouthlook}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMouthlook(ItalianParser.MouthlookContext ctx);
	/**
	 * Visit a parse tree produced by {@link ItalianParser#person}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerson(ItalianParser.PersonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ItalianParser#solution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSolution(ItalianParser.SolutionContext ctx);
}