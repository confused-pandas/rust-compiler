// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g 2018-04-02 13:26:46

	package eu.telecomnancy.mini_rust;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class mini_rustLexer extends Lexer {
    public static final int LSQBRACKET=25;
    public static final int LT=29;
    public static final int STAR=38;
    public static final int MEMBER=18;
    public static final int IDF=63;
    public static final int WHILE=48;
    public static final int BOOL_TYPE=56;
    public static final int PRINT_MACRO=53;
    public static final int EXCL=39;
    public static final int AND=33;
    public static final int EOF=-1;
    public static final int LPAREN=21;
    public static final int INT32_TYPE=55;
    public static final int TYPE=7;
    public static final int FUNC_CALL=11;
    public static final int IF=49;
    public static final int LBRACKET=23;
    public static final int INDEX=13;
    public static final int RSQBRACKET=26;
    public static final int RPAREN=22;
    public static final int UPPERCASE=66;
    public static final int COMMENTS=68;
    public static final int COMMA=59;
    public static final int OBJ=17;
    public static final int ARGUMENT=9;
    public static final int FICHIER=4;
    public static final int RETURN=51;
    public static final int MOINS_UNITAIRE=16;
    public static final int PLUS=35;
    public static final int LETMUT=19;
    public static final int DIGIT=67;
    public static final int RBRACKET=24;
    public static final int EQ=31;
    public static final int DOT=41;
    public static final int PARAMS=15;
    public static final int NE=32;
    public static final int GE=28;
    public static final int DECL_STRUCT=6;
    public static final int AMPS=42;
    public static final int ARGUMENTS=8;
    public static final int BLOC=10;
    public static final int ELSE=50;
    public static final int MUT=45;
    public static final int STRUCT=47;
    public static final int SEMICOLON=60;
    public static final int FN=46;
    public static final int MINUS=36;
    public static final int DECL_FUNC=5;
    public static final int MUL=20;
    public static final int TRUE=57;
    public static final int CSTE_STR=64;
    public static final int COLON=61;
    public static final int VEC_MACRO=52;
    public static final int WS=69;
    public static final int LOWERCASE=65;
    public static final int VEC_TYPE=54;
    public static final int OR=34;
    public static final int ASSIGN=40;
    public static final int GT=27;
    public static final int LEN=43;
    public static final int ARROW=62;
    public static final int CSTE_ENT=12;
    public static final int DIV=37;
    public static final int FUNCTION_CALL=14;
    public static final int FALSE=58;
    public static final int LE=30;
    public static final int LET=44;

    // delegates
    // delegators

    public mini_rustLexer() {;} 
    public mini_rustLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public mini_rustLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g"; }

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:11:8: ( '(' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:11:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:12:8: ( ')' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:12:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LBRACKET"
    public final void mLBRACKET() throws RecognitionException {
        try {
            int _type = LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:13:10: ( '{' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:13:12: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACKET"

    // $ANTLR start "RBRACKET"
    public final void mRBRACKET() throws RecognitionException {
        try {
            int _type = RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:14:10: ( '}' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:14:12: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACKET"

    // $ANTLR start "LSQBRACKET"
    public final void mLSQBRACKET() throws RecognitionException {
        try {
            int _type = LSQBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:15:12: ( '[' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:15:14: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LSQBRACKET"

    // $ANTLR start "RSQBRACKET"
    public final void mRSQBRACKET() throws RecognitionException {
        try {
            int _type = RSQBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:16:12: ( ']' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:16:14: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RSQBRACKET"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:17:4: ( '>' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:17:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:18:4: ( '>=' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:18:6: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:19:4: ( '<' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:19:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:20:4: ( '<=' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:20:6: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:21:4: ( '==' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:21:6: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NE"
    public final void mNE() throws RecognitionException {
        try {
            int _type = NE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:22:4: ( '!=' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:22:6: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NE"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:23:5: ( '&&' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:23:7: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:24:4: ( '||' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:24:6: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:25:6: ( '+' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:25:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:26:7: ( '-' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:26:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:27:5: ( '/' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:27:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:28:6: ( '*' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:28:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "EXCL"
    public final void mEXCL() throws RecognitionException {
        try {
            int _type = EXCL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:29:6: ( '!' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:29:8: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXCL"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:30:8: ( '=' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:30:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:31:5: ( '.' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:31:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "AMPS"
    public final void mAMPS() throws RecognitionException {
        try {
            int _type = AMPS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:32:6: ( '&' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:32:8: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMPS"

    // $ANTLR start "LEN"
    public final void mLEN() throws RecognitionException {
        try {
            int _type = LEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:33:5: ( 'len' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:33:7: 'len'
            {
            match("len"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEN"

    // $ANTLR start "LET"
    public final void mLET() throws RecognitionException {
        try {
            int _type = LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:34:5: ( 'let' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:34:7: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LET"

    // $ANTLR start "MUT"
    public final void mMUT() throws RecognitionException {
        try {
            int _type = MUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:35:5: ( 'mut' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:35:7: 'mut'
            {
            match("mut"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUT"

    // $ANTLR start "FN"
    public final void mFN() throws RecognitionException {
        try {
            int _type = FN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:36:4: ( 'fn' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:36:6: 'fn'
            {
            match("fn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FN"

    // $ANTLR start "STRUCT"
    public final void mSTRUCT() throws RecognitionException {
        try {
            int _type = STRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:37:8: ( 'struct' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:37:10: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRUCT"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:38:7: ( 'while' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:38:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:39:4: ( 'if' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:39:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:40:6: ( 'else' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:40:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:41:8: ( 'return' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:41:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "VEC_MACRO"
    public final void mVEC_MACRO() throws RecognitionException {
        try {
            int _type = VEC_MACRO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:42:11: ( 'vec' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:42:13: 'vec'
            {
            match("vec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VEC_MACRO"

    // $ANTLR start "PRINT_MACRO"
    public final void mPRINT_MACRO() throws RecognitionException {
        try {
            int _type = PRINT_MACRO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:43:13: ( 'print' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:43:15: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRINT_MACRO"

    // $ANTLR start "VEC_TYPE"
    public final void mVEC_TYPE() throws RecognitionException {
        try {
            int _type = VEC_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:44:10: ( 'Vec' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:44:12: 'Vec'
            {
            match("Vec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VEC_TYPE"

    // $ANTLR start "INT32_TYPE"
    public final void mINT32_TYPE() throws RecognitionException {
        try {
            int _type = INT32_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:45:12: ( 'int32' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:45:14: 'int32'
            {
            match("int32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT32_TYPE"

    // $ANTLR start "BOOL_TYPE"
    public final void mBOOL_TYPE() throws RecognitionException {
        try {
            int _type = BOOL_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:46:11: ( 'bool' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:46:13: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOL_TYPE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:47:6: ( 'true' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:47:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:48:7: ( 'false' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:48:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:49:7: ( ',' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:49:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:50:11: ( ';' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:50:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:51:7: ( ':' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:51:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "ARROW"
    public final void mARROW() throws RecognitionException {
        try {
            int _type = ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:52:7: ( '->' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:52:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARROW"

    // $ANTLR start "IDF"
    public final void mIDF() throws RecognitionException {
        try {
            int _type = IDF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:256:5: ( ( LOWERCASE | UPPERCASE | '_' ) ( LOWERCASE | UPPERCASE | DIGIT | '_' )* )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:256:7: ( LOWERCASE | UPPERCASE | '_' ) ( LOWERCASE | UPPERCASE | DIGIT | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:256:37: ( LOWERCASE | UPPERCASE | DIGIT | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDF"

    // $ANTLR start "CSTE_ENT"
    public final void mCSTE_ENT() throws RecognitionException {
        try {
            int _type = CSTE_ENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:257:10: ( ( DIGIT )+ )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:257:12: ( DIGIT )+
            {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:257:12: ( DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:257:12: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CSTE_ENT"

    // $ANTLR start "CSTE_STR"
    public final void mCSTE_STR() throws RecognitionException {
        try {
            int _type = CSTE_STR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:258:10: ( '\"' ( . )* '\"' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:258:12: '\"' ( . )* '\"'
            {
            match('\"'); 
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:258:16: ( . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\"') ) {
                    alt3=2;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:258:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CSTE_STR"

    // $ANTLR start "COMMENTS"
    public final void mCOMMENTS() throws RecognitionException {
        try {
            int _type = COMMENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:259:10: ( '/*' ( . )* '*/' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:259:12: '/*' ( . )* '*/'
            {
            match("/*"); 

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:259:17: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:259:17: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match("*/"); 

             _channel = HIDDEN ; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENTS"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:260:4: ( ( ' ' | '\\r' | '\\n' | '\\t' ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:260:6: ( ' ' | '\\r' | '\\n' | '\\t' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel = HIDDEN ; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "LOWERCASE"
    public final void mLOWERCASE() throws RecognitionException {
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:262:20: ( 'a' .. 'z' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:262:22: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "LOWERCASE"

    // $ANTLR start "UPPERCASE"
    public final void mUPPERCASE() throws RecognitionException {
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:263:20: ( 'A' .. 'Z' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:263:22: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UPPERCASE"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:264:16: ( '0' .. '9' )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:264:18: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    public void mTokens() throws RecognitionException {
        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:8: ( LPAREN | RPAREN | LBRACKET | RBRACKET | LSQBRACKET | RSQBRACKET | GT | GE | LT | LE | EQ | NE | AND | OR | PLUS | MINUS | DIV | STAR | EXCL | ASSIGN | DOT | AMPS | LEN | LET | MUT | FN | STRUCT | WHILE | IF | ELSE | RETURN | VEC_MACRO | PRINT_MACRO | VEC_TYPE | INT32_TYPE | BOOL_TYPE | TRUE | FALSE | COMMA | SEMICOLON | COLON | ARROW | IDF | CSTE_ENT | CSTE_STR | COMMENTS | WS )
        int alt5=47;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:10: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 2 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:17: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 3 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:24: LBRACKET
                {
                mLBRACKET(); 

                }
                break;
            case 4 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:33: RBRACKET
                {
                mRBRACKET(); 

                }
                break;
            case 5 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:42: LSQBRACKET
                {
                mLSQBRACKET(); 

                }
                break;
            case 6 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:53: RSQBRACKET
                {
                mRSQBRACKET(); 

                }
                break;
            case 7 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:64: GT
                {
                mGT(); 

                }
                break;
            case 8 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:67: GE
                {
                mGE(); 

                }
                break;
            case 9 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:70: LT
                {
                mLT(); 

                }
                break;
            case 10 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:73: LE
                {
                mLE(); 

                }
                break;
            case 11 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:76: EQ
                {
                mEQ(); 

                }
                break;
            case 12 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:79: NE
                {
                mNE(); 

                }
                break;
            case 13 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:82: AND
                {
                mAND(); 

                }
                break;
            case 14 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:86: OR
                {
                mOR(); 

                }
                break;
            case 15 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:89: PLUS
                {
                mPLUS(); 

                }
                break;
            case 16 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:94: MINUS
                {
                mMINUS(); 

                }
                break;
            case 17 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:100: DIV
                {
                mDIV(); 

                }
                break;
            case 18 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:104: STAR
                {
                mSTAR(); 

                }
                break;
            case 19 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:109: EXCL
                {
                mEXCL(); 

                }
                break;
            case 20 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:114: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 21 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:121: DOT
                {
                mDOT(); 

                }
                break;
            case 22 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:125: AMPS
                {
                mAMPS(); 

                }
                break;
            case 23 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:130: LEN
                {
                mLEN(); 

                }
                break;
            case 24 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:134: LET
                {
                mLET(); 

                }
                break;
            case 25 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:138: MUT
                {
                mMUT(); 

                }
                break;
            case 26 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:142: FN
                {
                mFN(); 

                }
                break;
            case 27 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:145: STRUCT
                {
                mSTRUCT(); 

                }
                break;
            case 28 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:152: WHILE
                {
                mWHILE(); 

                }
                break;
            case 29 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:158: IF
                {
                mIF(); 

                }
                break;
            case 30 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:161: ELSE
                {
                mELSE(); 

                }
                break;
            case 31 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:166: RETURN
                {
                mRETURN(); 

                }
                break;
            case 32 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:173: VEC_MACRO
                {
                mVEC_MACRO(); 

                }
                break;
            case 33 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:183: PRINT_MACRO
                {
                mPRINT_MACRO(); 

                }
                break;
            case 34 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:195: VEC_TYPE
                {
                mVEC_TYPE(); 

                }
                break;
            case 35 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:204: INT32_TYPE
                {
                mINT32_TYPE(); 

                }
                break;
            case 36 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:215: BOOL_TYPE
                {
                mBOOL_TYPE(); 

                }
                break;
            case 37 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:225: TRUE
                {
                mTRUE(); 

                }
                break;
            case 38 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:230: FALSE
                {
                mFALSE(); 

                }
                break;
            case 39 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:236: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 40 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:242: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 41 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:252: COLON
                {
                mCOLON(); 

                }
                break;
            case 42 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:258: ARROW
                {
                mARROW(); 

                }
                break;
            case 43 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:264: IDF
                {
                mIDF(); 

                }
                break;
            case 44 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:268: CSTE_ENT
                {
                mCSTE_ENT(); 

                }
                break;
            case 45 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:277: CSTE_STR
                {
                mCSTE_STR(); 

                }
                break;
            case 46 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:286: COMMENTS
                {
                mCOMMENTS(); 

                }
                break;
            case 47 :
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:1:295: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\7\uffff\1\47\1\51\1\53\1\55\1\57\2\uffff\1\61\1\63\2\uffff\15"+
        "\42\25\uffff\2\42\1\106\3\42\1\112\10\42\1\123\1\124\1\125\1\uffff"+
        "\3\42\1\uffff\3\42\1\134\1\42\1\136\2\42\3\uffff\4\42\1\145\1\42"+
        "\1\uffff\1\42\1\uffff\1\150\1\151\1\152\1\42\1\154\1\155\1\uffff"+
        "\1\42\1\157\3\uffff\1\160\2\uffff\1\161\3\uffff";
    static final String DFA5_eofS =
        "\162\uffff";
    static final String DFA5_minS =
        "\1\11\6\uffff\4\75\1\46\2\uffff\1\76\1\52\2\uffff\1\145\1\165\1"+
        "\141\1\164\1\150\1\146\1\154\2\145\1\162\1\145\1\157\1\162\25\uffff"+
        "\1\156\1\164\1\60\1\154\1\162\1\151\1\60\1\164\1\163\1\164\1\143"+
        "\1\151\1\143\1\157\1\165\3\60\1\uffff\1\163\1\165\1\154\1\uffff"+
        "\1\63\1\145\1\165\1\60\1\156\1\60\1\154\1\145\3\uffff\1\145\1\143"+
        "\1\145\1\62\1\60\1\162\1\uffff\1\164\1\uffff\3\60\1\164\2\60\1\uffff"+
        "\1\156\1\60\3\uffff\1\60\2\uffff\1\60\3\uffff";
    static final String DFA5_maxS =
        "\1\175\6\uffff\4\75\1\46\2\uffff\1\76\1\52\2\uffff\1\145\1\165"+
        "\1\156\1\164\1\150\1\156\1\154\2\145\1\162\1\145\1\157\1\162\25"+
        "\uffff\2\164\1\172\1\154\1\162\1\151\1\172\1\164\1\163\1\164\1\143"+
        "\1\151\1\143\1\157\1\165\3\172\1\uffff\1\163\1\165\1\154\1\uffff"+
        "\1\63\1\145\1\165\1\172\1\156\1\172\1\154\1\145\3\uffff\1\145\1"+
        "\143\1\145\1\62\1\172\1\162\1\uffff\1\164\1\uffff\3\172\1\164\2"+
        "\172\1\uffff\1\156\1\172\3\uffff\1\172\2\uffff\1\172\3\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\5\uffff\1\16\1\17\2\uffff\1\22"+
        "\1\25\15\uffff\1\47\1\50\1\51\1\53\1\54\1\55\1\57\1\10\1\7\1\12"+
        "\1\11\1\13\1\24\1\14\1\23\1\15\1\26\1\52\1\20\1\56\1\21\22\uffff"+
        "\1\32\3\uffff\1\35\10\uffff\1\27\1\30\1\31\6\uffff\1\40\1\uffff"+
        "\1\42\6\uffff\1\36\2\uffff\1\44\1\45\1\46\1\uffff\1\34\1\43\1\uffff"+
        "\1\41\1\33\1\37";
    static final String DFA5_specialS =
        "\162\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\45\2\uffff\1\45\22\uffff\1\45\1\12\1\44\3\uffff\1\13\1\uffff"+
            "\1\1\1\2\1\20\1\15\1\37\1\16\1\21\1\17\12\43\1\41\1\40\1\10"+
            "\1\11\1\7\2\uffff\25\42\1\34\4\42\1\5\1\uffff\1\6\1\uffff\1"+
            "\42\1\uffff\1\42\1\35\2\42\1\30\1\24\2\42\1\27\2\42\1\22\1\23"+
            "\2\42\1\33\1\42\1\31\1\25\1\36\1\42\1\32\1\26\3\42\1\3\1\14"+
            "\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\46",
            "\1\50",
            "\1\52",
            "\1\54",
            "\1\56",
            "",
            "",
            "\1\60",
            "\1\62",
            "",
            "",
            "\1\64",
            "\1\65",
            "\1\67\14\uffff\1\66",
            "\1\70",
            "\1\71",
            "\1\72\7\uffff\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\103\5\uffff\1\104",
            "\1\105",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\107",
            "\1\110",
            "\1\111",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\135",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\137",
            "\1\140",
            "",
            "",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\146",
            "",
            "\1\147",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\153",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\156",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( LPAREN | RPAREN | LBRACKET | RBRACKET | LSQBRACKET | RSQBRACKET | GT | GE | LT | LE | EQ | NE | AND | OR | PLUS | MINUS | DIV | STAR | EXCL | ASSIGN | DOT | AMPS | LEN | LET | MUT | FN | STRUCT | WHILE | IF | ELSE | RETURN | VEC_MACRO | PRINT_MACRO | VEC_TYPE | INT32_TYPE | BOOL_TYPE | TRUE | FALSE | COMMA | SEMICOLON | COLON | ARROW | IDF | CSTE_ENT | CSTE_STR | COMMENTS | WS );";
        }
    }
 

}