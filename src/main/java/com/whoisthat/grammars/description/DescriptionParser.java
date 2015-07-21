// Generated from C:/Users/PC/IdeaProjects/Who Is That/src/main/resources/com.whoisthat/grammars\Description.g4 by ANTLR 4.5.1
package com.whoisthat.grammars.description;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DescriptionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EYES=1, MOUTH=2, HAIR=3, NOSE=4, CHEEKS=5, BALD=6, SEX=7, AGE=8, BODY=9, 
		BEARD=10, MOUSTACHE=11, ETHNIC=12, ACCESSORY=13, SEXD=14, AGED=15, BODYD=16, 
		EYECOL=17, HAIRCOL=18, HAIRLEN=19, HAIRDO=20, ETHNICD=21, COL=22, SIZE=23, 
		BOOL=24, COMMA=25, SCOLON=26, OBR=27, CBR=28, EQUALS=29, NAME=30, ACC=31, 
		WS=32;
	public static final int
		RULE_gamePeople = 0, RULE_person = 1, RULE_portrait = 2, RULE_look = 3, 
		RULE_eyeLook = 4, RULE_hairLook = 5, RULE_noseLook = 6, RULE_mouthLook = 7, 
		RULE_beard = 8, RULE_age = 9, RULE_cheeks = 10, RULE_bald = 11, RULE_hairColor = 12, 
		RULE_eyeColor = 13, RULE_sex = 14, RULE_body = 15, RULE_ethnic = 16, RULE_accessory = 17;
	public static final String[] ruleNames = {
		"gamePeople", "person", "portrait", "look", "eyeLook", "hairLook", "noseLook", 
		"mouthLook", "beard", "age", "cheeks", "bald", "hairColor", "eyeColor", 
		"sex", "body", "ethnic", "accessory"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'eyes'", "'mouth'", "'hair'", "'nose'", "'cheeks'", "'bald'", "'sex'", 
		"'age'", "'body'", "'beard'", "'moustache'", "'ethnic'", "'accessory'", 
		null, null, null, null, null, null, null, "'asian'", null, null, null, 
		"','", "';'", "'{'", "'}'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EYES", "MOUTH", "HAIR", "NOSE", "CHEEKS", "BALD", "SEX", "AGE", 
		"BODY", "BEARD", "MOUSTACHE", "ETHNIC", "ACCESSORY", "SEXD", "AGED", "BODYD", 
		"EYECOL", "HAIRCOL", "HAIRLEN", "HAIRDO", "ETHNICD", "COL", "SIZE", "BOOL", 
		"COMMA", "SCOLON", "OBR", "CBR", "EQUALS", "NAME", "ACC", "WS"
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
	public String getGrammarFileName() { return "Description.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DescriptionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GamePeopleContext extends ParserRuleContext {
		public List<PersonContext> person() {
			return getRuleContexts(PersonContext.class);
		}
		public PersonContext person(int i) {
			return getRuleContext(PersonContext.class,i);
		}
		public GamePeopleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gamePeople; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescriptionVisitor ) return ((DescriptionVisitor<? extends T>)visitor).visitGamePeople(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GamePeopleContext gamePeople() throws RecognitionException {
		GamePeopleContext _localctx = new GamePeopleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gamePeople);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				person();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
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
		public TerminalNode NAME() { return getToken(DescriptionParser.NAME, 0); }
		public TerminalNode OBR() { return getToken(DescriptionParser.OBR, 0); }
		public PortraitContext portrait() {
			return getRuleContext(PortraitContext.class,0);
		}
		public TerminalNode CBR() { return getToken(DescriptionParser.CBR, 0); }
		public PersonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_person; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescriptionVisitor ) return ((DescriptionVisitor<? extends T>)visitor).visitPerson(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PersonContext person() throws RecognitionException {
		PersonContext _localctx = new PersonContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_person);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(NAME);
			setState(42);
			match(OBR);
			setState(43);
			portrait();
			setState(44);
			match(CBR);
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

	public static class PortraitContext extends ParserRuleContext {
		public List<LookContext> look() {
			return getRuleContexts(LookContext.class);
		}
		public LookContext look(int i) {
			return getRuleContext(LookContext.class,i);
		}
		public PortraitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_portrait; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescriptionVisitor ) return ((DescriptionVisitor<? extends T>)visitor).visitPortrait(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PortraitContext portrait() throws RecognitionException {
		PortraitContext _localctx = new PortraitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_portrait);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				look();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EYES) | (1L << MOUTH) | (1L << HAIR) | (1L << NOSE) | (1L << CHEEKS) | (1L << BALD) | (1L << SEX) | (1L << AGE) | (1L << BODY) | (1L << BEARD) | (1L << ETHNIC) | (1L << ACCESSORY))) != 0) );
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
		public SexContext sex() {
			return getRuleContext(SexContext.class,0);
		}
		public TerminalNode SCOLON() { return getToken(DescriptionParser.SCOLON, 0); }
		public EyeLookContext eyeLook() {
			return getRuleContext(EyeLookContext.class,0);
		}
		public HairLookContext hairLook() {
			return getRuleContext(HairLookContext.class,0);
		}
		public CheeksContext cheeks() {
			return getRuleContext(CheeksContext.class,0);
		}
		public AgeContext age() {
			return getRuleContext(AgeContext.class,0);
		}
		public NoseLookContext noseLook() {
			return getRuleContext(NoseLookContext.class,0);
		}
		public MouthLookContext mouthLook() {
			return getRuleContext(MouthLookContext.class,0);
		}
		public BeardContext beard() {
			return getRuleContext(BeardContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public EthnicContext ethnic() {
			return getRuleContext(EthnicContext.class,0);
		}
		public AccessoryContext accessory() {
			return getRuleContext(AccessoryContext.class,0);
		}
		public BaldContext bald() {
			return getRuleContext(BaldContext.class,0);
		}
		public LookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_look; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescriptionVisitor ) return ((DescriptionVisitor<? extends T>)visitor).visitLook(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LookContext look() throws RecognitionException {
		LookContext _localctx = new LookContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_look);
		try {
			setState(87);
			switch (_input.LA(1)) {
			case SEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				sex();
				setState(52);
				match(SCOLON);
				}
				break;
			case EYES:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				eyeLook();
				setState(55);
				match(SCOLON);
				}
				break;
			case HAIR:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				hairLook();
				setState(58);
				match(SCOLON);
				}
				break;
			case CHEEKS:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				cheeks();
				setState(61);
				match(SCOLON);
				}
				break;
			case AGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				age();
				setState(64);
				match(SCOLON);
				}
				break;
			case NOSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				noseLook();
				setState(67);
				match(SCOLON);
				}
				break;
			case MOUTH:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				mouthLook();
				setState(70);
				match(SCOLON);
				}
				break;
			case BEARD:
				enterOuterAlt(_localctx, 8);
				{
				setState(72);
				beard();
				setState(73);
				match(SCOLON);
				}
				break;
			case BODY:
				enterOuterAlt(_localctx, 9);
				{
				setState(75);
				body();
				setState(76);
				match(SCOLON);
				}
				break;
			case ETHNIC:
				enterOuterAlt(_localctx, 10);
				{
				setState(78);
				ethnic();
				setState(79);
				match(SCOLON);
				}
				break;
			case ACCESSORY:
				enterOuterAlt(_localctx, 11);
				{
				setState(81);
				accessory();
				setState(82);
				match(SCOLON);
				}
				break;
			case BALD:
				enterOuterAlt(_localctx, 12);
				{
				setState(84);
				bald();
				setState(85);
				match(SCOLON);
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

	public static class EyeLookContext extends ParserRuleContext {
		public TerminalNode EYES() { return getToken(DescriptionParser.EYES, 0); }
		public TerminalNode EQUALS() { return getToken(DescriptionParser.EQUALS, 0); }
		public EyeColorContext eyeColor() {
			return getRuleContext(EyeColorContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DescriptionParser.COMMA, 0); }
		public TerminalNode SIZE() { return getToken(DescriptionParser.SIZE, 0); }
		public EyeLookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eyeLook; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescriptionVisitor ) return ((DescriptionVisitor<? extends T>)visitor).visitEyeLook(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EyeLookContext eyeLook() throws RecognitionException {
		EyeLookContext _localctx = new EyeLookContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_eyeLook);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(EYES);
			setState(90);
			match(EQUALS);
			setState(91);
			eyeColor();
			setState(94);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(92);
				match(COMMA);
				setState(93);
				match(SIZE);
				}
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

	public static class HairLookContext extends ParserRuleContext {
		public TerminalNode HAIR() { return getToken(DescriptionParser.HAIR, 0); }
		public TerminalNode EQUALS() { return getToken(DescriptionParser.EQUALS, 0); }
		public TerminalNode HAIRLEN() { return getToken(DescriptionParser.HAIRLEN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DescriptionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DescriptionParser.COMMA, i);
		}
		public HairColorContext hairColor() {
			return getRuleContext(HairColorContext.class,0);
		}
		public TerminalNode HAIRDO() { return getToken(DescriptionParser.HAIRDO, 0); }
		public HairLookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hairLook; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescriptionVisitor ) return ((DescriptionVisitor<? extends T>)visitor).visitHairLook(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HairLookContext hairLook() throws RecognitionException {
		HairLookContext _localctx = new HairLookContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_hairLook);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(HAIR);
			setState(97);
			match(EQUALS);
			setState(98);
			match(HAIRLEN);
			setState(99);
			match(COMMA);
			setState(100);
			hairColor();
			setState(103);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(101);
				match(COMMA);
				setState(102);
				match(HAIRDO);
				}
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

	public static class NoseLookContext extends ParserRuleContext {
		public TerminalNode NOSE() { return getToken(DescriptionParser.NOSE, 0); }
		public TerminalNode EQUALS() { return getToken(DescriptionParser.EQUALS, 0); }
		public TerminalNode SIZE() { return getToken(DescriptionParser.SIZE, 0); }
		public NoseLookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noseLook; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescriptionVisitor ) return ((DescriptionVisitor<? extends T>)visitor).visitNoseLook(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoseLookContext noseLook() throws RecognitionException {
		NoseLookContext _localctx = new NoseLookContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_noseLook);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(NOSE);
			setState(106);
			match(EQUALS);
			setState(107);
			match(SIZE);
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

	public static class MouthLookContext extends ParserRuleContext {
		public TerminalNode MOUTH() { return getToken(DescriptionParser.MOUTH, 0); }
		public TerminalNode EQUALS() { return getToken(DescriptionParser.EQUALS, 0); }
		public TerminalNode SIZE() { return getToken(DescriptionParser.SIZE, 0); }
		public MouthLookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mouthLook; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescriptionVisitor ) return ((DescriptionVisitor<? extends T>)visitor).visitMouthLook(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MouthLookContext mouthLook() throws RecognitionException {
		MouthLookContext _localctx = new MouthLookContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mouthLook);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(MOUTH);
			setState(110);
			match(EQUALS);
			setState(111);
			match(SIZE);
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
		public List<TerminalNode> BEARD() { return getTokens(DescriptionParser.BEARD); }
		public TerminalNode BEARD(int i) {
			return getToken(DescriptionParser.BEARD, i);
		}
		public TerminalNode EQUALS() { return getToken(DescriptionParser.EQUALS, 0); }
		public TerminalNode MOUSTACHE() { return getToken(DescriptionParser.MOUSTACHE, 0); }
		public BeardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beard; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescriptionVisitor ) return ((DescriptionVisitor<? extends T>)visitor).visitBeard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeardContext beard() throws RecognitionException {
		BeardContext _localctx = new BeardContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_beard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(BEARD);
			setState(114);
			match(EQUALS);
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==BEARD || _la==MOUSTACHE) ) {
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

	public static class AgeContext extends ParserRuleContext {
		public TerminalNode AGE() { return getToken(DescriptionParser.AGE, 0); }
		public TerminalNode EQUALS() { return getToken(DescriptionParser.EQUALS, 0); }
		public TerminalNode AGED() { return getToken(DescriptionParser.AGED, 0); }
		public AgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_age; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescriptionVisitor ) return ((DescriptionVisitor<? extends T>)visitor).visitAge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AgeContext age() throws RecognitionException {
		AgeContext _localctx = new AgeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_age);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(AGE);
			setState(118);
			match(EQUALS);
			setState(119);
			match(AGED);
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
		public TerminalNode CHEEKS() { return getToken(DescriptionParser.CHEEKS, 0); }
		public TerminalNode EQUALS() { return getToken(DescriptionParser.EQUALS, 0); }
		public TerminalNode BOOL() { return getToken(DescriptionParser.BOOL, 0); }
		public CheeksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cheeks; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescriptionVisitor ) return ((DescriptionVisitor<? extends T>)visitor).visitCheeks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheeksContext cheeks() throws RecognitionException {
		CheeksContext _localctx = new CheeksContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cheeks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(CHEEKS);
			setState(122);
			match(EQUALS);
			setState(123);
			match(BOOL);
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

	public static class BaldContext extends ParserRuleContext {
		public TerminalNode BALD() { return getToken(DescriptionParser.BALD, 0); }
		public TerminalNode EQUALS() { return getToken(DescriptionParser.EQUALS, 0); }
		public TerminalNode BOOL() { return getToken(DescriptionParser.BOOL, 0); }
		public BaldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bald; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescriptionVisitor ) return ((DescriptionVisitor<? extends T>)visitor).visitBald(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaldContext bald() throws RecognitionException {
		BaldContext _localctx = new BaldContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bald);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(BALD);
			setState(126);
			match(EQUALS);
			setState(127);
			match(BOOL);
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

	public static class HairColorContext extends ParserRuleContext {
		public TerminalNode COL() { return getToken(DescriptionParser.COL, 0); }
		public TerminalNode HAIRCOL() { return getToken(DescriptionParser.HAIRCOL, 0); }
		public HairColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hairColor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescriptionVisitor ) return ((DescriptionVisitor<? extends T>)visitor).visitHairColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HairColorContext hairColor() throws RecognitionException {
		HairColorContext _localctx = new HairColorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_hairColor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==HAIRCOL || _la==COL) ) {
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

	public static class EyeColorContext extends ParserRuleContext {
		public TerminalNode EYECOL() { return getToken(DescriptionParser.EYECOL, 0); }
		public TerminalNode COL() { return getToken(DescriptionParser.COL, 0); }
		public EyeColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eyeColor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescriptionVisitor ) return ((DescriptionVisitor<? extends T>)visitor).visitEyeColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EyeColorContext eyeColor() throws RecognitionException {
		EyeColorContext _localctx = new EyeColorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_eyeColor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !(_la==EYECOL || _la==COL) ) {
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

	public static class SexContext extends ParserRuleContext {
		public TerminalNode SEX() { return getToken(DescriptionParser.SEX, 0); }
		public TerminalNode EQUALS() { return getToken(DescriptionParser.EQUALS, 0); }
		public TerminalNode SEXD() { return getToken(DescriptionParser.SEXD, 0); }
		public SexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescriptionVisitor ) return ((DescriptionVisitor<? extends T>)visitor).visitSex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SexContext sex() throws RecognitionException {
		SexContext _localctx = new SexContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(SEX);
			setState(134);
			match(EQUALS);
			setState(135);
			match(SEXD);
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode BODY() { return getToken(DescriptionParser.BODY, 0); }
		public TerminalNode EQUALS() { return getToken(DescriptionParser.EQUALS, 0); }
		public TerminalNode BODYD() { return getToken(DescriptionParser.BODYD, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescriptionVisitor ) return ((DescriptionVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(BODY);
			setState(138);
			match(EQUALS);
			setState(139);
			match(BODYD);
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
		public TerminalNode ETHNIC() { return getToken(DescriptionParser.ETHNIC, 0); }
		public TerminalNode EQUALS() { return getToken(DescriptionParser.EQUALS, 0); }
		public TerminalNode ETHNICD() { return getToken(DescriptionParser.ETHNICD, 0); }
		public TerminalNode COL() { return getToken(DescriptionParser.COL, 0); }
		public EthnicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ethnic; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescriptionVisitor ) return ((DescriptionVisitor<? extends T>)visitor).visitEthnic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EthnicContext ethnic() throws RecognitionException {
		EthnicContext _localctx = new EthnicContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ethnic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ETHNIC);
			setState(142);
			match(EQUALS);
			setState(143);
			_la = _input.LA(1);
			if ( !(_la==ETHNICD || _la==COL) ) {
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
		public TerminalNode ACCESSORY() { return getToken(DescriptionParser.ACCESSORY, 0); }
		public TerminalNode EQUALS() { return getToken(DescriptionParser.EQUALS, 0); }
		public List<TerminalNode> ACC() { return getTokens(DescriptionParser.ACC); }
		public TerminalNode ACC(int i) {
			return getToken(DescriptionParser.ACC, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DescriptionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DescriptionParser.COMMA, i);
		}
		public AccessoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessory; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DescriptionVisitor ) return ((DescriptionVisitor<? extends T>)visitor).visitAccessory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessoryContext accessory() throws RecognitionException {
		AccessoryContext _localctx = new AccessoryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_accessory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ACCESSORY);
			setState(146);
			match(EQUALS);
			setState(147);
			match(ACC);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(148);
				match(COMMA);
				setState(149);
				match(ACC);
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u009e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2(\n\2\r\2\16\2)\3\3\3\3\3\3\3\3\3\3\3\4\6\4\62\n\4\r"+
		"\4\16\4\63\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5Z\n\5\3\6\3\6\3\6\3\6\3\6\5\6a\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7j\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u0099\n\23\f\23\16\23\u009c\13\23\3\23\2\2\24\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\6\3\2\f\r\4\2\24\24\30\30\4"+
		"\2\23\23\30\30\3\2\27\30\u009b\2\'\3\2\2\2\4+\3\2\2\2\6\61\3\2\2\2\bY"+
		"\3\2\2\2\n[\3\2\2\2\fb\3\2\2\2\16k\3\2\2\2\20o\3\2\2\2\22s\3\2\2\2\24"+
		"w\3\2\2\2\26{\3\2\2\2\30\177\3\2\2\2\32\u0083\3\2\2\2\34\u0085\3\2\2\2"+
		"\36\u0087\3\2\2\2 \u008b\3\2\2\2\"\u008f\3\2\2\2$\u0093\3\2\2\2&(\5\4"+
		"\3\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\3\3\2\2\2+,\7 \2\2,-\7"+
		"\35\2\2-.\5\6\4\2./\7\36\2\2/\5\3\2\2\2\60\62\5\b\5\2\61\60\3\2\2\2\62"+
		"\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\7\3\2\2\2\65\66\5\36\20\2\66"+
		"\67\7\34\2\2\67Z\3\2\2\289\5\n\6\29:\7\34\2\2:Z\3\2\2\2;<\5\f\7\2<=\7"+
		"\34\2\2=Z\3\2\2\2>?\5\26\f\2?@\7\34\2\2@Z\3\2\2\2AB\5\24\13\2BC\7\34\2"+
		"\2CZ\3\2\2\2DE\5\16\b\2EF\7\34\2\2FZ\3\2\2\2GH\5\20\t\2HI\7\34\2\2IZ\3"+
		"\2\2\2JK\5\22\n\2KL\7\34\2\2LZ\3\2\2\2MN\5 \21\2NO\7\34\2\2OZ\3\2\2\2"+
		"PQ\5\"\22\2QR\7\34\2\2RZ\3\2\2\2ST\5$\23\2TU\7\34\2\2UZ\3\2\2\2VW\5\30"+
		"\r\2WX\7\34\2\2XZ\3\2\2\2Y\65\3\2\2\2Y8\3\2\2\2Y;\3\2\2\2Y>\3\2\2\2YA"+
		"\3\2\2\2YD\3\2\2\2YG\3\2\2\2YJ\3\2\2\2YM\3\2\2\2YP\3\2\2\2YS\3\2\2\2Y"+
		"V\3\2\2\2Z\t\3\2\2\2[\\\7\3\2\2\\]\7\37\2\2]`\5\34\17\2^_\7\33\2\2_a\7"+
		"\31\2\2`^\3\2\2\2`a\3\2\2\2a\13\3\2\2\2bc\7\5\2\2cd\7\37\2\2de\7\25\2"+
		"\2ef\7\33\2\2fi\5\32\16\2gh\7\33\2\2hj\7\26\2\2ig\3\2\2\2ij\3\2\2\2j\r"+
		"\3\2\2\2kl\7\6\2\2lm\7\37\2\2mn\7\31\2\2n\17\3\2\2\2op\7\4\2\2pq\7\37"+
		"\2\2qr\7\31\2\2r\21\3\2\2\2st\7\f\2\2tu\7\37\2\2uv\t\2\2\2v\23\3\2\2\2"+
		"wx\7\n\2\2xy\7\37\2\2yz\7\21\2\2z\25\3\2\2\2{|\7\7\2\2|}\7\37\2\2}~\7"+
		"\32\2\2~\27\3\2\2\2\177\u0080\7\b\2\2\u0080\u0081\7\37\2\2\u0081\u0082"+
		"\7\32\2\2\u0082\31\3\2\2\2\u0083\u0084\t\3\2\2\u0084\33\3\2\2\2\u0085"+
		"\u0086\t\4\2\2\u0086\35\3\2\2\2\u0087\u0088\7\t\2\2\u0088\u0089\7\37\2"+
		"\2\u0089\u008a\7\20\2\2\u008a\37\3\2\2\2\u008b\u008c\7\13\2\2\u008c\u008d"+
		"\7\37\2\2\u008d\u008e\7\22\2\2\u008e!\3\2\2\2\u008f\u0090\7\16\2\2\u0090"+
		"\u0091\7\37\2\2\u0091\u0092\t\5\2\2\u0092#\3\2\2\2\u0093\u0094\7\17\2"+
		"\2\u0094\u0095\7\37\2\2\u0095\u009a\7!\2\2\u0096\u0097\7\33\2\2\u0097"+
		"\u0099\7!\2\2\u0098\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b%\3\2\2\2\u009c\u009a\3\2\2\2\b)\63Y`i\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}