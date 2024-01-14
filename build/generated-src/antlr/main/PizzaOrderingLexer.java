// Generated from PizzaOrdering.g4 by ANTLR 4.9.3
package dethieme.MarkupParser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PizzaOrderingLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, EXTRA_CHEESE=7, MUSHROOMS=8, 
		OLIVES=9, SMALL=10, MEDIUM=11, LARGE=12, MARGHERITA=13, PEPERONI=14, TUNA=15, 
		CHARACTER=16, WHITESPACE=17, STRING=18, SEMICOLON=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "EXTRA_CHEESE", "MUSHROOMS", 
			"OLIVES", "SMALL", "MEDIUM", "LARGE", "MARGHERITA", "PEPERONI", "TUNA", 
			"CHARACTER", "WHITESPACE", "STRING", "SEMICOLON"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PLACE_ORDER_FOR'", "'('", "')'", "'ADD_PIZZA'", "','", "'TOPPINGS'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "EXTRA_CHEESE", "MUSHROOMS", 
			"OLIVES", "SMALL", "MEDIUM", "LARGE", "MARGHERITA", "PEPERONI", "TUNA", 
			"CHARACTER", "WHITESPACE", "STRING", "SEMICOLON"
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


	public PizzaOrderingLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PizzaOrdering.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u013b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bw\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0094\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a8\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u00b9\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u00cd\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u00de\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00fe\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0118\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0126\n\20\3\21\3\21"+
		"\3\22\6\22\u012b\n\22\r\22\16\22\u012c\3\22\3\22\3\23\3\23\3\23\6\23\u0134"+
		"\n\23\r\23\16\23\u0135\3\23\3\23\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		"\3\2\4\r\2//C\\c|\u00a6\u00a6\u00ab\u00ab\u00b8\u00b8\u00be\u00be\u00c5"+
		"\u00c5\u0155\u0155\u2015\u2015\u2020\u2020\5\2\13\f\17\17\"\"\2\u014f"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2"+
		"\2\13G\3\2\2\2\rI\3\2\2\2\17v\3\2\2\2\21\u0093\3\2\2\2\23\u00a7\3\2\2"+
		"\2\25\u00b8\3\2\2\2\27\u00cc\3\2\2\2\31\u00dd\3\2\2\2\33\u00fd\3\2\2\2"+
		"\35\u0117\3\2\2\2\37\u0125\3\2\2\2!\u0127\3\2\2\2#\u012a\3\2\2\2%\u0130"+
		"\3\2\2\2\'\u0139\3\2\2\2)*\7R\2\2*+\7N\2\2+,\7C\2\2,-\7E\2\2-.\7G\2\2"+
		"./\7a\2\2/\60\7Q\2\2\60\61\7T\2\2\61\62\7F\2\2\62\63\7G\2\2\63\64\7T\2"+
		"\2\64\65\7a\2\2\65\66\7H\2\2\66\67\7Q\2\2\678\7T\2\28\4\3\2\2\29:\7*\2"+
		"\2:\6\3\2\2\2;<\7+\2\2<\b\3\2\2\2=>\7C\2\2>?\7F\2\2?@\7F\2\2@A\7a\2\2"+
		"AB\7R\2\2BC\7K\2\2CD\7\\\2\2DE\7\\\2\2EF\7C\2\2F\n\3\2\2\2GH\7.\2\2H\f"+
		"\3\2\2\2IJ\7V\2\2JK\7Q\2\2KL\7R\2\2LM\7R\2\2MN\7K\2\2NO\7P\2\2OP\7I\2"+
		"\2PQ\7U\2\2Q\16\3\2\2\2RS\7g\2\2ST\7z\2\2TU\7v\2\2UV\7t\2\2VW\7c\2\2W"+
		"X\7a\2\2XY\7e\2\2YZ\7j\2\2Z[\7g\2\2[\\\7g\2\2\\]\7u\2\2]w\7g\2\2^_\7G"+
		"\2\2_`\7z\2\2`a\7v\2\2ab\7t\2\2bc\7c\2\2cd\7a\2\2de\7E\2\2ef\7j\2\2fg"+
		"\7g\2\2gh\7g\2\2hi\7u\2\2iw\7g\2\2jk\7G\2\2kl\7Z\2\2lm\7V\2\2mn\7T\2\2"+
		"no\7C\2\2op\7a\2\2pq\7E\2\2qr\7J\2\2rs\7G\2\2st\7G\2\2tu\7U\2\2uw\7G\2"+
		"\2vR\3\2\2\2v^\3\2\2\2vj\3\2\2\2w\20\3\2\2\2xy\7o\2\2yz\7w\2\2z{\7u\2"+
		"\2{|\7j\2\2|}\7t\2\2}~\7q\2\2~\177\7q\2\2\177\u0080\7o\2\2\u0080\u0094"+
		"\7u\2\2\u0081\u0082\7O\2\2\u0082\u0083\7w\2\2\u0083\u0084\7u\2\2\u0084"+
		"\u0085\7j\2\2\u0085\u0086\7t\2\2\u0086\u0087\7q\2\2\u0087\u0088\7q\2\2"+
		"\u0088\u0089\7o\2\2\u0089\u0094\7u\2\2\u008a\u008b\7O\2\2\u008b\u008c"+
		"\7W\2\2\u008c\u008d\7U\2\2\u008d\u008e\7J\2\2\u008e\u008f\7T\2\2\u008f"+
		"\u0090\7Q\2\2\u0090\u0091\7Q\2\2\u0091\u0092\7O\2\2\u0092\u0094\7U\2\2"+
		"\u0093x\3\2\2\2\u0093\u0081\3\2\2\2\u0093\u008a\3\2\2\2\u0094\22\3\2\2"+
		"\2\u0095\u0096\7q\2\2\u0096\u0097\7n\2\2\u0097\u0098\7k\2\2\u0098\u0099"+
		"\7x\2\2\u0099\u009a\7g\2\2\u009a\u00a8\7u\2\2\u009b\u009c\7Q\2\2\u009c"+
		"\u009d\7n\2\2\u009d\u009e\7k\2\2\u009e\u009f\7x\2\2\u009f\u00a0\7g\2\2"+
		"\u00a0\u00a8\7u\2\2\u00a1\u00a2\7Q\2\2\u00a2\u00a3\7N\2\2\u00a3\u00a4"+
		"\7K\2\2\u00a4\u00a5\7X\2\2\u00a5\u00a6\7G\2\2\u00a6\u00a8\7U\2\2\u00a7"+
		"\u0095\3\2\2\2\u00a7\u009b\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a8\24\3\2\2"+
		"\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7o\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad"+
		"\7n\2\2\u00ad\u00b9\7n\2\2\u00ae\u00af\7U\2\2\u00af\u00b0\7o\2\2\u00b0"+
		"\u00b1\7c\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b9\7n\2\2\u00b3\u00b4\7U\2\2"+
		"\u00b4\u00b5\7O\2\2\u00b5\u00b6\7C\2\2\u00b6\u00b7\7N\2\2\u00b7\u00b9"+
		"\7N\2\2\u00b8\u00a9\3\2\2\2\u00b8\u00ae\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b9"+
		"\26\3\2\2\2\u00ba\u00bb\7o\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7f\2\2\u00bd"+
		"\u00be\7k\2\2\u00be\u00bf\7w\2\2\u00bf\u00cd\7o\2\2\u00c0\u00c1\7O\2\2"+
		"\u00c1\u00c2\7g\2\2\u00c2\u00c3\7f\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5"+
		"\7w\2\2\u00c5\u00cd\7o\2\2\u00c6\u00c7\7O\2\2\u00c7\u00c8\7G\2\2\u00c8"+
		"\u00c9\7F\2\2\u00c9\u00ca\7K\2\2\u00ca\u00cb\7W\2\2\u00cb\u00cd\7O\2\2"+
		"\u00cc\u00ba\3\2\2\2\u00cc\u00c0\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cd\30"+
		"\3\2\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7t\2\2\u00d1"+
		"\u00d2\7i\2\2\u00d2\u00de\7g\2\2\u00d3\u00d4\7N\2\2\u00d4\u00d5\7c\2\2"+
		"\u00d5\u00d6\7t\2\2\u00d6\u00d7\7i\2\2\u00d7\u00de\7g\2\2\u00d8\u00d9"+
		"\7N\2\2\u00d9\u00da\7C\2\2\u00da\u00db\7T\2\2\u00db\u00dc\7I\2\2\u00dc"+
		"\u00de\7G\2\2\u00dd\u00ce\3\2\2\2\u00dd\u00d3\3\2\2\2\u00dd\u00d8\3\2"+
		"\2\2\u00de\32\3\2\2\2\u00df\u00e0\7o\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2"+
		"\7t\2\2\u00e2\u00e3\7i\2\2\u00e3\u00e4\7j\2\2\u00e4\u00e5\7g\2\2\u00e5"+
		"\u00e6\7t\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7v\2\2\u00e8\u00fe\7c\2\2"+
		"\u00e9\u00ea\7O\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed"+
		"\7i\2\2\u00ed\u00ee\7j\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7t\2\2\u00f0"+
		"\u00f1\7k\2\2\u00f1\u00f2\7v\2\2\u00f2\u00fe\7c\2\2\u00f3\u00f4\7O\2\2"+
		"\u00f4\u00f5\7C\2\2\u00f5\u00f6\7T\2\2\u00f6\u00f7\7I\2\2\u00f7\u00f8"+
		"\7J\2\2\u00f8\u00f9\7G\2\2\u00f9\u00fa\7T\2\2\u00fa\u00fb\7K\2\2\u00fb"+
		"\u00fc\7V\2\2\u00fc\u00fe\7C\2\2\u00fd\u00df\3\2\2\2\u00fd\u00e9\3\2\2"+
		"\2\u00fd\u00f3\3\2\2\2\u00fe\34\3\2\2\2\u00ff\u0100\7r\2\2\u0100\u0101"+
		"\7g\2\2\u0101\u0102\7r\2\2\u0102\u0103\7g\2\2\u0103\u0104\7t\2\2\u0104"+
		"\u0105\7q\2\2\u0105\u0106\7p\2\2\u0106\u0118\7k\2\2\u0107\u0108\7R\2\2"+
		"\u0108\u0109\7g\2\2\u0109\u010a\7r\2\2\u010a\u010b\7g\2\2\u010b\u010c"+
		"\7t\2\2\u010c\u010d\7q\2\2\u010d\u010e\7p\2\2\u010e\u0118\7k\2\2\u010f"+
		"\u0110\7R\2\2\u0110\u0111\7G\2\2\u0111\u0112\7R\2\2\u0112\u0113\7G\2\2"+
		"\u0113\u0114\7T\2\2\u0114\u0115\7Q\2\2\u0115\u0116\7P\2\2\u0116\u0118"+
		"\7K\2\2\u0117\u00ff\3\2\2\2\u0117\u0107\3\2\2\2\u0117\u010f\3\2\2\2\u0118"+
		"\36\3\2\2\2\u0119\u011a\7v\2\2\u011a\u011b\7w\2\2\u011b\u011c\7p\2\2\u011c"+
		"\u0126\7c\2\2\u011d\u011e\7V\2\2\u011e\u011f\7w\2\2\u011f\u0120\7p\2\2"+
		"\u0120\u0126\7c\2\2\u0121\u0122\7V\2\2\u0122\u0123\7W\2\2\u0123\u0124"+
		"\7P\2\2\u0124\u0126\7C\2\2\u0125\u0119\3\2\2\2\u0125\u011d\3\2\2\2\u0125"+
		"\u0121\3\2\2\2\u0126 \3\2\2\2\u0127\u0128\t\2\2\2\u0128\"\3\2\2\2\u0129"+
		"\u012b\t\3\2\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\b\22\2\2\u012f"+
		"$\3\2\2\2\u0130\u0133\7)\2\2\u0131\u0134\5!\21\2\u0132\u0134\7\"\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7)\2\2\u0138"+
		"&\3\2\2\2\u0139\u013a\7=\2\2\u013a(\3\2\2\2\17\2v\u0093\u00a7\u00b8\u00cc"+
		"\u00dd\u00fd\u0117\u0125\u012c\u0133\u0135\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}