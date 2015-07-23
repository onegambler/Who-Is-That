import com.whoisthat.grammars.ItalianQuestionListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class MainClass {

	public static void main(String[] args) throws Exception {


		String expression = "ha gli occhi neri?";
		ItalianLexer lexer = new ItalianLexer(new ANTLRInputStream(expression));
		ItalianParser parser = new ItalianParser(new CommonTokenStream(lexer));
		ParseTree tree = parser.game();

        ParseTreeWalker.DEFAULT.walk(new ItalianQuestionListener(), tree);

		//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		//new BoardTable("Who is he?").setVisible(true);
	}
}
