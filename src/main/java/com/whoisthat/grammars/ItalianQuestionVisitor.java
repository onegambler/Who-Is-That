package com.whoisthat.grammars;

import com.whoisthat.grammars.italian.ItalianBaseVisitor;
import com.whoisthat.grammars.italian.ItalianParser;
import com.whoisthat.system.question.Question;
import org.antlr.v4.runtime.tree.ParseTree;

import static com.whoisthat.grammars.italian.ItalianLexer.*;

public class ItalianQuestionVisitor extends ItalianBaseVisitor<Question> {

    private Question.QuestionBuilder questionBuilder;

    @Override
    public Question visitGame(ItalianParser.GameContext ctx) {
        return super.visitGame(ctx);
    }

    @Override
    public Question visitQuestion(ItalianParser.QuestionContext ctx) {
        switch (ctx.getRuleIndex()) {
            case HAVE:
                questionBuilder = Question.builder().have();
                break;
            case BE:
                questionBuilder = Question.builder().be();
                break;
            case WEAR:
                questionBuilder = Question.builder().wear();
                break;
            default:
                throw new IllegalStateException("Rule is not valid: " + ctx.getRuleIndex());
        }

        return super.visitQuestion(ctx);
    }

    @Override
    public Question visit(ParseTree tree) {
        return super.visit(tree);
    }
}
