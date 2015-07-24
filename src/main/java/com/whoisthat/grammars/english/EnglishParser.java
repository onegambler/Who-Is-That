// Generated from C:/Users/roberto.magale/IdeaProjects/Who-Is-That/src/main/resources/com.whoisthat/grammars\English.g4 by ANTLR 4.5.1
package com.whoisthat.grammars.english;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EnglishParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, HAIR=3, EYES=4, MOUTH=5, BEARD=6, NOSE=7, SEX=8, AGE=9, 
		BODY=10, ETHNIC=11, REDCHEEKS=12, ACCESSORY=13, HAVE=14, BE=15, WEAR=16, 
		AUX=17, PRON=18, BLACK=19, BROWN=20, GREEN=21, BLUE=22, WHITE=23, RED=24, 
		BLONDE=25, LENGTH=26, SIZE=27, SIZEA=28, BALD=29, HAIRDO=30, SOLUTION=31, 
		WS=32;
	public static final int
		RULE_game = 0, RULE_question = 1, RULE_look = 2, RULE_color = 3, RULE_measures = 4, 
		RULE_beard = 5, RULE_hairStyle = 6, RULE_cheeks = 7, RULE_person = 8, 
		RULE_ethnic = 9, RULE_accessory = 10, RULE_solution = 11;
	public static final String[] ruleNames = {
		"game", "question", "look", "color", "measures", "beard", "hairStyle", 
		"cheeks", "person", "ethnic", "accessory", "solution"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'?'", "'!'", "'hair'", "'eyes'", "'mouth'", null, "'nose'", null, 
		null, null, null, "'red cheeks'", null, "'have'", "'is'", "'wear'", "'does'", 
		null, "'black'", "'brown'", "'green'", "'blue'", "'white'", "'red'", "'blonde'", 
		null, null, null, "'bald'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "HAIR", "EYES", "MOUTH", "BEARD", "NOSE", "SEX", "AGE", 
		"BODY", "ETHNIC", "REDCHEEKS", "ACCESSORY", "HAVE", "BE", "WEAR", "AUX", 
		"PRON", "BLACK", "BROWN", "GREEN", "BLUE", "WHITE", "RED", "BLONDE", "LENGTH", 
		"SIZE", "SIZEA", "BALD", "HAIRDO", "SOLUTION", "WS"
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

	@Override
	public String getGrammarFileName() { return "English.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EnglishParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GameContext extends ParserRuleContext {
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public SolutionContext solution() {
			return getRuleContext(SolutionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(EnglishParser.EOF, 0); }
		public GameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_game; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterGame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitGame(this);
		}
	}

	public final GameContext game() throws RecognitionException {
		GameContext _localctx = new GameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_game);
		int _la;
		try {
			setState(30);
			switch (_input.LA(1)) {
			case BE:
			case AUX:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				question();
				setState(25);
				match(T__0);
				}
				break;
			case SOLUTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				solution();
				setState(28);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==T__1) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuestionContext extends ParserRuleContext {
		public TerminalNode AUX() { return getToken(EnglishParser.AUX, 0); }
		public TerminalNode PRON() { return getToken(EnglishParser.PRON, 0); }
		public TerminalNode HAVE() { return getToken(EnglishParser.HAVE, 0); }
		public LookContext look() {
			return getRuleContext(LookContext.class,0);
		}
		public TerminalNode WEAR() { return getToken(EnglishParser.WEAR, 0); }
		public AccessoryContext accessory() {
			return getRuleContext(AccessoryContext.class,0);
		}
		public TerminalNode BE() { return getToken(EnglishParser.BE, 0); }
		public PersonContext person() {
			return getRuleContext(PersonContext.class,0);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitQuestion(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_question);
		try {
			setState(43);
			switch (_input.LA(1)) {
			case AUX:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(AUX);
				setState(33);
				match(PRON);
				setState(38);
				switch (_input.LA(1)) {
				case HAVE:
					{
					setState(34);
					match(HAVE);
					setState(35);
					look();
					}
					break;
				case WEAR:
					{
					setState(36);
					match(WEAR);
					setState(37);
					accessory();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case BE:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(BE);
				setState(41);
				match(PRON);
				setState(42);
				person();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LookContext extends ParserRuleContext {
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public MeasuresContext measures() {
			return getRuleContext(MeasuresContext.class,0);
		}
		public BeardContext beard() {
			return getRuleContext(BeardContext.class,0);
		}
		public HairStyleContext hairStyle() {
			return getRuleContext(HairStyleContext.class,0);
		}
		public CheeksContext cheeks() {
			return getRuleContext(CheeksContext.class,0);
		}
		public LookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_look; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterLook(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitLook(this);
		}
	}

	public final LookContext look() throws RecognitionException {
		LookContext _localctx = new LookContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_look);
		try {
			setState(50);
			switch (_input.LA(1)) {
			case BLACK:
			case BROWN:
			case GREEN:
			case BLUE:
			case WHITE:
			case RED:
			case BLONDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				color();
				}
				break;
			case LENGTH:
			case SIZE:
			case SIZEA:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				measures();
				}
				break;
			case BEARD:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				beard();
				}
				break;
			case HAIRDO:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				hairStyle();
				}
				break;
			case REDCHEEKS:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				cheeks();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode BLACK() { return getToken(EnglishParser.BLACK, 0); }
		public TerminalNode BROWN() { return getToken(EnglishParser.BROWN, 0); }
		public TerminalNode EYES() { return getToken(EnglishParser.EYES, 0); }
		public TerminalNode HAIR() { return getToken(EnglishParser.HAIR, 0); }
		public TerminalNode WHITE() { return getToken(EnglishParser.WHITE, 0); }
		public TerminalNode BLONDE() { return getToken(EnglishParser.BLONDE, 0); }
		public TerminalNode RED() { return getToken(EnglishParser.RED, 0); }
		public TerminalNode GREEN() { return getToken(EnglishParser.GREEN, 0); }
		public TerminalNode BLUE() { return getToken(EnglishParser.BLUE, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitColor(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_color);
		int _la;
		try {
			setState(58);
			switch (_input.LA(1)) {
			case BLACK:
			case BROWN:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				_la = _input.LA(1);
				if ( !(_la==BLACK || _la==BROWN) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(53);
				_la = _input.LA(1);
				if ( !(_la==HAIR || _la==EYES) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case WHITE:
			case RED:
			case BLONDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITE) | (1L << RED) | (1L << BLONDE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(55);
				match(HAIR);
				}
				break;
			case GREEN:
			case BLUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				_la = _input.LA(1);
				if ( !(_la==GREEN || _la==BLUE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(57);
				match(EYES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeasuresContext extends ParserRuleContext {
		public TerminalNode SIZEA() { return getToken(EnglishParser.SIZEA, 0); }
		public TerminalNode NOSE() { return getToken(EnglishParser.NOSE, 0); }
		public TerminalNode MOUTH() { return getToken(EnglishParser.MOUTH, 0); }
		public TerminalNode LENGTH() { return getToken(EnglishParser.LENGTH, 0); }
		public TerminalNode HAIR() { return getToken(EnglishParser.HAIR, 0); }
		public TerminalNode SIZE() { return getToken(EnglishParser.SIZE, 0); }
		public TerminalNode EYES() { return getToken(EnglishParser.EYES, 0); }
		public MeasuresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measures; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterMeasures(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitMeasures(this);
		}
	}

	public final MeasuresContext measures() throws RecognitionException {
		MeasuresContext _localctx = new MeasuresContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_measures);
		int _la;
		try {
			setState(66);
			switch (_input.LA(1)) {
			case SIZEA:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(SIZEA);
				setState(61);
				_la = _input.LA(1);
				if ( !(_la==MOUTH || _la==NOSE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case LENGTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(LENGTH);
				setState(63);
				match(HAIR);
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(SIZE);
				setState(65);
				match(EYES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeardContext extends ParserRuleContext {
		public TerminalNode BEARD() { return getToken(EnglishParser.BEARD, 0); }
		public BeardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterBeard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitBeard(this);
		}
	}

	public final BeardContext beard() throws RecognitionException {
		BeardContext _localctx = new BeardContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_beard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(BEARD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HairStyleContext extends ParserRuleContext {
		public TerminalNode HAIRDO() { return getToken(EnglishParser.HAIRDO, 0); }
		public TerminalNode HAIR() { return getToken(EnglishParser.HAIR, 0); }
		public HairStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hairStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterHairStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitHairStyle(this);
		}
	}

	public final HairStyleContext hairStyle() throws RecognitionException {
		HairStyleContext _localctx = new HairStyleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_hairStyle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(HAIRDO);
			setState(71);
			match(HAIR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheeksContext extends ParserRuleContext {
		public TerminalNode REDCHEEKS() { return getToken(EnglishParser.REDCHEEKS, 0); }
		public CheeksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cheeks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterCheeks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitCheeks(this);
		}
	}

	public final CheeksContext cheeks() throws RecognitionException {
		CheeksContext _localctx = new CheeksContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cheeks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(REDCHEEKS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PersonContext extends ParserRuleContext {
		public TerminalNode SEX() { return getToken(EnglishParser.SEX, 0); }
		public TerminalNode AGE() { return getToken(EnglishParser.AGE, 0); }
		public TerminalNode BALD() { return getToken(EnglishParser.BALD, 0); }
		public TerminalNode BODY() { return getToken(EnglishParser.BODY, 0); }
		public EthnicContext ethnic() {
			return getRuleContext(EthnicContext.class,0);
		}
		public PersonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_person; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterPerson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitPerson(this);
		}
	}

	public final PersonContext person() throws RecognitionException {
		PersonContext _localctx = new PersonContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_person);
		try {
			setState(80);
			switch (_input.LA(1)) {
			case SEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(SEX);
				}
				break;
			case AGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(AGE);
				}
				break;
			case BALD:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(BALD);
				}
				break;
			case BODY:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				match(BODY);
				}
				break;
			case ETHNIC:
			case BLACK:
			case WHITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				ethnic();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EthnicContext extends ParserRuleContext {
		public TerminalNode ETHNIC() { return getToken(EnglishParser.ETHNIC, 0); }
		public TerminalNode BLACK() { return getToken(EnglishParser.BLACK, 0); }
		public TerminalNode WHITE() { return getToken(EnglishParser.WHITE, 0); }
		public EthnicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ethnic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterEthnic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitEthnic(this);
		}
	}

	public final EthnicContext ethnic() throws RecognitionException {
		EthnicContext _localctx = new EthnicContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ethnic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ETHNIC) | (1L << BLACK) | (1L << WHITE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessoryContext extends ParserRuleContext {
		public TerminalNode ACCESSORY() { return getToken(EnglishParser.ACCESSORY, 0); }
		public AccessoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterAccessory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitAccessory(this);
		}
	}

	public final AccessoryContext accessory() throws RecognitionException {
		AccessoryContext _localctx = new AccessoryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_accessory);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ACCESSORY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SolutionContext extends ParserRuleContext {
		public TerminalNode SOLUTION() { return getToken(EnglishParser.SOLUTION, 0); }
		public SolutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterSolution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitSolution(this);
		}
	}

	public final SolutionContext solution() throws RecognitionException {
		SolutionContext _localctx = new SolutionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_solution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(SOLUTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"[\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\5\2!\n\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3)\n\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\5\4\65\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5=\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6E\n\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\nS\n\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\t\3\3\4\4\3\2\25\26\3"+
		"\2\5\6\3\2\31\33\3\2\27\30\4\2\7\7\t\t\5\2\r\r\25\25\31\31]\2 \3\2\2\2"+
		"\4-\3\2\2\2\6\64\3\2\2\2\b<\3\2\2\2\nD\3\2\2\2\fF\3\2\2\2\16H\3\2\2\2"+
		"\20K\3\2\2\2\22R\3\2\2\2\24T\3\2\2\2\26V\3\2\2\2\30X\3\2\2\2\32\33\5\4"+
		"\3\2\33\34\7\3\2\2\34!\3\2\2\2\35\36\5\30\r\2\36\37\t\2\2\2\37!\3\2\2"+
		"\2 \32\3\2\2\2 \35\3\2\2\2!\3\3\2\2\2\"#\7\23\2\2#(\7\24\2\2$%\7\20\2"+
		"\2%)\5\6\4\2&\'\7\22\2\2\')\5\26\f\2($\3\2\2\2(&\3\2\2\2).\3\2\2\2*+\7"+
		"\21\2\2+,\7\24\2\2,.\5\22\n\2-\"\3\2\2\2-*\3\2\2\2.\5\3\2\2\2/\65\5\b"+
		"\5\2\60\65\5\n\6\2\61\65\5\f\7\2\62\65\5\16\b\2\63\65\5\20\t\2\64/\3\2"+
		"\2\2\64\60\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\7\3\2"+
		"\2\2\66\67\t\3\2\2\67=\t\4\2\289\t\5\2\29=\7\5\2\2:;\t\6\2\2;=\7\6\2\2"+
		"<\66\3\2\2\2<8\3\2\2\2<:\3\2\2\2=\t\3\2\2\2>?\7\36\2\2?E\t\7\2\2@A\7\34"+
		"\2\2AE\7\5\2\2BC\7\35\2\2CE\7\6\2\2D>\3\2\2\2D@\3\2\2\2DB\3\2\2\2E\13"+
		"\3\2\2\2FG\7\b\2\2G\r\3\2\2\2HI\7 \2\2IJ\7\5\2\2J\17\3\2\2\2KL\7\16\2"+
		"\2L\21\3\2\2\2MS\7\n\2\2NS\7\13\2\2OS\7\37\2\2PS\7\f\2\2QS\5\24\13\2R"+
		"M\3\2\2\2RN\3\2\2\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2S\23\3\2\2\2TU\t\b\2"+
		"\2U\25\3\2\2\2VW\7\17\2\2W\27\3\2\2\2XY\7!\2\2Y\31\3\2\2\2\t (-\64<DR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}