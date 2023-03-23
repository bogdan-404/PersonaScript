// Generated from PersonaScript.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PersonaScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_BRACE=1, CLOSE_BRACE=2, EQUALS=3, COMMA=4, QUOTE=5, DESCRIPTION=6, 
		SETTING=7, RESPONSE=8, NAME=9, TYPE=10, MBTI=11, ROLE=12, BACKGROUND=13, 
		CATEGORY=14, LENGTH=15, PROMPT=16, STRING_LITERAL=17, NUMBER_LITERAL=18, 
		WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OPEN_BRACE", "CLOSE_BRACE", "EQUALS", "COMMA", "QUOTE", "DESCRIPTION", 
			"SETTING", "RESPONSE", "NAME", "TYPE", "MBTI", "ROLE", "BACKGROUND", 
			"CATEGORY", "LENGTH", "PROMPT", "STRING_LITERAL", "NUMBER_LITERAL", "WS"
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


	public PersonaScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PersonaScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0013\u0099\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u0087\b\u0010\n\u0010\f\u0010\u008a\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011\u008f\b\u0011\u000b\u0011"+
		"\f\u0011\u0090\u0001\u0012\u0004\u0012\u0094\b\u0012\u000b\u0012\f\u0012"+
		"\u0095\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\u0001\u0000\u0003\u0001\u0000\"\"\u0001\u000009\u0003\u0000"+
		"\t\n\r\r  \u009b\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003)\u0001"+
		"\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u0007-\u0001\u0000\u0000"+
		"\u0000\t/\u0001\u0000\u0000\u0000\u000b1\u0001\u0000\u0000\u0000\r=\u0001"+
		"\u0000\u0000\u0000\u000fE\u0001\u0000\u0000\u0000\u0011N\u0001\u0000\u0000"+
		"\u0000\u0013S\u0001\u0000\u0000\u0000\u0015X\u0001\u0000\u0000\u0000\u0017"+
		"]\u0001\u0000\u0000\u0000\u0019b\u0001\u0000\u0000\u0000\u001bm\u0001"+
		"\u0000\u0000\u0000\u001dv\u0001\u0000\u0000\u0000\u001f}\u0001\u0000\u0000"+
		"\u0000!\u0084\u0001\u0000\u0000\u0000#\u008e\u0001\u0000\u0000\u0000%"+
		"\u0093\u0001\u0000\u0000\u0000\'(\u0005{\u0000\u0000(\u0002\u0001\u0000"+
		"\u0000\u0000)*\u0005}\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0005"+
		"=\u0000\u0000,\u0006\u0001\u0000\u0000\u0000-.\u0005,\u0000\u0000.\b\u0001"+
		"\u0000\u0000\u0000/0\u0005\"\u0000\u00000\n\u0001\u0000\u0000\u000012"+
		"\u0005D\u0000\u000023\u0005e\u0000\u000034\u0005s\u0000\u000045\u0005"+
		"c\u0000\u000056\u0005r\u0000\u000067\u0005i\u0000\u000078\u0005p\u0000"+
		"\u000089\u0005t\u0000\u00009:\u0005i\u0000\u0000:;\u0005o\u0000\u0000"+
		";<\u0005n\u0000\u0000<\f\u0001\u0000\u0000\u0000=>\u0005S\u0000\u0000"+
		">?\u0005e\u0000\u0000?@\u0005t\u0000\u0000@A\u0005t\u0000\u0000AB\u0005"+
		"i\u0000\u0000BC\u0005n\u0000\u0000CD\u0005g\u0000\u0000D\u000e\u0001\u0000"+
		"\u0000\u0000EF\u0005R\u0000\u0000FG\u0005e\u0000\u0000GH\u0005s\u0000"+
		"\u0000HI\u0005p\u0000\u0000IJ\u0005o\u0000\u0000JK\u0005n\u0000\u0000"+
		"KL\u0005s\u0000\u0000LM\u0005e\u0000\u0000M\u0010\u0001\u0000\u0000\u0000"+
		"NO\u0005n\u0000\u0000OP\u0005a\u0000\u0000PQ\u0005m\u0000\u0000QR\u0005"+
		"e\u0000\u0000R\u0012\u0001\u0000\u0000\u0000ST\u0005t\u0000\u0000TU\u0005"+
		"y\u0000\u0000UV\u0005p\u0000\u0000VW\u0005e\u0000\u0000W\u0014\u0001\u0000"+
		"\u0000\u0000XY\u0005m\u0000\u0000YZ\u0005b\u0000\u0000Z[\u0005t\u0000"+
		"\u0000[\\\u0005i\u0000\u0000\\\u0016\u0001\u0000\u0000\u0000]^\u0005r"+
		"\u0000\u0000^_\u0005o\u0000\u0000_`\u0005l\u0000\u0000`a\u0005e\u0000"+
		"\u0000a\u0018\u0001\u0000\u0000\u0000bc\u0005b\u0000\u0000cd\u0005a\u0000"+
		"\u0000de\u0005c\u0000\u0000ef\u0005k\u0000\u0000fg\u0005g\u0000\u0000"+
		"gh\u0005r\u0000\u0000hi\u0005o\u0000\u0000ij\u0005u\u0000\u0000jk\u0005"+
		"n\u0000\u0000kl\u0005d\u0000\u0000l\u001a\u0001\u0000\u0000\u0000mn\u0005"+
		"c\u0000\u0000no\u0005a\u0000\u0000op\u0005t\u0000\u0000pq\u0005e\u0000"+
		"\u0000qr\u0005g\u0000\u0000rs\u0005o\u0000\u0000st\u0005r\u0000\u0000"+
		"tu\u0005y\u0000\u0000u\u001c\u0001\u0000\u0000\u0000vw\u0005l\u0000\u0000"+
		"wx\u0005e\u0000\u0000xy\u0005n\u0000\u0000yz\u0005g\u0000\u0000z{\u0005"+
		"t\u0000\u0000{|\u0005h\u0000\u0000|\u001e\u0001\u0000\u0000\u0000}~\u0005"+
		"p\u0000\u0000~\u007f\u0005r\u0000\u0000\u007f\u0080\u0005o\u0000\u0000"+
		"\u0080\u0081\u0005m\u0000\u0000\u0081\u0082\u0005p\u0000\u0000\u0082\u0083"+
		"\u0005t\u0000\u0000\u0083 \u0001\u0000\u0000\u0000\u0084\u0088\u0003\t"+
		"\u0004\u0000\u0085\u0087\b\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000"+
		"\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008c\u0003\t\u0004\u0000"+
		"\u008c\"\u0001\u0000\u0000\u0000\u008d\u008f\u0007\u0001\u0000\u0000\u008e"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"$\u0001\u0000\u0000\u0000\u0092\u0094\u0007\u0002\u0000\u0000\u0093\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0006\u0012\u0000\u0000\u0098&\u0001"+
		"\u0000\u0000\u0000\u0004\u0000\u0088\u0090\u0095\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}