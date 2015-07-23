// Generated from C:/Users/PC/IdeaProjects/Who Is That/src/main/resources/com.whoisthat/grammars\Italian.g4 by ANTLR 4.5.1
package com.whoisthat.grammars.italian;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ItalianParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, BEARD=3, EYECOL=4, HAIRCOL=5, HAIRLEN=6, HAIRDO=7, BALD=8, 
		SEX=9, AGE=10, BODY=11, ETHNIC=12, ACCESSORY=13, HAVE=14, BE=15, WEAR=16, 
		EYES=17, MOUTH=18, HAIR=19, NOSE=20, REDCHEEKS=21, BIGS=22, BIGP=23, SMALLFS=24, 
		SMALLMS=25, SMALLFP=26, SMALLMP=27, BLACK=28, SOLUTION=29, WS=30;
	public static final int
		RULE_game = 0, RULE_question = 1, RULE_look = 2, RULE_eyelook = 3, RULE_eyecolor = 4, 
		RULE_eyesize = 5, RULE_hairlook = 6, RULE_haircolor = 7, RULE_noselook = 8, 
		RULE_mouthlook = 9, RULE_person = 10, RULE_solution = 11;
	public static final String[] ruleNames = {
		"game", "question", "look", "eyelook", "eyecolor", "eyesize", "hairlook", 
		"haircolor", "noselook", "mouthlook", "person", "solution"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'?'", "'!'", null, null, null, null, null, "'calvo'", null, null, 
		null, null, null, "'ha'", "'è'", "'porta'", "'gli occhi'", "'la bocca'", 
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

	@Override
	public String getGrammarFileName() { return "Italian.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ItalianParser(TokenStream input) {
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
		public TerminalNode EOF() { return getToken(ItalianParser.EOF, 0); }
		public GameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_game; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).enterGame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).exitGame(this);
		}
	}

	public final GameContext game() throws RecognitionException {
		GameContext _localctx = new GameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_game);
		int _la;
		try {
			setState(30);
			switch (_input.LA(1)) {
			case HAVE:
			case BE:
			case WEAR:
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
		public TerminalNode HAVE() { return getToken(ItalianParser.HAVE, 0); }
		public LookContext look() {
			return getRuleContext(LookContext.class,0);
		}
		public TerminalNode BE() { return getToken(ItalianParser.BE, 0); }
		public PersonContext person() {
			return getRuleContext(PersonContext.class,0);
		}
		public TerminalNode WEAR() { return getToken(ItalianParser.WEAR, 0); }
		public TerminalNode ACCESSORY() { return getToken(ItalianParser.ACCESSORY, 0); }
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).exitQuestion(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_question);
		try {
			setState(38);
			switch (_input.LA(1)) {
			case HAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(HAVE);
				setState(33);
				look();
				}
				break;
			case BE:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(BE);
				setState(35);
				person();
				}
				break;
			case WEAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				match(WEAR);
				setState(37);
				match(ACCESSORY);
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
		public EyelookContext eyelook() {
			return getRuleContext(EyelookContext.class,0);
		}
		public HairlookContext hairlook() {
			return getRuleContext(HairlookContext.class,0);
		}
		public NoselookContext noselook() {
			return getRuleContext(NoselookContext.class,0);
		}
		public MouthlookContext mouthlook() {
			return getRuleContext(MouthlookContext.class,0);
		}
		public TerminalNode BEARD() { return getToken(ItalianParser.BEARD, 0); }
		public TerminalNode REDCHEEKS() { return getToken(ItalianParser.REDCHEEKS, 0); }
		public LookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_look; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).enterLook(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).exitLook(this);
		}
	}

	public final LookContext look() throws RecognitionException {
		LookContext _localctx = new LookContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_look);
		try {
			setState(46);
			switch (_input.LA(1)) {
			case EYES:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				eyelook();
				}
				break;
			case HAIR:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				hairlook();
				}
				break;
			case NOSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				noselook();
				}
				break;
			case MOUTH:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				mouthlook();
				}
				break;
			case BEARD:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				match(BEARD);
				}
				break;
			case REDCHEEKS:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				match(REDCHEEKS);
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

	public static class EyelookContext extends ParserRuleContext {
		public TerminalNode EYES() { return getToken(ItalianParser.EYES, 0); }
		public EyecolorContext eyecolor() {
			return getRuleContext(EyecolorContext.class,0);
		}
		public EyesizeContext eyesize() {
			return getRuleContext(EyesizeContext.class,0);
		}
		public EyelookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eyelook; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).enterEyelook(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).exitEyelook(this);
		}
	}

	public final EyelookContext eyelook() throws RecognitionException {
		EyelookContext _localctx = new EyelookContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_eyelook);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(EYES);
			setState(51);
			switch (_input.LA(1)) {
			case EYECOL:
			case BLACK:
				{
				setState(49);
				eyecolor();
				}
				break;
			case BIGP:
			case SMALLMP:
				{
				setState(50);
				eyesize();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class EyecolorContext extends ParserRuleContext {
		public TerminalNode EYECOL() { return getToken(ItalianParser.EYECOL, 0); }
		public TerminalNode BLACK() { return getToken(ItalianParser.BLACK, 0); }
		public EyecolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eyecolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).enterEyecolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).exitEyecolor(this);
		}
	}

	public final EyecolorContext eyecolor() throws RecognitionException {
		EyecolorContext _localctx = new EyecolorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_eyecolor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !(_la==EYECOL || _la==BLACK) ) {
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

	public static class EyesizeContext extends ParserRuleContext {
		public TerminalNode BIGP() { return getToken(ItalianParser.BIGP, 0); }
		public TerminalNode SMALLMP() { return getToken(ItalianParser.SMALLMP, 0); }
		public EyesizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eyesize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).enterEyesize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).exitEyesize(this);
		}
	}

	public final EyesizeContext eyesize() throws RecognitionException {
		EyesizeContext _localctx = new EyesizeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_eyesize);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ( !(_la==BIGP || _la==SMALLMP) ) {
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

	public static class HairlookContext extends ParserRuleContext {
		public TerminalNode HAIR() { return getToken(ItalianParser.HAIR, 0); }
		public HaircolorContext haircolor() {
			return getRuleContext(HaircolorContext.class,0);
		}
		public TerminalNode HAIRLEN() { return getToken(ItalianParser.HAIRLEN, 0); }
		public TerminalNode HAIRDO() { return getToken(ItalianParser.HAIRDO, 0); }
		public HairlookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hairlook; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).enterHairlook(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).exitHairlook(this);
		}
	}

	public final HairlookContext hairlook() throws RecognitionException {
		HairlookContext _localctx = new HairlookContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_hairlook);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(HAIR);
			setState(61);
			switch (_input.LA(1)) {
			case HAIRCOL:
			case BLACK:
				{
				setState(58);
				haircolor();
				}
				break;
			case HAIRLEN:
				{
				setState(59);
				match(HAIRLEN);
				}
				break;
			case HAIRDO:
				{
				setState(60);
				match(HAIRDO);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class HaircolorContext extends ParserRuleContext {
		public TerminalNode BLACK() { return getToken(ItalianParser.BLACK, 0); }
		public TerminalNode HAIRCOL() { return getToken(ItalianParser.HAIRCOL, 0); }
		public HaircolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_haircolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).enterHaircolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).exitHaircolor(this);
		}
	}

	public final HaircolorContext haircolor() throws RecognitionException {
		HaircolorContext _localctx = new HaircolorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_haircolor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !(_la==HAIRCOL || _la==BLACK) ) {
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

	public static class NoselookContext extends ParserRuleContext {
		public TerminalNode NOSE() { return getToken(ItalianParser.NOSE, 0); }
		public TerminalNode BIGS() { return getToken(ItalianParser.BIGS, 0); }
		public TerminalNode SMALLMS() { return getToken(ItalianParser.SMALLMS, 0); }
		public NoselookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noselook; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).enterNoselook(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).exitNoselook(this);
		}
	}

	public final NoselookContext noselook() throws RecognitionException {
		NoselookContext _localctx = new NoselookContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_noselook);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(NOSE);
			setState(66);
			_la = _input.LA(1);
			if ( !(_la==BIGS || _la==SMALLMS) ) {
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

	public static class MouthlookContext extends ParserRuleContext {
		public TerminalNode MOUTH() { return getToken(ItalianParser.MOUTH, 0); }
		public TerminalNode BIGS() { return getToken(ItalianParser.BIGS, 0); }
		public TerminalNode SMALLFS() { return getToken(ItalianParser.SMALLFS, 0); }
		public MouthlookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mouthlook; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).enterMouthlook(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).exitMouthlook(this);
		}
	}

	public final MouthlookContext mouthlook() throws RecognitionException {
		MouthlookContext _localctx = new MouthlookContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mouthlook);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(MOUTH);
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==BIGS || _la==SMALLFS) ) {
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

	public static class PersonContext extends ParserRuleContext {
		public TerminalNode SEX() { return getToken(ItalianParser.SEX, 0); }
		public TerminalNode AGE() { return getToken(ItalianParser.AGE, 0); }
		public TerminalNode BALD() { return getToken(ItalianParser.BALD, 0); }
		public TerminalNode BODY() { return getToken(ItalianParser.BODY, 0); }
		public TerminalNode ETHNIC() { return getToken(ItalianParser.ETHNIC, 0); }
		public PersonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_person; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).enterPerson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).exitPerson(this);
		}
	}

	public final PersonContext person() throws RecognitionException {
		PersonContext _localctx = new PersonContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_person);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BALD) | (1L << SEX) | (1L << AGE) | (1L << BODY) | (1L << ETHNIC))) != 0)) ) {
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

	public static class SolutionContext extends ParserRuleContext {
		public TerminalNode SOLUTION() { return getToken(ItalianParser.SOLUTION, 0); }
		public SolutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).enterSolution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ItalianListener ) ((ItalianListener)listener).exitSolution(this);
		}
	}

	public final SolutionContext solution() throws RecognitionException {
		SolutionContext _localctx = new SolutionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_solution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 N\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\5\2!\n\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3)\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\61\n\4\3\5\3\5\3\5\5\5\66\n\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\5\b@\n\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\t\3\3"+
		"\4\4\4\2\6\6\36\36\4\2\31\31\35\35\4\2\7\7\36\36\4\2\30\30\33\33\4\2\30"+
		"\30\32\32\3\2\n\16L\2 \3\2\2\2\4(\3\2\2\2\6\60\3\2\2\2\b\62\3\2\2\2\n"+
		"\67\3\2\2\2\f9\3\2\2\2\16;\3\2\2\2\20A\3\2\2\2\22C\3\2\2\2\24F\3\2\2\2"+
		"\26I\3\2\2\2\30K\3\2\2\2\32\33\5\4\3\2\33\34\7\3\2\2\34!\3\2\2\2\35\36"+
		"\5\30\r\2\36\37\t\2\2\2\37!\3\2\2\2 \32\3\2\2\2 \35\3\2\2\2!\3\3\2\2\2"+
		"\"#\7\20\2\2#)\5\6\4\2$%\7\21\2\2%)\5\26\f\2&\'\7\22\2\2\')\7\17\2\2("+
		"\"\3\2\2\2($\3\2\2\2(&\3\2\2\2)\5\3\2\2\2*\61\5\b\5\2+\61\5\16\b\2,\61"+
		"\5\22\n\2-\61\5\24\13\2.\61\7\5\2\2/\61\7\27\2\2\60*\3\2\2\2\60+\3\2\2"+
		"\2\60,\3\2\2\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\7\3\2\2\2\62\65"+
		"\7\23\2\2\63\66\5\n\6\2\64\66\5\f\7\2\65\63\3\2\2\2\65\64\3\2\2\2\66\t"+
		"\3\2\2\2\678\t\3\2\28\13\3\2\2\29:\t\4\2\2:\r\3\2\2\2;?\7\25\2\2<@\5\20"+
		"\t\2=@\7\b\2\2>@\7\t\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\17\3\2\2\2AB\t"+
		"\5\2\2B\21\3\2\2\2CD\7\26\2\2DE\t\6\2\2E\23\3\2\2\2FG\7\24\2\2GH\t\7\2"+
		"\2H\25\3\2\2\2IJ\t\b\2\2J\27\3\2\2\2KL\7\37\2\2L\31\3\2\2\2\7 (\60\65"+
		"?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}