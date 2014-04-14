// Generated from fref.g4 by ANTLR 4.2
package de.lbac.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class frefLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LINEBREAK=1, FUNCTION=2, IFLEXER=3, IFCLOSE=4, IFTHEN=5, ELSELEXER=6, 
		DOLEXER=7, DOCLOSE=8, WHILELEXER=9, FUNCDEF=10, VARIABLETYPE=11, VARIABLE=12, 
		FUNCTNAME=13, NUMBER=14, WHITE=15, STRING=16, OA=17, OS=18, OM=19, OD=20, 
		OK=21, EXPRBRACKOPEN=22, EXPRBRACKCLOSE=23, BRACKOPEN=24, BRACKCLOSE=25, 
		EQ=26, EQUALS=27, PARAKOMMA=28, LT=29, GT=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'!'", "'function'", "'if'", "'fi'", "'then:'", "'else:'", "'do'", "'od'", 
		"'while'", "'#'", "VARIABLETYPE", "VARIABLE", "FUNCTNAME", "NUMBER", "WHITE", 
		"STRING", "'+'", "'-'", "'*'", "'/'", "'~'", "'<<'", "'>>'", "'('", "')'", 
		"'=='", "'='", "','", "'<'", "'>'"
	};
	public static final String[] ruleNames = {
		"LINEBREAK", "FUNCTION", "IFLEXER", "IFCLOSE", "IFTHEN", "ELSELEXER", 
		"DOLEXER", "DOCLOSE", "WHILELEXER", "FUNCDEF", "VARIABLETYPE", "VARIABLE", 
		"FUNCTNAME", "NUMBER", "WHITE", "STRING", "OA", "OS", "OM", "OD", "OK", 
		"EXPRBRACKOPEN", "EXPRBRACKCLOSE", "BRACKOPEN", "BRACKCLOSE", "EQ", "EQUALS", 
		"PARAKOMMA", "LT", "GT"
	};


	public frefLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "fref.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u00da\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\fw\n\f\3\r\3\r\7\r{\n\r\f\r\16\r~\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008d\n\r\3\16\3\16\7\16\u0091\n\16\f\16"+
		"\16\16\u0094\13\16\3\17\5\17\u0097\n\17\3\17\6\17\u009a\n\17\r\17\16\17"+
		"\u009b\3\17\7\17\u009f\n\17\f\17\16\17\u00a2\13\17\3\17\3\17\6\17\u00a6"+
		"\n\17\r\17\16\17\u00a7\5\17\u00aa\n\17\3\20\6\20\u00ad\n\20\r\20\16\20"+
		"\u00ae\3\20\3\20\3\21\3\21\7\21\u00b5\n\21\f\21\16\21\u00b8\13\21\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= \3\2\b\3\2c|\5\2\62;C\\c|\3\2C\\\3\2\62;\5"+
		"\2\13\f\17\17\"\"\7\2,,/;C\\aac|\u00e6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3"+
		"\2\2\2\7J\3\2\2\2\tM\3\2\2\2\13P\3\2\2\2\rV\3\2\2\2\17\\\3\2\2\2\21_\3"+
		"\2\2\2\23b\3\2\2\2\25h\3\2\2\2\27v\3\2\2\2\31\u008c\3\2\2\2\33\u008e\3"+
		"\2\2\2\35\u00a9\3\2\2\2\37\u00ac\3\2\2\2!\u00b2\3\2\2\2#\u00bb\3\2\2\2"+
		"%\u00bd\3\2\2\2\'\u00bf\3\2\2\2)\u00c1\3\2\2\2+\u00c3\3\2\2\2-\u00c5\3"+
		"\2\2\2/\u00c8\3\2\2\2\61\u00cb\3\2\2\2\63\u00cd\3\2\2\2\65\u00cf\3\2\2"+
		"\2\67\u00d2\3\2\2\29\u00d4\3\2\2\2;\u00d6\3\2\2\2=\u00d8\3\2\2\2?@\7#"+
		"\2\2@\4\3\2\2\2AB\7h\2\2BC\7w\2\2CD\7p\2\2DE\7e\2\2EF\7v\2\2FG\7k\2\2"+
		"GH\7q\2\2HI\7p\2\2I\6\3\2\2\2JK\7k\2\2KL\7h\2\2L\b\3\2\2\2MN\7h\2\2NO"+
		"\7k\2\2O\n\3\2\2\2PQ\7v\2\2QR\7j\2\2RS\7g\2\2ST\7p\2\2TU\7<\2\2U\f\3\2"+
		"\2\2VW\7g\2\2WX\7n\2\2XY\7u\2\2YZ\7g\2\2Z[\7<\2\2[\16\3\2\2\2\\]\7f\2"+
		"\2]^\7q\2\2^\20\3\2\2\2_`\7q\2\2`a\7f\2\2a\22\3\2\2\2bc\7y\2\2cd\7j\2"+
		"\2de\7k\2\2ef\7n\2\2fg\7g\2\2g\24\3\2\2\2hi\7%\2\2i\26\3\2\2\2jk\7P\2"+
		"\2kl\7w\2\2lm\7o\2\2mn\7d\2\2no\7g\2\2ow\7t\2\2pq\7U\2\2qr\7v\2\2rs\7"+
		"t\2\2st\7k\2\2tu\7p\2\2uw\7i\2\2vj\3\2\2\2vp\3\2\2\2w\30\3\2\2\2x|\t\2"+
		"\2\2y{\t\3\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u008d\3\2\2\2"+
		"~|\3\2\2\2\177\u0080\7C\2\2\u0080\u0081\7p\2\2\u0081\u008d\7u\2\2\u0082"+
		"\u0083\7V\2\2\u0083\u0084\7j\2\2\u0084\u0085\7k\2\2\u0085\u008d\7u\2\2"+
		"\u0086\u0087\7T\2\2\u0087\u0088\7g\2\2\u0088\u0089\7v\2\2\u0089\u008a"+
		"\7w\2\2\u008a\u008b\7t\2\2\u008b\u008d\7p\2\2\u008cx\3\2\2\2\u008c\177"+
		"\3\2\2\2\u008c\u0082\3\2\2\2\u008c\u0086\3\2\2\2\u008d\32\3\2\2\2\u008e"+
		"\u0092\t\4\2\2\u008f\u0091\t\3\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\34\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0095\u0097\7/\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\3\2\2\2\u0098\u009a\t\5\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00aa\3\2\2\2\u009d"+
		"\u009f\t\5\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"\u00a5\7\60\2\2\u00a4\u00a6\t\5\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3"+
		"\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u0096\3\2\2\2\u00a9\u00a0\3\2\2\2\u00aa\36\3\2\2\2\u00ab\u00ad\t\6\2"+
		"\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\20\2\2\u00b1 \3\2\2\2\u00b2"+
		"\u00b6\7$\2\2\u00b3\u00b5\t\7\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00ba\7$\2\2\u00ba\"\3\2\2\2\u00bb\u00bc\7-\2\2\u00bc"+
		"$\3\2\2\2\u00bd\u00be\7/\2\2\u00be&\3\2\2\2\u00bf\u00c0\7,\2\2\u00c0("+
		"\3\2\2\2\u00c1\u00c2\7\61\2\2\u00c2*\3\2\2\2\u00c3\u00c4\7\u0080\2\2\u00c4"+
		",\3\2\2\2\u00c5\u00c6\7>\2\2\u00c6\u00c7\7>\2\2\u00c7.\3\2\2\2\u00c8\u00c9"+
		"\7@\2\2\u00c9\u00ca\7@\2\2\u00ca\60\3\2\2\2\u00cb\u00cc\7*\2\2\u00cc\62"+
		"\3\2\2\2\u00cd\u00ce\7+\2\2\u00ce\64\3\2\2\2\u00cf\u00d0\7?\2\2\u00d0"+
		"\u00d1\7?\2\2\u00d1\66\3\2\2\2\u00d2\u00d3\7?\2\2\u00d38\3\2\2\2\u00d4"+
		"\u00d5\7.\2\2\u00d5:\3\2\2\2\u00d6\u00d7\7>\2\2\u00d7<\3\2\2\2\u00d8\u00d9"+
		"\7@\2\2\u00d9>\3\2\2\2\21\2vz|\u008c\u0090\u0092\u0096\u009b\u00a0\u00a7"+
		"\u00a9\u00ae\u00b4\u00b6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}