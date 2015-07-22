// Generated from C:/Users/PC/IdeaProjects/Who Is That/src/main/resources/com.whoisthat/grammars\Italian.g4 by ANTLR 4.5.1
package com.whoisthat.grammars.italian;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ItalianLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, BEARD=3, EYECOL=4, HAIRCOL=5, HAIRLEN=6, HAIRDO=7, BALD=8, 
		SEX=9, AGE=10, BODY=11, ETHNIC=12, ACCESSORY=13, HAVE=14, BE=15, WEAR=16, 
		EYES=17, MOUTH=18, HAIR=19, NOSE=20, REDCHEEKS=21, BIGS=22, BIGP=23, SMALLFS=24, 
		SMALLMS=25, SMALLFP=26, SMALLMP=27, BLACK=28, SOLUTION=29, WS=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "BEARD", "EYECOL", "HAIRCOL", "HAIRLEN", "HAIRDO", "BALD", 
		"SEX", "AGE", "BODY", "ETHNIC", "ACCESSORY", "HAVE", "BE", "WEAR", "EYES", 
		"MOUTH", "HAIR", "NOSE", "REDCHEEKS", "BIGS", "BIGP", "SMALLFS", "SMALLMS", 
		"SMALLFP", "SMALLMP", "BLACK", "SOLUTION", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'?'", "'!'", null, null, null, null, null, "'calvo'", null, null, 
		null, null, null, null, "'\\u00e8'", null, "'gli occhi'", "'la bocca'", 
		"'i capelli'", "'il naso'", "'le guance rosse'", "'grande'", "'grandi'", 
		"'piccola'", "'piccolo'", "'piccole'", "'piccoli'", "'neri'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "BEARD", "EYECOL", "HAIRCOL", "HAIRLEN", "HAIRDO", "BALD", 
		"SEX", "AGE", "BODY", "ETHNIC", "ACCESSORY", "HAVE", "BE", "WEAR", "EYES", 
		"MOUTH", "HAIR", "NOSE", "REDCHEEKS", "BIGS", "BIGP", "SMALLFS", "SMALLMS", 
		"SMALLFP", "SMALLMP", "BLACK", "SOLUTION", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ItalianLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Italian.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u01a2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"S\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5h\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0083\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0090\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a1\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00b7\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u00c7\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00d4\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ef\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u0120\n\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\7\36\u0197"+
		"\n\36\f\36\16\36\u019a\13\36\3\37\6\37\u019d\n\37\r\37\16\37\u019e\3\37"+
		"\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= \3\2\7\4\2JJjj\4\2RRrr\5\2))CC\\\\\5\2))cc||\5\2\13\f\17"+
		"\17\"\"\u01b5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7R\3\2\2\2\tg\3\2\2"+
		"\2\13\u0082\3\2\2\2\r\u008f\3\2\2\2\17\u00a0\3\2\2\2\21\u00a2\3\2\2\2"+
		"\23\u00b6\3\2\2\2\25\u00c6\3\2\2\2\27\u00d3\3\2\2\2\31\u00ee\3\2\2\2\33"+
		"\u011f\3\2\2\2\35\u0121\3\2\2\2\37\u0124\3\2\2\2!\u0126\3\2\2\2#\u012c"+
		"\3\2\2\2%\u0136\3\2\2\2\'\u013f\3\2\2\2)\u0149\3\2\2\2+\u0151\3\2\2\2"+
		"-\u0161\3\2\2\2/\u0168\3\2\2\2\61\u016f\3\2\2\2\63\u0177\3\2\2\2\65\u017f"+
		"\3\2\2\2\67\u0187\3\2\2\29\u018f\3\2\2\2;\u0194\3\2\2\2=\u019c\3\2\2\2"+
		"?@\7A\2\2@\4\3\2\2\2AB\7#\2\2B\6\3\2\2\2CD\7n\2\2DE\7c\2\2EF\7\"\2\2F"+
		"G\7d\2\2GH\7c\2\2HI\7t\2\2IJ\7d\2\2JS\7c\2\2KL\7k\2\2LM\7\"\2\2MN\7d\2"+
		"\2NO\7c\2\2OP\7h\2\2PQ\7h\2\2QS\7k\2\2RC\3\2\2\2RK\3\2\2\2S\b\3\2\2\2"+
		"TU\7o\2\2UV\7c\2\2VW\7t\2\2WX\7t\2\2XY\7q\2\2YZ\7p\2\2Zh\7k\2\2[\\\7x"+
		"\2\2\\]\7g\2\2]^\7t\2\2^_\7f\2\2_h\7k\2\2`a\7c\2\2ab\7|\2\2bc\7|\2\2c"+
		"d\7w\2\2de\7t\2\2ef\7t\2\2fh\7k\2\2gT\3\2\2\2g[\3\2\2\2g`\3\2\2\2h\n\3"+
		"\2\2\2ij\7d\2\2jk\7k\2\2kl\7q\2\2lm\7p\2\2mn\7f\2\2n\u0083\7k\2\2op\7"+
		"e\2\2pq\7c\2\2qr\7u\2\2rs\7v\2\2st\7c\2\2tu\7p\2\2u\u0083\7k\2\2vw\7t"+
		"\2\2wx\7q\2\2xy\7u\2\2yz\7u\2\2z\u0083\7k\2\2{|\7d\2\2|}\7k\2\2}~\7c\2"+
		"\2~\177\7p\2\2\177\u0080\7e\2\2\u0080\u0081\7j\2\2\u0081\u0083\7k\2\2"+
		"\u0082i\3\2\2\2\u0082o\3\2\2\2\u0082v\3\2\2\2\u0082{\3\2\2\2\u0083\f\3"+
		"\2\2\2\u0084\u0085\7n\2\2\u0085\u0086\7w\2\2\u0086\u0087\7p\2\2\u0087"+
		"\u0088\7i\2\2\u0088\u0089\7j\2\2\u0089\u0090\7k\2\2\u008a\u008b\7e\2\2"+
		"\u008b\u008c\7q\2\2\u008c\u008d\7t\2\2\u008d\u008e\7v\2\2\u008e\u0090"+
		"\7k\2\2\u008f\u0084\3\2\2\2\u008f\u008a\3\2\2\2\u0090\16\3\2\2\2\u0091"+
		"\u0092\7t\2\2\u0092\u0093\7k\2\2\u0093\u0094\7e\2\2\u0094\u0095\7e\2\2"+
		"\u0095\u00a1\7k\2\2\u0096\u0097\7n\2\2\u0097\u0098\7k\2\2\u0098\u0099"+
		"\7u\2\2\u0099\u009a\7e\2\2\u009a\u00a1\7k\2\2\u009b\u009c\7o\2\2\u009c"+
		"\u009d\7q\2\2\u009d\u009e\7u\2\2\u009e\u009f\7u\2\2\u009f\u00a1\7k\2\2"+
		"\u00a0\u0091\3\2\2\2\u00a0\u0096\3\2\2\2\u00a0\u009b\3\2\2\2\u00a1\20"+
		"\3\2\2\2\u00a2\u00a3\7e\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7n\2\2\u00a5"+
		"\u00a6\7x\2\2\u00a6\u00a7\7q\2\2\u00a7\22\3\2\2\2\u00a8\u00a9\7o\2\2\u00a9"+
		"\u00aa\7c\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7e\2\2\u00ac\u00ad\7j\2\2"+
		"\u00ad\u00ae\7k\2\2\u00ae\u00b7\7q\2\2\u00af\u00b0\7h\2\2\u00b0\u00b1"+
		"\7g\2\2\u00b1\u00b2\7o\2\2\u00b2\u00b3\7o\2\2\u00b3\u00b4\7k\2\2\u00b4"+
		"\u00b5\7p\2\2\u00b5\u00b7\7c\2\2\u00b6\u00a8\3\2\2\2\u00b6\u00af\3\2\2"+
		"\2\u00b7\24\3\2\2\2\u00b8\u00b9\7x\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb"+
		"\7e\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7j\2\2\u00bd\u00be\7k\2\2\u00be"+
		"\u00c7\7q\2\2\u00bf\u00c0\7i\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7q\2\2"+
		"\u00c2\u00c3\7x\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c7"+
		"\7g\2\2\u00c6\u00b8\3\2\2\2\u00c6\u00bf\3\2\2\2\u00c7\26\3\2\2\2\u00c8"+
		"\u00c9\7i\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7u\2\2"+
		"\u00cc\u00cd\7u\2\2\u00cd\u00d4\7q\2\2\u00ce\u00cf\7o\2\2\u00cf\u00d0"+
		"\7c\2\2\u00d0\u00d1\7i\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d4\7q\2\2\u00d3"+
		"\u00c8\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d4\30\3\2\2\2\u00d5\u00d6\7d\2\2"+
		"\u00d6\u00d7\7k\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da"+
		"\7e\2\2\u00da\u00ef\7q\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7g\2\2\u00dd"+
		"\u00de\7t\2\2\u00de\u00ef\7q\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7u\2\2"+
		"\u00e1\u00e2\7k\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5"+
		"\7k\2\2\u00e5\u00e6\7e\2\2\u00e6\u00ef\7q\2\2\u00e7\u00e8\7k\2\2\u00e8"+
		"\u00e9\7p\2\2\u00e9\u00ea\7f\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7c\2\2"+
		"\u00ec\u00ed\7p\2\2\u00ed\u00ef\7q\2\2\u00ee\u00d5\3\2\2\2\u00ee\u00db"+
		"\3\2\2\2\u00ee\u00df\3\2\2\2\u00ee\u00e7\3\2\2\2\u00ef\32\3\2\2\2\u00f0"+
		"\u00f1\7k\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7\"\2\2\u00f3\u00f4\7e\2"+
		"\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7r\2\2\u00f6\u00f7\7r\2\2\u00f7\u00f8"+
		"\7g\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7n\2\2\u00fa\u0120\7q\2\2\u00fb"+
		"\u00fc\7i\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7\"\2"+
		"\2\u00ff\u0100\7q\2\2\u0100\u0101\7e\2\2\u0101\u0102\7e\2\2\u0102\u0103"+
		"\7j\2\2\u0103\u0104\7k\2\2\u0104\u0105\7c\2\2\u0105\u0106\7n\2\2\u0106"+
		"\u0120\7k\2\2\u0107\u0108\7i\2\2\u0108\u0109\7n\2\2\u0109\u010a\7k\2\2"+
		"\u010a\u010b\7\"\2\2\u010b\u010c\7q\2\2\u010c\u010d\7t\2\2\u010d\u010e"+
		"\7g\2\2\u010e\u010f\7e\2\2\u010f\u0110\7e\2\2\u0110\u0111\7j\2\2\u0111"+
		"\u0112\7k\2\2\u0112\u0113\7p\2\2\u0113\u0120\7k\2\2\u0114\u0115\7k\2\2"+
		"\u0115\u0116\7n\2\2\u0116\u0117\7\"\2\2\u0117\u0118\7t\2\2\u0118\u0119"+
		"\7q\2\2\u0119\u011a\7u\2\2\u011a\u011b\7u\2\2\u011b\u011c\7g\2\2\u011c"+
		"\u011d\7v\2\2\u011d\u011e\7v\2\2\u011e\u0120\7q\2\2\u011f\u00f0\3\2\2"+
		"\2\u011f\u00fb\3\2\2\2\u011f\u0107\3\2\2\2\u011f\u0114\3\2\2\2\u0120\34"+
		"\3\2\2\2\u0121\u0122\t\2\2\2\u0122\u0123\7c\2\2\u0123\36\3\2\2\2\u0124"+
		"\u0125\7\u00ea\2\2\u0125 \3\2\2\2\u0126\u0127\t\3\2\2\u0127\u0128\7q\2"+
		"\2\u0128\u0129\7t\2\2\u0129\u012a\7v\2\2\u012a\u012b\7c\2\2\u012b\"\3"+
		"\2\2\2\u012c\u012d\7i\2\2\u012d\u012e\7n\2\2\u012e\u012f\7k\2\2\u012f"+
		"\u0130\7\"\2\2\u0130\u0131\7q\2\2\u0131\u0132\7e\2\2\u0132\u0133\7e\2"+
		"\2\u0133\u0134\7j\2\2\u0134\u0135\7k\2\2\u0135$\3\2\2\2\u0136\u0137\7"+
		"n\2\2\u0137\u0138\7c\2\2\u0138\u0139\7\"\2\2\u0139\u013a\7d\2\2\u013a"+
		"\u013b\7q\2\2\u013b\u013c\7e\2\2\u013c\u013d\7e\2\2\u013d\u013e\7c\2\2"+
		"\u013e&\3\2\2\2\u013f\u0140\7k\2\2\u0140\u0141\7\"\2\2\u0141\u0142\7e"+
		"\2\2\u0142\u0143\7c\2\2\u0143\u0144\7r\2\2\u0144\u0145\7g\2\2\u0145\u0146"+
		"\7n\2\2\u0146\u0147\7n\2\2\u0147\u0148\7k\2\2\u0148(\3\2\2\2\u0149\u014a"+
		"\7k\2\2\u014a\u014b\7n\2\2\u014b\u014c\7\"\2\2\u014c\u014d\7p\2\2\u014d"+
		"\u014e\7c\2\2\u014e\u014f\7u\2\2\u014f\u0150\7q\2\2\u0150*\3\2\2\2\u0151"+
		"\u0152\7n\2\2\u0152\u0153\7g\2\2\u0153\u0154\7\"\2\2\u0154\u0155\7i\2"+
		"\2\u0155\u0156\7w\2\2\u0156\u0157\7c\2\2\u0157\u0158\7p\2\2\u0158\u0159"+
		"\7e\2\2\u0159\u015a\7g\2\2\u015a\u015b\7\"\2\2\u015b\u015c\7t\2\2\u015c"+
		"\u015d\7q\2\2\u015d\u015e\7u\2\2\u015e\u015f\7u\2\2\u015f\u0160\7g\2\2"+
		"\u0160,\3\2\2\2\u0161\u0162\7i\2\2\u0162\u0163\7t\2\2\u0163\u0164\7c\2"+
		"\2\u0164\u0165\7p\2\2\u0165\u0166\7f\2\2\u0166\u0167\7g\2\2\u0167.\3\2"+
		"\2\2\u0168\u0169\7i\2\2\u0169\u016a\7t\2\2\u016a\u016b\7c\2\2\u016b\u016c"+
		"\7p\2\2\u016c\u016d\7f\2\2\u016d\u016e\7k\2\2\u016e\60\3\2\2\2\u016f\u0170"+
		"\7r\2\2\u0170\u0171\7k\2\2\u0171\u0172\7e\2\2\u0172\u0173\7e\2\2\u0173"+
		"\u0174\7q\2\2\u0174\u0175\7n\2\2\u0175\u0176\7c\2\2\u0176\62\3\2\2\2\u0177"+
		"\u0178\7r\2\2\u0178\u0179\7k\2\2\u0179\u017a\7e\2\2\u017a\u017b\7e\2\2"+
		"\u017b\u017c\7q\2\2\u017c\u017d\7n\2\2\u017d\u017e\7q\2\2\u017e\64\3\2"+
		"\2\2\u017f\u0180\7r\2\2\u0180\u0181\7k\2\2\u0181\u0182\7e\2\2\u0182\u0183"+
		"\7e\2\2\u0183\u0184\7q\2\2\u0184\u0185\7n\2\2\u0185\u0186\7g\2\2\u0186"+
		"\66\3\2\2\2\u0187\u0188\7r\2\2\u0188\u0189\7k\2\2\u0189\u018a\7e\2\2\u018a"+
		"\u018b\7e\2\2\u018b\u018c\7q\2\2\u018c\u018d\7n\2\2\u018d\u018e\7k\2\2"+
		"\u018e8\3\2\2\2\u018f\u0190\7p\2\2\u0190\u0191\7g\2\2\u0191\u0192\7t\2"+
		"\2\u0192\u0193\7k\2\2\u0193:\3\2\2\2\u0194\u0198\t\4\2\2\u0195\u0197\t"+
		"\5\2\2\u0196\u0195\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199<\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019d\t\6\2\2"+
		"\u019c\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f"+
		"\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\b\37\2\2\u01a1>\3\2\2\2\17\2"+
		"Rg\u0082\u008f\u00a0\u00b6\u00c6\u00d3\u00ee\u011f\u0198\u019e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}