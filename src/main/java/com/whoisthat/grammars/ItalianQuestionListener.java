package com.whoisthat.grammars;

import com.whoisthat.grammars.italian.ItalianBaseListener;
import com.whoisthat.grammars.italian.ItalianParser;
import com.whoisthat.grammars.italian.ItalianTerminal;
import com.whoisthat.system.question.Question;
import org.antlr.v4.runtime.tree.TerminalNode;

import static com.whoisthat.grammars.italian.ItalianLexer.*;
import static com.whoisthat.grammars.italian.ItalianTerminal.getTerminal;

public class ItalianQuestionListener extends ItalianBaseListener {

    private Question.QuestionBuilder questionBuilder;

    @Override
    public void enterQuestion(ItalianParser.QuestionContext ctx) {
        TerminalNode child = ctx.getChild(TerminalNode.class, 0);
        switch (child.getSymbol().getTokenIndex()) {
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

    enter
}
