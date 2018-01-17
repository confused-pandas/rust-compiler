// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g 2018-01-17 15:29:21

  package eu.telecomnancy.mini_rust;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class mini_rustLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int IDENT=4;
    public static final int INTEGER=5;
    public static final int FLOAT=6;
    public static final int WS=7;

    // delegates
    // delegators

    public mini_rustLexer() {;} 
    public mini_rustLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public mini_rustLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:11:6: ( ';' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:11:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:12:6: ( 'while ' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:12:8: 'while '
            {
            match("while "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:13:7: ( '{' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:13:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:14:7: ( '}' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:14:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:15:7: ( '=' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:15:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:16:7: ( 'let' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:16:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:17:7: ( 'mut' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:17:9: 'mut'
            {
            match("mut"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:18:7: ( '(' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:18:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:19:7: ( ')' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:19:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:20:7: ( '-' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:20:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:21:7: ( '!' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:21:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:22:7: ( '*' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:22:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:23:7: ( '&' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:23:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:24:7: ( '/' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:24:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:25:7: ( '+' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:25:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:26:7: ( 'u32' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:26:9: 'u32'
            {
            match("u32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:94:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:95:2: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:95:24: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "IDENT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:99:2: ( ( '-' )? ( '0' .. '9' )+ )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:100:2: ( '-' )? ( '0' .. '9' )+
            {
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:100:2: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:100:3: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:100:9: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:100:10: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:104:2: ( ( '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' ) )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:105:2: ( '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )
            {
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:105:2: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:105:3: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:105:9: ( '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:105:10: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('.'); 
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:105:25: ( '0' .. '9' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:105:26: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:109:2: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' ) )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:110:2: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | IDENT | INTEGER | FLOAT | WS )
        int alt6=20;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:32: T__12
                {
                mT__12(); 

                }
                break;
            case 6 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:38: T__13
                {
                mT__13(); 

                }
                break;
            case 7 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:44: T__14
                {
                mT__14(); 

                }
                break;
            case 8 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:50: T__15
                {
                mT__15(); 

                }
                break;
            case 9 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:56: T__16
                {
                mT__16(); 

                }
                break;
            case 10 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:62: T__17
                {
                mT__17(); 

                }
                break;
            case 11 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:68: T__18
                {
                mT__18(); 

                }
                break;
            case 12 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:74: T__19
                {
                mT__19(); 

                }
                break;
            case 13 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:80: T__20
                {
                mT__20(); 

                }
                break;
            case 14 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:86: T__21
                {
                mT__21(); 

                }
                break;
            case 15 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:92: T__22
                {
                mT__22(); 

                }
                break;
            case 16 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:98: T__23
                {
                mT__23(); 

                }
                break;
            case 17 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:104: IDENT
                {
                mIDENT(); 

                }
                break;
            case 18 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:110: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 19 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:118: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 20 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:124: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\2\uffff\1\21\3\uffff\2\21\2\uffff\1\30\5\uffff\1\21\1\uffff\1\32"+
        "\2\uffff\3\21\1\uffff\1\21\1\uffff\1\21\1\40\1\41\1\42\1\21\3\uffff"+
        "\1\21\1\uffff";
    static final String DFA6_eofS =
        "\45\uffff";
    static final String DFA6_minS =
        "\1\11\1\uffff\1\150\3\uffff\1\145\1\165\2\uffff\1\56\5\uffff\1\63"+
        "\1\uffff\1\56\2\uffff\1\151\2\164\1\uffff\1\62\1\uffff\1\154\3\60"+
        "\1\145\3\uffff\1\40\1\uffff";
    static final String DFA6_maxS =
        "\1\175\1\uffff\1\150\3\uffff\1\145\1\165\2\uffff\1\71\5\uffff\1"+
        "\63\1\uffff\1\71\2\uffff\1\151\2\164\1\uffff\1\62\1\uffff\1\154"+
        "\3\172\1\145\3\uffff\1\40\1\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\2\uffff\1\10\1\11\1\uffff\1\13"+
        "\1\14\1\15\1\16\1\17\1\uffff\1\21\1\uffff\1\23\1\24\3\uffff\1\12"+
        "\1\uffff\1\22\5\uffff\1\6\1\7\1\20\1\uffff\1\2";
    static final String DFA6_specialS =
        "\45\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\24\1\uffff\2\24\22\uffff\1\24\1\13\4\uffff\1\15\1\uffff\1"+
            "\10\1\11\1\14\1\17\1\uffff\1\12\1\23\1\16\12\22\1\uffff\1\1"+
            "\1\uffff\1\5\3\uffff\32\21\6\uffff\13\21\1\6\1\7\7\21\1\20\1"+
            "\21\1\2\3\21\1\3\1\uffff\1\4",
            "",
            "\1\25",
            "",
            "",
            "",
            "\1\26",
            "\1\27",
            "",
            "",
            "\1\23\1\uffff\12\22",
            "",
            "",
            "",
            "",
            "",
            "\1\31",
            "",
            "\1\23\1\uffff\12\22",
            "",
            "",
            "\1\33",
            "\1\34",
            "\1\35",
            "",
            "\1\36",
            "",
            "\1\37",
            "\12\21\7\uffff\32\21\6\uffff\32\21",
            "\12\21\7\uffff\32\21\6\uffff\32\21",
            "\12\21\7\uffff\32\21\6\uffff\32\21",
            "\1\43",
            "",
            "",
            "",
            "\1\44",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | IDENT | INTEGER | FLOAT | WS );";
        }
    }
 

}