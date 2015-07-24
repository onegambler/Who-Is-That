import com.whoisthat.grammars.ItalianQuestionListener;
import com.whoisthat.grammars.italian.ItalianLexer;
import com.whoisthat.grammars.italian.ItalianParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class MainClass {

	public static void main(String[] args) throws Exception {


		String expression = "ha le guance rosse?";
		ItalianLexer lexer = new ItalianLexer(new ANTLRInputStream(expression));
		ItalianParser parser = new ItalianParser(new CommonTokenStream(lexer));
		ParseTree tree = parser.game();

		ItalianQuestionListener listener = new ItalianQuestionListener();
		ParseTreeWalker.DEFAULT.walk(listener, tree);

		System.out.println(listener.getQuestion());



		//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		//new BoardTable("Who is he?").setVisible(true);
	}
}
