package com.whoisthat.grammars;

import com.whoisthat.GameTerminal;
import com.whoisthat.grammars.italian.ItalianBaseListener;
import com.whoisthat.grammars.italian.ItalianParser;
import com.whoisthat.system.question.Question;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import static com.whoisthat.grammars.italian.ItalianLexer.*;
import static com.whoisthat.grammars.italian.ItalianTerminal.getTerminal;

public class ItalianQuestionListener extends ItalianBaseListener implements QuestionListener {

    private Question.QuestionBuilder questionBuilder;

    @Override
    public void enterGame(ItalianParser.GameContext ctx) {
        questionBuilder = Question.builder();
    }

    public Question getQuestion() {
        return questionBuilder.create();
    }

    @Override
    public void enterQuestion(ItalianParser.QuestionContext ctx) {

        questionBuilder.withPronoun(GameTerminal.MAN);

        TerminalNode child = ctx.getChild(TerminalNode.class, 0);
        switch (child.getSymbol().getType()) {
            case HAVE:
                questionBuilder.have();
                break;
            case BE:
                questionBuilder.be();
                break;
            case WEAR:
                questionBuilder.wear()
                        .withAccessory(getTerminal(ctx.getChild(1).getText()));
                break;
        }
    }

    @Override
    public void enterLook(ItalianParser.LookContext ctx) {
        ParseTree lookNode = ctx.getChild(0);
        if(hasOnlyPhysicalTrait(lookNode)) {
            questionBuilder.withPhysicalTrait(getTerminal(ctx.getText()));
        } else {
            questionBuilder.withPhysicalTrait(getTerminal(lookNode.getChild(0).getText()));
            if (hasLookDefinition(lookNode)) {
                questionBuilder.withLook(getTerminal(lookNode.getChild(1).getText()));
            }
        }
    }

    private boolean hasOnlyPhysicalTrait(ParseTree lookNode) {
        return isTerminalNode(lookNode);
    }

    private boolean isTerminalNode(ParseTree node) {
        return node instanceof TerminalNode;
    }

    private boolean hasLookDefinition(ParseTree lookNode) {
        return lookNode.getChildCount() == 2;
    }

    @Override
    public void enterSolution(ItalianParser.SolutionContext ctx) {
        questionBuilder.answer()
                .withSolution(ctx.getChild(0).getText());
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        //TODO: handle error nodes

    }

    @Override
    public void enterPerson(ItalianParser.PersonContext ctx) {
        questionBuilder.withLook(getTerminal(ctx.getText()));
    }
}