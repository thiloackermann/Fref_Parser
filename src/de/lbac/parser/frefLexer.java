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
		EXPRBRACKOPEN=21, EXPRBRACKCLOSE=22, BRACKOPEN=23, BRACKCLOSE=24, EQ=25, 
		EQUALS=26, PARAKOMMA=27, LT=28, GT=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'!'", "'function'", "'if'", "'fi'", "'then:'", "'else:'", "'do'", "'od'", 
		"'while'", "'#'", "'Number'", "VARIABLE", "FUNCTNAME", "NUMBER", "WHITE", 
		"STRING", "'+'", "'-'", "'*'", "'/'", "'<<'", "'>>'", "'('", "')'", "'=='", 
		"'='", "','", "'<'", "'>'"
	};
	public static final String[] ruleNames = {
		"LINEBREAK", "FUNCTION", "IFLEXER", "IFCLOSE", "IFTHEN", "ELSELEXER", 
		"DOLEXER", "DOCLOSE", "WHILELEXER", "FUNCDEF", "VARIABLETYPE", "VARIABLE", 
		"FUNCTNAME", "NUMBER", "WHITE", "STRING", "OA", "OS", "OM", "OD", "EXPRBRACKOPEN", 
		"EXPRBRACKCLOSE", "BRACKOPEN", "BRACKCLOSE", "EQ", "EQUALS", "PARAKOMMA", 
		"LT", "GT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00cf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\7\rr\n\r\f\r"+
		"\16\ru\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0084"+
		"\n\r\3\16\3\16\7\16\u0088\n\16\f\16\16\16\u008b\13\16\3\17\5\17\u008e"+
		"\n\17\3\17\6\17\u0091\n\17\r\17\16\17\u0092\3\17\7\17\u0096\n\17\f\17"+
		"\16\17\u0099\13\17\3\17\3\17\6\17\u009d\n\17\r\17\16\17\u009e\5\17\u00a1"+
		"\n\17\3\20\6\20\u00a4\n\20\r\20\16\20\u00a5\3\20\3\20\3\21\3\21\7\21\u00ac"+
		"\n\21\f\21\16\21\u00af\13\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\b\3\2c|\5\2\62"+
		";C\\c|\3\2C\\\3\2\62;\5\2\13\f\17\17\"\"\7\2,,/;C\\aac|\u00da\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3"+
		"=\3\2\2\2\5?\3\2\2\2\7H\3\2\2\2\tK\3\2\2\2\13N\3\2\2\2\rT\3\2\2\2\17Z"+
		"\3\2\2\2\21]\3\2\2\2\23`\3\2\2\2\25f\3\2\2\2\27h\3\2\2\2\31\u0083\3\2"+
		"\2\2\33\u0085\3\2\2\2\35\u00a0\3\2\2\2\37\u00a3\3\2\2\2!\u00a9\3\2\2\2"+
		"#\u00b2\3\2\2\2%\u00b4\3\2\2\2\'\u00b6\3\2\2\2)\u00b8\3\2\2\2+\u00ba\3"+
		"\2\2\2-\u00bd\3\2\2\2/\u00c0\3\2\2\2\61\u00c2\3\2\2\2\63\u00c4\3\2\2\2"+
		"\65\u00c7\3\2\2\2\67\u00c9\3\2\2\29\u00cb\3\2\2\2;\u00cd\3\2\2\2=>\7#"+
		"\2\2>\4\3\2\2\2?@\7h\2\2@A\7w\2\2AB\7p\2\2BC\7e\2\2CD\7v\2\2DE\7k\2\2"+
		"EF\7q\2\2FG\7p\2\2G\6\3\2\2\2HI\7k\2\2IJ\7h\2\2J\b\3\2\2\2KL\7h\2\2LM"+
		"\7k\2\2M\n\3\2\2\2NO\7v\2\2OP\7j\2\2PQ\7g\2\2QR\7p\2\2RS\7<\2\2S\f\3\2"+
		"\2\2TU\7g\2\2UV\7n\2\2VW\7u\2\2WX\7g\2\2XY\7<\2\2Y\16\3\2\2\2Z[\7f\2\2"+
		"[\\\7q\2\2\\\20\3\2\2\2]^\7q\2\2^_\7f\2\2_\22\3\2\2\2`a\7y\2\2ab\7j\2"+
		"\2bc\7k\2\2cd\7n\2\2de\7g\2\2e\24\3\2\2\2fg\7%\2\2g\26\3\2\2\2hi\7P\2"+
		"\2ij\7w\2\2jk\7o\2\2kl\7d\2\2lm\7g\2\2mn\7t\2\2n\30\3\2\2\2os\t\2\2\2"+
		"pr\t\3\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\u0084\3\2\2\2us\3"+
		"\2\2\2vw\7C\2\2wx\7p\2\2x\u0084\7u\2\2yz\7V\2\2z{\7j\2\2{|\7k\2\2|\u0084"+
		"\7u\2\2}~\7T\2\2~\177\7g\2\2\177\u0080\7v\2\2\u0080\u0081\7w\2\2\u0081"+
		"\u0082\7t\2\2\u0082\u0084\7p\2\2\u0083o\3\2\2\2\u0083v\3\2\2\2\u0083y"+
		"\3\2\2\2\u0083}\3\2\2\2\u0084\32\3\2\2\2\u0085\u0089\t\4\2\2\u0086\u0088"+
		"\t\3\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\34\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\7/\2\2"+
		"\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u0091"+
		"\t\5\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u00a1\3\2\2\2\u0094\u0096\t\5\2\2\u0095\u0094\3\2"+
		"\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009c\7\60\2\2\u009b\u009d\t"+
		"\5\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u008d\3\2\2\2\u00a0\u0097\3\2"+
		"\2\2\u00a1\36\3\2\2\2\u00a2\u00a4\t\6\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a8\b\20\2\2\u00a8 \3\2\2\2\u00a9\u00ad\7$\2\2\u00aa\u00ac\t\7\2\2"+
		"\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7$\2\2\u00b1"+
		"\"\3\2\2\2\u00b2\u00b3\7-\2\2\u00b3$\3\2\2\2\u00b4\u00b5\7/\2\2\u00b5"+
		"&\3\2\2\2\u00b6\u00b7\7,\2\2\u00b7(\3\2\2\2\u00b8\u00b9\7\61\2\2\u00b9"+
		"*\3\2\2\2\u00ba\u00bb\7>\2\2\u00bb\u00bc\7>\2\2\u00bc,\3\2\2\2\u00bd\u00be"+
		"\7@\2\2\u00be\u00bf\7@\2\2\u00bf.\3\2\2\2\u00c0\u00c1\7*\2\2\u00c1\60"+
		"\3\2\2\2\u00c2\u00c3\7+\2\2\u00c3\62\3\2\2\2\u00c4\u00c5\7?\2\2\u00c5"+
		"\u00c6\7?\2\2\u00c6\64\3\2\2\2\u00c7\u00c8\7?\2\2\u00c8\66\3\2\2\2\u00c9"+
		"\u00ca\7.\2\2\u00ca8\3\2\2\2\u00cb\u00cc\7>\2\2\u00cc:\3\2\2\2\u00cd\u00ce"+
		"\7@\2\2\u00ce<\3\2\2\2\20\2qs\u0083\u0087\u0089\u008d\u0092\u0097\u009e"+
		"\u00a0\u00a5\u00ab\u00ad\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}