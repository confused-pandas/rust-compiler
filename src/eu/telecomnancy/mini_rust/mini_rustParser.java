// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g 2018-04-02 11:47:36

	package eu.telecomnancy.mini_rust;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class mini_rustParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FICHIER", "DECL_FUNC", "DECL_STRUCT", "TYPE", "ARGUMENTS", "ARGUMENT", "BLOC", "FUNC_CALL", "CSTE_ENT", "INDEX", "FUNCTION_CALL", "PARAMS", "MOINS_UNITAIRE", "OBJ", "MEMBER", "LETMUT", "MUL", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "LSQBRACKET", "RSQBRACKET", "GT", "GE", "LT", "LE", "EQ", "NE", "AND", "OR", "PLUS", "MINUS", "DIV", "STAR", "EXCL", "ASSIGN", "DOT", "AMPS", "LEN", "LET", "MUT", "FN", "STRUCT", "WHILE", "IF", "ELSE", "RETURN", "VEC_MACRO", "PRINT_MACRO", "VEC_TYPE", "INT32_TYPE", "BOOL_TYPE", "TRUE", "FALSE", "COMMA", "SEMICOLON", "COLON", "ARROW", "IDF", "CSTE_STR", "LOWERCASE", "UPPERCASE", "DIGIT", "COMMENTS", "WS"
    };
    public static final int LSQBRACKET=25;
    public static final int LT=29;
    public static final int MEMBER=18;
    public static final int STAR=38;
    public static final int IDF=63;
    public static final int WHILE=48;
    public static final int BOOL_TYPE=56;
    public static final int PRINT_MACRO=53;
    public static final int EXCL=39;
    public static final int AND=33;
    public static final int EOF=-1;
    public static final int INT32_TYPE=55;
    public static final int LPAREN=21;
    public static final int IF=49;
    public static final int FUNC_CALL=11;
    public static final int TYPE=7;
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
    public static final int TRUE=57;
    public static final int MUL=20;
    public static final int CSTE_STR=64;
    public static final int COLON=61;
    public static final int VEC_MACRO=52;
    public static final int WS=69;
    public static final int LOWERCASE=65;
    public static final int VEC_TYPE=54;
    public static final int OR=34;
    public static final int ASSIGN=40;
    public static final int ARROW=62;
    public static final int LEN=43;
    public static final int GT=27;
    public static final int CSTE_ENT=12;
    public static final int DIV=37;
    public static final int FALSE=58;
    public static final int FUNCTION_CALL=14;
    public static final int LET=44;
    public static final int LE=30;

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
    public String getGrammarFileName() { return "D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g"; }


    public static class fichier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fichier"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:86:1: fichier : ( decl )* -> ^( FICHIER ( decl )* ) ;
    public final mini_rustParser.fichier_return fichier() throws RecognitionException {
        mini_rustParser.fichier_return retval = new mini_rustParser.fichier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        mini_rustParser.decl_return decl1 = null;


        RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:87:2: ( ( decl )* -> ^( FICHIER ( decl )* ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:88:2: ( decl )*
            {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:88:2: ( decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=FN && LA1_0<=STRUCT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:88:3: decl
            	    {
            	    pushFollow(FOLLOW_decl_in_fichier479);
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
            // 88:10: -> ^( FICHIER ( decl )* )
            {
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:88:13: ^( FICHIER ( decl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FICHIER, "FICHIER"), root_1);

                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:88:23: ( decl )*
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:91:1: decl : ( decl_func | decl_struct );
    public final mini_rustParser.decl_return decl() throws RecognitionException {
        mini_rustParser.decl_return retval = new mini_rustParser.decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        mini_rustParser.decl_func_return decl_func2 = null;

        mini_rustParser.decl_struct_return decl_struct3 = null;



        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:92:2: ( decl_func | decl_struct )
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
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:93:4: decl_func
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_decl_func_in_decl504);
                    decl_func2=decl_func();

                    state._fsp--;

                    adaptor.addChild(root_0, decl_func2.getTree());

                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:94:4: decl_struct
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_decl_struct_in_decl509);
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:97:1: decl_func : FN IDF LPAREN ( argument ( COMMA argument )* )? RPAREN ( ARROW type )? bloc -> ^( DECL_FUNC IDF ( argument )* ( type )? bloc ) ;
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
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:98:2: ( FN IDF LPAREN ( argument ( COMMA argument )* )? RPAREN ( ARROW type )? bloc -> ^( DECL_FUNC IDF ( argument )* ( type )? bloc ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:99:2: FN IDF LPAREN ( argument ( COMMA argument )* )? RPAREN ( ARROW type )? bloc
            {
            FN4=(Token)match(input,FN,FOLLOW_FN_in_decl_func521);  
            stream_FN.add(FN4);

            IDF5=(Token)match(input,IDF,FOLLOW_IDF_in_decl_func523);  
            stream_IDF.add(IDF5);

            LPAREN6=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_decl_func525);  
            stream_LPAREN.add(LPAREN6);

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:99:16: ( argument ( COMMA argument )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IDF) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:99:17: argument ( COMMA argument )*
                    {
                    pushFollow(FOLLOW_argument_in_decl_func528);
                    argument7=argument();

                    state._fsp--;

                    stream_argument.add(argument7.getTree());
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:99:26: ( COMMA argument )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==COMMA) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:99:27: COMMA argument
                    	    {
                    	    COMMA8=(Token)match(input,COMMA,FOLLOW_COMMA_in_decl_func531);  
                    	    stream_COMMA.add(COMMA8);

                    	    pushFollow(FOLLOW_argument_in_decl_func533);
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

            RPAREN10=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_decl_func539);  
            stream_RPAREN.add(RPAREN10);

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:99:53: ( ARROW type )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ARROW) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:99:54: ARROW type
                    {
                    ARROW11=(Token)match(input,ARROW,FOLLOW_ARROW_in_decl_func542);  
                    stream_ARROW.add(ARROW11);

                    pushFollow(FOLLOW_type_in_decl_func544);
                    type12=type();

                    state._fsp--;

                    stream_type.add(type12.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_bloc_in_decl_func548);
            bloc13=bloc();

            state._fsp--;

            stream_bloc.add(bloc13.getTree());


            // AST REWRITE
            // elements: bloc, type, argument, IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 99:72: -> ^( DECL_FUNC IDF ( argument )* ( type )? bloc )
            {
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:99:75: ^( DECL_FUNC IDF ( argument )* ( type )? bloc )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL_FUNC, "DECL_FUNC"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:99:91: ( argument )*
                while ( stream_argument.hasNext() ) {
                    adaptor.addChild(root_1, stream_argument.nextTree());

                }
                stream_argument.reset();
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:99:103: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                adaptor.addChild(root_1, stream_bloc.nextTree());

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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:102:1: decl_struct : STRUCT idf= IDF LBRACKET (i+= IDF COLON t+= type ( COMMA i+= IDF COLON t+= type )* )? RBRACKET -> ^( DECL_STRUCT $idf ( ^( MEMBER $i $t) )* ) ;
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
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:103:2: ( STRUCT idf= IDF LBRACKET (i+= IDF COLON t+= type ( COMMA i+= IDF COLON t+= type )* )? RBRACKET -> ^( DECL_STRUCT $idf ( ^( MEMBER $i $t) )* ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:104:2: STRUCT idf= IDF LBRACKET (i+= IDF COLON t+= type ( COMMA i+= IDF COLON t+= type )* )? RBRACKET
            {
            STRUCT14=(Token)match(input,STRUCT,FOLLOW_STRUCT_in_decl_struct580);  
            stream_STRUCT.add(STRUCT14);

            idf=(Token)match(input,IDF,FOLLOW_IDF_in_decl_struct584);  
            stream_IDF.add(idf);

            LBRACKET15=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_decl_struct586);  
            stream_LBRACKET.add(LBRACKET15);

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:104:26: (i+= IDF COLON t+= type ( COMMA i+= IDF COLON t+= type )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDF) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:104:27: i+= IDF COLON t+= type ( COMMA i+= IDF COLON t+= type )*
                    {
                    i=(Token)match(input,IDF,FOLLOW_IDF_in_decl_struct591);  
                    stream_IDF.add(i);

                    if (list_i==null) list_i=new ArrayList();
                    list_i.add(i);

                    COLON16=(Token)match(input,COLON,FOLLOW_COLON_in_decl_struct593);  
                    stream_COLON.add(COLON16);

                    pushFollow(FOLLOW_type_in_decl_struct597);
                    t=type();

                    state._fsp--;

                    stream_type.add(t.getTree());
                    if (list_t==null) list_t=new ArrayList();
                    list_t.add(t.getTree());

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:104:48: ( COMMA i+= IDF COLON t+= type )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==COMMA) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:104:49: COMMA i+= IDF COLON t+= type
                    	    {
                    	    COMMA17=(Token)match(input,COMMA,FOLLOW_COMMA_in_decl_struct600);  
                    	    stream_COMMA.add(COMMA17);

                    	    i=(Token)match(input,IDF,FOLLOW_IDF_in_decl_struct604);  
                    	    stream_IDF.add(i);

                    	    if (list_i==null) list_i=new ArrayList();
                    	    list_i.add(i);

                    	    COLON18=(Token)match(input,COLON,FOLLOW_COLON_in_decl_struct606);  
                    	    stream_COLON.add(COLON18);

                    	    pushFollow(FOLLOW_type_in_decl_struct610);
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

            RBRACKET19=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_decl_struct616);  
            stream_RBRACKET.add(RBRACKET19);



            // AST REWRITE
            // elements: i, idf, t
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
            // 104:89: -> ^( DECL_STRUCT $idf ( ^( MEMBER $i $t) )* )
            {
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:104:92: ^( DECL_STRUCT $idf ( ^( MEMBER $i $t) )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL_STRUCT, "DECL_STRUCT"), root_1);

                adaptor.addChild(root_1, stream_idf.nextNode());
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:104:111: ( ^( MEMBER $i $t) )*
                while ( stream_i.hasNext()||stream_t.hasNext() ) {
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:104:111: ^( MEMBER $i $t)
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:107:1: type : ( IDF | VEC_TYPE LT type GT -> ^( VEC_TYPE type ) | AMPS type | INT32_TYPE | BOOL_TYPE );
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
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:108:2: ( IDF | VEC_TYPE LT type GT -> ^( VEC_TYPE type ) | AMPS type | INT32_TYPE | BOOL_TYPE )
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
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:109:4: IDF
                    {
                    root_0 = (Object)adaptor.nil();

                    IDF20=(Token)match(input,IDF,FOLLOW_IDF_in_type650); 
                    IDF20_tree = (Object)adaptor.create(IDF20);
                    adaptor.addChild(root_0, IDF20_tree);


                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:110:4: VEC_TYPE LT type GT
                    {
                    VEC_TYPE21=(Token)match(input,VEC_TYPE,FOLLOW_VEC_TYPE_in_type655);  
                    stream_VEC_TYPE.add(VEC_TYPE21);

                    LT22=(Token)match(input,LT,FOLLOW_LT_in_type657);  
                    stream_LT.add(LT22);

                    pushFollow(FOLLOW_type_in_type659);
                    type23=type();

                    state._fsp--;

                    stream_type.add(type23.getTree());
                    GT24=(Token)match(input,GT,FOLLOW_GT_in_type661);  
                    stream_GT.add(GT24);



                    // AST REWRITE
                    // elements: type, VEC_TYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 110:24: -> ^( VEC_TYPE type )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:110:27: ^( VEC_TYPE type )
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
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:111:4: AMPS type
                    {
                    root_0 = (Object)adaptor.nil();

                    AMPS25=(Token)match(input,AMPS,FOLLOW_AMPS_in_type674); 
                    AMPS25_tree = (Object)adaptor.create(AMPS25);
                    adaptor.addChild(root_0, AMPS25_tree);

                    pushFollow(FOLLOW_type_in_type676);
                    type26=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type26.getTree());

                    }
                    break;
                case 4 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:112:4: INT32_TYPE
                    {
                    root_0 = (Object)adaptor.nil();

                    INT32_TYPE27=(Token)match(input,INT32_TYPE,FOLLOW_INT32_TYPE_in_type682); 
                    INT32_TYPE27_tree = (Object)adaptor.create(INT32_TYPE27);
                    adaptor.addChild(root_0, INT32_TYPE27_tree);


                    }
                    break;
                case 5 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:113:4: BOOL_TYPE
                    {
                    root_0 = (Object)adaptor.nil();

                    BOOL_TYPE28=(Token)match(input,BOOL_TYPE,FOLLOW_BOOL_TYPE_in_type687); 
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:116:1: argument : IDF COLON type -> ^( ARGUMENT IDF type ) ;
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
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:117:2: ( IDF COLON type -> ^( ARGUMENT IDF type ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:118:2: IDF COLON type
            {
            IDF29=(Token)match(input,IDF,FOLLOW_IDF_in_argument699);  
            stream_IDF.add(IDF29);

            COLON30=(Token)match(input,COLON,FOLLOW_COLON_in_argument701);  
            stream_COLON.add(COLON30);

            pushFollow(FOLLOW_type_in_argument703);
            type31=type();

            state._fsp--;

            stream_type.add(type31.getTree());


            // AST REWRITE
            // elements: type, IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 118:17: -> ^( ARGUMENT IDF type )
            {
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:118:20: ^( ARGUMENT IDF type )
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:121:1: bloc : LBRACKET instruction_bloc RBRACKET -> ^( BLOC ( instruction_bloc )? ) ;
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
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:122:2: ( LBRACKET instruction_bloc RBRACKET -> ^( BLOC ( instruction_bloc )? ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:123:2: LBRACKET instruction_bloc RBRACKET
            {
            LBRACKET32=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_bloc725);  
            stream_LBRACKET.add(LBRACKET32);

            pushFollow(FOLLOW_instruction_bloc_in_bloc727);
            instruction_bloc33=instruction_bloc();

            state._fsp--;

            stream_instruction_bloc.add(instruction_bloc33.getTree());
            RBRACKET34=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_bloc729);  
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
            // 123:37: -> ^( BLOC ( instruction_bloc )? )
            {
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:123:40: ^( BLOC ( instruction_bloc )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOC, "BLOC"), root_1);

                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:123:47: ( instruction_bloc )?
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:126:1: instruction_bloc : ( instruction instruction_bloc | ( expr )? ( SEMICOLON instruction_bloc )? -> ( expr )? ( instruction_bloc )? );
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
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:127:2: ( instruction instruction_bloc | ( expr )? ( SEMICOLON instruction_bloc )? -> ( expr )? ( instruction_bloc )? )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==LBRACKET||LA11_0==LET||(LA11_0>=WHILE && LA11_0<=IF)||LA11_0==RETURN) ) {
                alt11=1;
            }
            else if ( (LA11_0==CSTE_ENT||LA11_0==LPAREN||LA11_0==RBRACKET||LA11_0==MINUS||(LA11_0>=STAR && LA11_0<=EXCL)||LA11_0==AMPS||(LA11_0>=VEC_MACRO && LA11_0<=PRINT_MACRO)||(LA11_0>=TRUE && LA11_0<=FALSE)||LA11_0==SEMICOLON||(LA11_0>=IDF && LA11_0<=CSTE_STR)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:128:4: instruction instruction_bloc
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_instruction_in_instruction_bloc752);
                    instruction35=instruction();

                    state._fsp--;

                    adaptor.addChild(root_0, instruction35.getTree());
                    pushFollow(FOLLOW_instruction_bloc_in_instruction_bloc754);
                    instruction_bloc36=instruction_bloc();

                    state._fsp--;

                    adaptor.addChild(root_0, instruction_bloc36.getTree());

                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:129:4: ( expr )? ( SEMICOLON instruction_bloc )?
                    {
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:129:4: ( expr )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==CSTE_ENT||LA9_0==LPAREN||LA9_0==MINUS||(LA9_0>=STAR && LA9_0<=EXCL)||LA9_0==AMPS||(LA9_0>=VEC_MACRO && LA9_0<=PRINT_MACRO)||(LA9_0>=TRUE && LA9_0<=FALSE)||(LA9_0>=IDF && LA9_0<=CSTE_STR)) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:129:5: expr
                            {
                            pushFollow(FOLLOW_expr_in_instruction_bloc760);
                            expr37=expr();

                            state._fsp--;

                            stream_expr.add(expr37.getTree());

                            }
                            break;

                    }

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:129:12: ( SEMICOLON instruction_bloc )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==SEMICOLON) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:129:13: SEMICOLON instruction_bloc
                            {
                            SEMICOLON38=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_instruction_bloc765);  
                            stream_SEMICOLON.add(SEMICOLON38);

                            pushFollow(FOLLOW_instruction_bloc_in_instruction_bloc767);
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
                    // 129:42: -> ( expr )? ( instruction_bloc )?
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:129:45: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_0, stream_expr.nextTree());

                        }
                        stream_expr.reset();
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:129:51: ( instruction_bloc )?
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:132:1: instruction : ( LET instruction_let SEMICOLON -> instruction_let | WHILE expr bloc -> ^( WHILE expr bloc ) | RETURN ( expr )? SEMICOLON -> ^( RETURN ( expr )? ) | if_expr | bloc );
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
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:133:2: ( LET instruction_let SEMICOLON -> instruction_let | WHILE expr bloc -> ^( WHILE expr bloc ) | RETURN ( expr )? SEMICOLON -> ^( RETURN ( expr )? ) | if_expr | bloc )
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
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:134:4: LET instruction_let SEMICOLON
                    {
                    LET40=(Token)match(input,LET,FOLLOW_LET_in_instruction791);  
                    stream_LET.add(LET40);

                    pushFollow(FOLLOW_instruction_let_in_instruction793);
                    instruction_let41=instruction_let();

                    state._fsp--;

                    stream_instruction_let.add(instruction_let41.getTree());
                    SEMICOLON42=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_instruction795);  
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
                    // 134:34: -> instruction_let
                    {
                        adaptor.addChild(root_0, stream_instruction_let.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:135:4: WHILE expr bloc
                    {
                    WHILE43=(Token)match(input,WHILE,FOLLOW_WHILE_in_instruction804);  
                    stream_WHILE.add(WHILE43);

                    pushFollow(FOLLOW_expr_in_instruction806);
                    expr44=expr();

                    state._fsp--;

                    stream_expr.add(expr44.getTree());
                    pushFollow(FOLLOW_bloc_in_instruction808);
                    bloc45=bloc();

                    state._fsp--;

                    stream_bloc.add(bloc45.getTree());


                    // AST REWRITE
                    // elements: WHILE, bloc, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 135:20: -> ^( WHILE expr bloc )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:135:23: ^( WHILE expr bloc )
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
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:136:4: RETURN ( expr )? SEMICOLON
                    {
                    RETURN46=(Token)match(input,RETURN,FOLLOW_RETURN_in_instruction823);  
                    stream_RETURN.add(RETURN46);

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:136:11: ( expr )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==CSTE_ENT||LA12_0==LPAREN||LA12_0==MINUS||(LA12_0>=STAR && LA12_0<=EXCL)||LA12_0==AMPS||(LA12_0>=VEC_MACRO && LA12_0<=PRINT_MACRO)||(LA12_0>=TRUE && LA12_0<=FALSE)||(LA12_0>=IDF && LA12_0<=CSTE_STR)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:136:12: expr
                            {
                            pushFollow(FOLLOW_expr_in_instruction826);
                            expr47=expr();

                            state._fsp--;

                            stream_expr.add(expr47.getTree());

                            }
                            break;

                    }

                    SEMICOLON48=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_instruction830);  
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
                    // 136:29: -> ^( RETURN ( expr )? )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:136:32: ^( RETURN ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:136:41: ( expr )?
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
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:137:4: if_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_expr_in_instruction844);
                    if_expr49=if_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, if_expr49.getTree());

                    }
                    break;
                case 5 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:138:4: bloc
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_bloc_in_instruction849);
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:141:1: instruction_let : ( MUT expr ( let_assign )? -> ^( LETMUT expr ( let_assign )? ) | expr ( let_assign )? -> ^( LET expr ( let_assign )? ) );
    public final mini_rustParser.instruction_let_return instruction_let() throws RecognitionException {
        mini_rustParser.instruction_let_return retval = new mini_rustParser.instruction_let_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MUT51=null;
        mini_rustParser.expr_return expr52 = null;

        mini_rustParser.let_assign_return let_assign53 = null;

        mini_rustParser.expr_return expr54 = null;

        mini_rustParser.let_assign_return let_assign55 = null;


        Object MUT51_tree=null;
        RewriteRuleTokenStream stream_MUT=new RewriteRuleTokenStream(adaptor,"token MUT");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_let_assign=new RewriteRuleSubtreeStream(adaptor,"rule let_assign");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:142:2: ( MUT expr ( let_assign )? -> ^( LETMUT expr ( let_assign )? ) | expr ( let_assign )? -> ^( LET expr ( let_assign )? ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==MUT) ) {
                alt16=1;
            }
            else if ( (LA16_0==CSTE_ENT||LA16_0==LPAREN||LA16_0==MINUS||(LA16_0>=STAR && LA16_0<=EXCL)||LA16_0==AMPS||(LA16_0>=VEC_MACRO && LA16_0<=PRINT_MACRO)||(LA16_0>=TRUE && LA16_0<=FALSE)||(LA16_0>=IDF && LA16_0<=CSTE_STR)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:143:6: MUT expr ( let_assign )?
                    {
                    MUT51=(Token)match(input,MUT,FOLLOW_MUT_in_instruction_let865);  
                    stream_MUT.add(MUT51);

                    pushFollow(FOLLOW_expr_in_instruction_let867);
                    expr52=expr();

                    state._fsp--;

                    stream_expr.add(expr52.getTree());
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:143:15: ( let_assign )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ASSIGN) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:143:16: let_assign
                            {
                            pushFollow(FOLLOW_let_assign_in_instruction_let870);
                            let_assign53=let_assign();

                            state._fsp--;

                            stream_let_assign.add(let_assign53.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: expr, let_assign
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 143:29: -> ^( LETMUT expr ( let_assign )? )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:143:32: ^( LETMUT expr ( let_assign )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LETMUT, "LETMUT"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:143:46: ( let_assign )?
                        if ( stream_let_assign.hasNext() ) {
                            adaptor.addChild(root_1, stream_let_assign.nextTree());

                        }
                        stream_let_assign.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:144:6: expr ( let_assign )?
                    {
                    pushFollow(FOLLOW_expr_in_instruction_let892);
                    expr54=expr();

                    state._fsp--;

                    stream_expr.add(expr54.getTree());
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:144:11: ( let_assign )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==ASSIGN) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:144:12: let_assign
                            {
                            pushFollow(FOLLOW_let_assign_in_instruction_let895);
                            let_assign55=let_assign();

                            state._fsp--;

                            stream_let_assign.add(let_assign55.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: let_assign, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 144:25: -> ^( LET expr ( let_assign )? )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:144:28: ^( LET expr ( let_assign )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LET, "LET"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:144:39: ( let_assign )?
                        if ( stream_let_assign.hasNext() ) {
                            adaptor.addChild(root_1, stream_let_assign.nextTree());

                        }
                        stream_let_assign.reset();

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

    public static class let_assign_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "let_assign"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:147:1: let_assign : ASSIGN expr ( -> expr | obj_def -> ^( OBJ expr obj_def ) ) ;
    public final mini_rustParser.let_assign_return let_assign() throws RecognitionException {
        mini_rustParser.let_assign_return retval = new mini_rustParser.let_assign_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASSIGN56=null;
        mini_rustParser.expr_return expr57 = null;

        mini_rustParser.obj_def_return obj_def58 = null;


        Object ASSIGN56_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_obj_def=new RewriteRuleSubtreeStream(adaptor,"rule obj_def");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:148:2: ( ASSIGN expr ( -> expr | obj_def -> ^( OBJ expr obj_def ) ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:149:2: ASSIGN expr ( -> expr | obj_def -> ^( OBJ expr obj_def ) )
            {
            ASSIGN56=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_let_assign922);  
            stream_ASSIGN.add(ASSIGN56);

            pushFollow(FOLLOW_expr_in_let_assign924);
            expr57=expr();

            state._fsp--;

            stream_expr.add(expr57.getTree());
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:150:2: ( -> expr | obj_def -> ^( OBJ expr obj_def ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==SEMICOLON) ) {
                alt17=1;
            }
            else if ( (LA17_0==LBRACKET) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:151:3: 
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
                    // 151:3: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:152:5: obj_def
                    {
                    pushFollow(FOLLOW_obj_def_in_let_assign940);
                    obj_def58=obj_def();

                    state._fsp--;

                    stream_obj_def.add(obj_def58.getTree());


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
                    // 152:13: -> ^( OBJ expr obj_def )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:152:16: ^( OBJ expr obj_def )
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
    // $ANTLR end "let_assign"

    public static class obj_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "obj_def"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:156:1: obj_def : LBRACKET (i+= IDF COLON o+= obj_expr ( COMMA i+= IDF COLON o+= obj_expr )* )? RBRACKET -> ( ^( MEMBER $i $o) )* ;
    public final mini_rustParser.obj_def_return obj_def() throws RecognitionException {
        mini_rustParser.obj_def_return retval = new mini_rustParser.obj_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LBRACKET59=null;
        Token COLON60=null;
        Token COMMA61=null;
        Token COLON62=null;
        Token RBRACKET63=null;
        Token i=null;
        List list_i=null;
        List list_o=null;
        RuleReturnScope o = null;
        Object LBRACKET59_tree=null;
        Object COLON60_tree=null;
        Object COMMA61_tree=null;
        Object COLON62_tree=null;
        Object RBRACKET63_tree=null;
        Object i_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_obj_expr=new RewriteRuleSubtreeStream(adaptor,"rule obj_expr");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:157:2: ( LBRACKET (i+= IDF COLON o+= obj_expr ( COMMA i+= IDF COLON o+= obj_expr )* )? RBRACKET -> ( ^( MEMBER $i $o) )* )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:158:2: LBRACKET (i+= IDF COLON o+= obj_expr ( COMMA i+= IDF COLON o+= obj_expr )* )? RBRACKET
            {
            LBRACKET59=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_obj_def966);  
            stream_LBRACKET.add(LBRACKET59);

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:158:11: (i+= IDF COLON o+= obj_expr ( COMMA i+= IDF COLON o+= obj_expr )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDF) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:158:12: i+= IDF COLON o+= obj_expr ( COMMA i+= IDF COLON o+= obj_expr )*
                    {
                    i=(Token)match(input,IDF,FOLLOW_IDF_in_obj_def971);  
                    stream_IDF.add(i);

                    if (list_i==null) list_i=new ArrayList();
                    list_i.add(i);

                    COLON60=(Token)match(input,COLON,FOLLOW_COLON_in_obj_def973);  
                    stream_COLON.add(COLON60);

                    pushFollow(FOLLOW_obj_expr_in_obj_def977);
                    o=obj_expr();

                    state._fsp--;

                    stream_obj_expr.add(o.getTree());
                    if (list_o==null) list_o=new ArrayList();
                    list_o.add(o.getTree());

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:158:37: ( COMMA i+= IDF COLON o+= obj_expr )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==COMMA) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:158:38: COMMA i+= IDF COLON o+= obj_expr
                    	    {
                    	    COMMA61=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj_def980);  
                    	    stream_COMMA.add(COMMA61);

                    	    i=(Token)match(input,IDF,FOLLOW_IDF_in_obj_def984);  
                    	    stream_IDF.add(i);

                    	    if (list_i==null) list_i=new ArrayList();
                    	    list_i.add(i);

                    	    COLON62=(Token)match(input,COLON,FOLLOW_COLON_in_obj_def986);  
                    	    stream_COLON.add(COLON62);

                    	    pushFollow(FOLLOW_obj_expr_in_obj_def990);
                    	    o=obj_expr();

                    	    state._fsp--;

                    	    stream_obj_expr.add(o.getTree());
                    	    if (list_o==null) list_o=new ArrayList();
                    	    list_o.add(o.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            RBRACKET63=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_obj_def996);  
            stream_RBRACKET.add(RBRACKET63);



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
            // 158:82: -> ( ^( MEMBER $i $o) )*
            {
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:158:85: ( ^( MEMBER $i $o) )*
                while ( stream_i.hasNext()||stream_o.hasNext() ) {
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:158:85: ^( MEMBER $i $o)
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:161:1: obj_expr : ( IDF obj_def -> ^( OBJ IDF obj_def ) | expr -> expr );
    public final mini_rustParser.obj_expr_return obj_expr() throws RecognitionException {
        mini_rustParser.obj_expr_return retval = new mini_rustParser.obj_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF64=null;
        mini_rustParser.obj_def_return obj_def65 = null;

        mini_rustParser.expr_return expr66 = null;


        Object IDF64_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_obj_def=new RewriteRuleSubtreeStream(adaptor,"rule obj_def");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:162:2: ( IDF obj_def -> ^( OBJ IDF obj_def ) | expr -> expr )
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:163:4: IDF obj_def
                    {
                    IDF64=(Token)match(input,IDF,FOLLOW_IDF_in_obj_expr1023);  
                    stream_IDF.add(IDF64);

                    pushFollow(FOLLOW_obj_def_in_obj_expr1025);
                    obj_def65=obj_def();

                    state._fsp--;

                    stream_obj_def.add(obj_def65.getTree());


                    // AST REWRITE
                    // elements: obj_def, IDF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 163:16: -> ^( OBJ IDF obj_def )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:163:19: ^( OBJ IDF obj_def )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OBJ, "OBJ"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        adaptor.addChild(root_1, stream_obj_def.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:164:4: expr
                    {
                    pushFollow(FOLLOW_expr_in_obj_expr1040);
                    expr66=expr();

                    state._fsp--;

                    stream_expr.add(expr66.getTree());


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
                    // 164:9: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

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
    // $ANTLR end "obj_expr"

    public static class if_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_expr"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:167:1: if_expr : IF expr bloc ( else_expr )? -> ^( IF expr bloc ( else_expr )? ) ;
    public final mini_rustParser.if_expr_return if_expr() throws RecognitionException {
        mini_rustParser.if_expr_return retval = new mini_rustParser.if_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF67=null;
        mini_rustParser.expr_return expr68 = null;

        mini_rustParser.bloc_return bloc69 = null;

        mini_rustParser.else_expr_return else_expr70 = null;


        Object IF67_tree=null;
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
        RewriteRuleSubtreeStream stream_else_expr=new RewriteRuleSubtreeStream(adaptor,"rule else_expr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:168:2: ( IF expr bloc ( else_expr )? -> ^( IF expr bloc ( else_expr )? ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:169:2: IF expr bloc ( else_expr )?
            {
            IF67=(Token)match(input,IF,FOLLOW_IF_in_if_expr1057);  
            stream_IF.add(IF67);

            pushFollow(FOLLOW_expr_in_if_expr1059);
            expr68=expr();

            state._fsp--;

            stream_expr.add(expr68.getTree());
            pushFollow(FOLLOW_bloc_in_if_expr1061);
            bloc69=bloc();

            state._fsp--;

            stream_bloc.add(bloc69.getTree());
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:169:15: ( else_expr )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ELSE) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:169:16: else_expr
                    {
                    pushFollow(FOLLOW_else_expr_in_if_expr1064);
                    else_expr70=else_expr();

                    state._fsp--;

                    stream_else_expr.add(else_expr70.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: IF, else_expr, expr, bloc
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 169:28: -> ^( IF expr bloc ( else_expr )? )
            {
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:169:31: ^( IF expr bloc ( else_expr )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                adaptor.addChild(root_1, stream_bloc.nextTree());
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:169:46: ( else_expr )?
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:172:1: else_expr : ELSE ( bloc -> ^( ELSE bloc ) | if_expr -> ^( ELSE if_expr ) ) ;
    public final mini_rustParser.else_expr_return else_expr() throws RecognitionException {
        mini_rustParser.else_expr_return retval = new mini_rustParser.else_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ELSE71=null;
        mini_rustParser.bloc_return bloc72 = null;

        mini_rustParser.if_expr_return if_expr73 = null;


        Object ELSE71_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
        RewriteRuleSubtreeStream stream_if_expr=new RewriteRuleSubtreeStream(adaptor,"rule if_expr");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:173:2: ( ELSE ( bloc -> ^( ELSE bloc ) | if_expr -> ^( ELSE if_expr ) ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:174:2: ELSE ( bloc -> ^( ELSE bloc ) | if_expr -> ^( ELSE if_expr ) )
            {
            ELSE71=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_expr1093);  
            stream_ELSE.add(ELSE71);

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:174:7: ( bloc -> ^( ELSE bloc ) | if_expr -> ^( ELSE if_expr ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LBRACKET) ) {
                alt22=1;
            }
            else if ( (LA22_0==IF) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:174:8: bloc
                    {
                    pushFollow(FOLLOW_bloc_in_else_expr1096);
                    bloc72=bloc();

                    state._fsp--;

                    stream_bloc.add(bloc72.getTree());


                    // AST REWRITE
                    // elements: bloc, ELSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 174:13: -> ^( ELSE bloc )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:174:16: ^( ELSE bloc )
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
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:174:31: if_expr
                    {
                    pushFollow(FOLLOW_if_expr_in_else_expr1108);
                    if_expr73=if_expr();

                    state._fsp--;

                    stream_if_expr.add(if_expr73.getTree());


                    // AST REWRITE
                    // elements: ELSE, if_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 174:39: -> ^( ELSE if_expr )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:174:42: ^( ELSE if_expr )
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:177:1: expr : expr_ou ;
    public final mini_rustParser.expr_return expr() throws RecognitionException {
        mini_rustParser.expr_return retval = new mini_rustParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        mini_rustParser.expr_ou_return expr_ou74 = null;



        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:178:2: ( expr_ou )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:179:2: expr_ou
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_ou_in_expr1129);
            expr_ou74=expr_ou();

            state._fsp--;

            adaptor.addChild(root_0, expr_ou74.getTree());

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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:182:1: dot_factorisation : ( IDF -> IDF | LEN LPAREN RPAREN -> LEN );
    public final mini_rustParser.dot_factorisation_return dot_factorisation() throws RecognitionException {
        mini_rustParser.dot_factorisation_return retval = new mini_rustParser.dot_factorisation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF75=null;
        Token LEN76=null;
        Token LPAREN77=null;
        Token RPAREN78=null;

        Object IDF75_tree=null;
        Object LEN76_tree=null;
        Object LPAREN77_tree=null;
        Object RPAREN78_tree=null;
        RewriteRuleTokenStream stream_LEN=new RewriteRuleTokenStream(adaptor,"token LEN");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");

        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:183:2: ( IDF -> IDF | LEN LPAREN RPAREN -> LEN )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==IDF) ) {
                alt23=1;
            }
            else if ( (LA23_0==LEN) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:184:4: IDF
                    {
                    IDF75=(Token)match(input,IDF,FOLLOW_IDF_in_dot_factorisation1143);  
                    stream_IDF.add(IDF75);



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
                    // 184:8: -> IDF
                    {
                        adaptor.addChild(root_0, stream_IDF.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:185:4: LEN LPAREN RPAREN
                    {
                    LEN76=(Token)match(input,LEN,FOLLOW_LEN_in_dot_factorisation1152);  
                    stream_LEN.add(LEN76);

                    LPAREN77=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dot_factorisation1154);  
                    stream_LPAREN.add(LPAREN77);

                    RPAREN78=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dot_factorisation1156);  
                    stream_RPAREN.add(RPAREN78);



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
                    // 185:22: -> LEN
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:188:1: expr_ou : (e1= expr_et -> $e1) ( OR e2= expr_et -> ^( OR $expr_ou $e2) )* ;
    public final mini_rustParser.expr_ou_return expr_ou() throws RecognitionException {
        mini_rustParser.expr_ou_return retval = new mini_rustParser.expr_ou_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR79=null;
        mini_rustParser.expr_et_return e1 = null;

        mini_rustParser.expr_et_return e2 = null;


        Object OR79_tree=null;
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_expr_et=new RewriteRuleSubtreeStream(adaptor,"rule expr_et");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:189:2: ( (e1= expr_et -> $e1) ( OR e2= expr_et -> ^( OR $expr_ou $e2) )* )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:190:2: (e1= expr_et -> $e1) ( OR e2= expr_et -> ^( OR $expr_ou $e2) )*
            {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:190:2: (e1= expr_et -> $e1)
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:190:3: e1= expr_et
            {
            pushFollow(FOLLOW_expr_et_in_expr_ou1175);
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
            // 190:14: -> $e1
            {
                adaptor.addChild(root_0, stream_e1.nextTree());

            }

            retval.tree = root_0;
            }

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:190:22: ( OR e2= expr_et -> ^( OR $expr_ou $e2) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==OR) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:190:23: OR e2= expr_et
            	    {
            	    OR79=(Token)match(input,OR,FOLLOW_OR_in_expr_ou1184);  
            	    stream_OR.add(OR79);

            	    pushFollow(FOLLOW_expr_et_in_expr_ou1188);
            	    e2=expr_et();

            	    state._fsp--;

            	    stream_expr_et.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: expr_ou, OR, e2
            	    // token labels: 
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 190:37: -> ^( OR $expr_ou $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:190:40: ^( OR $expr_ou $e2)
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
    // $ANTLR end "expr_ou"

    public static class expr_et_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_et"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:193:1: expr_et : (e1= expr_comp -> $e1) ( AND e2= expr_comp -> ^( AND $expr_et $e2) )* ;
    public final mini_rustParser.expr_et_return expr_et() throws RecognitionException {
        mini_rustParser.expr_et_return retval = new mini_rustParser.expr_et_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND80=null;
        mini_rustParser.expr_comp_return e1 = null;

        mini_rustParser.expr_comp_return e2 = null;


        Object AND80_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_expr_comp=new RewriteRuleSubtreeStream(adaptor,"rule expr_comp");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:194:2: ( (e1= expr_comp -> $e1) ( AND e2= expr_comp -> ^( AND $expr_et $e2) )* )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:195:2: (e1= expr_comp -> $e1) ( AND e2= expr_comp -> ^( AND $expr_et $e2) )*
            {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:195:2: (e1= expr_comp -> $e1)
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:195:3: e1= expr_comp
            {
            pushFollow(FOLLOW_expr_comp_in_expr_et1217);
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
            // 195:16: -> $e1
            {
                adaptor.addChild(root_0, stream_e1.nextTree());

            }

            retval.tree = root_0;
            }

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:195:24: ( AND e2= expr_comp -> ^( AND $expr_et $e2) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==AND) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:195:25: AND e2= expr_comp
            	    {
            	    AND80=(Token)match(input,AND,FOLLOW_AND_in_expr_et1226);  
            	    stream_AND.add(AND80);

            	    pushFollow(FOLLOW_expr_comp_in_expr_et1230);
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
            	    // 195:42: -> ^( AND $expr_et $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:195:45: ^( AND $expr_et $e2)
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
    // $ANTLR end "expr_et"

    public static class expr_comp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_comp"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:198:1: expr_comp : (e1= expr_plus -> $e1) (op= LT e2= expr_plus -> ^( $op $expr_comp $e2) | op= LE e2= expr_plus -> ^( $op $expr_comp $e2) | op= GT e2= expr_plus -> ^( $op $expr_comp $e2) | op= GE e2= expr_plus -> ^( $op $expr_comp $e2) | op= EQ e2= expr_plus -> ^( $op $expr_comp $e2) | op= NE e2= expr_plus -> ^( $op $expr_comp $e2) )* ;
    public final mini_rustParser.expr_comp_return expr_comp() throws RecognitionException {
        mini_rustParser.expr_comp_return retval = new mini_rustParser.expr_comp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        mini_rustParser.expr_plus_return e1 = null;

        mini_rustParser.expr_plus_return e2 = null;


        Object op_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_GE=new RewriteRuleTokenStream(adaptor,"token GE");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_LE=new RewriteRuleTokenStream(adaptor,"token LE");
        RewriteRuleTokenStream stream_NE=new RewriteRuleTokenStream(adaptor,"token NE");
        RewriteRuleSubtreeStream stream_expr_plus=new RewriteRuleSubtreeStream(adaptor,"rule expr_plus");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:199:2: ( (e1= expr_plus -> $e1) (op= LT e2= expr_plus -> ^( $op $expr_comp $e2) | op= LE e2= expr_plus -> ^( $op $expr_comp $e2) | op= GT e2= expr_plus -> ^( $op $expr_comp $e2) | op= GE e2= expr_plus -> ^( $op $expr_comp $e2) | op= EQ e2= expr_plus -> ^( $op $expr_comp $e2) | op= NE e2= expr_plus -> ^( $op $expr_comp $e2) )* )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:200:2: (e1= expr_plus -> $e1) (op= LT e2= expr_plus -> ^( $op $expr_comp $e2) | op= LE e2= expr_plus -> ^( $op $expr_comp $e2) | op= GT e2= expr_plus -> ^( $op $expr_comp $e2) | op= GE e2= expr_plus -> ^( $op $expr_comp $e2) | op= EQ e2= expr_plus -> ^( $op $expr_comp $e2) | op= NE e2= expr_plus -> ^( $op $expr_comp $e2) )*
            {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:200:2: (e1= expr_plus -> $e1)
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:200:3: e1= expr_plus
            {
            pushFollow(FOLLOW_expr_plus_in_expr_comp1262);
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
            // 200:18: -> $e1
            {
                adaptor.addChild(root_0, stream_e1.nextTree());

            }

            retval.tree = root_0;
            }

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:201:2: (op= LT e2= expr_plus -> ^( $op $expr_comp $e2) | op= LE e2= expr_plus -> ^( $op $expr_comp $e2) | op= GT e2= expr_plus -> ^( $op $expr_comp $e2) | op= GE e2= expr_plus -> ^( $op $expr_comp $e2) | op= EQ e2= expr_plus -> ^( $op $expr_comp $e2) | op= NE e2= expr_plus -> ^( $op $expr_comp $e2) )*
            loop26:
            do {
                int alt26=7;
                switch ( input.LA(1) ) {
                case LT:
                    {
                    alt26=1;
                    }
                    break;
                case LE:
                    {
                    alt26=2;
                    }
                    break;
                case GT:
                    {
                    alt26=3;
                    }
                    break;
                case GE:
                    {
                    alt26=4;
                    }
                    break;
                case EQ:
                    {
                    alt26=5;
                    }
                    break;
                case NE:
                    {
                    alt26=6;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:202:5: op= LT e2= expr_plus
            	    {
            	    op=(Token)match(input,LT,FOLLOW_LT_in_expr_comp1279);  
            	    stream_LT.add(op);

            	    pushFollow(FOLLOW_expr_plus_in_expr_comp1283);
            	    e2=expr_plus();

            	    state._fsp--;

            	    stream_expr_plus.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: op, e2, expr_comp
            	    // token labels: op
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 202:24: -> ^( $op $expr_comp $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:202:27: ^( $op $expr_comp $e2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_op.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_e2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 2 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:203:5: op= LE e2= expr_plus
            	    {
            	    op=(Token)match(input,LE,FOLLOW_LE_in_expr_comp1304);  
            	    stream_LE.add(op);

            	    pushFollow(FOLLOW_expr_plus_in_expr_comp1308);
            	    e2=expr_plus();

            	    state._fsp--;

            	    stream_expr_plus.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: e2, op, expr_comp
            	    // token labels: op
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 203:24: -> ^( $op $expr_comp $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:203:27: ^( $op $expr_comp $e2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_op.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_e2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 3 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:204:5: op= GT e2= expr_plus
            	    {
            	    op=(Token)match(input,GT,FOLLOW_GT_in_expr_comp1329);  
            	    stream_GT.add(op);

            	    pushFollow(FOLLOW_expr_plus_in_expr_comp1333);
            	    e2=expr_plus();

            	    state._fsp--;

            	    stream_expr_plus.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: expr_comp, op, e2
            	    // token labels: op
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 204:24: -> ^( $op $expr_comp $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:204:27: ^( $op $expr_comp $e2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_op.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_e2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 4 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:205:5: op= GE e2= expr_plus
            	    {
            	    op=(Token)match(input,GE,FOLLOW_GE_in_expr_comp1354);  
            	    stream_GE.add(op);

            	    pushFollow(FOLLOW_expr_plus_in_expr_comp1358);
            	    e2=expr_plus();

            	    state._fsp--;

            	    stream_expr_plus.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: e2, op, expr_comp
            	    // token labels: op
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 205:24: -> ^( $op $expr_comp $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:205:27: ^( $op $expr_comp $e2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_op.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_e2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 5 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:206:5: op= EQ e2= expr_plus
            	    {
            	    op=(Token)match(input,EQ,FOLLOW_EQ_in_expr_comp1379);  
            	    stream_EQ.add(op);

            	    pushFollow(FOLLOW_expr_plus_in_expr_comp1383);
            	    e2=expr_plus();

            	    state._fsp--;

            	    stream_expr_plus.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: expr_comp, op, e2
            	    // token labels: op
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 206:25: -> ^( $op $expr_comp $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:206:28: ^( $op $expr_comp $e2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_op.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_e2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 6 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:207:5: op= NE e2= expr_plus
            	    {
            	    op=(Token)match(input,NE,FOLLOW_NE_in_expr_comp1405);  
            	    stream_NE.add(op);

            	    pushFollow(FOLLOW_expr_plus_in_expr_comp1409);
            	    e2=expr_plus();

            	    state._fsp--;

            	    stream_expr_plus.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: op, e2, expr_comp
            	    // token labels: op
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 207:25: -> ^( $op $expr_comp $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:207:28: ^( $op $expr_comp $e2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_op.nextNode(), root_1);

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
    // $ANTLR end "expr_comp"

    public static class expr_plus_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_plus"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:211:1: expr_plus : (e1= expr_mult -> $e1) ( PLUS e2= expr_mult -> ^( PLUS $expr_plus $e2) | MINUS e2= expr_mult -> ^( MINUS $expr_plus $e2) )* ;
    public final mini_rustParser.expr_plus_return expr_plus() throws RecognitionException {
        mini_rustParser.expr_plus_return retval = new mini_rustParser.expr_plus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS81=null;
        Token MINUS82=null;
        mini_rustParser.expr_mult_return e1 = null;

        mini_rustParser.expr_mult_return e2 = null;


        Object PLUS81_tree=null;
        Object MINUS82_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_expr_mult=new RewriteRuleSubtreeStream(adaptor,"rule expr_mult");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:212:2: ( (e1= expr_mult -> $e1) ( PLUS e2= expr_mult -> ^( PLUS $expr_plus $e2) | MINUS e2= expr_mult -> ^( MINUS $expr_plus $e2) )* )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:213:2: (e1= expr_mult -> $e1) ( PLUS e2= expr_mult -> ^( PLUS $expr_plus $e2) | MINUS e2= expr_mult -> ^( MINUS $expr_plus $e2) )*
            {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:213:2: (e1= expr_mult -> $e1)
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:213:3: e1= expr_mult
            {
            pushFollow(FOLLOW_expr_mult_in_expr_plus1444);
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
            // 213:16: -> $e1
            {
                adaptor.addChild(root_0, stream_e1.nextTree());

            }

            retval.tree = root_0;
            }

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:214:2: ( PLUS e2= expr_mult -> ^( PLUS $expr_plus $e2) | MINUS e2= expr_mult -> ^( MINUS $expr_plus $e2) )*
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==PLUS) ) {
                    alt27=1;
                }
                else if ( (LA27_0==MINUS) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:214:3: PLUS e2= expr_mult
            	    {
            	    PLUS81=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_plus1454);  
            	    stream_PLUS.add(PLUS81);

            	    pushFollow(FOLLOW_expr_mult_in_expr_plus1458);
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
            	    // 214:21: -> ^( PLUS $expr_plus $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:214:24: ^( PLUS $expr_plus $e2)
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
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:215:4: MINUS e2= expr_mult
            	    {
            	    MINUS82=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_plus1475);  
            	    stream_MINUS.add(MINUS82);

            	    pushFollow(FOLLOW_expr_mult_in_expr_plus1479);
            	    e2=expr_mult();

            	    state._fsp--;

            	    stream_expr_mult.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: MINUS, e2, expr_plus
            	    // token labels: 
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 215:23: -> ^( MINUS $expr_plus $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:215:26: ^( MINUS $expr_plus $e2)
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
    // $ANTLR end "expr_plus"

    public static class expr_mult_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_mult"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:219:1: expr_mult : (e1= expr_unaire -> $e1) (op= MUL e2= expr_unaire -> ^( $op $expr_mult $e2) | op= DIV e2= expr_unaire -> ^( $op $expr_mult $e2) )* ;
    public final mini_rustParser.expr_mult_return expr_mult() throws RecognitionException {
        mini_rustParser.expr_mult_return retval = new mini_rustParser.expr_mult_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        mini_rustParser.expr_unaire_return e1 = null;

        mini_rustParser.expr_unaire_return e2 = null;


        Object op_tree=null;
        RewriteRuleTokenStream stream_DIV=new RewriteRuleTokenStream(adaptor,"token DIV");
        RewriteRuleTokenStream stream_MUL=new RewriteRuleTokenStream(adaptor,"token MUL");
        RewriteRuleSubtreeStream stream_expr_unaire=new RewriteRuleSubtreeStream(adaptor,"rule expr_unaire");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:220:2: ( (e1= expr_unaire -> $e1) (op= MUL e2= expr_unaire -> ^( $op $expr_mult $e2) | op= DIV e2= expr_unaire -> ^( $op $expr_mult $e2) )* )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:221:2: (e1= expr_unaire -> $e1) (op= MUL e2= expr_unaire -> ^( $op $expr_mult $e2) | op= DIV e2= expr_unaire -> ^( $op $expr_mult $e2) )*
            {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:221:2: (e1= expr_unaire -> $e1)
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:221:3: e1= expr_unaire
            {
            pushFollow(FOLLOW_expr_unaire_in_expr_mult1511);
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
            // 221:18: -> $e1
            {
                adaptor.addChild(root_0, stream_e1.nextTree());

            }

            retval.tree = root_0;
            }

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:222:2: (op= MUL e2= expr_unaire -> ^( $op $expr_mult $e2) | op= DIV e2= expr_unaire -> ^( $op $expr_mult $e2) )*
            loop28:
            do {
                int alt28=3;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==MUL) ) {
                    alt28=1;
                }
                else if ( (LA28_0==DIV) ) {
                    alt28=2;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:223:5: op= MUL e2= expr_unaire
            	    {
            	    op=(Token)match(input,MUL,FOLLOW_MUL_in_expr_mult1528);  
            	    stream_MUL.add(op);

            	    pushFollow(FOLLOW_expr_unaire_in_expr_mult1532);
            	    e2=expr_unaire();

            	    state._fsp--;

            	    stream_expr_unaire.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: op, expr_mult, e2
            	    // token labels: op
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 223:27: -> ^( $op $expr_mult $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:223:30: ^( $op $expr_mult $e2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_op.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_e2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 2 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:224:5: op= DIV e2= expr_unaire
            	    {
            	    op=(Token)match(input,DIV,FOLLOW_DIV_in_expr_mult1553);  
            	    stream_DIV.add(op);

            	    pushFollow(FOLLOW_expr_unaire_in_expr_mult1557);
            	    e2=expr_unaire();

            	    state._fsp--;

            	    stream_expr_unaire.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: e2, expr_mult, op
            	    // token labels: op
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 224:27: -> ^( $op $expr_mult $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:224:30: ^( $op $expr_mult $e2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_op.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_e2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop28;
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:228:1: expr_unaire : ( (op= MINUS ) expr_unaire -> ^( MOINS_UNITAIRE ^( expr_unaire ) ) | (op= EXCL | op= STAR | op= AMPS ) expr_unaire -> ^( $op ^( expr_unaire ) ) | (a= atom -> $a) ( LSQBRACKET expr RSQBRACKET -> ^( INDEX $expr_unaire expr ) )* ( DOT dot_factorisation -> ^( DOT $expr_unaire dot_factorisation ) )* );
    public final mini_rustParser.expr_unaire_return expr_unaire() throws RecognitionException {
        mini_rustParser.expr_unaire_return retval = new mini_rustParser.expr_unaire_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        Token LSQBRACKET85=null;
        Token RSQBRACKET87=null;
        Token DOT88=null;
        mini_rustParser.atom_return a = null;

        mini_rustParser.expr_unaire_return expr_unaire83 = null;

        mini_rustParser.expr_unaire_return expr_unaire84 = null;

        mini_rustParser.expr_return expr86 = null;

        mini_rustParser.dot_factorisation_return dot_factorisation89 = null;


        Object op_tree=null;
        Object LSQBRACKET85_tree=null;
        Object RSQBRACKET87_tree=null;
        Object DOT88_tree=null;
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
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:229:2: ( (op= MINUS ) expr_unaire -> ^( MOINS_UNITAIRE ^( expr_unaire ) ) | (op= EXCL | op= STAR | op= AMPS ) expr_unaire -> ^( $op ^( expr_unaire ) ) | (a= atom -> $a) ( LSQBRACKET expr RSQBRACKET -> ^( INDEX $expr_unaire expr ) )* ( DOT dot_factorisation -> ^( DOT $expr_unaire dot_factorisation ) )* )
            int alt32=3;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                alt32=1;
                }
                break;
            case STAR:
            case EXCL:
            case AMPS:
                {
                alt32=2;
                }
                break;
            case CSTE_ENT:
            case LPAREN:
            case VEC_MACRO:
            case PRINT_MACRO:
            case TRUE:
            case FALSE:
            case IDF:
            case CSTE_STR:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:230:4: (op= MINUS ) expr_unaire
                    {
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:230:4: (op= MINUS )
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:230:5: op= MINUS
                    {
                    op=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_unaire1591);  
                    stream_MINUS.add(op);


                    }

                    pushFollow(FOLLOW_expr_unaire_in_expr_unaire1594);
                    expr_unaire83=expr_unaire();

                    state._fsp--;

                    stream_expr_unaire.add(expr_unaire83.getTree());


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
                    // 230:27: -> ^( MOINS_UNITAIRE ^( expr_unaire ) )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:230:30: ^( MOINS_UNITAIRE ^( expr_unaire ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MOINS_UNITAIRE, "MOINS_UNITAIRE"), root_1);

                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:230:47: ^( expr_unaire )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_expr_unaire.nextNode(), root_2);

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:231:4: (op= EXCL | op= STAR | op= AMPS ) expr_unaire
                    {
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:231:4: (op= EXCL | op= STAR | op= AMPS )
                    int alt29=3;
                    switch ( input.LA(1) ) {
                    case EXCL:
                        {
                        alt29=1;
                        }
                        break;
                    case STAR:
                        {
                        alt29=2;
                        }
                        break;
                    case AMPS:
                        {
                        alt29=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }

                    switch (alt29) {
                        case 1 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:231:5: op= EXCL
                            {
                            op=(Token)match(input,EXCL,FOLLOW_EXCL_in_expr_unaire1612);  
                            stream_EXCL.add(op);


                            }
                            break;
                        case 2 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:231:15: op= STAR
                            {
                            op=(Token)match(input,STAR,FOLLOW_STAR_in_expr_unaire1618);  
                            stream_STAR.add(op);


                            }
                            break;
                        case 3 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:231:25: op= AMPS
                            {
                            op=(Token)match(input,AMPS,FOLLOW_AMPS_in_expr_unaire1624);  
                            stream_AMPS.add(op);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_unaire_in_expr_unaire1627);
                    expr_unaire84=expr_unaire();

                    state._fsp--;

                    stream_expr_unaire.add(expr_unaire84.getTree());


                    // AST REWRITE
                    // elements: expr_unaire, op
                    // token labels: op
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 231:46: -> ^( $op ^( expr_unaire ) )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:231:49: ^( $op ^( expr_unaire ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_op.nextNode(), root_1);

                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:231:55: ^( expr_unaire )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_expr_unaire.nextNode(), root_2);

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:232:4: (a= atom -> $a) ( LSQBRACKET expr RSQBRACKET -> ^( INDEX $expr_unaire expr ) )* ( DOT dot_factorisation -> ^( DOT $expr_unaire dot_factorisation ) )*
                    {
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:232:4: (a= atom -> $a)
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:232:5: a= atom
                    {
                    pushFollow(FOLLOW_atom_in_expr_unaire1646);
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
                    // 232:12: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;
                    }

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:232:19: ( LSQBRACKET expr RSQBRACKET -> ^( INDEX $expr_unaire expr ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==LSQBRACKET) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:232:20: LSQBRACKET expr RSQBRACKET
                    	    {
                    	    LSQBRACKET85=(Token)match(input,LSQBRACKET,FOLLOW_LSQBRACKET_in_expr_unaire1655);  
                    	    stream_LSQBRACKET.add(LSQBRACKET85);

                    	    pushFollow(FOLLOW_expr_in_expr_unaire1657);
                    	    expr86=expr();

                    	    state._fsp--;

                    	    stream_expr.add(expr86.getTree());
                    	    RSQBRACKET87=(Token)match(input,RSQBRACKET,FOLLOW_RSQBRACKET_in_expr_unaire1659);  
                    	    stream_RSQBRACKET.add(RSQBRACKET87);



                    	    // AST REWRITE
                    	    // elements: expr_unaire, expr
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 232:47: -> ^( INDEX $expr_unaire expr )
                    	    {
                    	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:232:50: ^( INDEX $expr_unaire expr )
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

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:232:79: ( DOT dot_factorisation -> ^( DOT $expr_unaire dot_factorisation ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==DOT) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:232:80: DOT dot_factorisation
                    	    {
                    	    DOT88=(Token)match(input,DOT,FOLLOW_DOT_in_expr_unaire1675);  
                    	    stream_DOT.add(DOT88);

                    	    pushFollow(FOLLOW_dot_factorisation_in_expr_unaire1677);
                    	    dot_factorisation89=dot_factorisation();

                    	    state._fsp--;

                    	    stream_dot_factorisation.add(dot_factorisation89.getTree());


                    	    // AST REWRITE
                    	    // elements: DOT, expr_unaire, dot_factorisation
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 232:102: -> ^( DOT $expr_unaire dot_factorisation )
                    	    {
                    	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:232:105: ^( DOT $expr_unaire dot_factorisation )
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
                    	    break loop31;
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:235:1: atom : ( CSTE_ENT | CSTE_STR | TRUE | FALSE | IDF ( LPAREN ( params )? RPAREN )? -> {isFunctionCall}? ^( FUNCTION_CALL IDF ( params )? ) -> IDF | LPAREN expr RPAREN -> expr | VEC_MACRO EXCL LSQBRACKET (e+= expr ( COMMA e+= expr )* )? RSQBRACKET -> ^( VEC_MACRO ( $e)* ) | PRINT_MACRO EXCL LPAREN expr RPAREN -> ^( PRINT_MACRO expr ) );
    public final mini_rustParser.atom_return atom() throws RecognitionException {
        mini_rustParser.atom_return retval = new mini_rustParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CSTE_ENT90=null;
        Token CSTE_STR91=null;
        Token TRUE92=null;
        Token FALSE93=null;
        Token IDF94=null;
        Token LPAREN95=null;
        Token RPAREN97=null;
        Token LPAREN98=null;
        Token RPAREN100=null;
        Token VEC_MACRO101=null;
        Token EXCL102=null;
        Token LSQBRACKET103=null;
        Token COMMA104=null;
        Token RSQBRACKET105=null;
        Token PRINT_MACRO106=null;
        Token EXCL107=null;
        Token LPAREN108=null;
        Token RPAREN110=null;
        List list_e=null;
        mini_rustParser.params_return params96 = null;

        mini_rustParser.expr_return expr99 = null;

        mini_rustParser.expr_return expr109 = null;

        RuleReturnScope e = null;
        Object CSTE_ENT90_tree=null;
        Object CSTE_STR91_tree=null;
        Object TRUE92_tree=null;
        Object FALSE93_tree=null;
        Object IDF94_tree=null;
        Object LPAREN95_tree=null;
        Object RPAREN97_tree=null;
        Object LPAREN98_tree=null;
        Object RPAREN100_tree=null;
        Object VEC_MACRO101_tree=null;
        Object EXCL102_tree=null;
        Object LSQBRACKET103_tree=null;
        Object COMMA104_tree=null;
        Object RSQBRACKET105_tree=null;
        Object PRINT_MACRO106_tree=null;
        Object EXCL107_tree=null;
        Object LPAREN108_tree=null;
        Object RPAREN110_tree=null;
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
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:236:2: ( CSTE_ENT | CSTE_STR | TRUE | FALSE | IDF ( LPAREN ( params )? RPAREN )? -> {isFunctionCall}? ^( FUNCTION_CALL IDF ( params )? ) -> IDF | LPAREN expr RPAREN -> expr | VEC_MACRO EXCL LSQBRACKET (e+= expr ( COMMA e+= expr )* )? RSQBRACKET -> ^( VEC_MACRO ( $e)* ) | PRINT_MACRO EXCL LPAREN expr RPAREN -> ^( PRINT_MACRO expr ) )
            int alt37=8;
            switch ( input.LA(1) ) {
            case CSTE_ENT:
                {
                alt37=1;
                }
                break;
            case CSTE_STR:
                {
                alt37=2;
                }
                break;
            case TRUE:
                {
                alt37=3;
                }
                break;
            case FALSE:
                {
                alt37=4;
                }
                break;
            case IDF:
                {
                alt37=5;
                }
                break;
            case LPAREN:
                {
                alt37=6;
                }
                break;
            case VEC_MACRO:
                {
                alt37=7;
                }
                break;
            case PRINT_MACRO:
                {
                alt37=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:237:4: CSTE_ENT
                    {
                    root_0 = (Object)adaptor.nil();

                    CSTE_ENT90=(Token)match(input,CSTE_ENT,FOLLOW_CSTE_ENT_in_atom1704); 
                    CSTE_ENT90_tree = (Object)adaptor.create(CSTE_ENT90);
                    adaptor.addChild(root_0, CSTE_ENT90_tree);


                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:238:4: CSTE_STR
                    {
                    root_0 = (Object)adaptor.nil();

                    CSTE_STR91=(Token)match(input,CSTE_STR,FOLLOW_CSTE_STR_in_atom1709); 
                    CSTE_STR91_tree = (Object)adaptor.create(CSTE_STR91);
                    adaptor.addChild(root_0, CSTE_STR91_tree);


                    }
                    break;
                case 3 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:239:4: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    TRUE92=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1714); 
                    TRUE92_tree = (Object)adaptor.create(TRUE92);
                    adaptor.addChild(root_0, TRUE92_tree);


                    }
                    break;
                case 4 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:240:4: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    FALSE93=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1719); 
                    FALSE93_tree = (Object)adaptor.create(FALSE93);
                    adaptor.addChild(root_0, FALSE93_tree);


                    }
                    break;
                case 5 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:242:4: IDF ( LPAREN ( params )? RPAREN )?
                    {
                     boolean isFunctionCall = false; 
                    IDF94=(Token)match(input,IDF,FOLLOW_IDF_in_atom1732);  
                    stream_IDF.add(IDF94);

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:243:8: ( LPAREN ( params )? RPAREN )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==LPAREN) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:243:9: LPAREN ( params )? RPAREN
                            {
                            LPAREN95=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom1735);  
                            stream_LPAREN.add(LPAREN95);

                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:243:16: ( params )?
                            int alt33=2;
                            int LA33_0 = input.LA(1);

                            if ( (LA33_0==CSTE_ENT||LA33_0==LPAREN||LA33_0==MINUS||(LA33_0>=STAR && LA33_0<=EXCL)||LA33_0==AMPS||(LA33_0>=VEC_MACRO && LA33_0<=PRINT_MACRO)||(LA33_0>=TRUE && LA33_0<=FALSE)||(LA33_0>=IDF && LA33_0<=CSTE_STR)) ) {
                                alt33=1;
                            }
                            switch (alt33) {
                                case 1 :
                                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:243:17: params
                                    {
                                    pushFollow(FOLLOW_params_in_atom1738);
                                    params96=params();

                                    state._fsp--;

                                    stream_params.add(params96.getTree());

                                    }
                                    break;

                            }

                            RPAREN97=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom1742);  
                            stream_RPAREN.add(RPAREN97);

                             isFunctionCall = true; 

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: IDF, IDF, params
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 244:4: -> {isFunctionCall}? ^( FUNCTION_CALL IDF ( params )? )
                    if (isFunctionCall) {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:244:25: ^( FUNCTION_CALL IDF ( params )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:244:45: ( params )?
                        if ( stream_params.hasNext() ) {
                            adaptor.addChild(root_1, stream_params.nextTree());

                        }
                        stream_params.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 245:4: -> IDF
                    {
                        adaptor.addChild(root_0, stream_IDF.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:246:4: LPAREN expr RPAREN
                    {
                    LPAREN98=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom1774);  
                    stream_LPAREN.add(LPAREN98);

                    pushFollow(FOLLOW_expr_in_atom1776);
                    expr99=expr();

                    state._fsp--;

                    stream_expr.add(expr99.getTree());
                    RPAREN100=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom1778);  
                    stream_RPAREN.add(RPAREN100);



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
                    // 246:23: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:247:4: VEC_MACRO EXCL LSQBRACKET (e+= expr ( COMMA e+= expr )* )? RSQBRACKET
                    {
                    VEC_MACRO101=(Token)match(input,VEC_MACRO,FOLLOW_VEC_MACRO_in_atom1787);  
                    stream_VEC_MACRO.add(VEC_MACRO101);

                    EXCL102=(Token)match(input,EXCL,FOLLOW_EXCL_in_atom1789);  
                    stream_EXCL.add(EXCL102);

                    LSQBRACKET103=(Token)match(input,LSQBRACKET,FOLLOW_LSQBRACKET_in_atom1791);  
                    stream_LSQBRACKET.add(LSQBRACKET103);

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:247:30: (e+= expr ( COMMA e+= expr )* )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==CSTE_ENT||LA36_0==LPAREN||LA36_0==MINUS||(LA36_0>=STAR && LA36_0<=EXCL)||LA36_0==AMPS||(LA36_0>=VEC_MACRO && LA36_0<=PRINT_MACRO)||(LA36_0>=TRUE && LA36_0<=FALSE)||(LA36_0>=IDF && LA36_0<=CSTE_STR)) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:247:31: e+= expr ( COMMA e+= expr )*
                            {
                            pushFollow(FOLLOW_expr_in_atom1796);
                            e=expr();

                            state._fsp--;

                            stream_expr.add(e.getTree());
                            if (list_e==null) list_e=new ArrayList();
                            list_e.add(e.getTree());

                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:247:39: ( COMMA e+= expr )*
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( (LA35_0==COMMA) ) {
                                    alt35=1;
                                }


                                switch (alt35) {
                            	case 1 :
                            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:247:40: COMMA e+= expr
                            	    {
                            	    COMMA104=(Token)match(input,COMMA,FOLLOW_COMMA_in_atom1799);  
                            	    stream_COMMA.add(COMMA104);

                            	    pushFollow(FOLLOW_expr_in_atom1803);
                            	    e=expr();

                            	    state._fsp--;

                            	    stream_expr.add(e.getTree());
                            	    if (list_e==null) list_e=new ArrayList();
                            	    list_e.add(e.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop35;
                                }
                            } while (true);


                            }
                            break;

                    }

                    RSQBRACKET105=(Token)match(input,RSQBRACKET,FOLLOW_RSQBRACKET_in_atom1809);  
                    stream_RSQBRACKET.add(RSQBRACKET105);



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
                    // 247:69: -> ^( VEC_MACRO ( $e)* )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:247:72: ^( VEC_MACRO ( $e)* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_VEC_MACRO.nextNode(), root_1);

                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:247:84: ( $e)*
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
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:248:4: PRINT_MACRO EXCL LPAREN expr RPAREN
                    {
                    PRINT_MACRO106=(Token)match(input,PRINT_MACRO,FOLLOW_PRINT_MACRO_in_atom1826);  
                    stream_PRINT_MACRO.add(PRINT_MACRO106);

                    EXCL107=(Token)match(input,EXCL,FOLLOW_EXCL_in_atom1828);  
                    stream_EXCL.add(EXCL107);

                    LPAREN108=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom1830);  
                    stream_LPAREN.add(LPAREN108);

                    pushFollow(FOLLOW_expr_in_atom1832);
                    expr109=expr();

                    state._fsp--;

                    stream_expr.add(expr109.getTree());
                    RPAREN110=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom1834);  
                    stream_RPAREN.add(RPAREN110);



                    // AST REWRITE
                    // elements: expr, PRINT_MACRO
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 248:40: -> ^( PRINT_MACRO expr )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:248:43: ^( PRINT_MACRO expr )
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

    public static class params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "params"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:251:1: params : ( expr ( COMMA expr )* ) -> ^( PARAMS ( expr )+ ) ;
    public final mini_rustParser.params_return params() throws RecognitionException {
        mini_rustParser.params_return retval = new mini_rustParser.params_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA112=null;
        mini_rustParser.expr_return expr111 = null;

        mini_rustParser.expr_return expr113 = null;


        Object COMMA112_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:252:2: ( ( expr ( COMMA expr )* ) -> ^( PARAMS ( expr )+ ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:253:2: ( expr ( COMMA expr )* )
            {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:253:2: ( expr ( COMMA expr )* )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:253:3: expr ( COMMA expr )*
            {
            pushFollow(FOLLOW_expr_in_params1855);
            expr111=expr();

            state._fsp--;

            stream_expr.add(expr111.getTree());
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:253:8: ( COMMA expr )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==COMMA) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:253:9: COMMA expr
            	    {
            	    COMMA112=(Token)match(input,COMMA,FOLLOW_COMMA_in_params1858);  
            	    stream_COMMA.add(COMMA112);

            	    pushFollow(FOLLOW_expr_in_params1860);
            	    expr113=expr();

            	    state._fsp--;

            	    stream_expr.add(expr113.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }



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
            // 253:23: -> ^( PARAMS ( expr )+ )
            {
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:253:26: ^( PARAMS ( expr )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_1);

                if ( !(stream_expr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

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
    // $ANTLR end "params"

    // Delegated rules


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\15\uffff";
    static final String DFA20_eofS =
        "\15\uffff";
    static final String DFA20_minS =
        "\1\14\14\uffff";
    static final String DFA20_maxS =
        "\1\100\14\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA20_specialS =
        "\15\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\2\10\uffff\1\2\16\uffff\1\2\1\uffff\2\2\2\uffff\1\2\11\uffff"+
            "\2\2\3\uffff\2\2\4\uffff\1\1\1\2",
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
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "161:1: obj_expr : ( IDF obj_def -> ^( OBJ IDF obj_def ) | expr -> expr );";
        }
    }
 

    public static final BitSet FOLLOW_decl_in_fichier479 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_decl_func_in_decl504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_struct_in_decl509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FN_in_decl_func521 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_IDF_in_decl_func523 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_decl_func525 = new BitSet(new long[]{0x8000000000400000L});
    public static final BitSet FOLLOW_argument_in_decl_func528 = new BitSet(new long[]{0x0800000000400000L});
    public static final BitSet FOLLOW_COMMA_in_decl_func531 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_argument_in_decl_func533 = new BitSet(new long[]{0x0800000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_decl_func539 = new BitSet(new long[]{0x4000000000800000L});
    public static final BitSet FOLLOW_ARROW_in_decl_func542 = new BitSet(new long[]{0x81C0040000000000L});
    public static final BitSet FOLLOW_type_in_decl_func544 = new BitSet(new long[]{0x4000000000800000L});
    public static final BitSet FOLLOW_bloc_in_decl_func548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUCT_in_decl_struct580 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_IDF_in_decl_struct584 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LBRACKET_in_decl_struct586 = new BitSet(new long[]{0x8000000001000000L});
    public static final BitSet FOLLOW_IDF_in_decl_struct591 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_COLON_in_decl_struct593 = new BitSet(new long[]{0x81C0040000000000L});
    public static final BitSet FOLLOW_type_in_decl_struct597 = new BitSet(new long[]{0x0800000001000000L});
    public static final BitSet FOLLOW_COMMA_in_decl_struct600 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_IDF_in_decl_struct604 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_COLON_in_decl_struct606 = new BitSet(new long[]{0x81C0040000000000L});
    public static final BitSet FOLLOW_type_in_decl_struct610 = new BitSet(new long[]{0x0800000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_decl_struct616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_type650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEC_TYPE_in_type655 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LT_in_type657 = new BitSet(new long[]{0x81C0040000000000L});
    public static final BitSet FOLLOW_type_in_type659 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_GT_in_type661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPS_in_type674 = new BitSet(new long[]{0x81C0040000000000L});
    public static final BitSet FOLLOW_type_in_type676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT32_TYPE_in_type682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_TYPE_in_type687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_argument699 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_COLON_in_argument701 = new BitSet(new long[]{0x81C0040000000000L});
    public static final BitSet FOLLOW_type_in_argument703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_bloc725 = new BitSet(new long[]{0xD63B14D001A01000L,0x0000000000000001L});
    public static final BitSet FOLLOW_instruction_bloc_in_bloc727 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_bloc729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_instruction_bloc752 = new BitSet(new long[]{0xD63B14D000A01000L,0x0000000000000001L});
    public static final BitSet FOLLOW_instruction_bloc_in_instruction_bloc754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_instruction_bloc760 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_instruction_bloc765 = new BitSet(new long[]{0xD63B14D000A01000L,0x0000000000000001L});
    public static final BitSet FOLLOW_instruction_bloc_in_instruction_bloc767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LET_in_instruction791 = new BitSet(new long[]{0x863024D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_instruction_let_in_instruction793 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_instruction795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_instruction804 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_instruction806 = new BitSet(new long[]{0x4000000000800000L});
    public static final BitSet FOLLOW_bloc_in_instruction808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_instruction823 = new BitSet(new long[]{0x963004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_instruction826 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_instruction830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_instruction844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bloc_in_instruction849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUT_in_instruction_let865 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_instruction_let867 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_let_assign_in_instruction_let870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_instruction_let892 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_let_assign_in_instruction_let895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_let_assign922 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_let_assign924 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_obj_def_in_let_assign940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_obj_def966 = new BitSet(new long[]{0x8000000001000000L});
    public static final BitSet FOLLOW_IDF_in_obj_def971 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_COLON_in_obj_def973 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_obj_expr_in_obj_def977 = new BitSet(new long[]{0x0800000001000000L});
    public static final BitSet FOLLOW_COMMA_in_obj_def980 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_IDF_in_obj_def984 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_COLON_in_obj_def986 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_obj_expr_in_obj_def990 = new BitSet(new long[]{0x0800000001000000L});
    public static final BitSet FOLLOW_RBRACKET_in_obj_def996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_obj_expr1023 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_obj_def_in_obj_expr1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_obj_expr1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_expr1057 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_if_expr1059 = new BitSet(new long[]{0x4000000000800000L});
    public static final BitSet FOLLOW_bloc_in_if_expr1061 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_else_expr_in_if_expr1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_expr1093 = new BitSet(new long[]{0x4002000000800000L});
    public static final BitSet FOLLOW_bloc_in_else_expr1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_else_expr1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_ou_in_expr1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_dot_factorisation1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEN_in_dot_factorisation1152 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_dot_factorisation1154 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_dot_factorisation1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_et_in_expr_ou1175 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_OR_in_expr_ou1184 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_et_in_expr_ou1188 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_expr_comp_in_expr_et1217 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_AND_in_expr_et1226 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_comp_in_expr_et1230 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_expr_plus_in_expr_comp1262 = new BitSet(new long[]{0x00000001F8000002L});
    public static final BitSet FOLLOW_LT_in_expr_comp1279 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_plus_in_expr_comp1283 = new BitSet(new long[]{0x00000001F8000002L});
    public static final BitSet FOLLOW_LE_in_expr_comp1304 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_plus_in_expr_comp1308 = new BitSet(new long[]{0x00000001F8000002L});
    public static final BitSet FOLLOW_GT_in_expr_comp1329 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_plus_in_expr_comp1333 = new BitSet(new long[]{0x00000001F8000002L});
    public static final BitSet FOLLOW_GE_in_expr_comp1354 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_plus_in_expr_comp1358 = new BitSet(new long[]{0x00000001F8000002L});
    public static final BitSet FOLLOW_EQ_in_expr_comp1379 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_plus_in_expr_comp1383 = new BitSet(new long[]{0x00000001F8000002L});
    public static final BitSet FOLLOW_NE_in_expr_comp1405 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_plus_in_expr_comp1409 = new BitSet(new long[]{0x00000001F8000002L});
    public static final BitSet FOLLOW_expr_mult_in_expr_plus1444 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_PLUS_in_expr_plus1454 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_mult_in_expr_plus1458 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_MINUS_in_expr_plus1475 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_mult_in_expr_plus1479 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_expr_unaire_in_expr_mult1511 = new BitSet(new long[]{0x0000002000100002L});
    public static final BitSet FOLLOW_MUL_in_expr_mult1528 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_unaire_in_expr_mult1532 = new BitSet(new long[]{0x0000002000100002L});
    public static final BitSet FOLLOW_DIV_in_expr_mult1553 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_unaire_in_expr_mult1557 = new BitSet(new long[]{0x0000002000100002L});
    public static final BitSet FOLLOW_MINUS_in_expr_unaire1591 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_unaire_in_expr_unaire1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCL_in_expr_unaire1612 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_STAR_in_expr_unaire1618 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_AMPS_in_expr_unaire1624 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_unaire_in_expr_unaire1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_expr_unaire1646 = new BitSet(new long[]{0x0000020002000002L});
    public static final BitSet FOLLOW_LSQBRACKET_in_expr_unaire1655 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_expr_unaire1657 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RSQBRACKET_in_expr_unaire1659 = new BitSet(new long[]{0x0000020002000002L});
    public static final BitSet FOLLOW_DOT_in_expr_unaire1675 = new BitSet(new long[]{0x8000080000000000L});
    public static final BitSet FOLLOW_dot_factorisation_in_expr_unaire1677 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_CSTE_ENT_in_atom1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTE_STR_in_atom1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_atom1732 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_LPAREN_in_atom1735 = new BitSet(new long[]{0x863004D000601000L,0x0000000000000001L});
    public static final BitSet FOLLOW_params_in_atom1738 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_atom1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom1774 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_atom1776 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_atom1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEC_MACRO_in_atom1787 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_EXCL_in_atom1789 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LSQBRACKET_in_atom1791 = new BitSet(new long[]{0x863004D004201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_atom1796 = new BitSet(new long[]{0x0800000004000000L});
    public static final BitSet FOLLOW_COMMA_in_atom1799 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_atom1803 = new BitSet(new long[]{0x0800000004000000L});
    public static final BitSet FOLLOW_RSQBRACKET_in_atom1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_MACRO_in_atom1826 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_EXCL_in_atom1828 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_atom1830 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_atom1832 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_atom1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_params1855 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_COMMA_in_params1858 = new BitSet(new long[]{0x863004D000201000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_params1860 = new BitSet(new long[]{0x0800000000000002L});

}