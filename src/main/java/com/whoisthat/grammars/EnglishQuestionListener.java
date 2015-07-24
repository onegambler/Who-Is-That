package com.whoisthat.grammars;

import com.whoisthat.GameTerminal;
import com.whoisthat.grammars.english.EnglishBaseListener;
import com.whoisthat.grammars.english.EnglishLexer;
import com.whoisthat.grammars.english.EnglishParser;
import com.whoisthat.system.question.Question;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import static com.whoisthat.grammars.english.EnglishLexer.*;
import static com.whoisthat.grammars.english.EnglishTerminal.getTerminal;

public class EnglishQuestionListener extends EnglishBaseListener implements QuestionListener {

    private Question.QuestionBuilder questionBuilder;

    @Override
    public void enterGame(EnglishParser.GameContext ctx) {
        questionBuilder = Question.builder();
    }

    @Override
    public void enterQuestion(EnglishParser.QuestionContext ctx) {
        TerminalNode firstChild = ctx.getChild(TerminalNode.class, 0);
        if (firstChild.getSymbol().getType() == BE) {
            questionBuilder.be();
        } else {

            switch (ctx.getChild(TerminalNode.class, 2).getSymbol().getType()) {
                case HAVE:
                    questionBuilder.have();
                    break;
                case WEAR:
                    questionBuilder.wear();
            }
        }

        TerminalNode pronoun = ctx.getToken(EnglishLexer.PRON, 0);
        questionBuilder.withPronoun(getTerminal(pronoun.getText()));
    }

    @Override
    public void enterColor(EnglishParser.ColorContext ctx) {
        setTraitAndLook(ctx);
    }

    @Override
    public void enterMeasures(EnglishParser.MeasuresContext ctx) {
        setTraitAndLook(ctx);
    }

    @Override
    public void enterBeard(EnglishParser.BeardContext ctx) {
        questionBuilder.withPhysicalTrait(GameTerminal.BEARD);
    }

    @Override
    public void enterHairStyle(EnglishParser.HairStyleContext ctx) {
        setTraitAndLook(ctx);
    }

    @Override
    public void enterCheeks(EnglishParser.CheeksContext ctx) {
        questionBuilder.withPhysicalTrait(GameTerminal.RED_CHEEKS);
    }

    @Override
    public void enterAccessory(EnglishParser.AccessoryContext ctx) {
        questionBuilder.withAccessory(getTerminal(ctx.ACCESSORY().getText()));
    }

    @Override
    public void enterPerson(EnglishParser.PersonContext ctx) {
        TerminalNode lookNode = ctx.getChild(TerminalNode.class, 0);
        questionBuilder.withLook(getTerminal(lookNode.getText()));
    }

    @Override
    public Question getQuestion() {
        return questionBuilder.create();
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        //TODO: handle errors
    }

    private void setTraitAndLook(ParserRuleContext context) {
        TerminalNode look = context.getChild(TerminalNode.class, 0);
        TerminalNode trait = context.getChild(TerminalNode.class, 1);
        questionBuilder.withPhysicalTrait(getTerminal(look.getText()))
                .withLook(getTerminal(trait.getText()));
    }

    @Override
    public void enterSolution(EnglishParser.SolutionContext ctx) {
        questionBuilder.answer()
                .withSolution(ctx.getChild(0).getText());
    }
}
