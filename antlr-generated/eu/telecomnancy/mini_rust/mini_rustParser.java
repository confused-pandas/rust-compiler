// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g 2018-01-17 15:32:06

  package eu.telecomnancy.mini_rust;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class mini_rustParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "INTEGER", "FLOAT", "WS", "';'", "'while '", "'{'", "'}'", "'='", "'let'", "'mut'", "'('", "')'", "'-'", "'!'", "'*'", "'&'", "'/'", "'+'", "'i8'", "'i16'", "'i32'", "'i64'", "'u8'", "'u16'", "'u32'", "'u64'", "'f32'", "'f64'"
    };
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


        public mini_rustParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public mini_rustParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return mini_rustParser.tokenNames; }
    public String getGrammarFileName() { return "/home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g"; }



    // $ANTLR start "program"
    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:15:1: program : ( statement )* EOF ;
    public final void program() throws RecognitionException {
        try {
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:16:2: ( ( statement )* EOF )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:17:2: ( statement )* EOF
            {
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:17:2: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=IDENT && LA1_0<=FLOAT)||LA1_0==9||LA1_0==13||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:17:3: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program42);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_program46); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "program"


    // $ANTLR start "statement"
    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:20:1: statement : ( ( expr | variable ) ';' | loop );
    public final void statement() throws RecognitionException {
        try {
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:21:2: ( ( expr | variable ) ';' | loop )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=IDENT && LA3_0<=FLOAT)||LA3_0==13||LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==9) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:22:2: ( expr | variable ) ';'
                    {
                    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:22:2: ( expr | variable )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=IDENT && LA2_0<=FLOAT)||LA2_0==15) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==13) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:22:3: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement59);
                            expr();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:22:10: variable
                            {
                            pushFollow(FOLLOW_variable_in_statement63);
                            variable();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,8,FOLLOW_8_in_statement66); 

                    }
                    break;
                case 2 :
                    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:23:4: loop
                    {
                    pushFollow(FOLLOW_loop_in_statement71);
                    loop();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "statement"


    // $ANTLR start "loop"
    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:26:1: loop : loop_while ;
    public final void loop() throws RecognitionException {
        try {
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:27:2: ( loop_while )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:28:2: loop_while
            {
            pushFollow(FOLLOW_loop_while_in_loop83);
            loop_while();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "loop"


    // $ANTLR start "loop_while"
    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:31:1: loop_while : 'while ' expr block ;
    public final void loop_while() throws RecognitionException {
        try {
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:32:2: ( 'while ' expr block )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:33:2: 'while ' expr block
            {
            match(input,9,FOLLOW_9_in_loop_while95); 
            pushFollow(FOLLOW_expr_in_loop_while97);
            expr();

            state._fsp--;

            pushFollow(FOLLOW_block_in_loop_while100);
            block();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "loop_while"


    // $ANTLR start "block"
    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:37:1: block : '{' ( statement )* '}' ;
    public final void block() throws RecognitionException {
        try {
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:38:2: ( '{' ( statement )* '}' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:39:2: '{' ( statement )* '}'
            {
            match(input,10,FOLLOW_10_in_block112); 
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:40:2: ( statement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=IDENT && LA4_0<=FLOAT)||LA4_0==9||LA4_0==13||LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:40:3: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block116);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match(input,11,FOLLOW_11_in_block121); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "block"


    // $ANTLR start "assign"
    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:44:1: assign : IDENT '=' expr ;
    public final void assign() throws RecognitionException {
        try {
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:45:2: ( IDENT '=' expr )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:46:2: IDENT '=' expr
            {
            match(input,IDENT,FOLLOW_IDENT_in_assign133); 
            match(input,12,FOLLOW_12_in_assign135); 
            pushFollow(FOLLOW_expr_in_assign137);
            expr();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "assign"


    // $ANTLR start "variable"
    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:49:1: variable : 'let' ( 'mut' )? IDENT '=' expr ;
    public final void variable() throws RecognitionException {
        try {
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:50:2: ( 'let' ( 'mut' )? IDENT '=' expr )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:51:2: 'let' ( 'mut' )? IDENT '=' expr
            {
            match(input,13,FOLLOW_13_in_variable149); 
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:51:8: ( 'mut' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:51:9: 'mut'
                    {
                    match(input,14,FOLLOW_14_in_variable152); 

                    }
                    break;

            }

            match(input,IDENT,FOLLOW_IDENT_in_variable156); 
            match(input,12,FOLLOW_12_in_variable158); 
            pushFollow(FOLLOW_expr_in_variable160);
            expr();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "variable"


    // $ANTLR start "atom"
    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:54:1: atom : ( '(' expr ')' | number | IDENT );
    public final void atom() throws RecognitionException {
        try {
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:55:2: ( '(' expr ')' | number | IDENT )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case INTEGER:
            case FLOAT:
                {
                alt6=2;
                }
                break;
            case IDENT:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:56:4: '(' expr ')'
                    {
                    match(input,15,FOLLOW_15_in_atom174); 
                    pushFollow(FOLLOW_expr_in_atom176);
                    expr();

                    state._fsp--;

                    match(input,16,FOLLOW_16_in_atom178); 

                    }
                    break;
                case 2 :
                    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:57:4: number
                    {
                    pushFollow(FOLLOW_number_in_atom183);
                    number();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:58:4: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_atom188); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "atom"


    // $ANTLR start "unary"
    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:61:1: unary : ( '-' | '!' | '*' | '&' )* atom ;
    public final void unary() throws RecognitionException {
        try {
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:62:3: ( ( '-' | '!' | '*' | '&' )* atom )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:63:3: ( '-' | '!' | '*' | '&' )* atom
            {
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:63:3: ( '-' | '!' | '*' | '&' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=17 && LA7_0<=20)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:
            	    {
            	    if ( (input.LA(1)>=17 && input.LA(1)<=20) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            pushFollow(FOLLOW_atom_in_unary221);
            atom();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "unary"


    // $ANTLR start "binary_mul"
    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:66:1: binary_mul : unary ( ( '*' | '/' ) unary )* ;
    public final void binary_mul() throws RecognitionException {
        try {
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:67:3: ( unary ( ( '*' | '/' ) unary )* )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:68:3: unary ( ( '*' | '/' ) unary )*
            {
            pushFollow(FOLLOW_unary_in_binary_mul238);
            unary();

            state._fsp--;

            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:68:9: ( ( '*' | '/' ) unary )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19||LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:68:10: ( '*' | '/' ) unary
            	    {
            	    if ( input.LA(1)==19||input.LA(1)==21 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unary_in_binary_mul249);
            	    unary();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "binary_mul"


    // $ANTLR start "binary_add"
    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:71:1: binary_add : binary_mul ( ( '+' | '-' ) binary_mul )* ;
    public final void binary_add() throws RecognitionException {
        try {
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:72:3: ( binary_mul ( ( '+' | '-' ) binary_mul )* )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:73:3: binary_mul ( ( '+' | '-' ) binary_mul )*
            {
            pushFollow(FOLLOW_binary_mul_in_binary_add268);
            binary_mul();

            state._fsp--;

            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:73:14: ( ( '+' | '-' ) binary_mul )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17||LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:73:15: ( '+' | '-' ) binary_mul
            	    {
            	    if ( input.LA(1)==17||input.LA(1)==22 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_binary_mul_in_binary_add279);
            	    binary_mul();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "binary_add"


    // $ANTLR start "expr"
    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:76:1: expr : ( atom | assign );
    public final void expr() throws RecognitionException {
        try {
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:77:2: ( atom | assign )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=INTEGER && LA10_0<=FLOAT)||LA10_0==15) ) {
                alt10=1;
            }
            else if ( (LA10_0==IDENT) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==12) ) {
                    alt10=2;
                }
                else if ( (LA10_2==8||LA10_2==10||LA10_2==16) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:78:4: atom
                    {
                    pushFollow(FOLLOW_atom_in_expr298);
                    atom();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:79:4: assign
                    {
                    pushFollow(FOLLOW_assign_in_expr303);
                    assign();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr"


    // $ANTLR start "type"
    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:82:1: type : ( 'i8' | 'i16' | 'i32' | 'i64' | 'u8' | 'u16' | 'u32' | 'u64' | 'f32' | 'f64' );
    public final void type() throws RecognitionException {
        try {
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:83:2: ( 'i8' | 'i16' | 'i32' | 'i64' | 'u8' | 'u16' | 'u32' | 'u64' | 'f32' | 'f64' )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:
            {
            if ( (input.LA(1)>=23 && input.LA(1)<=32) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "type"


    // $ANTLR start "number"
    // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:96:1: number : ( INTEGER | FLOAT );
    public final void number() throws RecognitionException {
        try {
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:97:2: ( INTEGER | FLOAT )
            // /home/najib/eclipse-workspace/aghenda1u/src/eu/telecomnancy/mini_rust/mini_rust.g:
            {
            if ( (input.LA(1)>=INTEGER && input.LA(1)<=FLOAT) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "number"

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_program42 = new BitSet(new long[]{0x000000000000A270L});
    public static final BitSet FOLLOW_EOF_in_program46 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement59 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_variable_in_statement63 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_statement66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loop_in_statement71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loop_while_in_loop83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_loop_while95 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_expr_in_loop_while97 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_block_in_loop_while100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_block112 = new BitSet(new long[]{0x000000000000AA70L});
    public static final BitSet FOLLOW_statement_in_block116 = new BitSet(new long[]{0x000000000000AA70L});
    public static final BitSet FOLLOW_11_in_block121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assign133 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_assign135 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_expr_in_assign137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_variable149 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_variable152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_variable156 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_variable158 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_expr_in_variable160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_atom174 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_expr_in_atom176 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_atom178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_atom183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_atom188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unary204 = new BitSet(new long[]{0x00000000001E8070L});
    public static final BitSet FOLLOW_atom_in_unary221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_binary_mul238 = new BitSet(new long[]{0x0000000000280002L});
    public static final BitSet FOLLOW_set_in_binary_mul241 = new BitSet(new long[]{0x00000000001E8070L});
    public static final BitSet FOLLOW_unary_in_binary_mul249 = new BitSet(new long[]{0x0000000000280002L});
    public static final BitSet FOLLOW_binary_mul_in_binary_add268 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_set_in_binary_add271 = new BitSet(new long[]{0x00000000001E8070L});
    public static final BitSet FOLLOW_binary_mul_in_binary_add279 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_atom_in_expr298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_number0 = new BitSet(new long[]{0x0000000000000002L});

}