// Generated from C:/Users/PC/IdeaProjects/Who Is That/src/main/resources/com.whoisthat/grammars\Italian.g4 by ANTLR 4.5.1
package com.whoisthat.grammars.italian;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ItalianParser}.
 */
public interface ItalianListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ItalianParser#game}.
	 * @param ctx the parse tree
	 */
	void enterGame(ItalianParser.GameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItalianParser#game}.
	 * @param ctx the parse tree
	 */
	void exitGame(ItalianParser.GameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItalianParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(ItalianParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItalianParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(ItalianParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItalianParser#look}.
	 * @param ctx the parse tree
	 */
	void enterLook(ItalianParser.LookContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItalianParser#look}.
	 * @param ctx the parse tree
	 */
	void exitLook(ItalianParser.LookContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItalianParser#eyelook}.
	 * @param ctx the parse tree
	 */
	void enterEyelook(ItalianParser.EyelookContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItalianParser#eyelook}.
	 * @param ctx the parse tree
	 */
	void exitEyelook(ItalianParser.EyelookContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItalianParser#eyecolor}.
	 * @param ctx the parse tree
	 */
	void enterEyecolor(ItalianParser.EyecolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItalianParser#eyecolor}.
	 * @param ctx the parse tree
	 */
	void exitEyecolor(ItalianParser.EyecolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItalianParser#eyesize}.
	 * @param ctx the parse tree
	 */
	void enterEyesize(ItalianParser.EyesizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItalianParser#eyesize}.
	 * @param ctx the parse tree
	 */
	void exitEyesize(ItalianParser.EyesizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItalianParser#hairlook}.
	 * @param ctx the parse tree
	 */
	void enterHairlook(ItalianParser.HairlookContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItalianParser#hairlook}.
	 * @param ctx the parse tree
	 */
	void exitHairlook(ItalianParser.HairlookContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItalianParser#haircolor}.
	 * @param ctx the parse tree
	 */
	void enterHaircolor(ItalianParser.HaircolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItalianParser#haircolor}.
	 * @param ctx the parse tree
	 */
	void exitHaircolor(ItalianParser.HaircolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItalianParser#noselook}.
	 * @param ctx the parse tree
	 */
	void enterNoselook(ItalianParser.NoselookContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItalianParser#noselook}.
	 * @param ctx the parse tree
	 */
	void exitNoselook(ItalianParser.NoselookContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItalianParser#mouthlook}.
	 * @param ctx the parse tree
	 */
	void enterMouthlook(ItalianParser.MouthlookContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItalianParser#mouthlook}.
	 * @param ctx the parse tree
	 */
	void exitMouthlook(ItalianParser.MouthlookContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItalianParser#person}.
	 * @param ctx the parse tree
	 */
	void enterPerson(ItalianParser.PersonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItalianParser#person}.
	 * @param ctx the parse tree
	 */
	void exitPerson(ItalianParser.PersonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItalianParser#solution}.
	 * @param ctx the parse tree
	 */
	void enterSolution(ItalianParser.SolutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItalianParser#solution}.
	 * @param ctx the parse tree
	 */
	void exitSolution(ItalianParser.SolutionContext ctx);
}