// Generated from PersonaScript.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PersonaScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_BRACE=1, CLOSE_BRACE=2, EQUALS=3, COMMA=4, QUOTE=5, DESCRIPTION=6, 
		SETTING=7, RESPONSE=8, NAME=9, TYPE=10, MBTI=11, ROLE=12, BACKGROUND=13, 
		CATEGORY=14, LENGTH=15, PROMPT=16, STRING_LITERAL=17, NUMBER_LITERAL=18, 
		WS=19;
	public static final int
		RULE_program = 0, RULE_description = 1, RULE_descriptionProperty = 2, 
		RULE_nameProperty = 3, RULE_typeProperty = 4, RULE_mbtiProperty = 5, RULE_roleProperty = 6, 
		RULE_backgroundProperty = 7, RULE_setting = 8, RULE_settingProperty = 9, 
		RULE_categoryProperty = 10, RULE_response = 11, RULE_responseProperty = 12, 
		RULE_lengthProperty = 13, RULE_promptProperty = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "description", "descriptionProperty", "nameProperty", "typeProperty", 
			"mbtiProperty", "roleProperty", "backgroundProperty", "setting", "settingProperty", 
			"categoryProperty", "response", "responseProperty", "lengthProperty", 
			"promptProperty"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'='", "','", "'\"'", "'Description'", "'Setting'", 
			"'Response'", "'name'", "'type'", "'mbti'", "'role'", "'background'", 
			"'category'", "'length'", "'prompt'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN_BRACE", "CLOSE_BRACE", "EQUALS", "COMMA", "QUOTE", "DESCRIPTION", 
			"SETTING", "RESPONSE", "NAME", "TYPE", "MBTI", "ROLE", "BACKGROUND", 
			"CATEGORY", "LENGTH", "PROMPT", "STRING_LITERAL", "NUMBER_LITERAL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "PersonaScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PersonaScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public SettingContext setting() {
			return getRuleContext(SettingContext.class,0);
		}
		public ResponseContext response() {
			return getRuleContext(ResponseContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			description();
			setState(31);
			setting();
			setState(32);
			response();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DescriptionContext extends ParserRuleContext {
		public TerminalNode DESCRIPTION() { return getToken(PersonaScriptParser.DESCRIPTION, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(PersonaScriptParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(PersonaScriptParser.CLOSE_BRACE, 0); }
		public List<DescriptionPropertyContext> descriptionProperty() {
			return getRuleContexts(DescriptionPropertyContext.class);
		}
		public DescriptionPropertyContext descriptionProperty(int i) {
			return getRuleContext(DescriptionPropertyContext.class,i);
		}
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).exitDescription(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(DESCRIPTION);
			setState(35);
			match(OPEN_BRACE);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15872L) != 0)) {
				{
				{
				setState(36);
				descriptionProperty();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DescriptionPropertyContext extends ParserRuleContext {
		public NamePropertyContext nameProperty() {
			return getRuleContext(NamePropertyContext.class,0);
		}
		public TypePropertyContext typeProperty() {
			return getRuleContext(TypePropertyContext.class,0);
		}
		public MbtiPropertyContext mbtiProperty() {
			return getRuleContext(MbtiPropertyContext.class,0);
		}
		public RolePropertyContext roleProperty() {
			return getRuleContext(RolePropertyContext.class,0);
		}
		public BackgroundPropertyContext backgroundProperty() {
			return getRuleContext(BackgroundPropertyContext.class,0);
		}
		public DescriptionPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptionProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).enterDescriptionProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).exitDescriptionProperty(this);
		}
	}

	public final DescriptionPropertyContext descriptionProperty() throws RecognitionException {
		DescriptionPropertyContext _localctx = new DescriptionPropertyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_descriptionProperty);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				nameProperty();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				typeProperty();
				}
				break;
			case MBTI:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				mbtiProperty();
				}
				break;
			case ROLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				roleProperty();
				}
				break;
			case BACKGROUND:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				backgroundProperty();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NamePropertyContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PersonaScriptParser.NAME, 0); }
		public TerminalNode EQUALS() { return getToken(PersonaScriptParser.EQUALS, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(PersonaScriptParser.STRING_LITERAL, 0); }
		public NamePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).enterNameProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).exitNameProperty(this);
		}
	}

	public final NamePropertyContext nameProperty() throws RecognitionException {
		NamePropertyContext _localctx = new NamePropertyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nameProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(NAME);
			setState(52);
			match(EQUALS);
			setState(53);
			match(STRING_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypePropertyContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(PersonaScriptParser.TYPE, 0); }
		public TerminalNode EQUALS() { return getToken(PersonaScriptParser.EQUALS, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(PersonaScriptParser.STRING_LITERAL, 0); }
		public TypePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).enterTypeProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).exitTypeProperty(this);
		}
	}

	public final TypePropertyContext typeProperty() throws RecognitionException {
		TypePropertyContext _localctx = new TypePropertyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(TYPE);
			setState(56);
			match(EQUALS);
			setState(57);
			match(STRING_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MbtiPropertyContext extends ParserRuleContext {
		public TerminalNode MBTI() { return getToken(PersonaScriptParser.MBTI, 0); }
		public TerminalNode EQUALS() { return getToken(PersonaScriptParser.EQUALS, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(PersonaScriptParser.STRING_LITERAL, 0); }
		public MbtiPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mbtiProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).enterMbtiProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).exitMbtiProperty(this);
		}
	}

	public final MbtiPropertyContext mbtiProperty() throws RecognitionException {
		MbtiPropertyContext _localctx = new MbtiPropertyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mbtiProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(MBTI);
			setState(60);
			match(EQUALS);
			setState(61);
			match(STRING_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RolePropertyContext extends ParserRuleContext {
		public TerminalNode ROLE() { return getToken(PersonaScriptParser.ROLE, 0); }
		public TerminalNode EQUALS() { return getToken(PersonaScriptParser.EQUALS, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(PersonaScriptParser.STRING_LITERAL, 0); }
		public RolePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).enterRoleProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).exitRoleProperty(this);
		}
	}

	public final RolePropertyContext roleProperty() throws RecognitionException {
		RolePropertyContext _localctx = new RolePropertyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_roleProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(ROLE);
			setState(64);
			match(EQUALS);
			setState(65);
			match(STRING_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BackgroundPropertyContext extends ParserRuleContext {
		public TerminalNode BACKGROUND() { return getToken(PersonaScriptParser.BACKGROUND, 0); }
		public TerminalNode EQUALS() { return getToken(PersonaScriptParser.EQUALS, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(PersonaScriptParser.STRING_LITERAL, 0); }
		public BackgroundPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backgroundProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).enterBackgroundProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).exitBackgroundProperty(this);
		}
	}

	public final BackgroundPropertyContext backgroundProperty() throws RecognitionException {
		BackgroundPropertyContext _localctx = new BackgroundPropertyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_backgroundProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(BACKGROUND);
			setState(68);
			match(EQUALS);
			setState(69);
			match(STRING_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SettingContext extends ParserRuleContext {
		public TerminalNode SETTING() { return getToken(PersonaScriptParser.SETTING, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(PersonaScriptParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(PersonaScriptParser.CLOSE_BRACE, 0); }
		public List<SettingPropertyContext> settingProperty() {
			return getRuleContexts(SettingPropertyContext.class);
		}
		public SettingPropertyContext settingProperty(int i) {
			return getRuleContext(SettingPropertyContext.class,i);
		}
		public SettingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).enterSetting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).exitSetting(this);
		}
	}

	public final SettingContext setting() throws RecognitionException {
		SettingContext _localctx = new SettingContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_setting);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(SETTING);
			setState(72);
			match(OPEN_BRACE);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 25600L) != 0)) {
				{
				{
				setState(73);
				settingProperty();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SettingPropertyContext extends ParserRuleContext {
		public TypePropertyContext typeProperty() {
			return getRuleContext(TypePropertyContext.class,0);
		}
		public CategoryPropertyContext categoryProperty() {
			return getRuleContext(CategoryPropertyContext.class,0);
		}
		public BackgroundPropertyContext backgroundProperty() {
			return getRuleContext(BackgroundPropertyContext.class,0);
		}
		public SettingPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settingProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).enterSettingProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).exitSettingProperty(this);
		}
	}

	public final SettingPropertyContext settingProperty() throws RecognitionException {
		SettingPropertyContext _localctx = new SettingPropertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_settingProperty);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				typeProperty();
				}
				break;
			case CATEGORY:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				categoryProperty();
				}
				break;
			case BACKGROUND:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				backgroundProperty();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CategoryPropertyContext extends ParserRuleContext {
		public TerminalNode CATEGORY() { return getToken(PersonaScriptParser.CATEGORY, 0); }
		public TerminalNode EQUALS() { return getToken(PersonaScriptParser.EQUALS, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(PersonaScriptParser.STRING_LITERAL, 0); }
		public CategoryPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_categoryProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).enterCategoryProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).exitCategoryProperty(this);
		}
	}

	public final CategoryPropertyContext categoryProperty() throws RecognitionException {
		CategoryPropertyContext _localctx = new CategoryPropertyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_categoryProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(CATEGORY);
			setState(87);
			match(EQUALS);
			setState(88);
			match(STRING_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ResponseContext extends ParserRuleContext {
		public TerminalNode RESPONSE() { return getToken(PersonaScriptParser.RESPONSE, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(PersonaScriptParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(PersonaScriptParser.CLOSE_BRACE, 0); }
		public List<ResponsePropertyContext> responseProperty() {
			return getRuleContexts(ResponsePropertyContext.class);
		}
		public ResponsePropertyContext responseProperty(int i) {
			return getRuleContext(ResponsePropertyContext.class,i);
		}
		public ResponseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).enterResponse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).exitResponse(this);
		}
	}

	public final ResponseContext response() throws RecognitionException {
		ResponseContext _localctx = new ResponseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_response);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(RESPONSE);
			setState(91);
			match(OPEN_BRACE);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LENGTH || _la==PROMPT) {
				{
				{
				setState(92);
				responseProperty();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ResponsePropertyContext extends ParserRuleContext {
		public LengthPropertyContext lengthProperty() {
			return getRuleContext(LengthPropertyContext.class,0);
		}
		public PromptPropertyContext promptProperty() {
			return getRuleContext(PromptPropertyContext.class,0);
		}
		public ResponsePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_responseProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).enterResponseProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).exitResponseProperty(this);
		}
	}

	public final ResponsePropertyContext responseProperty() throws RecognitionException {
		ResponsePropertyContext _localctx = new ResponsePropertyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_responseProperty);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LENGTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				lengthProperty();
				}
				break;
			case PROMPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				promptProperty();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LengthPropertyContext extends ParserRuleContext {
		public TerminalNode LENGTH() { return getToken(PersonaScriptParser.LENGTH, 0); }
		public TerminalNode EQUALS() { return getToken(PersonaScriptParser.EQUALS, 0); }
		public TerminalNode NUMBER_LITERAL() { return getToken(PersonaScriptParser.NUMBER_LITERAL, 0); }
		public LengthPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).enterLengthProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).exitLengthProperty(this);
		}
	}

	public final LengthPropertyContext lengthProperty() throws RecognitionException {
		LengthPropertyContext _localctx = new LengthPropertyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lengthProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(LENGTH);
			setState(105);
			match(EQUALS);
			setState(106);
			match(NUMBER_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PromptPropertyContext extends ParserRuleContext {
		public TerminalNode PROMPT() { return getToken(PersonaScriptParser.PROMPT, 0); }
		public TerminalNode EQUALS() { return getToken(PersonaScriptParser.EQUALS, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(PersonaScriptParser.STRING_LITERAL, 0); }
		public PromptPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_promptProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).enterPromptProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PersonaScriptListener ) ((PersonaScriptListener)listener).exitPromptProperty(this);
		}
	}

	public final PromptPropertyContext promptProperty() throws RecognitionException {
		PromptPropertyContext _localctx = new PromptPropertyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_promptProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(PROMPT);
			setState(109);
			match(EQUALS);
			setState(110);
			match(STRING_LITERAL);
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
		"\u0004\u0001\u0013q\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"&\b\u0001\n\u0001\f\u0001)\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00022\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\bK\b\b\n\b\f\b"+
		"N\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\tU\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b^\b"+
		"\u000b\n\u000b\f\u000ba\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0003\fg\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0000"+
		"k\u0000\u001e\u0001\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000"+
		"\u00041\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000\u0000\b7\u0001"+
		"\u0000\u0000\u0000\n;\u0001\u0000\u0000\u0000\f?\u0001\u0000\u0000\u0000"+
		"\u000eC\u0001\u0000\u0000\u0000\u0010G\u0001\u0000\u0000\u0000\u0012T"+
		"\u0001\u0000\u0000\u0000\u0014V\u0001\u0000\u0000\u0000\u0016Z\u0001\u0000"+
		"\u0000\u0000\u0018f\u0001\u0000\u0000\u0000\u001ah\u0001\u0000\u0000\u0000"+
		"\u001cl\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0002\u0001\u0000\u001f"+
		" \u0003\u0010\b\u0000 !\u0003\u0016\u000b\u0000!\u0001\u0001\u0000\u0000"+
		"\u0000\"#\u0005\u0006\u0000\u0000#\'\u0005\u0001\u0000\u0000$&\u0003\u0004"+
		"\u0002\u0000%$\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001"+
		"\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(*\u0001\u0000\u0000\u0000"+
		")\'\u0001\u0000\u0000\u0000*+\u0005\u0002\u0000\u0000+\u0003\u0001\u0000"+
		"\u0000\u0000,2\u0003\u0006\u0003\u0000-2\u0003\b\u0004\u0000.2\u0003\n"+
		"\u0005\u0000/2\u0003\f\u0006\u000002\u0003\u000e\u0007\u00001,\u0001\u0000"+
		"\u0000\u00001-\u0001\u0000\u0000\u00001.\u0001\u0000\u0000\u00001/\u0001"+
		"\u0000\u0000\u000010\u0001\u0000\u0000\u00002\u0005\u0001\u0000\u0000"+
		"\u000034\u0005\t\u0000\u000045\u0005\u0003\u0000\u000056\u0005\u0011\u0000"+
		"\u00006\u0007\u0001\u0000\u0000\u000078\u0005\n\u0000\u000089\u0005\u0003"+
		"\u0000\u00009:\u0005\u0011\u0000\u0000:\t\u0001\u0000\u0000\u0000;<\u0005"+
		"\u000b\u0000\u0000<=\u0005\u0003\u0000\u0000=>\u0005\u0011\u0000\u0000"+
		">\u000b\u0001\u0000\u0000\u0000?@\u0005\f\u0000\u0000@A\u0005\u0003\u0000"+
		"\u0000AB\u0005\u0011\u0000\u0000B\r\u0001\u0000\u0000\u0000CD\u0005\r"+
		"\u0000\u0000DE\u0005\u0003\u0000\u0000EF\u0005\u0011\u0000\u0000F\u000f"+
		"\u0001\u0000\u0000\u0000GH\u0005\u0007\u0000\u0000HL\u0005\u0001\u0000"+
		"\u0000IK\u0003\u0012\t\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MO\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0005\u0002\u0000\u0000P\u0011"+
		"\u0001\u0000\u0000\u0000QU\u0003\b\u0004\u0000RU\u0003\u0014\n\u0000S"+
		"U\u0003\u000e\u0007\u0000TQ\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TS\u0001\u0000\u0000\u0000U\u0013\u0001\u0000\u0000\u0000VW\u0005"+
		"\u000e\u0000\u0000WX\u0005\u0003\u0000\u0000XY\u0005\u0011\u0000\u0000"+
		"Y\u0015\u0001\u0000\u0000\u0000Z[\u0005\b\u0000\u0000[_\u0005\u0001\u0000"+
		"\u0000\\^\u0003\u0018\f\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000"+
		"\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u0005\u0002\u0000\u0000"+
		"c\u0017\u0001\u0000\u0000\u0000dg\u0003\u001a\r\u0000eg\u0003\u001c\u000e"+
		"\u0000fd\u0001\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000g\u0019\u0001"+
		"\u0000\u0000\u0000hi\u0005\u000f\u0000\u0000ij\u0005\u0003\u0000\u0000"+
		"jk\u0005\u0012\u0000\u0000k\u001b\u0001\u0000\u0000\u0000lm\u0005\u0010"+
		"\u0000\u0000mn\u0005\u0003\u0000\u0000no\u0005\u0011\u0000\u0000o\u001d"+
		"\u0001\u0000\u0000\u0000\u0006\'1LT_f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}