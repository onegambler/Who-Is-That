import com.whoisthat.grammars.EnglishQuestionListener;
import com.whoisthat.grammars.ItalianQuestionListener;
import com.whoisthat.grammars.english.EnglishLexer;
import com.whoisthat.grammars.english.EnglishParser;
import com.whoisthat.grammars.italian.ItalianLexer;
import com.whoisthat.grammars.italian.ItalianParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.BitSet;

public class MainClass {

	public static void main(String[] args) throws Exception {


		String expression = "carlo!";
		ItalianLexer lexer = new ItalianLexer(new ANTLRInputStream(expression));
		ItalianParser parser = new ItalianParser(new CommonTokenStream(lexer));
		ParseTree tree = parser.game();

		ItalianQuestionListener listener = new ItalianQuestionListener();
		ParseTreeWalker.DEFAULT.walk(listener, tree);

		System.out.println(listener.getQuestion());

        String englishExpression = "mario!";
        EnglishLexer englishLexer = new EnglishLexer(new ANTLRInputStream(englishExpression));
        EnglishParser englishParser = new EnglishParser(new CommonTokenStream(englishLexer));
        EnglishQuestionListener englishQuestionListener = new EnglishQuestionListener();
        ParseTreeWalker.DEFAULT.walk(englishQuestionListener, englishParser.game());

        System.out.println(englishQuestionListener.getQuestion());



		//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		//new BoardTable("Who is he?").setVisible(true);
	}
}
