// Generated from C:/Users/PC/IdeaProjects/Who Is That/src/main/resources/com.whoisthat/grammars\Description.g4 by ANTLR 4.5.1
package com.whoisthat.grammars.description;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DescriptionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DescriptionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DescriptionParser#gamePeople}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGamePeople(DescriptionParser.GamePeopleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DescriptionParser#person}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerson(DescriptionParser.PersonContext ctx);
	/**
	 * Visit a parse tree produced by {@link DescriptionParser#portrait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPortrait(DescriptionParser.PortraitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DescriptionParser#look}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLook(DescriptionParser.LookContext ctx);
	/**
	 * Visit a parse tree produced by {@link DescriptionParser#eyeLook}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEyeLook(DescriptionParser.EyeLookContext ctx);
	/**
	 * Visit a parse tree produced by {@link DescriptionParser#hairLook}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHairLook(DescriptionParser.HairLookContext ctx);
	/**
	 * Visit a parse tree produced by {@link DescriptionParser#noseLook}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoseLook(DescriptionParser.NoseLookContext ctx);
	/**
	 * Visit a parse tree produced by {@link DescriptionParser#mouthLook}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMouthLook(DescriptionParser.MouthLookContext ctx);
	/**
	 * Visit a parse tree produced by {@link DescriptionParser#beard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeard(DescriptionParser.BeardContext ctx);
	/**
	 * Visit a parse tree produced by {@link DescriptionParser#age}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAge(DescriptionParser.AgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DescriptionParser#cheeks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheeks(DescriptionParser.CheeksContext ctx);
	/**
	 * Visit a parse tree produced by {@link DescriptionParser#bald}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBald(DescriptionParser.BaldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DescriptionParser#hairColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHairColor(DescriptionParser.HairColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DescriptionParser#eyeColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEyeColor(DescriptionParser.EyeColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DescriptionParser#sex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSex(DescriptionParser.SexContext ctx);
	/**
	 * Visit a parse tree produced by {@link DescriptionParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(DescriptionParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DescriptionParser#ethnic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEthnic(DescriptionParser.EthnicContext ctx);
	/**
	 * Visit a parse tree produced by {@link DescriptionParser#accessory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessory(DescriptionParser.AccessoryContext ctx);
}