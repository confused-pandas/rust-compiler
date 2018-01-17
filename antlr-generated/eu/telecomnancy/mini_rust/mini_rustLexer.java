// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g 2018-01-17 15:32:07

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
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:26:7: ( 'i8' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:26:9: 'i8'
            {
            match("i8"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:27:7: ( 'i16' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:27:9: 'i16'
            {
            match("i16"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:28:7: ( 'i32' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:28:9: 'i32'
            {
            match("i32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:29:7: ( 'i64' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:29:9: 'i64'
            {
            match("i64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:30:7: ( 'u8' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:30:9: 'u8'
            {
            match("u8"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:31:7: ( 'u16' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:31:9: 'u16'
            {
            match("u16"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:32:7: ( 'u32' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:32:9: 'u32'
            {
            match("u32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:33:7: ( 'u64' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:33:9: 'u64'
            {
            match("u64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:34:7: ( 'f32' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:34:9: 'f32'
            {
            match("f32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:35:7: ( 'f64' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:35:9: 'f64'
            {
            match("f64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:103:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:104:2: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:104:24: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:108:2: ( ( '-' )? ( '0' .. '9' )+ )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:109:2: ( '-' )? ( '0' .. '9' )+
            {
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:109:2: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:109:3: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:109:9: ( '0' .. '9' )+
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
            	    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:109:10: '0' .. '9'
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
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:113:2: ( ( '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' ) )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:114:2: ( '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )
            {
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:114:2: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:114:3: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:114:9: ( '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:114:10: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('.'); 
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:114:25: ( '0' .. '9' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:114:26: '0' .. '9'
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
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:118:2: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' ) )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:119:2: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )
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
        // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | IDENT | INTEGER | FLOAT | WS )
        int alt6=29;
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
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:104: T__24
                {
                mT__24(); 

                }
                break;
            case 18 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:110: T__25
                {
                mT__25(); 

                }
                break;
            case 19 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:116: T__26
                {
                mT__26(); 

                }
                break;
            case 20 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:122: T__27
                {
                mT__27(); 

                }
                break;
            case 21 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:128: T__28
                {
                mT__28(); 

                }
                break;
            case 22 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:134: T__29
                {
                mT__29(); 

                }
                break;
            case 23 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:140: T__30
                {
                mT__30(); 

                }
                break;
            case 24 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:146: T__31
                {
                mT__31(); 

                }
                break;
            case 25 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:152: T__32
                {
                mT__32(); 

                }
                break;
            case 26 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:158: IDENT
                {
                mIDENT(); 

                }
                break;
            case 27 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:164: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 28 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:172: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 29 :
                // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:1:178: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\2\uffff\1\23\3\uffff\2\23\2\uffff\1\32\5\uffff\3\23\1\uffff\1\45"+
        "\2\uffff\3\23\1\uffff\1\51\3\23\1\55\5\23\1\uffff\1\23\1\64\1\65"+
        "\1\uffff\1\66\1\67\1\70\1\uffff\1\71\1\72\1\73\1\74\1\75\1\23\12"+
        "\uffff\1\23\1\uffff";
    static final String DFA6_eofS =
        "\100\uffff";
    static final String DFA6_minS =
        "\1\11\1\uffff\1\150\3\uffff\1\145\1\165\2\uffff\1\56\5\uffff\2\61"+
        "\1\63\1\uffff\1\56\2\uffff\1\151\2\164\1\uffff\1\60\1\66\1\62\1"+
        "\64\1\60\1\66\1\62\1\64\1\62\1\64\1\uffff\1\154\2\60\1\uffff\3\60"+
        "\1\uffff\5\60\1\145\12\uffff\1\40\1\uffff";
    static final String DFA6_maxS =
        "\1\175\1\uffff\1\150\3\uffff\1\145\1\165\2\uffff\1\71\5\uffff\2"+
        "\70\1\66\1\uffff\1\71\2\uffff\1\151\2\164\1\uffff\1\172\1\66\1\62"+
        "\1\64\1\172\1\66\1\62\1\64\1\62\1\64\1\uffff\1\154\2\172\1\uffff"+
        "\3\172\1\uffff\5\172\1\145\12\uffff\1\40\1\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\2\uffff\1\10\1\11\1\uffff\1\13"+
        "\1\14\1\15\1\16\1\17\3\uffff\1\32\1\uffff\1\34\1\35\3\uffff\1\12"+
        "\12\uffff\1\33\3\uffff\1\20\3\uffff\1\24\6\uffff\1\6\1\7\1\21\1"+
        "\22\1\23\1\25\1\26\1\27\1\30\1\31\1\uffff\1\2";
    static final String DFA6_specialS =
        "\100\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\26\1\uffff\2\26\22\uffff\1\26\1\13\4\uffff\1\15\1\uffff\1"+
            "\10\1\11\1\14\1\17\1\uffff\1\12\1\25\1\16\12\24\1\uffff\1\1"+
            "\1\uffff\1\5\3\uffff\32\23\6\uffff\5\23\1\22\2\23\1\20\2\23"+
            "\1\6\1\7\7\23\1\21\1\23\1\2\3\23\1\3\1\uffff\1\4",
            "",
            "\1\27",
            "",
            "",
            "",
            "\1\30",
            "\1\31",
            "",
            "",
            "\1\25\1\uffff\12\24",
            "",
            "",
            "",
            "",
            "",
            "\1\34\1\uffff\1\35\2\uffff\1\36\1\uffff\1\33",
            "\1\40\1\uffff\1\41\2\uffff\1\42\1\uffff\1\37",
            "\1\43\2\uffff\1\44",
            "",
            "\1\25\1\uffff\12\24",
            "",
            "",
            "\1\46",
            "\1\47",
            "\1\50",
            "",
            "\12\23\7\uffff\32\23\6\uffff\32\23",
            "\1\52",
            "\1\53",
            "\1\54",
            "\12\23\7\uffff\32\23\6\uffff\32\23",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "",
            "\1\63",
            "\12\23\7\uffff\32\23\6\uffff\32\23",
            "\12\23\7\uffff\32\23\6\uffff\32\23",
            "",
            "\12\23\7\uffff\32\23\6\uffff\32\23",
            "\12\23\7\uffff\32\23\6\uffff\32\23",
            "\12\23\7\uffff\32\23\6\uffff\32\23",
            "",
            "\12\23\7\uffff\32\23\6\uffff\32\23",
            "\12\23\7\uffff\32\23\6\uffff\32\23",
            "\12\23\7\uffff\32\23\6\uffff\32\23",
            "\12\23\7\uffff\32\23\6\uffff\32\23",
            "\12\23\7\uffff\32\23\6\uffff\32\23",
            "\1\76",
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
            "\1\77",
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
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | IDENT | INTEGER | FLOAT | WS );";
        }
    }
 

}