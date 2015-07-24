// Generated from C:/Users/roberto.magale/IdeaProjects/Who-Is-That/src/main/resources/com.whoisthat/grammars\English.g4 by ANTLR 4.5.1
package com.whoisthat.grammars.english;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EnglishParser}.
 */
public interface EnglishListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EnglishParser#game}.
	 * @param ctx the parse tree
	 */
	void enterGame(EnglishParser.GameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#game}.
	 * @param ctx the parse tree
	 */
	void exitGame(EnglishParser.GameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(EnglishParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(EnglishParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#look}.
	 * @param ctx the parse tree
	 */
	void enterLook(EnglishParser.LookContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#look}.
	 * @param ctx the parse tree
	 */
	void exitLook(EnglishParser.LookContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(EnglishParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(EnglishParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#measures}.
	 * @param ctx the parse tree
	 */
	void enterMeasures(EnglishParser.MeasuresContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#measures}.
	 * @param ctx the parse tree
	 */
	void exitMeasures(EnglishParser.MeasuresContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#beard}.
	 * @param ctx the parse tree
	 */
	void enterBeard(EnglishParser.BeardContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#beard}.
	 * @param ctx the parse tree
	 */
	void exitBeard(EnglishParser.BeardContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#hairStyle}.
	 * @param ctx the parse tree
	 */
	void enterHairStyle(EnglishParser.HairStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#hairStyle}.
	 * @param ctx the parse tree
	 */
	void exitHairStyle(EnglishParser.HairStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#cheeks}.
	 * @param ctx the parse tree
	 */
	void enterCheeks(EnglishParser.CheeksContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#cheeks}.
	 * @param ctx the parse tree
	 */
	void exitCheeks(EnglishParser.CheeksContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#person}.
	 * @param ctx the parse tree
	 */
	void enterPerson(EnglishParser.PersonContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#person}.
	 * @param ctx the parse tree
	 */
	void exitPerson(EnglishParser.PersonContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#ethnic}.
	 * @param ctx the parse tree
	 */
	void enterEthnic(EnglishParser.EthnicContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#ethnic}.
	 * @param ctx the parse tree
	 */
	void exitEthnic(EnglishParser.EthnicContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#accessory}.
	 * @param ctx the parse tree
	 */
	void enterAccessory(EnglishParser.AccessoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#accessory}.
	 * @param ctx the parse tree
	 */
	void exitAccessory(EnglishParser.AccessoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#solution}.
	 * @param ctx the parse tree
	 */
	void enterSolution(EnglishParser.SolutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#solution}.
	 * @param ctx the parse tree
	 */
	void exitSolution(EnglishParser.SolutionContext ctx);
}