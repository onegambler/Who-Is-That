package com.whoisthat.grammars;

import com.whoisthat.grammars.italian.ItalianBaseListener;
import com.whoisthat.grammars.italian.ItalianLexer;
import com.whoisthat.grammars.italian.ItalianParser;
import com.whoisthat.system.question.Question;

/**
 * Created by PC on 22/07/2015.
 */
public class ItalianQuestionListener extends ItalianBaseListener {

    private Question.QuestionBuilder questionBuilder;

    @Override
    public void enterBeQuestion(ItalianParser.BeQuestionContext ctx) {
        questionBuilder.be();
    }

    @Override
    public void enterHaveQuestion(ItalianParser.HaveQuestionContext ctx) {
        questionBuilder.have();
    }

    @Override
    public void enterWearQuestion(ItalianParser.WearQuestionContext ctx) {
        questionBuilder.wear();
    }

    @Override
    public void enterEyelook(ItalianParser.EyelookContext ctx) {

    }
}
