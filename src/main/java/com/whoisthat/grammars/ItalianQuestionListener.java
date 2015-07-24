package com.whoisthat.grammars;

import com.whoisthat.GameTerminal;
import com.whoisthat.grammars.italian.ItalianBaseListener;
import com.whoisthat.grammars.italian.ItalianParser;
import com.whoisthat.system.question.Question;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import static com.whoisthat.grammars.italian.ItalianLexer.*;
import static com.whoisthat.grammars.italian.ItalianTerminal.getTerminal;

public class ItalianQuestionListener extends ItalianBaseListener {

    private Question.QuestionBuilder questionBuilder;

    @Override
    public void enterGame(ItalianParser.GameContext ctx) {
        questionBuilder = Question.builder()
                .withPronoun(GameTerminal.MAN);
    }

    public Question getQuestion() {
        return questionBuilder.create();
    }

    @Override
    public void enterQuestion(ItalianParser.QuestionContext ctx) {
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
        if(lookNode.getChildCount() > 0) {
            questionBuilder.withPhysicalTrait(getTerminal(lookNode.getChild(0).getText()));
            if (lookNode.getChildCount() == 2) {
                questionBuilder.withLook(getTerminal(lookNode.getChild(1).getText()));
            }
        } else {
            questionBuilder.withPhysicalTrait(getTerminal(ctx.getText()));
        }
    }

    @Override
    public void enterPerson(ItalianParser.PersonContext ctx) {
        questionBuilder.withLook(getTerminal(ctx.getText()));
    }
}