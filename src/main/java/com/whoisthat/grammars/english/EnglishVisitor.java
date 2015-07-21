// Generated from C:/Users/PC/IdeaProjects/Who Is That/src/main/resources/com.whoisthat/grammars\English.g4 by ANTLR 4.5.1
package com.whoisthat.grammars.english;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EnglishParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EnglishVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EnglishParser#game}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGame(EnglishParser.GameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(EnglishParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#look}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLook(EnglishParser.LookContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(EnglishParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#measures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasures(EnglishParser.MeasuresContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#beard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeard(EnglishParser.BeardContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#hairStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHairStyle(EnglishParser.HairStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#cheeks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheeks(EnglishParser.CheeksContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#person}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerson(EnglishParser.PersonContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#ethnic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEthnic(EnglishParser.EthnicContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#accessory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessory(EnglishParser.AccessoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#solution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSolution(EnglishParser.SolutionContext ctx);
}