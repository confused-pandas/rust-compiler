// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g 2018-04-08 08:29:31

	package eu.telecomnancy.mini_rust.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class mini_rustParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FICHIER", "DECL_FUNC", "DECL_STRUCT", "TYPE", "ARGUMENT", "BLOC", "INDEX", "FUNCTION_CALL", "UNARY_MINUS", "OBJ", "MEMBER", "LETMUT", "MUL", "NEG", "POINTER", "REF", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "LSQBRACKET", "RSQBRACKET", "GT", "GE", "LT", "LE", "EQ", "NE", "AND", "OR", "PLUS", "MINUS", "DIV", "STAR", "EXCL", "ASSIGN", "DOT", "AMPS", "LEN", "LET", "MUT", "FN", "STRUCT", "WHILE", "IF", "ELSE", "RETURN", "VEC_MACRO", "PRINT_MACRO", "VEC_TYPE", "INT32_TYPE", "BOOL_TYPE", "TRUE", "FALSE", "COMMA", "SEMICOLON", "COLON", "ARROW", "IDF", "CSTE_ENT", "CSTE_STR", "LOWERCASE", "UPPERCASE", "DIGIT", "COMMENTS", "WS"
    };
    public static final int LSQBRACKET=24;
    public static final int LT=28;
    public static final int MEMBER=14;
    public static final int STAR=37;
    public static final int IDF=62;
    public static final int WHILE=47;
    public static final int BOOL_TYPE=55;
    public static final int POINTER=18;
    public static final int PRINT_MACRO=52;
    public static final int EXCL=38;
    public static final int AND=32;
    public static final int EOF=-1;
    public static final int INT32_TYPE=54;
    public static final int LPAREN=20;
    public static final int IF=48;
    public static final int TYPE=7;
    public static final int LBRACKET=22;
    public static final int INDEX=10;
    public static final int RSQBRACKET=25;
    public static final int RPAREN=21;
    public static final int UPPERCASE=66;
    public static final int COMMENTS=68;
    public static final int COMMA=58;
    public static final int OBJ=13;
    public static final int ARGUMENT=8;
    public static final int FICHIER=4;
    public static final int RETURN=50;
    public static final int PLUS=34;
    public static final int LETMUT=15;
    public static final int DIGIT=67;
    public static final int RBRACKET=23;
    public static final int EQ=30;
    public static final int DOT=40;
    public static final int NE=31;
    public static final int GE=27;
    public static final int DECL_STRUCT=6;
    public static final int AMPS=41;
    public static final int BLOC=9;
    public static final int ELSE=49;
    public static final int MUT=44;
    public static final int STRUCT=46;
    public static final int UNARY_MINUS=12;
    public static final int SEMICOLON=59;
    public static final int FN=45;
    public static final int MINUS=35;
    public static final int DECL_FUNC=5;
    public static final int TRUE=56;
    public static final int MUL=16;
    public static final int CSTE_STR=64;
    public static final int REF=19;
    public static final int COLON=60;
    public static final int VEC_MACRO=51;
    public static final int WS=69;
    public static final int LOWERCASE=65;
    public static final int VEC_TYPE=53;
    public static final int NEG=17;
    public static final int OR=33;
    public static final int ASSIGN=39;
    public static final int ARROW=61;
    public static final int GT=26;
    public static final int LEN=42;
    public static final int CSTE_ENT=63;
    public static final int DIV=36;
    public static final int FALSE=57;
    public static final int FUNCTION_CALL=11;
    public static final int LET=43;
    public static final int LE=29;

    // delegates
    // delegators


        public mini_rustParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public mini_rustParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return mini_rustParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g"; }


    public static class fichier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fichier"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:85:1: fichier : ( decl )* -> ^( FICHIER ( decl )* ) ;
    public final mini_rustParser.fichier_return fichier() throws RecognitionException {
        mini_rustParser.fichier_return retval = new mini_rustParser.fichier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        mini_rustParser.decl_return decl1 = null;


        RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:86:2: ( ( decl )* -> ^( FICHIER ( decl )* ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:87:2: ( decl )*
            {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:87:2: ( decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=FN && LA1_0<=STRUCT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:87:3: decl
            	    {
            	    pushFollow(FOLLOW_decl_in_fichier469);
            	    decl1=decl();

            	    state._fsp--;

            	    stream_decl.add(decl1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);



            // AST REWRITE
            // elements: decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 87:10: -> ^( FICHIER ( decl )* )
            {
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:87:13: ^( FICHIER ( decl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FICHIER, "FICHIER"), root_1);

                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:87:23: ( decl )*
                while ( stream_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_decl.nextTree());

                }
                stream_decl.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fichier"

    public static class decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "decl"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:90:1: decl : ( decl_func | decl_struct );
    public final mini_rustParser.decl_return decl() throws RecognitionException {
        mini_rustParser.decl_return retval = new mini_rustParser.decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        mini_rustParser.decl_func_return decl_func2 = null;

        mini_rustParser.decl_struct_return decl_struct3 = null;



        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:91:2: ( decl_func | decl_struct )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FN) ) {
                alt2=1;
            }
            else if ( (LA2_0==STRUCT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:92:4: decl_func
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_decl_func_in_decl494);
                    decl_func2=decl_func();

                    state._fsp--;

                    adaptor.addChild(root_0, decl_func2.getTree());

                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:93:4: decl_struct
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_decl_struct_in_decl499);
                    decl_struct3=decl_struct();

                    state._fsp--;

                    adaptor.addChild(root_0, decl_struct3.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "decl"

    public static class decl_func_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "decl_func"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:96:1: decl_func : FN IDF LPAREN ( argument ( COMMA argument )* )? RPAREN ( ARROW type )? bloc -> ^( DECL_FUNC IDF bloc ( type )? ( argument )* ) ;
    public final mini_rustParser.decl_func_return decl_func() throws RecognitionException {
        mini_rustParser.decl_func_return retval = new mini_rustParser.decl_func_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FN4=null;
        Token IDF5=null;
        Token LPAREN6=null;
        Token COMMA8=null;
        Token RPAREN10=null;
        Token ARROW11=null;
        mini_rustParser.argument_return argument7 = null;

        mini_rustParser.argument_return argument9 = null;

        mini_rustParser.type_return type12 = null;

        mini_rustParser.bloc_return bloc13 = null;


        Object FN4_tree=null;
        Object IDF5_tree=null;
        Object LPAREN6_tree=null;
        Object COMMA8_tree=null;
        Object RPAREN10_tree=null;
        Object ARROW11_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_FN=new RewriteRuleTokenStream(adaptor,"token FN");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:97:2: ( FN IDF LPAREN ( argument ( COMMA argument )* )? RPAREN ( ARROW type )? bloc -> ^( DECL_FUNC IDF bloc ( type )? ( argument )* ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:98:2: FN IDF LPAREN ( argument ( COMMA argument )* )? RPAREN ( ARROW type )? bloc
            {
            FN4=(Token)match(input,FN,FOLLOW_FN_in_decl_func511);  
            stream_FN.add(FN4);

            IDF5=(Token)match(input,IDF,FOLLOW_IDF_in_decl_func513);  
            stream_IDF.add(IDF5);

            LPAREN6=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_decl_func515);  
            stream_LPAREN.add(LPAREN6);

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:98:16: ( argument ( COMMA argument )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IDF) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:98:17: argument ( COMMA argument )*
                    {
                    pushFollow(FOLLOW_argument_in_decl_func518);
                    argument7=argument();

                    state._fsp--;

                    stream_argument.add(argument7.getTree());
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:98:26: ( COMMA argument )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==COMMA) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:98:27: COMMA argument
                    	    {
                    	    COMMA8=(Token)match(input,COMMA,FOLLOW_COMMA_in_decl_func521);  
                    	    stream_COMMA.add(COMMA8);

                    	    pushFollow(FOLLOW_argument_in_decl_func523);
                    	    argument9=argument();

                    	    state._fsp--;

                    	    stream_argument.add(argument9.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN10=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_decl_func529);  
            stream_RPAREN.add(RPAREN10);

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:98:53: ( ARROW type )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ARROW) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:98:54: ARROW type
                    {
                    ARROW11=(Token)match(input,ARROW,FOLLOW_ARROW_in_decl_func532);  
                    stream_ARROW.add(ARROW11);

                    pushFollow(FOLLOW_type_in_decl_func534);
                    type12=type();

                    state._fsp--;

                    stream_type.add(type12.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_bloc_in_decl_func538);
            bloc13=bloc();

            state._fsp--;

            stream_bloc.add(bloc13.getTree());


            // AST REWRITE
            // elements: argument, IDF, type, bloc
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 98:72: -> ^( DECL_FUNC IDF bloc ( type )? ( argument )* )
            {
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:98:75: ^( DECL_FUNC IDF bloc ( type )? ( argument )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL_FUNC, "DECL_FUNC"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                adaptor.addChild(root_1, stream_bloc.nextTree());
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:98:96: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:98:104: ( argument )*
                while ( stream_argument.hasNext() ) {
                    adaptor.addChild(root_1, stream_argument.nextTree());

                }
                stream_argument.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "decl_func"

    public static class decl_struct_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "decl_struct"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:101:1: decl_struct : STRUCT idf= IDF LBRACKET (i+= IDF COLON t+= type ( COMMA i+= IDF COLON t+= type )* )? RBRACKET -> ^( DECL_STRUCT $idf ( ^( MEMBER $i $t) )* ) ;
    public final mini_rustParser.decl_struct_return decl_struct() throws RecognitionException {
        mini_rustParser.decl_struct_return retval = new mini_rustParser.decl_struct_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token idf=null;
        Token STRUCT14=null;
        Token LBRACKET15=null;
        Token COLON16=null;
        Token COMMA17=null;
        Token COLON18=null;
        Token RBRACKET19=null;
        Token i=null;
        List list_i=null;
        List list_t=null;
        RuleReturnScope t = null;
        Object idf_tree=null;
        Object STRUCT14_tree=null;
        Object LBRACKET15_tree=null;
        Object COLON16_tree=null;
        Object COMMA17_tree=null;
        Object COLON18_tree=null;
        Object RBRACKET19_tree=null;
        Object i_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_STRUCT=new RewriteRuleTokenStream(adaptor,"token STRUCT");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:102:2: ( STRUCT idf= IDF LBRACKET (i+= IDF COLON t+= type ( COMMA i+= IDF COLON t+= type )* )? RBRACKET -> ^( DECL_STRUCT $idf ( ^( MEMBER $i $t) )* ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:103:2: STRUCT idf= IDF LBRACKET (i+= IDF COLON t+= type ( COMMA i+= IDF COLON t+= type )* )? RBRACKET
            {
            STRUCT14=(Token)match(input,STRUCT,FOLLOW_STRUCT_in_decl_struct570);  
            stream_STRUCT.add(STRUCT14);

            idf=(Token)match(input,IDF,FOLLOW_IDF_in_decl_struct574);  
            stream_IDF.add(idf);

            LBRACKET15=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_decl_struct576);  
            stream_LBRACKET.add(LBRACKET15);

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:103:26: (i+= IDF COLON t+= type ( COMMA i+= IDF COLON t+= type )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDF) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:103:27: i+= IDF COLON t+= type ( COMMA i+= IDF COLON t+= type )*
                    {
                    i=(Token)match(input,IDF,FOLLOW_IDF_in_decl_struct581);  
                    stream_IDF.add(i);

                    if (list_i==null) list_i=new ArrayList();
                    list_i.add(i);

                    COLON16=(Token)match(input,COLON,FOLLOW_COLON_in_decl_struct583);  
                    stream_COLON.add(COLON16);

                    pushFollow(FOLLOW_type_in_decl_struct587);
                    t=type();

                    state._fsp--;

                    stream_type.add(t.getTree());
                    if (list_t==null) list_t=new ArrayList();
                    list_t.add(t.getTree());

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:103:48: ( COMMA i+= IDF COLON t+= type )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==COMMA) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:103:49: COMMA i+= IDF COLON t+= type
                    	    {
                    	    COMMA17=(Token)match(input,COMMA,FOLLOW_COMMA_in_decl_struct590);  
                    	    stream_COMMA.add(COMMA17);

                    	    i=(Token)match(input,IDF,FOLLOW_IDF_in_decl_struct594);  
                    	    stream_IDF.add(i);

                    	    if (list_i==null) list_i=new ArrayList();
                    	    list_i.add(i);

                    	    COLON18=(Token)match(input,COLON,FOLLOW_COLON_in_decl_struct596);  
                    	    stream_COLON.add(COLON18);

                    	    pushFollow(FOLLOW_type_in_decl_struct600);
                    	    t=type();

                    	    state._fsp--;

                    	    stream_type.add(t.getTree());
                    	    if (list_t==null) list_t=new ArrayList();
                    	    list_t.add(t.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            RBRACKET19=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_decl_struct606);  
            stream_RBRACKET.add(RBRACKET19);



            // AST REWRITE
            // elements: i, t, idf
            // token labels: idf
            // rule labels: retval
            // token list labels: i
            // rule list labels: t
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_idf=new RewriteRuleTokenStream(adaptor,"token idf",idf);
            RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i", list_i);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"token t",list_t);
            root_0 = (Object)adaptor.nil();
            // 103:89: -> ^( DECL_STRUCT $idf ( ^( MEMBER $i $t) )* )
            {
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:103:92: ^( DECL_STRUCT $idf ( ^( MEMBER $i $t) )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL_STRUCT, "DECL_STRUCT"), root_1);

                adaptor.addChild(root_1, stream_idf.nextNode());
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:103:111: ( ^( MEMBER $i $t) )*
                while ( stream_i.hasNext()||stream_t.hasNext() ) {
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:103:111: ^( MEMBER $i $t)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MEMBER, "MEMBER"), root_2);

                    adaptor.addChild(root_2, stream_i.nextNode());
                    adaptor.addChild(root_2, stream_t.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_i.reset();
                stream_t.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "decl_struct"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:106:1: type : ( IDF | VEC_TYPE LT type GT -> ^( VEC_TYPE type ) | AMPS type | INT32_TYPE | BOOL_TYPE );
    public final mini_rustParser.type_return type() throws RecognitionException {
        mini_rustParser.type_return retval = new mini_rustParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF20=null;
        Token VEC_TYPE21=null;
        Token LT22=null;
        Token GT24=null;
        Token AMPS25=null;
        Token INT32_TYPE27=null;
        Token BOOL_TYPE28=null;
        mini_rustParser.type_return type23 = null;

        mini_rustParser.type_return type26 = null;


        Object IDF20_tree=null;
        Object VEC_TYPE21_tree=null;
        Object LT22_tree=null;
        Object GT24_tree=null;
        Object AMPS25_tree=null;
        Object INT32_TYPE27_tree=null;
        Object BOOL_TYPE28_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_VEC_TYPE=new RewriteRuleTokenStream(adaptor,"token VEC_TYPE");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:107:2: ( IDF | VEC_TYPE LT type GT -> ^( VEC_TYPE type ) | AMPS type | INT32_TYPE | BOOL_TYPE )
            int alt8=5;
            switch ( input.LA(1) ) {
            case IDF:
                {
                alt8=1;
                }
                break;
            case VEC_TYPE:
                {
                alt8=2;
                }
                break;
            case AMPS:
                {
                alt8=3;
                }
                break;
            case INT32_TYPE:
                {
                alt8=4;
                }
                break;
            case BOOL_TYPE:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:108:4: IDF
                    {
                    root_0 = (Object)adaptor.nil();

                    IDF20=(Token)match(input,IDF,FOLLOW_IDF_in_type640); 
                    IDF20_tree = (Object)adaptor.create(IDF20);
                    adaptor.addChild(root_0, IDF20_tree);


                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:109:4: VEC_TYPE LT type GT
                    {
                    VEC_TYPE21=(Token)match(input,VEC_TYPE,FOLLOW_VEC_TYPE_in_type645);  
                    stream_VEC_TYPE.add(VEC_TYPE21);

                    LT22=(Token)match(input,LT,FOLLOW_LT_in_type647);  
                    stream_LT.add(LT22);

                    pushFollow(FOLLOW_type_in_type649);
                    type23=type();

                    state._fsp--;

                    stream_type.add(type23.getTree());
                    GT24=(Token)match(input,GT,FOLLOW_GT_in_type651);  
                    stream_GT.add(GT24);



                    // AST REWRITE
                    // elements: VEC_TYPE, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 109:24: -> ^( VEC_TYPE type )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:109:27: ^( VEC_TYPE type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_VEC_TYPE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:110:4: AMPS type
                    {
                    root_0 = (Object)adaptor.nil();

                    AMPS25=(Token)match(input,AMPS,FOLLOW_AMPS_in_type664); 
                    AMPS25_tree = (Object)adaptor.create(AMPS25);
                    adaptor.addChild(root_0, AMPS25_tree);

                    pushFollow(FOLLOW_type_in_type666);
                    type26=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type26.getTree());

                    }
                    break;
                case 4 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:111:4: INT32_TYPE
                    {
                    root_0 = (Object)adaptor.nil();

                    INT32_TYPE27=(Token)match(input,INT32_TYPE,FOLLOW_INT32_TYPE_in_type671); 
                    INT32_TYPE27_tree = (Object)adaptor.create(INT32_TYPE27);
                    adaptor.addChild(root_0, INT32_TYPE27_tree);


                    }
                    break;
                case 5 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:112:4: BOOL_TYPE
                    {
                    root_0 = (Object)adaptor.nil();

                    BOOL_TYPE28=(Token)match(input,BOOL_TYPE,FOLLOW_BOOL_TYPE_in_type676); 
                    BOOL_TYPE28_tree = (Object)adaptor.create(BOOL_TYPE28);
                    adaptor.addChild(root_0, BOOL_TYPE28_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argument"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:115:1: argument : IDF COLON type -> ^( ARGUMENT IDF type ) ;
    public final mini_rustParser.argument_return argument() throws RecognitionException {
        mini_rustParser.argument_return retval = new mini_rustParser.argument_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF29=null;
        Token COLON30=null;
        mini_rustParser.type_return type31 = null;


        Object IDF29_tree=null;
        Object COLON30_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:116:2: ( IDF COLON type -> ^( ARGUMENT IDF type ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:117:2: IDF COLON type
            {
            IDF29=(Token)match(input,IDF,FOLLOW_IDF_in_argument688);  
            stream_IDF.add(IDF29);

            COLON30=(Token)match(input,COLON,FOLLOW_COLON_in_argument690);  
            stream_COLON.add(COLON30);

            pushFollow(FOLLOW_type_in_argument692);
            type31=type();

            state._fsp--;

            stream_type.add(type31.getTree());


            // AST REWRITE
            // elements: IDF, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 117:17: -> ^( ARGUMENT IDF type )
            {
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:117:20: ^( ARGUMENT IDF type )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENT, "ARGUMENT"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argument"

    public static class bloc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bloc"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:120:1: bloc : LBRACKET instruction_bloc RBRACKET -> ^( BLOC ( instruction_bloc )? ) ;
    public final mini_rustParser.bloc_return bloc() throws RecognitionException {
        mini_rustParser.bloc_return retval = new mini_rustParser.bloc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LBRACKET32=null;
        Token RBRACKET34=null;
        mini_rustParser.instruction_bloc_return instruction_bloc33 = null;


        Object LBRACKET32_tree=null;
        Object RBRACKET34_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_instruction_bloc=new RewriteRuleSubtreeStream(adaptor,"rule instruction_bloc");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:121:2: ( LBRACKET instruction_bloc RBRACKET -> ^( BLOC ( instruction_bloc )? ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:122:2: LBRACKET instruction_bloc RBRACKET
            {
            LBRACKET32=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_bloc714);  
            stream_LBRACKET.add(LBRACKET32);

            pushFollow(FOLLOW_instruction_bloc_in_bloc716);
            instruction_bloc33=instruction_bloc();

            state._fsp--;

            stream_instruction_bloc.add(instruction_bloc33.getTree());
            RBRACKET34=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_bloc718);  
            stream_RBRACKET.add(RBRACKET34);



            // AST REWRITE
            // elements: instruction_bloc
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 122:37: -> ^( BLOC ( instruction_bloc )? )
            {
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:122:40: ^( BLOC ( instruction_bloc )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOC, "BLOC"), root_1);

                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:122:47: ( instruction_bloc )?
                if ( stream_instruction_bloc.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction_bloc.nextTree());

                }
                stream_instruction_bloc.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bloc"

    public static class instruction_bloc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction_bloc"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:125:1: instruction_bloc : ( instruction instruction_bloc | ( expr )? ( SEMICOLON instruction_bloc )? -> ( expr )? ( instruction_bloc )? );
    public final mini_rustParser.instruction_bloc_return instruction_bloc() throws RecognitionException {
        mini_rustParser.instruction_bloc_return retval = new mini_rustParser.instruction_bloc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON38=null;
        mini_rustParser.instruction_return instruction35 = null;

        mini_rustParser.instruction_bloc_return instruction_bloc36 = null;

        mini_rustParser.expr_return expr37 = null;

        mini_rustParser.instruction_bloc_return instruction_bloc39 = null;


        Object SEMICOLON38_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_instruction_bloc=new RewriteRuleSubtreeStream(adaptor,"rule instruction_bloc");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:126:2: ( instruction instruction_bloc | ( expr )? ( SEMICOLON instruction_bloc )? -> ( expr )? ( instruction_bloc )? )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==LBRACKET||LA11_0==LET||(LA11_0>=WHILE && LA11_0<=IF)||LA11_0==RETURN) ) {
                alt11=1;
            }
            else if ( (LA11_0==LPAREN||LA11_0==RBRACKET||LA11_0==MINUS||(LA11_0>=STAR && LA11_0<=EXCL)||LA11_0==AMPS||(LA11_0>=VEC_MACRO && LA11_0<=PRINT_MACRO)||(LA11_0>=TRUE && LA11_0<=FALSE)||LA11_0==SEMICOLON||(LA11_0>=IDF && LA11_0<=CSTE_STR)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:127:4: instruction instruction_bloc
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_instruction_in_instruction_bloc741);
                    instruction35=instruction();

                    state._fsp--;

                    adaptor.addChild(root_0, instruction35.getTree());
                    pushFollow(FOLLOW_instruction_bloc_in_instruction_bloc743);
                    instruction_bloc36=instruction_bloc();

                    state._fsp--;

                    adaptor.addChild(root_0, instruction_bloc36.getTree());

                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:128:4: ( expr )? ( SEMICOLON instruction_bloc )?
                    {
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:128:4: ( expr )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==LPAREN||LA9_0==MINUS||(LA9_0>=STAR && LA9_0<=EXCL)||LA9_0==AMPS||(LA9_0>=VEC_MACRO && LA9_0<=PRINT_MACRO)||(LA9_0>=TRUE && LA9_0<=FALSE)||(LA9_0>=IDF && LA9_0<=CSTE_STR)) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:128:5: expr
                            {
                            pushFollow(FOLLOW_expr_in_instruction_bloc749);
                            expr37=expr();

                            state._fsp--;

                            stream_expr.add(expr37.getTree());

                            }
                            break;

                    }

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:128:12: ( SEMICOLON instruction_bloc )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==SEMICOLON) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:128:13: SEMICOLON instruction_bloc
                            {
                            SEMICOLON38=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_instruction_bloc754);  
                            stream_SEMICOLON.add(SEMICOLON38);

                            pushFollow(FOLLOW_instruction_bloc_in_instruction_bloc756);
                            instruction_bloc39=instruction_bloc();

                            state._fsp--;

                            stream_instruction_bloc.add(instruction_bloc39.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: instruction_bloc, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 128:42: -> ( expr )? ( instruction_bloc )?
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:128:45: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_0, stream_expr.nextTree());

                        }
                        stream_expr.reset();
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:128:51: ( instruction_bloc )?
                        if ( stream_instruction_bloc.hasNext() ) {
                            adaptor.addChild(root_0, stream_instruction_bloc.nextTree());

                        }
                        stream_instruction_bloc.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instruction_bloc"

    public static class instruction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:131:1: instruction : ( LET instruction_let SEMICOLON -> instruction_let | WHILE expr bloc -> ^( WHILE expr bloc ) | RETURN ( expr )? SEMICOLON -> ^( RETURN ( expr )? ) | if_expr | bloc );
    public final mini_rustParser.instruction_return instruction() throws RecognitionException {
        mini_rustParser.instruction_return retval = new mini_rustParser.instruction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LET40=null;
        Token SEMICOLON42=null;
        Token WHILE43=null;
        Token RETURN46=null;
        Token SEMICOLON48=null;
        mini_rustParser.instruction_let_return instruction_let41 = null;

        mini_rustParser.expr_return expr44 = null;

        mini_rustParser.bloc_return bloc45 = null;

        mini_rustParser.expr_return expr47 = null;

        mini_rustParser.if_expr_return if_expr49 = null;

        mini_rustParser.bloc_return bloc50 = null;


        Object LET40_tree=null;
        Object SEMICOLON42_tree=null;
        Object WHILE43_tree=null;
        Object RETURN46_tree=null;
        Object SEMICOLON48_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LET=new RewriteRuleTokenStream(adaptor,"token LET");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_instruction_let=new RewriteRuleSubtreeStream(adaptor,"rule instruction_let");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:132:2: ( LET instruction_let SEMICOLON -> instruction_let | WHILE expr bloc -> ^( WHILE expr bloc ) | RETURN ( expr )? SEMICOLON -> ^( RETURN ( expr )? ) | if_expr | bloc )
            int alt13=5;
            switch ( input.LA(1) ) {
            case LET:
                {
                alt13=1;
                }
                break;
            case WHILE:
                {
                alt13=2;
                }
                break;
            case RETURN:
                {
                alt13=3;
                }
                break;
            case IF:
                {
                alt13=4;
                }
                break;
            case LBRACKET:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:133:4: LET instruction_let SEMICOLON
                    {
                    LET40=(Token)match(input,LET,FOLLOW_LET_in_instruction780);  
                    stream_LET.add(LET40);

                    pushFollow(FOLLOW_instruction_let_in_instruction782);
                    instruction_let41=instruction_let();

                    state._fsp--;

                    stream_instruction_let.add(instruction_let41.getTree());
                    SEMICOLON42=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_instruction784);  
                    stream_SEMICOLON.add(SEMICOLON42);



                    // AST REWRITE
                    // elements: instruction_let
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 133:34: -> instruction_let
                    {
                        adaptor.addChild(root_0, stream_instruction_let.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:134:4: WHILE expr bloc
                    {
                    WHILE43=(Token)match(input,WHILE,FOLLOW_WHILE_in_instruction793);  
                    stream_WHILE.add(WHILE43);

                    pushFollow(FOLLOW_expr_in_instruction795);
                    expr44=expr();

                    state._fsp--;

                    stream_expr.add(expr44.getTree());
                    pushFollow(FOLLOW_bloc_in_instruction797);
                    bloc45=bloc();

                    state._fsp--;

                    stream_bloc.add(bloc45.getTree());


                    // AST REWRITE
                    // elements: WHILE, expr, bloc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 134:20: -> ^( WHILE expr bloc )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:134:23: ^( WHILE expr bloc )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        adaptor.addChild(root_1, stream_bloc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:135:4: RETURN ( expr )? SEMICOLON
                    {
                    RETURN46=(Token)match(input,RETURN,FOLLOW_RETURN_in_instruction812);  
                    stream_RETURN.add(RETURN46);

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:135:11: ( expr )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==LPAREN||LA12_0==MINUS||(LA12_0>=STAR && LA12_0<=EXCL)||LA12_0==AMPS||(LA12_0>=VEC_MACRO && LA12_0<=PRINT_MACRO)||(LA12_0>=TRUE && LA12_0<=FALSE)||(LA12_0>=IDF && LA12_0<=CSTE_STR)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:135:12: expr
                            {
                            pushFollow(FOLLOW_expr_in_instruction815);
                            expr47=expr();

                            state._fsp--;

                            stream_expr.add(expr47.getTree());

                            }
                            break;

                    }

                    SEMICOLON48=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_instruction819);  
                    stream_SEMICOLON.add(SEMICOLON48);



                    // AST REWRITE
                    // elements: RETURN, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 135:29: -> ^( RETURN ( expr )? )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:135:32: ^( RETURN ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:135:41: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:136:4: if_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_expr_in_instruction833);
                    if_expr49=if_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, if_expr49.getTree());

                    }
                    break;
                case 5 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:137:4: bloc
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_bloc_in_instruction838);
                    bloc50=bloc();

                    state._fsp--;

                    adaptor.addChild(root_0, bloc50.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instruction"

    public static class instruction_let_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction_let"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:140:1: instruction_let : ( MUT expr ( ASSIGN obj_expr )? -> ^( LETMUT expr ( obj_expr )? ) | expr ( ASSIGN obj_expr )? -> ^( LET expr ( obj_expr )? ) );
    public final mini_rustParser.instruction_let_return instruction_let() throws RecognitionException {
        mini_rustParser.instruction_let_return retval = new mini_rustParser.instruction_let_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MUT51=null;
        Token ASSIGN53=null;
        Token ASSIGN56=null;
        mini_rustParser.expr_return expr52 = null;

        mini_rustParser.obj_expr_return obj_expr54 = null;

        mini_rustParser.expr_return expr55 = null;

        mini_rustParser.obj_expr_return obj_expr57 = null;


        Object MUT51_tree=null;
        Object ASSIGN53_tree=null;
        Object ASSIGN56_tree=null;
        RewriteRuleTokenStream stream_MUT=new RewriteRuleTokenStream(adaptor,"token MUT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_obj_expr=new RewriteRuleSubtreeStream(adaptor,"rule obj_expr");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:141:2: ( MUT expr ( ASSIGN obj_expr )? -> ^( LETMUT expr ( obj_expr )? ) | expr ( ASSIGN obj_expr )? -> ^( LET expr ( obj_expr )? ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==MUT) ) {
                alt16=1;
            }
            else if ( (LA16_0==LPAREN||LA16_0==MINUS||(LA16_0>=STAR && LA16_0<=EXCL)||LA16_0==AMPS||(LA16_0>=VEC_MACRO && LA16_0<=PRINT_MACRO)||(LA16_0>=TRUE && LA16_0<=FALSE)||(LA16_0>=IDF && LA16_0<=CSTE_STR)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:142:4: MUT expr ( ASSIGN obj_expr )?
                    {
                    MUT51=(Token)match(input,MUT,FOLLOW_MUT_in_instruction_let852);  
                    stream_MUT.add(MUT51);

                    pushFollow(FOLLOW_expr_in_instruction_let854);
                    expr52=expr();

                    state._fsp--;

                    stream_expr.add(expr52.getTree());
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:142:13: ( ASSIGN obj_expr )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ASSIGN) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:142:14: ASSIGN obj_expr
                            {
                            ASSIGN53=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_instruction_let857);  
                            stream_ASSIGN.add(ASSIGN53);

                            pushFollow(FOLLOW_obj_expr_in_instruction_let859);
                            obj_expr54=obj_expr();

                            state._fsp--;

                            stream_obj_expr.add(obj_expr54.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: obj_expr, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 142:32: -> ^( LETMUT expr ( obj_expr )? )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:142:35: ^( LETMUT expr ( obj_expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LETMUT, "LETMUT"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:142:49: ( obj_expr )?
                        if ( stream_obj_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_obj_expr.nextTree());

                        }
                        stream_obj_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:143:4: expr ( ASSIGN obj_expr )?
                    {
                    pushFollow(FOLLOW_expr_in_instruction_let879);
                    expr55=expr();

                    state._fsp--;

                    stream_expr.add(expr55.getTree());
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:143:9: ( ASSIGN obj_expr )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==ASSIGN) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:143:10: ASSIGN obj_expr
                            {
                            ASSIGN56=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_instruction_let882);  
                            stream_ASSIGN.add(ASSIGN56);

                            pushFollow(FOLLOW_obj_expr_in_instruction_let884);
                            obj_expr57=obj_expr();

                            state._fsp--;

                            stream_obj_expr.add(obj_expr57.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: expr, obj_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 143:28: -> ^( LET expr ( obj_expr )? )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:143:31: ^( LET expr ( obj_expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LET, "LET"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:143:42: ( obj_expr )?
                        if ( stream_obj_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_obj_expr.nextTree());

                        }
                        stream_obj_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instruction_let"

    public static class obj_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "obj_def"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:146:1: obj_def : LBRACKET (i+= IDF COLON o+= obj_expr ( COMMA i+= IDF COLON o+= obj_expr )* )? RBRACKET -> ( ^( MEMBER $i $o) )* ;
    public final mini_rustParser.obj_def_return obj_def() throws RecognitionException {
        mini_rustParser.obj_def_return retval = new mini_rustParser.obj_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LBRACKET58=null;
        Token COLON59=null;
        Token COMMA60=null;
        Token COLON61=null;
        Token RBRACKET62=null;
        Token i=null;
        List list_i=null;
        List list_o=null;
        RuleReturnScope o = null;
        Object LBRACKET58_tree=null;
        Object COLON59_tree=null;
        Object COMMA60_tree=null;
        Object COLON61_tree=null;
        Object RBRACKET62_tree=null;
        Object i_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_obj_expr=new RewriteRuleSubtreeStream(adaptor,"rule obj_expr");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:147:2: ( LBRACKET (i+= IDF COLON o+= obj_expr ( COMMA i+= IDF COLON o+= obj_expr )* )? RBRACKET -> ( ^( MEMBER $i $o) )* )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:148:2: LBRACKET (i+= IDF COLON o+= obj_expr ( COMMA i+= IDF COLON o+= obj_expr )* )? RBRACKET
            {
            LBRACKET58=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_obj_def911);  
            stream_LBRACKET.add(LBRACKET58);

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:148:11: (i+= IDF COLON o+= obj_expr ( COMMA i+= IDF COLON o+= obj_expr )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDF) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:148:12: i+= IDF COLON o+= obj_expr ( COMMA i+= IDF COLON o+= obj_expr )*
                    {
                    i=(Token)match(input,IDF,FOLLOW_IDF_in_obj_def916);  
                    stream_IDF.add(i);

                    if (list_i==null) list_i=new ArrayList();
                    list_i.add(i);

                    COLON59=(Token)match(input,COLON,FOLLOW_COLON_in_obj_def918);  
                    stream_COLON.add(COLON59);

                    pushFollow(FOLLOW_obj_expr_in_obj_def922);
                    o=obj_expr();

                    state._fsp--;

                    stream_obj_expr.add(o.getTree());
                    if (list_o==null) list_o=new ArrayList();
                    list_o.add(o.getTree());

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:148:37: ( COMMA i+= IDF COLON o+= obj_expr )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:148:38: COMMA i+= IDF COLON o+= obj_expr
                    	    {
                    	    COMMA60=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj_def925);  
                    	    stream_COMMA.add(COMMA60);

                    	    i=(Token)match(input,IDF,FOLLOW_IDF_in_obj_def929);  
                    	    stream_IDF.add(i);

                    	    if (list_i==null) list_i=new ArrayList();
                    	    list_i.add(i);

                    	    COLON61=(Token)match(input,COLON,FOLLOW_COLON_in_obj_def931);  
                    	    stream_COLON.add(COLON61);

                    	    pushFollow(FOLLOW_obj_expr_in_obj_def935);
                    	    o=obj_expr();

                    	    state._fsp--;

                    	    stream_obj_expr.add(o.getTree());
                    	    if (list_o==null) list_o=new ArrayList();
                    	    list_o.add(o.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            RBRACKET62=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_obj_def941);  
            stream_RBRACKET.add(RBRACKET62);



            // AST REWRITE
            // elements: i, o
            // token labels: 
            // rule labels: retval
            // token list labels: i
            // rule list labels: o
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i", list_i);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"token o",list_o);
            root_0 = (Object)adaptor.nil();
            // 148:82: -> ( ^( MEMBER $i $o) )*
            {
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:148:85: ( ^( MEMBER $i $o) )*
                while ( stream_i.hasNext()||stream_o.hasNext() ) {
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:148:85: ^( MEMBER $i $o)
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MEMBER, "MEMBER"), root_1);

                    adaptor.addChild(root_1, stream_i.nextNode());
                    adaptor.addChild(root_1, stream_o.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_i.reset();
                stream_o.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "obj_def"

    public static class obj_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "obj_expr"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:151:1: obj_expr : expr ( -> expr | obj_def -> ^( OBJ expr obj_def ) ) ;
    public final mini_rustParser.obj_expr_return obj_expr() throws RecognitionException {
        mini_rustParser.obj_expr_return retval = new mini_rustParser.obj_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        mini_rustParser.expr_return expr63 = null;

        mini_rustParser.obj_def_return obj_def64 = null;


        RewriteRuleSubtreeStream stream_obj_def=new RewriteRuleSubtreeStream(adaptor,"rule obj_def");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:152:2: ( expr ( -> expr | obj_def -> ^( OBJ expr obj_def ) ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:153:4: expr ( -> expr | obj_def -> ^( OBJ expr obj_def ) )
            {
            pushFollow(FOLLOW_expr_in_obj_expr968);
            expr63=expr();

            state._fsp--;

            stream_expr.add(expr63.getTree());
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:154:4: ( -> expr | obj_def -> ^( OBJ expr obj_def ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RBRACKET||(LA19_0>=COMMA && LA19_0<=SEMICOLON)) ) {
                alt19=1;
            }
            else if ( (LA19_0==LBRACKET) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:155:7: 
                    {

                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 155:7: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:156:7: obj_def
                    {
                    pushFollow(FOLLOW_obj_def_in_obj_expr991);
                    obj_def64=obj_def();

                    state._fsp--;

                    stream_obj_def.add(obj_def64.getTree());


                    // AST REWRITE
                    // elements: expr, obj_def
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 156:15: -> ^( OBJ expr obj_def )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:156:18: ^( OBJ expr obj_def )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OBJ, "OBJ"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        adaptor.addChild(root_1, stream_obj_def.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "obj_expr"

    public static class if_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_expr"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:160:1: if_expr : IF expr bloc ( else_expr )? -> ^( IF expr bloc ( else_expr )? ) ;
    public final mini_rustParser.if_expr_return if_expr() throws RecognitionException {
        mini_rustParser.if_expr_return retval = new mini_rustParser.if_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF65=null;
        mini_rustParser.expr_return expr66 = null;

        mini_rustParser.bloc_return bloc67 = null;

        mini_rustParser.else_expr_return else_expr68 = null;


        Object IF65_tree=null;
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
        RewriteRuleSubtreeStream stream_else_expr=new RewriteRuleSubtreeStream(adaptor,"rule else_expr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:161:2: ( IF expr bloc ( else_expr )? -> ^( IF expr bloc ( else_expr )? ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:162:2: IF expr bloc ( else_expr )?
            {
            IF65=(Token)match(input,IF,FOLLOW_IF_in_if_expr1018);  
            stream_IF.add(IF65);

            pushFollow(FOLLOW_expr_in_if_expr1020);
            expr66=expr();

            state._fsp--;

            stream_expr.add(expr66.getTree());
            pushFollow(FOLLOW_bloc_in_if_expr1022);
            bloc67=bloc();

            state._fsp--;

            stream_bloc.add(bloc67.getTree());
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:162:15: ( else_expr )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ELSE) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:162:16: else_expr
                    {
                    pushFollow(FOLLOW_else_expr_in_if_expr1025);
                    else_expr68=else_expr();

                    state._fsp--;

                    stream_else_expr.add(else_expr68.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: else_expr, IF, bloc, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 162:28: -> ^( IF expr bloc ( else_expr )? )
            {
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:162:31: ^( IF expr bloc ( else_expr )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                adaptor.addChild(root_1, stream_bloc.nextTree());
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:162:46: ( else_expr )?
                if ( stream_else_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_else_expr.nextTree());

                }
                stream_else_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "if_expr"

    public static class else_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "else_expr"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:165:1: else_expr : ELSE ( bloc -> ^( ELSE bloc ) | if_expr -> ^( ELSE if_expr ) ) ;
    public final mini_rustParser.else_expr_return else_expr() throws RecognitionException {
        mini_rustParser.else_expr_return retval = new mini_rustParser.else_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ELSE69=null;
        mini_rustParser.bloc_return bloc70 = null;

        mini_rustParser.if_expr_return if_expr71 = null;


        Object ELSE69_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
        RewriteRuleSubtreeStream stream_if_expr=new RewriteRuleSubtreeStream(adaptor,"rule if_expr");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:166:2: ( ELSE ( bloc -> ^( ELSE bloc ) | if_expr -> ^( ELSE if_expr ) ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:167:2: ELSE ( bloc -> ^( ELSE bloc ) | if_expr -> ^( ELSE if_expr ) )
            {
            ELSE69=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_expr1054);  
            stream_ELSE.add(ELSE69);

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:167:7: ( bloc -> ^( ELSE bloc ) | if_expr -> ^( ELSE if_expr ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LBRACKET) ) {
                alt21=1;
            }
            else if ( (LA21_0==IF) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:167:8: bloc
                    {
                    pushFollow(FOLLOW_bloc_in_else_expr1057);
                    bloc70=bloc();

                    state._fsp--;

                    stream_bloc.add(bloc70.getTree());


                    // AST REWRITE
                    // elements: ELSE, bloc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 167:13: -> ^( ELSE bloc )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:167:16: ^( ELSE bloc )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ELSE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_bloc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:167:31: if_expr
                    {
                    pushFollow(FOLLOW_if_expr_in_else_expr1069);
                    if_expr71=if_expr();

                    state._fsp--;

                    stream_if_expr.add(if_expr71.getTree());


                    // AST REWRITE
                    // elements: if_expr, ELSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 167:39: -> ^( ELSE if_expr )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:167:42: ^( ELSE if_expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ELSE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_if_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "else_expr"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:170:1: expr : expr_ou ;
    public final mini_rustParser.expr_return expr() throws RecognitionException {
        mini_rustParser.expr_return retval = new mini_rustParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        mini_rustParser.expr_ou_return expr_ou72 = null;



        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:171:2: ( expr_ou )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:172:2: expr_ou
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_ou_in_expr1090);
            expr_ou72=expr_ou();

            state._fsp--;

            adaptor.addChild(root_0, expr_ou72.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class dot_factorisation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dot_factorisation"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:175:1: dot_factorisation : ( IDF -> IDF | LEN LPAREN RPAREN -> LEN );
    public final mini_rustParser.dot_factorisation_return dot_factorisation() throws RecognitionException {
        mini_rustParser.dot_factorisation_return retval = new mini_rustParser.dot_factorisation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF73=null;
        Token LEN74=null;
        Token LPAREN75=null;
        Token RPAREN76=null;

        Object IDF73_tree=null;
        Object LEN74_tree=null;
        Object LPAREN75_tree=null;
        Object RPAREN76_tree=null;
        RewriteRuleTokenStream stream_LEN=new RewriteRuleTokenStream(adaptor,"token LEN");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");

        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:176:2: ( IDF -> IDF | LEN LPAREN RPAREN -> LEN )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==IDF) ) {
                alt22=1;
            }
            else if ( (LA22_0==LEN) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:177:4: IDF
                    {
                    IDF73=(Token)match(input,IDF,FOLLOW_IDF_in_dot_factorisation1104);  
                    stream_IDF.add(IDF73);



                    // AST REWRITE
                    // elements: IDF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 177:8: -> IDF
                    {
                        adaptor.addChild(root_0, stream_IDF.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:178:4: LEN LPAREN RPAREN
                    {
                    LEN74=(Token)match(input,LEN,FOLLOW_LEN_in_dot_factorisation1113);  
                    stream_LEN.add(LEN74);

                    LPAREN75=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dot_factorisation1115);  
                    stream_LPAREN.add(LPAREN75);

                    RPAREN76=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dot_factorisation1117);  
                    stream_RPAREN.add(RPAREN76);



                    // AST REWRITE
                    // elements: LEN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 178:22: -> LEN
                    {
                        adaptor.addChild(root_0, stream_LEN.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dot_factorisation"

    public static class expr_ou_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_ou"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:181:1: expr_ou : (e1= expr_et -> $e1) ( OR e2= expr_et -> ^( OR $expr_ou $e2) )* ;
    public final mini_rustParser.expr_ou_return expr_ou() throws RecognitionException {
        mini_rustParser.expr_ou_return retval = new mini_rustParser.expr_ou_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR77=null;
        mini_rustParser.expr_et_return e1 = null;

        mini_rustParser.expr_et_return e2 = null;


        Object OR77_tree=null;
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_expr_et=new RewriteRuleSubtreeStream(adaptor,"rule expr_et");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:182:2: ( (e1= expr_et -> $e1) ( OR e2= expr_et -> ^( OR $expr_ou $e2) )* )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:183:2: (e1= expr_et -> $e1) ( OR e2= expr_et -> ^( OR $expr_ou $e2) )*
            {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:183:2: (e1= expr_et -> $e1)
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:183:3: e1= expr_et
            {
            pushFollow(FOLLOW_expr_et_in_expr_ou1136);
            e1=expr_et();

            state._fsp--;

            stream_expr_et.add(e1.getTree());


            // AST REWRITE
            // elements: e1
            // token labels: 
            // rule labels: retval, e1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 183:14: -> $e1
            {
                adaptor.addChild(root_0, stream_e1.nextTree());

            }

            retval.tree = root_0;
            }

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:183:22: ( OR e2= expr_et -> ^( OR $expr_ou $e2) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==OR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:183:23: OR e2= expr_et
            	    {
            	    OR77=(Token)match(input,OR,FOLLOW_OR_in_expr_ou1145);  
            	    stream_OR.add(OR77);

            	    pushFollow(FOLLOW_expr_et_in_expr_ou1149);
            	    e2=expr_et();

            	    state._fsp--;

            	    stream_expr_et.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: OR, expr_ou, e2
            	    // token labels: 
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 183:37: -> ^( OR $expr_ou $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:183:40: ^( OR $expr_ou $e2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_e2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_ou"

    public static class expr_et_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_et"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:186:1: expr_et : (e1= expr_comp -> $e1) ( AND e2= expr_comp -> ^( AND $expr_et $e2) )* ;
    public final mini_rustParser.expr_et_return expr_et() throws RecognitionException {
        mini_rustParser.expr_et_return retval = new mini_rustParser.expr_et_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND78=null;
        mini_rustParser.expr_comp_return e1 = null;

        mini_rustParser.expr_comp_return e2 = null;


        Object AND78_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_expr_comp=new RewriteRuleSubtreeStream(adaptor,"rule expr_comp");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:187:2: ( (e1= expr_comp -> $e1) ( AND e2= expr_comp -> ^( AND $expr_et $e2) )* )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:188:2: (e1= expr_comp -> $e1) ( AND e2= expr_comp -> ^( AND $expr_et $e2) )*
            {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:188:2: (e1= expr_comp -> $e1)
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:188:3: e1= expr_comp
            {
            pushFollow(FOLLOW_expr_comp_in_expr_et1178);
            e1=expr_comp();

            state._fsp--;

            stream_expr_comp.add(e1.getTree());


            // AST REWRITE
            // elements: e1
            // token labels: 
            // rule labels: retval, e1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 188:16: -> $e1
            {
                adaptor.addChild(root_0, stream_e1.nextTree());

            }

            retval.tree = root_0;
            }

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:188:24: ( AND e2= expr_comp -> ^( AND $expr_et $e2) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==AND) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:188:25: AND e2= expr_comp
            	    {
            	    AND78=(Token)match(input,AND,FOLLOW_AND_in_expr_et1187);  
            	    stream_AND.add(AND78);

            	    pushFollow(FOLLOW_expr_comp_in_expr_et1191);
            	    e2=expr_comp();

            	    state._fsp--;

            	    stream_expr_comp.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: expr_et, AND, e2
            	    // token labels: 
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 188:42: -> ^( AND $expr_et $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:188:45: ^( AND $expr_et $e2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_e2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_et"

    public static class expr_comp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_comp"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:191:1: expr_comp : (e1= expr_plus -> $e1) ( LT e2= expr_plus -> ^( LT $expr_comp $e2) | LE e2= expr_plus -> ^( LE $expr_comp $e2) | GT e2= expr_plus -> ^( GT $expr_comp $e2) | GE e2= expr_plus -> ^( GE $expr_comp $e2) | EQ e2= expr_plus -> ^( EQ $expr_comp $e2) | NE e2= expr_plus -> ^( NE $expr_comp $e2) )* ;
    public final mini_rustParser.expr_comp_return expr_comp() throws RecognitionException {
        mini_rustParser.expr_comp_return retval = new mini_rustParser.expr_comp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LT79=null;
        Token LE80=null;
        Token GT81=null;
        Token GE82=null;
        Token EQ83=null;
        Token NE84=null;
        mini_rustParser.expr_plus_return e1 = null;

        mini_rustParser.expr_plus_return e2 = null;


        Object LT79_tree=null;
        Object LE80_tree=null;
        Object GT81_tree=null;
        Object GE82_tree=null;
        Object EQ83_tree=null;
        Object NE84_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_GE=new RewriteRuleTokenStream(adaptor,"token GE");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_LE=new RewriteRuleTokenStream(adaptor,"token LE");
        RewriteRuleTokenStream stream_NE=new RewriteRuleTokenStream(adaptor,"token NE");
        RewriteRuleSubtreeStream stream_expr_plus=new RewriteRuleSubtreeStream(adaptor,"rule expr_plus");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:192:2: ( (e1= expr_plus -> $e1) ( LT e2= expr_plus -> ^( LT $expr_comp $e2) | LE e2= expr_plus -> ^( LE $expr_comp $e2) | GT e2= expr_plus -> ^( GT $expr_comp $e2) | GE e2= expr_plus -> ^( GE $expr_comp $e2) | EQ e2= expr_plus -> ^( EQ $expr_comp $e2) | NE e2= expr_plus -> ^( NE $expr_comp $e2) )* )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:193:2: (e1= expr_plus -> $e1) ( LT e2= expr_plus -> ^( LT $expr_comp $e2) | LE e2= expr_plus -> ^( LE $expr_comp $e2) | GT e2= expr_plus -> ^( GT $expr_comp $e2) | GE e2= expr_plus -> ^( GE $expr_comp $e2) | EQ e2= expr_plus -> ^( EQ $expr_comp $e2) | NE e2= expr_plus -> ^( NE $expr_comp $e2) )*
            {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:193:2: (e1= expr_plus -> $e1)
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:193:3: e1= expr_plus
            {
            pushFollow(FOLLOW_expr_plus_in_expr_comp1222);
            e1=expr_plus();

            state._fsp--;

            stream_expr_plus.add(e1.getTree());


            // AST REWRITE
            // elements: e1
            // token labels: 
            // rule labels: retval, e1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 193:18: -> $e1
            {
                adaptor.addChild(root_0, stream_e1.nextTree());

            }

            retval.tree = root_0;
            }

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:194:2: ( LT e2= expr_plus -> ^( LT $expr_comp $e2) | LE e2= expr_plus -> ^( LE $expr_comp $e2) | GT e2= expr_plus -> ^( GT $expr_comp $e2) | GE e2= expr_plus -> ^( GE $expr_comp $e2) | EQ e2= expr_plus -> ^( EQ $expr_comp $e2) | NE e2= expr_plus -> ^( NE $expr_comp $e2) )*
            loop25:
            do {
                int alt25=7;
                switch ( input.LA(1) ) {
                case LT:
                    {
                    alt25=1;
                    }
                    break;
                case LE:
                    {
                    alt25=2;
                    }
                    break;
                case GT:
                    {
                    alt25=3;
                    }
                    break;
                case GE:
                    {
                    alt25=4;
                    }
                    break;
                case EQ:
                    {
                    alt25=5;
                    }
                    break;
                case NE:
                    {
                    alt25=6;
                    }
                    break;

                }

                switch (alt25) {
            	case 1 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:195:5: LT e2= expr_plus
            	    {
            	    LT79=(Token)match(input,LT,FOLLOW_LT_in_expr_comp1237);  
            	    stream_LT.add(LT79);

            	    pushFollow(FOLLOW_expr_plus_in_expr_comp1241);
            	    e2=expr_plus();

            	    state._fsp--;

            	    stream_expr_plus.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: e2, LT, expr_comp
            	    // token labels: 
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 195:21: -> ^( LT $expr_comp $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:195:24: ^( LT $expr_comp $e2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_LT.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_e2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 2 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:196:5: LE e2= expr_plus
            	    {
            	    LE80=(Token)match(input,LE,FOLLOW_LE_in_expr_comp1259);  
            	    stream_LE.add(LE80);

            	    pushFollow(FOLLOW_expr_plus_in_expr_comp1263);
            	    e2=expr_plus();

            	    state._fsp--;

            	    stream_expr_plus.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: e2, LE, expr_comp
            	    // token labels: 
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 196:21: -> ^( LE $expr_comp $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:196:24: ^( LE $expr_comp $e2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_LE.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_e2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 3 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:197:5: GT e2= expr_plus
            	    {
            	    GT81=(Token)match(input,GT,FOLLOW_GT_in_expr_comp1281);  
            	    stream_GT.add(GT81);

            	    pushFollow(FOLLOW_expr_plus_in_expr_comp1285);
            	    e2=expr_plus();

            	    state._fsp--;

            	    stream_expr_plus.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: GT, expr_comp, e2
            	    // token labels: 
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 197:21: -> ^( GT $expr_comp $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:197:24: ^( GT $expr_comp $e2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_GT.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_e2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 4 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:198:5: GE e2= expr_plus
            	    {
            	    GE82=(Token)match(input,GE,FOLLOW_GE_in_expr_comp1303);  
            	    stream_GE.add(GE82);

            	    pushFollow(FOLLOW_expr_plus_in_expr_comp1307);
            	    e2=expr_plus();

            	    state._fsp--;

            	    stream_expr_plus.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: expr_comp, e2, GE
            	    // token labels: 
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 198:21: -> ^( GE $expr_comp $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:198:24: ^( GE $expr_comp $e2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_GE.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_e2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 5 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:199:5: EQ e2= expr_plus
            	    {
            	    EQ83=(Token)match(input,EQ,FOLLOW_EQ_in_expr_comp1325);  
            	    stream_EQ.add(EQ83);

            	    pushFollow(FOLLOW_expr_plus_in_expr_comp1329);
            	    e2=expr_plus();

            	    state._fsp--;

            	    stream_expr_plus.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: expr_comp, EQ, e2
            	    // token labels: 
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 199:22: -> ^( EQ $expr_comp $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:199:25: ^( EQ $expr_comp $e2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_EQ.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_e2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 6 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:200:5: NE e2= expr_plus
            	    {
            	    NE84=(Token)match(input,NE,FOLLOW_NE_in_expr_comp1348);  
            	    stream_NE.add(NE84);

            	    pushFollow(FOLLOW_expr_plus_in_expr_comp1352);
            	    e2=expr_plus();

            	    state._fsp--;

            	    stream_expr_plus.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: NE, expr_comp, e2
            	    // token labels: 
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 200:22: -> ^( NE $expr_comp $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:200:25: ^( NE $expr_comp $e2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_NE.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_e2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_comp"

    public static class expr_plus_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_plus"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:204:1: expr_plus : (e1= expr_mult -> $e1) ( PLUS e2= expr_mult -> ^( PLUS $expr_plus $e2) | MINUS e2= expr_mult -> ^( MINUS $expr_plus $e2) )* ;
    public final mini_rustParser.expr_plus_return expr_plus() throws RecognitionException {
        mini_rustParser.expr_plus_return retval = new mini_rustParser.expr_plus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS85=null;
        Token MINUS86=null;
        mini_rustParser.expr_mult_return e1 = null;

        mini_rustParser.expr_mult_return e2 = null;


        Object PLUS85_tree=null;
        Object MINUS86_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_expr_mult=new RewriteRuleSubtreeStream(adaptor,"rule expr_mult");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:205:2: ( (e1= expr_mult -> $e1) ( PLUS e2= expr_mult -> ^( PLUS $expr_plus $e2) | MINUS e2= expr_mult -> ^( MINUS $expr_plus $e2) )* )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:206:2: (e1= expr_mult -> $e1) ( PLUS e2= expr_mult -> ^( PLUS $expr_plus $e2) | MINUS e2= expr_mult -> ^( MINUS $expr_plus $e2) )*
            {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:206:2: (e1= expr_mult -> $e1)
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:206:3: e1= expr_mult
            {
            pushFollow(FOLLOW_expr_mult_in_expr_plus1384);
            e1=expr_mult();

            state._fsp--;

            stream_expr_mult.add(e1.getTree());


            // AST REWRITE
            // elements: e1
            // token labels: 
            // rule labels: retval, e1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 206:16: -> $e1
            {
                adaptor.addChild(root_0, stream_e1.nextTree());

            }

            retval.tree = root_0;
            }

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:207:2: ( PLUS e2= expr_mult -> ^( PLUS $expr_plus $e2) | MINUS e2= expr_mult -> ^( MINUS $expr_plus $e2) )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==PLUS) ) {
                    alt26=1;
                }
                else if ( (LA26_0==MINUS) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:208:8: PLUS e2= expr_mult
            	    {
            	    PLUS85=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_plus1402);  
            	    stream_PLUS.add(PLUS85);

            	    pushFollow(FOLLOW_expr_mult_in_expr_plus1406);
            	    e2=expr_mult();

            	    state._fsp--;

            	    stream_expr_mult.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: expr_plus, PLUS, e2
            	    // token labels: 
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 208:26: -> ^( PLUS $expr_plus $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:208:29: ^( PLUS $expr_plus $e2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_PLUS.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_e2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 2 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:209:8: MINUS e2= expr_mult
            	    {
            	    MINUS86=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_plus1427);  
            	    stream_MINUS.add(MINUS86);

            	    pushFollow(FOLLOW_expr_mult_in_expr_plus1431);
            	    e2=expr_mult();

            	    state._fsp--;

            	    stream_expr_mult.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: expr_plus, MINUS, e2
            	    // token labels: 
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 209:27: -> ^( MINUS $expr_plus $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:209:30: ^( MINUS $expr_plus $e2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_MINUS.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_e2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_plus"

    public static class expr_mult_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_mult"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:213:1: expr_mult : (e1= expr_unaire -> $e1) ( STAR e2= expr_unaire -> ^( MUL $expr_mult $e2) | DIV e2= expr_unaire -> ^( DIV $expr_mult $e2) )* ;
    public final mini_rustParser.expr_mult_return expr_mult() throws RecognitionException {
        mini_rustParser.expr_mult_return retval = new mini_rustParser.expr_mult_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STAR87=null;
        Token DIV88=null;
        mini_rustParser.expr_unaire_return e1 = null;

        mini_rustParser.expr_unaire_return e2 = null;


        Object STAR87_tree=null;
        Object DIV88_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_DIV=new RewriteRuleTokenStream(adaptor,"token DIV");
        RewriteRuleSubtreeStream stream_expr_unaire=new RewriteRuleSubtreeStream(adaptor,"rule expr_unaire");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:214:2: ( (e1= expr_unaire -> $e1) ( STAR e2= expr_unaire -> ^( MUL $expr_mult $e2) | DIV e2= expr_unaire -> ^( DIV $expr_mult $e2) )* )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:215:2: (e1= expr_unaire -> $e1) ( STAR e2= expr_unaire -> ^( MUL $expr_mult $e2) | DIV e2= expr_unaire -> ^( DIV $expr_mult $e2) )*
            {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:215:2: (e1= expr_unaire -> $e1)
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:215:3: e1= expr_unaire
            {
            pushFollow(FOLLOW_expr_unaire_in_expr_mult1462);
            e1=expr_unaire();

            state._fsp--;

            stream_expr_unaire.add(e1.getTree());


            // AST REWRITE
            // elements: e1
            // token labels: 
            // rule labels: retval, e1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 215:18: -> $e1
            {
                adaptor.addChild(root_0, stream_e1.nextTree());

            }

            retval.tree = root_0;
            }

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:216:2: ( STAR e2= expr_unaire -> ^( MUL $expr_mult $e2) | DIV e2= expr_unaire -> ^( DIV $expr_mult $e2) )*
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==STAR) ) {
                    alt27=1;
                }
                else if ( (LA27_0==DIV) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:217:5: STAR e2= expr_unaire
            	    {
            	    STAR87=(Token)match(input,STAR,FOLLOW_STAR_in_expr_mult1477);  
            	    stream_STAR.add(STAR87);

            	    pushFollow(FOLLOW_expr_unaire_in_expr_mult1481);
            	    e2=expr_unaire();

            	    state._fsp--;

            	    stream_expr_unaire.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: expr_mult, e2
            	    // token labels: 
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 217:25: -> ^( MUL $expr_mult $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:217:28: ^( MUL $expr_mult $e2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MUL, "MUL"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_e2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 2 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:218:5: DIV e2= expr_unaire
            	    {
            	    DIV88=(Token)match(input,DIV,FOLLOW_DIV_in_expr_mult1499);  
            	    stream_DIV.add(DIV88);

            	    pushFollow(FOLLOW_expr_unaire_in_expr_mult1503);
            	    e2=expr_unaire();

            	    state._fsp--;

            	    stream_expr_unaire.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: DIV, e2, expr_mult
            	    // token labels: 
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 218:24: -> ^( DIV $expr_mult $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:218:27: ^( DIV $expr_mult $e2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_DIV.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_e2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_mult"

    public static class expr_unaire_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_unaire"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:222:1: expr_unaire : ( MINUS expr_unaire -> ^( UNARY_MINUS expr_unaire ) | ( EXCL expr_unaire -> ^( NEG expr_unaire ) | STAR expr_unaire -> ^( POINTER expr_unaire ) | AMPS expr_unaire -> ^( REF expr_unaire ) ) | (a= atom -> $a) ( LSQBRACKET expr RSQBRACKET -> ^( INDEX $expr_unaire expr ) | DOT dot_factorisation -> ^( DOT $expr_unaire dot_factorisation ) )* );
    public final mini_rustParser.expr_unaire_return expr_unaire() throws RecognitionException {
        mini_rustParser.expr_unaire_return retval = new mini_rustParser.expr_unaire_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MINUS89=null;
        Token EXCL91=null;
        Token STAR93=null;
        Token AMPS95=null;
        Token LSQBRACKET97=null;
        Token RSQBRACKET99=null;
        Token DOT100=null;
        mini_rustParser.atom_return a = null;

        mini_rustParser.expr_unaire_return expr_unaire90 = null;

        mini_rustParser.expr_unaire_return expr_unaire92 = null;

        mini_rustParser.expr_unaire_return expr_unaire94 = null;

        mini_rustParser.expr_unaire_return expr_unaire96 = null;

        mini_rustParser.expr_return expr98 = null;

        mini_rustParser.dot_factorisation_return dot_factorisation101 = null;


        Object MINUS89_tree=null;
        Object EXCL91_tree=null;
        Object STAR93_tree=null;
        Object AMPS95_tree=null;
        Object LSQBRACKET97_tree=null;
        Object RSQBRACKET99_tree=null;
        Object DOT100_tree=null;
        RewriteRuleTokenStream stream_RSQBRACKET=new RewriteRuleTokenStream(adaptor,"token RSQBRACKET");
        RewriteRuleTokenStream stream_LSQBRACKET=new RewriteRuleTokenStream(adaptor,"token LSQBRACKET");
        RewriteRuleTokenStream stream_EXCL=new RewriteRuleTokenStream(adaptor,"token EXCL");
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_AMPS=new RewriteRuleTokenStream(adaptor,"token AMPS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_dot_factorisation=new RewriteRuleSubtreeStream(adaptor,"rule dot_factorisation");
        RewriteRuleSubtreeStream stream_expr_unaire=new RewriteRuleSubtreeStream(adaptor,"rule expr_unaire");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:223:2: ( MINUS expr_unaire -> ^( UNARY_MINUS expr_unaire ) | ( EXCL expr_unaire -> ^( NEG expr_unaire ) | STAR expr_unaire -> ^( POINTER expr_unaire ) | AMPS expr_unaire -> ^( REF expr_unaire ) ) | (a= atom -> $a) ( LSQBRACKET expr RSQBRACKET -> ^( INDEX $expr_unaire expr ) | DOT dot_factorisation -> ^( DOT $expr_unaire dot_factorisation ) )* )
            int alt30=3;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                alt30=1;
                }
                break;
            case STAR:
            case EXCL:
            case AMPS:
                {
                alt30=2;
                }
                break;
            case LPAREN:
            case VEC_MACRO:
            case PRINT_MACRO:
            case TRUE:
            case FALSE:
            case IDF:
            case CSTE_ENT:
            case CSTE_STR:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:224:4: MINUS expr_unaire
                    {
                    MINUS89=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_unaire1533);  
                    stream_MINUS.add(MINUS89);

                    pushFollow(FOLLOW_expr_unaire_in_expr_unaire1535);
                    expr_unaire90=expr_unaire();

                    state._fsp--;

                    stream_expr_unaire.add(expr_unaire90.getTree());


                    // AST REWRITE
                    // elements: expr_unaire
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 224:22: -> ^( UNARY_MINUS expr_unaire )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:224:25: ^( UNARY_MINUS expr_unaire )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);

                        adaptor.addChild(root_1, stream_expr_unaire.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:225:4: ( EXCL expr_unaire -> ^( NEG expr_unaire ) | STAR expr_unaire -> ^( POINTER expr_unaire ) | AMPS expr_unaire -> ^( REF expr_unaire ) )
                    {
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:225:4: ( EXCL expr_unaire -> ^( NEG expr_unaire ) | STAR expr_unaire -> ^( POINTER expr_unaire ) | AMPS expr_unaire -> ^( REF expr_unaire ) )
                    int alt28=3;
                    switch ( input.LA(1) ) {
                    case EXCL:
                        {
                        alt28=1;
                        }
                        break;
                    case STAR:
                        {
                        alt28=2;
                        }
                        break;
                    case AMPS:
                        {
                        alt28=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }

                    switch (alt28) {
                        case 1 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:226:8: EXCL expr_unaire
                            {
                            EXCL91=(Token)match(input,EXCL,FOLLOW_EXCL_in_expr_unaire1557);  
                            stream_EXCL.add(EXCL91);

                            pushFollow(FOLLOW_expr_unaire_in_expr_unaire1559);
                            expr_unaire92=expr_unaire();

                            state._fsp--;

                            stream_expr_unaire.add(expr_unaire92.getTree());


                            // AST REWRITE
                            // elements: expr_unaire
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 226:25: -> ^( NEG expr_unaire )
                            {
                                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:226:28: ^( NEG expr_unaire )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEG, "NEG"), root_1);

                                adaptor.addChild(root_1, stream_expr_unaire.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:227:8: STAR expr_unaire
                            {
                            STAR93=(Token)match(input,STAR,FOLLOW_STAR_in_expr_unaire1576);  
                            stream_STAR.add(STAR93);

                            pushFollow(FOLLOW_expr_unaire_in_expr_unaire1578);
                            expr_unaire94=expr_unaire();

                            state._fsp--;

                            stream_expr_unaire.add(expr_unaire94.getTree());


                            // AST REWRITE
                            // elements: expr_unaire
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 227:25: -> ^( POINTER expr_unaire )
                            {
                                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:227:28: ^( POINTER expr_unaire )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(POINTER, "POINTER"), root_1);

                                adaptor.addChild(root_1, stream_expr_unaire.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 3 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:228:8: AMPS expr_unaire
                            {
                            AMPS95=(Token)match(input,AMPS,FOLLOW_AMPS_in_expr_unaire1595);  
                            stream_AMPS.add(AMPS95);

                            pushFollow(FOLLOW_expr_unaire_in_expr_unaire1597);
                            expr_unaire96=expr_unaire();

                            state._fsp--;

                            stream_expr_unaire.add(expr_unaire96.getTree());


                            // AST REWRITE
                            // elements: expr_unaire
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 228:25: -> ^( REF expr_unaire )
                            {
                                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:228:28: ^( REF expr_unaire )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(REF, "REF"), root_1);

                                adaptor.addChild(root_1, stream_expr_unaire.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:230:4: (a= atom -> $a) ( LSQBRACKET expr RSQBRACKET -> ^( INDEX $expr_unaire expr ) | DOT dot_factorisation -> ^( DOT $expr_unaire dot_factorisation ) )*
                    {
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:230:4: (a= atom -> $a)
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:230:5: a= atom
                    {
                    pushFollow(FOLLOW_atom_in_expr_unaire1618);
                    a=atom();

                    state._fsp--;

                    stream_atom.add(a.getTree());


                    // AST REWRITE
                    // elements: a
                    // token labels: 
                    // rule labels: retval, a
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 230:12: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;
                    }

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:231:4: ( LSQBRACKET expr RSQBRACKET -> ^( INDEX $expr_unaire expr ) | DOT dot_factorisation -> ^( DOT $expr_unaire dot_factorisation ) )*
                    loop29:
                    do {
                        int alt29=3;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==LSQBRACKET) ) {
                            alt29=1;
                        }
                        else if ( (LA29_0==DOT) ) {
                            alt29=2;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:232:7: LSQBRACKET expr RSQBRACKET
                    	    {
                    	    LSQBRACKET97=(Token)match(input,LSQBRACKET,FOLLOW_LSQBRACKET_in_expr_unaire1637);  
                    	    stream_LSQBRACKET.add(LSQBRACKET97);

                    	    pushFollow(FOLLOW_expr_in_expr_unaire1639);
                    	    expr98=expr();

                    	    state._fsp--;

                    	    stream_expr.add(expr98.getTree());
                    	    RSQBRACKET99=(Token)match(input,RSQBRACKET,FOLLOW_RSQBRACKET_in_expr_unaire1641);  
                    	    stream_RSQBRACKET.add(RSQBRACKET99);



                    	    // AST REWRITE
                    	    // elements: expr, expr_unaire
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 232:34: -> ^( INDEX $expr_unaire expr )
                    	    {
                    	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:232:37: ^( INDEX $expr_unaire expr )
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INDEX, "INDEX"), root_1);

                    	        adaptor.addChild(root_1, stream_retval.nextTree());
                    	        adaptor.addChild(root_1, stream_expr.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }

                    	    retval.tree = root_0;
                    	    }
                    	    break;
                    	case 2 :
                    	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:233:7: DOT dot_factorisation
                    	    {
                    	    DOT100=(Token)match(input,DOT,FOLLOW_DOT_in_expr_unaire1660);  
                    	    stream_DOT.add(DOT100);

                    	    pushFollow(FOLLOW_dot_factorisation_in_expr_unaire1662);
                    	    dot_factorisation101=dot_factorisation();

                    	    state._fsp--;

                    	    stream_dot_factorisation.add(dot_factorisation101.getTree());


                    	    // AST REWRITE
                    	    // elements: expr_unaire, DOT, dot_factorisation
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 233:29: -> ^( DOT $expr_unaire dot_factorisation )
                    	    {
                    	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:233:32: ^( DOT $expr_unaire dot_factorisation )
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        root_1 = (Object)adaptor.becomeRoot(stream_DOT.nextNode(), root_1);

                    	        adaptor.addChild(root_1, stream_retval.nextTree());
                    	        adaptor.addChild(root_1, stream_dot_factorisation.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }

                    	    retval.tree = root_0;
                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_unaire"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:237:1: atom : ( CSTE_ENT | CSTE_STR | TRUE | FALSE | IDF ( -> IDF | LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( FUNCTION_CALL IDF ( expr )* ) ) | LPAREN expr RPAREN -> expr | VEC_MACRO EXCL LSQBRACKET (e+= expr ( COMMA e+= expr )* )? RSQBRACKET -> ^( VEC_MACRO ( $e)* ) | PRINT_MACRO EXCL LPAREN expr RPAREN -> ^( PRINT_MACRO expr ) );
    public final mini_rustParser.atom_return atom() throws RecognitionException {
        mini_rustParser.atom_return retval = new mini_rustParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CSTE_ENT102=null;
        Token CSTE_STR103=null;
        Token TRUE104=null;
        Token FALSE105=null;
        Token IDF106=null;
        Token LPAREN107=null;
        Token COMMA109=null;
        Token RPAREN111=null;
        Token LPAREN112=null;
        Token RPAREN114=null;
        Token VEC_MACRO115=null;
        Token EXCL116=null;
        Token LSQBRACKET117=null;
        Token COMMA118=null;
        Token RSQBRACKET119=null;
        Token PRINT_MACRO120=null;
        Token EXCL121=null;
        Token LPAREN122=null;
        Token RPAREN124=null;
        List list_e=null;
        mini_rustParser.expr_return expr108 = null;

        mini_rustParser.expr_return expr110 = null;

        mini_rustParser.expr_return expr113 = null;

        mini_rustParser.expr_return expr123 = null;

        RuleReturnScope e = null;
        Object CSTE_ENT102_tree=null;
        Object CSTE_STR103_tree=null;
        Object TRUE104_tree=null;
        Object FALSE105_tree=null;
        Object IDF106_tree=null;
        Object LPAREN107_tree=null;
        Object COMMA109_tree=null;
        Object RPAREN111_tree=null;
        Object LPAREN112_tree=null;
        Object RPAREN114_tree=null;
        Object VEC_MACRO115_tree=null;
        Object EXCL116_tree=null;
        Object LSQBRACKET117_tree=null;
        Object COMMA118_tree=null;
        Object RSQBRACKET119_tree=null;
        Object PRINT_MACRO120_tree=null;
        Object EXCL121_tree=null;
        Object LPAREN122_tree=null;
        Object RPAREN124_tree=null;
        RewriteRuleTokenStream stream_RSQBRACKET=new RewriteRuleTokenStream(adaptor,"token RSQBRACKET");
        RewriteRuleTokenStream stream_PRINT_MACRO=new RewriteRuleTokenStream(adaptor,"token PRINT_MACRO");
        RewriteRuleTokenStream stream_VEC_MACRO=new RewriteRuleTokenStream(adaptor,"token VEC_MACRO");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LSQBRACKET=new RewriteRuleTokenStream(adaptor,"token LSQBRACKET");
        RewriteRuleTokenStream stream_EXCL=new RewriteRuleTokenStream(adaptor,"token EXCL");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:238:2: ( CSTE_ENT | CSTE_STR | TRUE | FALSE | IDF ( -> IDF | LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( FUNCTION_CALL IDF ( expr )* ) ) | LPAREN expr RPAREN -> expr | VEC_MACRO EXCL LSQBRACKET (e+= expr ( COMMA e+= expr )* )? RSQBRACKET -> ^( VEC_MACRO ( $e)* ) | PRINT_MACRO EXCL LPAREN expr RPAREN -> ^( PRINT_MACRO expr ) )
            int alt36=8;
            switch ( input.LA(1) ) {
            case CSTE_ENT:
                {
                alt36=1;
                }
                break;
            case CSTE_STR:
                {
                alt36=2;
                }
                break;
            case TRUE:
                {
                alt36=3;
                }
                break;
            case FALSE:
                {
                alt36=4;
                }
                break;
            case IDF:
                {
                alt36=5;
                }
                break;
            case LPAREN:
                {
                alt36=6;
                }
                break;
            case VEC_MACRO:
                {
                alt36=7;
                }
                break;
            case PRINT_MACRO:
                {
                alt36=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:239:4: CSTE_ENT
                    {
                    root_0 = (Object)adaptor.nil();

                    CSTE_ENT102=(Token)match(input,CSTE_ENT,FOLLOW_CSTE_ENT_in_atom1693); 
                    CSTE_ENT102_tree = (Object)adaptor.create(CSTE_ENT102);
                    adaptor.addChild(root_0, CSTE_ENT102_tree);


                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:240:4: CSTE_STR
                    {
                    root_0 = (Object)adaptor.nil();

                    CSTE_STR103=(Token)match(input,CSTE_STR,FOLLOW_CSTE_STR_in_atom1698); 
                    CSTE_STR103_tree = (Object)adaptor.create(CSTE_STR103);
                    adaptor.addChild(root_0, CSTE_STR103_tree);


                    }
                    break;
                case 3 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:241:4: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    TRUE104=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1703); 
                    TRUE104_tree = (Object)adaptor.create(TRUE104);
                    adaptor.addChild(root_0, TRUE104_tree);


                    }
                    break;
                case 4 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:242:4: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    FALSE105=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1708); 
                    FALSE105_tree = (Object)adaptor.create(FALSE105);
                    adaptor.addChild(root_0, FALSE105_tree);


                    }
                    break;
                case 5 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:243:4: IDF ( -> IDF | LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( FUNCTION_CALL IDF ( expr )* ) )
                    {
                    IDF106=(Token)match(input,IDF,FOLLOW_IDF_in_atom1713);  
                    stream_IDF.add(IDF106);

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:244:6: ( -> IDF | LPAREN ( expr ( COMMA expr )* )? RPAREN -> ^( FUNCTION_CALL IDF ( expr )* ) )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=RPAREN && LA33_0<=STAR)||(LA33_0>=ASSIGN && LA33_0<=DOT)||(LA33_0>=COMMA && LA33_0<=SEMICOLON)) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==LPAREN) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:245:12: 
                            {

                            // AST REWRITE
                            // elements: IDF
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 245:12: -> IDF
                            {
                                adaptor.addChild(root_0, stream_IDF.nextNode());

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:246:12: LPAREN ( expr ( COMMA expr )* )? RPAREN
                            {
                            LPAREN107=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom1748);  
                            stream_LPAREN.add(LPAREN107);

                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:246:19: ( expr ( COMMA expr )* )?
                            int alt32=2;
                            int LA32_0 = input.LA(1);

                            if ( (LA32_0==LPAREN||LA32_0==MINUS||(LA32_0>=STAR && LA32_0<=EXCL)||LA32_0==AMPS||(LA32_0>=VEC_MACRO && LA32_0<=PRINT_MACRO)||(LA32_0>=TRUE && LA32_0<=FALSE)||(LA32_0>=IDF && LA32_0<=CSTE_STR)) ) {
                                alt32=1;
                            }
                            switch (alt32) {
                                case 1 :
                                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:246:20: expr ( COMMA expr )*
                                    {
                                    pushFollow(FOLLOW_expr_in_atom1751);
                                    expr108=expr();

                                    state._fsp--;

                                    stream_expr.add(expr108.getTree());
                                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:246:25: ( COMMA expr )*
                                    loop31:
                                    do {
                                        int alt31=2;
                                        int LA31_0 = input.LA(1);

                                        if ( (LA31_0==COMMA) ) {
                                            alt31=1;
                                        }


                                        switch (alt31) {
                                    	case 1 :
                                    	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:246:26: COMMA expr
                                    	    {
                                    	    COMMA109=(Token)match(input,COMMA,FOLLOW_COMMA_in_atom1754);  
                                    	    stream_COMMA.add(COMMA109);

                                    	    pushFollow(FOLLOW_expr_in_atom1756);
                                    	    expr110=expr();

                                    	    state._fsp--;

                                    	    stream_expr.add(expr110.getTree());

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop31;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            RPAREN111=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom1762);  
                            stream_RPAREN.add(RPAREN111);



                            // AST REWRITE
                            // elements: IDF, expr
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 246:48: -> ^( FUNCTION_CALL IDF ( expr )* )
                            {
                                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:246:51: ^( FUNCTION_CALL IDF ( expr )* )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL"), root_1);

                                adaptor.addChild(root_1, stream_IDF.nextNode());
                                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:246:71: ( expr )*
                                while ( stream_expr.hasNext() ) {
                                    adaptor.addChild(root_1, stream_expr.nextTree());

                                }
                                stream_expr.reset();

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:248:4: LPAREN expr RPAREN
                    {
                    LPAREN112=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom1785);  
                    stream_LPAREN.add(LPAREN112);

                    pushFollow(FOLLOW_expr_in_atom1787);
                    expr113=expr();

                    state._fsp--;

                    stream_expr.add(expr113.getTree());
                    RPAREN114=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom1789);  
                    stream_RPAREN.add(RPAREN114);



                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 248:23: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:249:4: VEC_MACRO EXCL LSQBRACKET (e+= expr ( COMMA e+= expr )* )? RSQBRACKET
                    {
                    VEC_MACRO115=(Token)match(input,VEC_MACRO,FOLLOW_VEC_MACRO_in_atom1798);  
                    stream_VEC_MACRO.add(VEC_MACRO115);

                    EXCL116=(Token)match(input,EXCL,FOLLOW_EXCL_in_atom1800);  
                    stream_EXCL.add(EXCL116);

                    LSQBRACKET117=(Token)match(input,LSQBRACKET,FOLLOW_LSQBRACKET_in_atom1802);  
                    stream_LSQBRACKET.add(LSQBRACKET117);

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:249:30: (e+= expr ( COMMA e+= expr )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==LPAREN||LA35_0==MINUS||(LA35_0>=STAR && LA35_0<=EXCL)||LA35_0==AMPS||(LA35_0>=VEC_MACRO && LA35_0<=PRINT_MACRO)||(LA35_0>=TRUE && LA35_0<=FALSE)||(LA35_0>=IDF && LA35_0<=CSTE_STR)) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:249:31: e+= expr ( COMMA e+= expr )*
                            {
                            pushFollow(FOLLOW_expr_in_atom1807);
                            e=expr();

                            state._fsp--;

                            stream_expr.add(e.getTree());
                            if (list_e==null) list_e=new ArrayList();
                            list_e.add(e.getTree());

                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:249:39: ( COMMA e+= expr )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==COMMA) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:249:40: COMMA e+= expr
                            	    {
                            	    COMMA118=(Token)match(input,COMMA,FOLLOW_COMMA_in_atom1810);  
                            	    stream_COMMA.add(COMMA118);

                            	    pushFollow(FOLLOW_expr_in_atom1814);
                            	    e=expr();

                            	    state._fsp--;

                            	    stream_expr.add(e.getTree());
                            	    if (list_e==null) list_e=new ArrayList();
                            	    list_e.add(e.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop34;
                                }
                            } while (true);


                            }
                            break;

                    }

                    RSQBRACKET119=(Token)match(input,RSQBRACKET,FOLLOW_RSQBRACKET_in_atom1820);  
                    stream_RSQBRACKET.add(RSQBRACKET119);



                    // AST REWRITE
                    // elements: VEC_MACRO, e
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: e
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"token e",list_e);
                    root_0 = (Object)adaptor.nil();
                    // 249:69: -> ^( VEC_MACRO ( $e)* )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:249:72: ^( VEC_MACRO ( $e)* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_VEC_MACRO.nextNode(), root_1);

                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:249:84: ( $e)*
                        while ( stream_e.hasNext() ) {
                            adaptor.addChild(root_1, stream_e.nextTree());

                        }
                        stream_e.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:250:4: PRINT_MACRO EXCL LPAREN expr RPAREN
                    {
                    PRINT_MACRO120=(Token)match(input,PRINT_MACRO,FOLLOW_PRINT_MACRO_in_atom1837);  
                    stream_PRINT_MACRO.add(PRINT_MACRO120);

                    EXCL121=(Token)match(input,EXCL,FOLLOW_EXCL_in_atom1839);  
                    stream_EXCL.add(EXCL121);

                    LPAREN122=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom1841);  
                    stream_LPAREN.add(LPAREN122);

                    pushFollow(FOLLOW_expr_in_atom1843);
                    expr123=expr();

                    state._fsp--;

                    stream_expr.add(expr123.getTree());
                    RPAREN124=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom1845);  
                    stream_RPAREN.add(RPAREN124);



                    // AST REWRITE
                    // elements: PRINT_MACRO, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 250:40: -> ^( PRINT_MACRO expr )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\grammar\\mini_rust.g:250:43: ^( PRINT_MACRO expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PRINT_MACRO.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_decl_in_fichier469 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_decl_func_in_decl494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_struct_in_decl499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FN_in_decl_func511 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDF_in_decl_func513 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_decl_func515 = new BitSet(new long[]{0x4000000000200000L});
    public static final BitSet FOLLOW_argument_in_decl_func518 = new BitSet(new long[]{0x0400000000200000L});
    public static final BitSet FOLLOW_COMMA_in_decl_func521 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_argument_in_decl_func523 = new BitSet(new long[]{0x0400000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_decl_func529 = new BitSet(new long[]{0x2000000000400000L});
    public static final BitSet FOLLOW_ARROW_in_decl_func532 = new BitSet(new long[]{0x40E0020000000000L});
    public static final BitSet FOLLOW_type_in_decl_func534 = new BitSet(new long[]{0x2000000000400000L});
    public static final BitSet FOLLOW_bloc_in_decl_func538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUCT_in_decl_struct570 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDF_in_decl_struct574 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LBRACKET_in_decl_struct576 = new BitSet(new long[]{0x4000000000800000L});
    public static final BitSet FOLLOW_IDF_in_decl_struct581 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_COLON_in_decl_struct583 = new BitSet(new long[]{0x40E0020000000000L});
    public static final BitSet FOLLOW_type_in_decl_struct587 = new BitSet(new long[]{0x0400000000800000L});
    public static final BitSet FOLLOW_COMMA_in_decl_struct590 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDF_in_decl_struct594 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_COLON_in_decl_struct596 = new BitSet(new long[]{0x40E0020000000000L});
    public static final BitSet FOLLOW_type_in_decl_struct600 = new BitSet(new long[]{0x0400000000800000L});
    public static final BitSet FOLLOW_RBRACKET_in_decl_struct606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_type640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEC_TYPE_in_type645 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LT_in_type647 = new BitSet(new long[]{0x40E0020000000000L});
    public static final BitSet FOLLOW_type_in_type649 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_GT_in_type651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPS_in_type664 = new BitSet(new long[]{0x40E0020000000000L});
    public static final BitSet FOLLOW_type_in_type666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT32_TYPE_in_type671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_TYPE_in_type676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_argument688 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_COLON_in_argument690 = new BitSet(new long[]{0x40E0020000000000L});
    public static final BitSet FOLLOW_type_in_argument692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_bloc714 = new BitSet(new long[]{0xEB1D8A6800D00000L,0x0000000000000001L});
    public static final BitSet FOLLOW_instruction_bloc_in_bloc716 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACKET_in_bloc718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_instruction_bloc741 = new BitSet(new long[]{0xEB1D8A6800500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_instruction_bloc_in_instruction_bloc743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_instruction_bloc749 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_instruction_bloc754 = new BitSet(new long[]{0xEB1D8A6800500000L,0x0000000000000001L});
    public static final BitSet FOLLOW_instruction_bloc_in_instruction_bloc756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LET_in_instruction780 = new BitSet(new long[]{0xC318126800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_instruction_let_in_instruction782 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_instruction784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_instruction793 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_instruction795 = new BitSet(new long[]{0x2000000000400000L});
    public static final BitSet FOLLOW_bloc_in_instruction797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_instruction812 = new BitSet(new long[]{0xCB18026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_instruction815 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_instruction819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_instruction833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bloc_in_instruction838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUT_in_instruction_let852 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_instruction_let854 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_instruction_let857 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_obj_expr_in_instruction_let859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_instruction_let879 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_instruction_let882 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_obj_expr_in_instruction_let884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_obj_def911 = new BitSet(new long[]{0x4000000000800000L});
    public static final BitSet FOLLOW_IDF_in_obj_def916 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_COLON_in_obj_def918 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_obj_expr_in_obj_def922 = new BitSet(new long[]{0x0400000000800000L});
    public static final BitSet FOLLOW_COMMA_in_obj_def925 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDF_in_obj_def929 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_COLON_in_obj_def931 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_obj_expr_in_obj_def935 = new BitSet(new long[]{0x0400000000800000L});
    public static final BitSet FOLLOW_RBRACKET_in_obj_def941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_obj_expr968 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_obj_def_in_obj_expr991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_expr1018 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_if_expr1020 = new BitSet(new long[]{0x2000000000400000L});
    public static final BitSet FOLLOW_bloc_in_if_expr1022 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_else_expr_in_if_expr1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_expr1054 = new BitSet(new long[]{0x2001000000400000L});
    public static final BitSet FOLLOW_bloc_in_else_expr1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_else_expr1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_ou_in_expr1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_dot_factorisation1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEN_in_dot_factorisation1113 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_dot_factorisation1115 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_dot_factorisation1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_et_in_expr_ou1136 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_OR_in_expr_ou1145 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_et_in_expr_ou1149 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_expr_comp_in_expr_et1178 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_AND_in_expr_et1187 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_comp_in_expr_et1191 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_expr_plus_in_expr_comp1222 = new BitSet(new long[]{0x00000000FC000002L});
    public static final BitSet FOLLOW_LT_in_expr_comp1237 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_plus_in_expr_comp1241 = new BitSet(new long[]{0x00000000FC000002L});
    public static final BitSet FOLLOW_LE_in_expr_comp1259 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_plus_in_expr_comp1263 = new BitSet(new long[]{0x00000000FC000002L});
    public static final BitSet FOLLOW_GT_in_expr_comp1281 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_plus_in_expr_comp1285 = new BitSet(new long[]{0x00000000FC000002L});
    public static final BitSet FOLLOW_GE_in_expr_comp1303 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_plus_in_expr_comp1307 = new BitSet(new long[]{0x00000000FC000002L});
    public static final BitSet FOLLOW_EQ_in_expr_comp1325 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_plus_in_expr_comp1329 = new BitSet(new long[]{0x00000000FC000002L});
    public static final BitSet FOLLOW_NE_in_expr_comp1348 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_plus_in_expr_comp1352 = new BitSet(new long[]{0x00000000FC000002L});
    public static final BitSet FOLLOW_expr_mult_in_expr_plus1384 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_PLUS_in_expr_plus1402 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_mult_in_expr_plus1406 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_MINUS_in_expr_plus1427 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_mult_in_expr_plus1431 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_expr_unaire_in_expr_mult1462 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_STAR_in_expr_mult1477 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_unaire_in_expr_mult1481 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_DIV_in_expr_mult1499 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_unaire_in_expr_mult1503 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_MINUS_in_expr_unaire1533 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_unaire_in_expr_unaire1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCL_in_expr_unaire1557 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_unaire_in_expr_unaire1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_expr_unaire1576 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_unaire_in_expr_unaire1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPS_in_expr_unaire1595 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_unaire_in_expr_unaire1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_expr_unaire1618 = new BitSet(new long[]{0x0000010001000002L});
    public static final BitSet FOLLOW_LSQBRACKET_in_expr_unaire1637 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_expr_unaire1639 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RSQBRACKET_in_expr_unaire1641 = new BitSet(new long[]{0x0000010001000002L});
    public static final BitSet FOLLOW_DOT_in_expr_unaire1660 = new BitSet(new long[]{0x4000040000000000L});
    public static final BitSet FOLLOW_dot_factorisation_in_expr_unaire1662 = new BitSet(new long[]{0x0000010001000002L});
    public static final BitSet FOLLOW_CSTE_ENT_in_atom1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTE_STR_in_atom1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_atom1713 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_LPAREN_in_atom1748 = new BitSet(new long[]{0xC318026800300000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_atom1751 = new BitSet(new long[]{0x0400000000200000L});
    public static final BitSet FOLLOW_COMMA_in_atom1754 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_atom1756 = new BitSet(new long[]{0x0400000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_atom1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom1785 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_atom1787 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_atom1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEC_MACRO_in_atom1798 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EXCL_in_atom1800 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LSQBRACKET_in_atom1802 = new BitSet(new long[]{0xC318026802100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_atom1807 = new BitSet(new long[]{0x0400000002000000L});
    public static final BitSet FOLLOW_COMMA_in_atom1810 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_atom1814 = new BitSet(new long[]{0x0400000002000000L});
    public static final BitSet FOLLOW_RSQBRACKET_in_atom1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_MACRO_in_atom1837 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EXCL_in_atom1839 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_atom1841 = new BitSet(new long[]{0xC318026800100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_atom1843 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_atom1845 = new BitSet(new long[]{0x0000000000000002L});

}