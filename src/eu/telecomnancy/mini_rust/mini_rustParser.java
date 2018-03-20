// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g 2018-03-20 15:45:29

	package eu.telecomnancy.mini_rust;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class mini_rustParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FICHIER", "DECL_FUNC", "DECL_STRUCT", "TYPE", "ARGUMENTS", "ARGUMENT", "BLOC", "FUNC_CALL", "CSTE_ENT", "INDEX", "FUNCTION_CALL", "PARAMS", "MOINS_UNITAIRE", "OBJ", "MEMBER", "LETMUT", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "LSQBRACKET", "RSQBRACKET", "GT", "GE", "LT", "LE", "EQ", "NE", "AND", "OR", "PLUS", "MINUS", "DIV", "STAR", "EXCL", "ASSIGN", "DOT", "AMPS", "LEN", "LET", "MUT", "FN", "STRUCT", "WHILE", "IF", "ELSE", "RETURN", "VEC_MACRO", "PRINT_MACRO", "VEC_TYPE", "INT32_TYPE", "BOOL_TYPE", "TRUE", "FALSE", "COMMA", "SEMICOLON", "COLON", "ARROW", "IDF", "CSTE_STR", "LOWERCASE", "UPPERCASE", "DIGIT", "COMMENTS", "WS"
    };
    public static final int LSQBRACKET=24;
    public static final int LT=28;
    public static final int MEMBER=18;
    public static final int STAR=37;
    public static final int IDF=62;
    public static final int WHILE=47;
    public static final int BOOL_TYPE=55;
    public static final int PRINT_MACRO=52;
    public static final int EXCL=38;
    public static final int AND=32;
    public static final int EOF=-1;
    public static final int INT32_TYPE=54;
    public static final int LPAREN=20;
    public static final int IF=48;
    public static final int FUNC_CALL=11;
    public static final int TYPE=7;
    public static final int LBRACKET=22;
    public static final int INDEX=13;
    public static final int RSQBRACKET=25;
    public static final int RPAREN=21;
    public static final int UPPERCASE=65;
    public static final int COMMENTS=67;
    public static final int COMMA=58;
    public static final int OBJ=17;
    public static final int ARGUMENT=9;
    public static final int FICHIER=4;
    public static final int RETURN=50;
    public static final int MOINS_UNITAIRE=16;
    public static final int PLUS=34;
    public static final int LETMUT=19;
    public static final int DIGIT=66;
    public static final int RBRACKET=23;
    public static final int EQ=30;
    public static final int DOT=40;
    public static final int PARAMS=15;
    public static final int NE=31;
    public static final int GE=27;
    public static final int DECL_STRUCT=6;
    public static final int AMPS=41;
    public static final int ARGUMENTS=8;
    public static final int BLOC=10;
    public static final int ELSE=49;
    public static final int MUT=44;
    public static final int STRUCT=46;
    public static final int SEMICOLON=59;
    public static final int FN=45;
    public static final int MINUS=35;
    public static final int DECL_FUNC=5;
    public static final int TRUE=56;
    public static final int CSTE_STR=63;
    public static final int COLON=60;
    public static final int VEC_MACRO=51;
    public static final int WS=68;
    public static final int LOWERCASE=64;
    public static final int VEC_TYPE=53;
    public static final int OR=33;
    public static final int ASSIGN=39;
    public static final int ARROW=61;
    public static final int GT=26;
    public static final int LEN=42;
    public static final int CSTE_ENT=12;
    public static final int DIV=36;
    public static final int FALSE=57;
    public static final int FUNCTION_CALL=14;
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
            	    pushFollow(FOLLOW_decl_in_fichier478);
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

                    pushFollow(FOLLOW_decl_func_in_decl503);
                    decl_func2=decl_func();

                    state._fsp--;

                    adaptor.addChild(root_0, decl_func2.getTree());

                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:94:4: decl_struct
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_decl_struct_in_decl508);
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:97:1: decl_func : FN IDF LPAREN ( arguments )? RPAREN ( ARROW type )? bloc -> ^( DECL_FUNC IDF ( arguments )? ( type )? bloc ) ;
    public final mini_rustParser.decl_func_return decl_func() throws RecognitionException {
        mini_rustParser.decl_func_return retval = new mini_rustParser.decl_func_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FN4=null;
        Token IDF5=null;
        Token LPAREN6=null;
        Token RPAREN8=null;
        Token ARROW9=null;
        mini_rustParser.arguments_return arguments7 = null;

        mini_rustParser.type_return type10 = null;

        mini_rustParser.bloc_return bloc11 = null;


        Object FN4_tree=null;
        Object IDF5_tree=null;
        Object LPAREN6_tree=null;
        Object RPAREN8_tree=null;
        Object ARROW9_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_FN=new RewriteRuleTokenStream(adaptor,"token FN");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:98:2: ( FN IDF LPAREN ( arguments )? RPAREN ( ARROW type )? bloc -> ^( DECL_FUNC IDF ( arguments )? ( type )? bloc ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:99:2: FN IDF LPAREN ( arguments )? RPAREN ( ARROW type )? bloc
            {
            FN4=(Token)match(input,FN,FOLLOW_FN_in_decl_func520);  
            stream_FN.add(FN4);

            IDF5=(Token)match(input,IDF,FOLLOW_IDF_in_decl_func522);  
            stream_IDF.add(IDF5);

            LPAREN6=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_decl_func524);  
            stream_LPAREN.add(LPAREN6);

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:99:16: ( arguments )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDF) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:99:17: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_decl_func527);
                    arguments7=arguments();

                    state._fsp--;

                    stream_arguments.add(arguments7.getTree());

                    }
                    break;

            }

            RPAREN8=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_decl_func531);  
            stream_RPAREN.add(RPAREN8);

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:99:36: ( ARROW type )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ARROW) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:99:37: ARROW type
                    {
                    ARROW9=(Token)match(input,ARROW,FOLLOW_ARROW_in_decl_func534);  
                    stream_ARROW.add(ARROW9);

                    pushFollow(FOLLOW_type_in_decl_func536);
                    type10=type();

                    state._fsp--;

                    stream_type.add(type10.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_bloc_in_decl_func540);
            bloc11=bloc();

            state._fsp--;

            stream_bloc.add(bloc11.getTree());


            // AST REWRITE
            // elements: bloc, IDF, arguments, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 99:55: -> ^( DECL_FUNC IDF ( arguments )? ( type )? bloc )
            {
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:99:58: ^( DECL_FUNC IDF ( arguments )? ( type )? bloc )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL_FUNC, "DECL_FUNC"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:99:74: ( arguments )?
                if ( stream_arguments.hasNext() ) {
                    adaptor.addChild(root_1, stream_arguments.nextTree());

                }
                stream_arguments.reset();
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:99:87: ( type )?
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
        Token STRUCT12=null;
        Token LBRACKET13=null;
        Token COLON14=null;
        Token COMMA15=null;
        Token COLON16=null;
        Token RBRACKET17=null;
        Token i=null;
        List list_i=null;
        List list_t=null;
        RuleReturnScope t = null;
        Object idf_tree=null;
        Object STRUCT12_tree=null;
        Object LBRACKET13_tree=null;
        Object COLON14_tree=null;
        Object COMMA15_tree=null;
        Object COLON16_tree=null;
        Object RBRACKET17_tree=null;
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
            STRUCT12=(Token)match(input,STRUCT,FOLLOW_STRUCT_in_decl_struct572);  
            stream_STRUCT.add(STRUCT12);

            idf=(Token)match(input,IDF,FOLLOW_IDF_in_decl_struct576);  
            stream_IDF.add(idf);

            LBRACKET13=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_decl_struct578);  
            stream_LBRACKET.add(LBRACKET13);

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:104:26: (i+= IDF COLON t+= type ( COMMA i+= IDF COLON t+= type )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDF) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:104:27: i+= IDF COLON t+= type ( COMMA i+= IDF COLON t+= type )*
                    {
                    i=(Token)match(input,IDF,FOLLOW_IDF_in_decl_struct583);  
                    stream_IDF.add(i);

                    if (list_i==null) list_i=new ArrayList();
                    list_i.add(i);

                    COLON14=(Token)match(input,COLON,FOLLOW_COLON_in_decl_struct585);  
                    stream_COLON.add(COLON14);

                    pushFollow(FOLLOW_type_in_decl_struct589);
                    t=type();

                    state._fsp--;

                    stream_type.add(t.getTree());
                    if (list_t==null) list_t=new ArrayList();
                    list_t.add(t.getTree());

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:104:48: ( COMMA i+= IDF COLON t+= type )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==COMMA) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:104:49: COMMA i+= IDF COLON t+= type
                    	    {
                    	    COMMA15=(Token)match(input,COMMA,FOLLOW_COMMA_in_decl_struct592);  
                    	    stream_COMMA.add(COMMA15);

                    	    i=(Token)match(input,IDF,FOLLOW_IDF_in_decl_struct596);  
                    	    stream_IDF.add(i);

                    	    if (list_i==null) list_i=new ArrayList();
                    	    list_i.add(i);

                    	    COLON16=(Token)match(input,COLON,FOLLOW_COLON_in_decl_struct598);  
                    	    stream_COLON.add(COLON16);

                    	    pushFollow(FOLLOW_type_in_decl_struct602);
                    	    t=type();

                    	    state._fsp--;

                    	    stream_type.add(t.getTree());
                    	    if (list_t==null) list_t=new ArrayList();
                    	    list_t.add(t.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            RBRACKET17=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_decl_struct608);  
            stream_RBRACKET.add(RBRACKET17);



            // AST REWRITE
            // elements: t, i, idf
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
                while ( stream_t.hasNext()||stream_i.hasNext() ) {
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:104:111: ^( MEMBER $i $t)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MEMBER, "MEMBER"), root_2);

                    adaptor.addChild(root_2, stream_i.nextNode());
                    adaptor.addChild(root_2, stream_t.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_t.reset();
                stream_i.reset();

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

    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:107:1: arguments : argument ( COMMA argument )* -> ^( ARGUMENTS ( argument )* ) ;
    public final mini_rustParser.arguments_return arguments() throws RecognitionException {
        mini_rustParser.arguments_return retval = new mini_rustParser.arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA19=null;
        mini_rustParser.argument_return argument18 = null;

        mini_rustParser.argument_return argument20 = null;


        Object COMMA19_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:108:2: ( argument ( COMMA argument )* -> ^( ARGUMENTS ( argument )* ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:109:2: argument ( COMMA argument )*
            {
            pushFollow(FOLLOW_argument_in_arguments640);
            argument18=argument();

            state._fsp--;

            stream_argument.add(argument18.getTree());
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:109:11: ( COMMA argument )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:109:12: COMMA argument
            	    {
            	    COMMA19=(Token)match(input,COMMA,FOLLOW_COMMA_in_arguments643);  
            	    stream_COMMA.add(COMMA19);

            	    pushFollow(FOLLOW_argument_in_arguments645);
            	    argument20=argument();

            	    state._fsp--;

            	    stream_argument.add(argument20.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);



            // AST REWRITE
            // elements: argument
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 109:29: -> ^( ARGUMENTS ( argument )* )
            {
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:109:32: ^( ARGUMENTS ( argument )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:109:44: ( argument )*
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
    // $ANTLR end "arguments"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:112:1: type : ( IDF | VEC_TYPE LT type GT -> ^( VEC_TYPE type ) | AMPS type | INT32_TYPE | BOOL_TYPE );
    public final mini_rustParser.type_return type() throws RecognitionException {
        mini_rustParser.type_return retval = new mini_rustParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF21=null;
        Token VEC_TYPE22=null;
        Token LT23=null;
        Token GT25=null;
        Token AMPS26=null;
        Token INT32_TYPE28=null;
        Token BOOL_TYPE29=null;
        mini_rustParser.type_return type24 = null;

        mini_rustParser.type_return type27 = null;


        Object IDF21_tree=null;
        Object VEC_TYPE22_tree=null;
        Object LT23_tree=null;
        Object GT25_tree=null;
        Object AMPS26_tree=null;
        Object INT32_TYPE28_tree=null;
        Object BOOL_TYPE29_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_VEC_TYPE=new RewriteRuleTokenStream(adaptor,"token VEC_TYPE");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:113:2: ( IDF | VEC_TYPE LT type GT -> ^( VEC_TYPE type ) | AMPS type | INT32_TYPE | BOOL_TYPE )
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
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:114:4: IDF
                    {
                    root_0 = (Object)adaptor.nil();

                    IDF21=(Token)match(input,IDF,FOLLOW_IDF_in_type670); 
                    IDF21_tree = (Object)adaptor.create(IDF21);
                    adaptor.addChild(root_0, IDF21_tree);


                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:115:4: VEC_TYPE LT type GT
                    {
                    VEC_TYPE22=(Token)match(input,VEC_TYPE,FOLLOW_VEC_TYPE_in_type675);  
                    stream_VEC_TYPE.add(VEC_TYPE22);

                    LT23=(Token)match(input,LT,FOLLOW_LT_in_type677);  
                    stream_LT.add(LT23);

                    pushFollow(FOLLOW_type_in_type679);
                    type24=type();

                    state._fsp--;

                    stream_type.add(type24.getTree());
                    GT25=(Token)match(input,GT,FOLLOW_GT_in_type681);  
                    stream_GT.add(GT25);



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
                    // 115:24: -> ^( VEC_TYPE type )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:115:27: ^( VEC_TYPE type )
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
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:116:4: AMPS type
                    {
                    root_0 = (Object)adaptor.nil();

                    AMPS26=(Token)match(input,AMPS,FOLLOW_AMPS_in_type694); 
                    AMPS26_tree = (Object)adaptor.create(AMPS26);
                    adaptor.addChild(root_0, AMPS26_tree);

                    pushFollow(FOLLOW_type_in_type696);
                    type27=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type27.getTree());

                    }
                    break;
                case 4 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:117:4: INT32_TYPE
                    {
                    root_0 = (Object)adaptor.nil();

                    INT32_TYPE28=(Token)match(input,INT32_TYPE,FOLLOW_INT32_TYPE_in_type702); 
                    INT32_TYPE28_tree = (Object)adaptor.create(INT32_TYPE28);
                    adaptor.addChild(root_0, INT32_TYPE28_tree);


                    }
                    break;
                case 5 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:118:4: BOOL_TYPE
                    {
                    root_0 = (Object)adaptor.nil();

                    BOOL_TYPE29=(Token)match(input,BOOL_TYPE,FOLLOW_BOOL_TYPE_in_type707); 
                    BOOL_TYPE29_tree = (Object)adaptor.create(BOOL_TYPE29);
                    adaptor.addChild(root_0, BOOL_TYPE29_tree);


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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:121:1: argument : IDF COLON type -> ^( ARGUMENT IDF type ) ;
    public final mini_rustParser.argument_return argument() throws RecognitionException {
        mini_rustParser.argument_return retval = new mini_rustParser.argument_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF30=null;
        Token COLON31=null;
        mini_rustParser.type_return type32 = null;


        Object IDF30_tree=null;
        Object COLON31_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:122:2: ( IDF COLON type -> ^( ARGUMENT IDF type ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:123:2: IDF COLON type
            {
            IDF30=(Token)match(input,IDF,FOLLOW_IDF_in_argument719);  
            stream_IDF.add(IDF30);

            COLON31=(Token)match(input,COLON,FOLLOW_COLON_in_argument721);  
            stream_COLON.add(COLON31);

            pushFollow(FOLLOW_type_in_argument723);
            type32=type();

            state._fsp--;

            stream_type.add(type32.getTree());


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
            // 123:17: -> ^( ARGUMENT IDF type )
            {
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:123:20: ^( ARGUMENT IDF type )
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:126:1: bloc : LBRACKET instruction_bloc RBRACKET -> ^( BLOC ( instruction_bloc )? ) ;
    public final mini_rustParser.bloc_return bloc() throws RecognitionException {
        mini_rustParser.bloc_return retval = new mini_rustParser.bloc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LBRACKET33=null;
        Token RBRACKET35=null;
        mini_rustParser.instruction_bloc_return instruction_bloc34 = null;


        Object LBRACKET33_tree=null;
        Object RBRACKET35_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_instruction_bloc=new RewriteRuleSubtreeStream(adaptor,"rule instruction_bloc");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:127:2: ( LBRACKET instruction_bloc RBRACKET -> ^( BLOC ( instruction_bloc )? ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:128:2: LBRACKET instruction_bloc RBRACKET
            {
            LBRACKET33=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_bloc745);  
            stream_LBRACKET.add(LBRACKET33);

            pushFollow(FOLLOW_instruction_bloc_in_bloc747);
            instruction_bloc34=instruction_bloc();

            state._fsp--;

            stream_instruction_bloc.add(instruction_bloc34.getTree());
            RBRACKET35=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_bloc749);  
            stream_RBRACKET.add(RBRACKET35);



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
            // 128:37: -> ^( BLOC ( instruction_bloc )? )
            {
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:128:40: ^( BLOC ( instruction_bloc )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOC, "BLOC"), root_1);

                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:128:47: ( instruction_bloc )?
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:131:1: instruction_bloc : ( instruction instruction_bloc | ( expr )? ( SEMICOLON instruction_bloc )? -> ( expr )? ( instruction_bloc )? );
    public final mini_rustParser.instruction_bloc_return instruction_bloc() throws RecognitionException {
        mini_rustParser.instruction_bloc_return retval = new mini_rustParser.instruction_bloc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON39=null;
        mini_rustParser.instruction_return instruction36 = null;

        mini_rustParser.instruction_bloc_return instruction_bloc37 = null;

        mini_rustParser.expr_return expr38 = null;

        mini_rustParser.instruction_bloc_return instruction_bloc40 = null;


        Object SEMICOLON39_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_instruction_bloc=new RewriteRuleSubtreeStream(adaptor,"rule instruction_bloc");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:132:2: ( instruction instruction_bloc | ( expr )? ( SEMICOLON instruction_bloc )? -> ( expr )? ( instruction_bloc )? )
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
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:133:4: instruction instruction_bloc
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_instruction_in_instruction_bloc772);
                    instruction36=instruction();

                    state._fsp--;

                    adaptor.addChild(root_0, instruction36.getTree());
                    pushFollow(FOLLOW_instruction_bloc_in_instruction_bloc774);
                    instruction_bloc37=instruction_bloc();

                    state._fsp--;

                    adaptor.addChild(root_0, instruction_bloc37.getTree());

                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:134:4: ( expr )? ( SEMICOLON instruction_bloc )?
                    {
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:134:4: ( expr )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==CSTE_ENT||LA9_0==LPAREN||LA9_0==MINUS||(LA9_0>=STAR && LA9_0<=EXCL)||LA9_0==AMPS||(LA9_0>=VEC_MACRO && LA9_0<=PRINT_MACRO)||(LA9_0>=TRUE && LA9_0<=FALSE)||(LA9_0>=IDF && LA9_0<=CSTE_STR)) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:134:5: expr
                            {
                            pushFollow(FOLLOW_expr_in_instruction_bloc780);
                            expr38=expr();

                            state._fsp--;

                            stream_expr.add(expr38.getTree());

                            }
                            break;

                    }

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:134:12: ( SEMICOLON instruction_bloc )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==SEMICOLON) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:134:13: SEMICOLON instruction_bloc
                            {
                            SEMICOLON39=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_instruction_bloc785);  
                            stream_SEMICOLON.add(SEMICOLON39);

                            pushFollow(FOLLOW_instruction_bloc_in_instruction_bloc787);
                            instruction_bloc40=instruction_bloc();

                            state._fsp--;

                            stream_instruction_bloc.add(instruction_bloc40.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: expr, instruction_bloc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 134:42: -> ( expr )? ( instruction_bloc )?
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:134:45: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_0, stream_expr.nextTree());

                        }
                        stream_expr.reset();
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:134:51: ( instruction_bloc )?
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:137:1: instruction : ( ( LET ( MUT )? e1= expr ) ( ASSIGN e2= expr ( obj_def )? )? SEMICOLON -> {isMut}? ^( LETMUT $e1 ( $e2)? ( obj_def )? ) -> ^( LET $e1 ( $e2)? ( obj_def )? ) | WHILE expr bloc -> ^( WHILE expr bloc ) | RETURN ( expr )? SEMICOLON -> ^( RETURN ( expr )? ) | if_expr | bloc );
    public final mini_rustParser.instruction_return instruction() throws RecognitionException {
        mini_rustParser.instruction_return retval = new mini_rustParser.instruction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LET41=null;
        Token MUT42=null;
        Token ASSIGN43=null;
        Token SEMICOLON45=null;
        Token WHILE46=null;
        Token RETURN49=null;
        Token SEMICOLON51=null;
        mini_rustParser.expr_return e1 = null;

        mini_rustParser.expr_return e2 = null;

        mini_rustParser.obj_def_return obj_def44 = null;

        mini_rustParser.expr_return expr47 = null;

        mini_rustParser.bloc_return bloc48 = null;

        mini_rustParser.expr_return expr50 = null;

        mini_rustParser.if_expr_return if_expr52 = null;

        mini_rustParser.bloc_return bloc53 = null;


        Object LET41_tree=null;
        Object MUT42_tree=null;
        Object ASSIGN43_tree=null;
        Object SEMICOLON45_tree=null;
        Object WHILE46_tree=null;
        Object RETURN49_tree=null;
        Object SEMICOLON51_tree=null;
        RewriteRuleTokenStream stream_MUT=new RewriteRuleTokenStream(adaptor,"token MUT");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LET=new RewriteRuleTokenStream(adaptor,"token LET");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
        RewriteRuleSubtreeStream stream_obj_def=new RewriteRuleSubtreeStream(adaptor,"rule obj_def");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:138:2: ( ( LET ( MUT )? e1= expr ) ( ASSIGN e2= expr ( obj_def )? )? SEMICOLON -> {isMut}? ^( LETMUT $e1 ( $e2)? ( obj_def )? ) -> ^( LET $e1 ( $e2)? ( obj_def )? ) | WHILE expr bloc -> ^( WHILE expr bloc ) | RETURN ( expr )? SEMICOLON -> ^( RETURN ( expr )? ) | if_expr | bloc )
            int alt16=5;
            switch ( input.LA(1) ) {
            case LET:
                {
                alt16=1;
                }
                break;
            case WHILE:
                {
                alt16=2;
                }
                break;
            case RETURN:
                {
                alt16=3;
                }
                break;
            case IF:
                {
                alt16=4;
                }
                break;
            case LBRACKET:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:139:4: ( LET ( MUT )? e1= expr ) ( ASSIGN e2= expr ( obj_def )? )? SEMICOLON
                    {
                     boolean isMut = false; 
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:140:4: ( LET ( MUT )? e1= expr )
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:140:5: LET ( MUT )? e1= expr
                    {
                    LET41=(Token)match(input,LET,FOLLOW_LET_in_instruction817);  
                    stream_LET.add(LET41);

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:140:9: ( MUT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==MUT) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:140:10: MUT
                            {
                            MUT42=(Token)match(input,MUT,FOLLOW_MUT_in_instruction820);  
                            stream_MUT.add(MUT42);

                             isMut = true; 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_instruction828);
                    e1=expr();

                    state._fsp--;

                    stream_expr.add(e1.getTree());

                    }

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:140:43: ( ASSIGN e2= expr ( obj_def )? )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ASSIGN) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:140:44: ASSIGN e2= expr ( obj_def )?
                            {
                            ASSIGN43=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_instruction832);  
                            stream_ASSIGN.add(ASSIGN43);

                            pushFollow(FOLLOW_expr_in_instruction836);
                            e2=expr();

                            state._fsp--;

                            stream_expr.add(e2.getTree());
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:140:59: ( obj_def )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==LBRACKET) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:140:60: obj_def
                                    {
                                    pushFollow(FOLLOW_obj_def_in_instruction839);
                                    obj_def44=obj_def();

                                    state._fsp--;

                                    stream_obj_def.add(obj_def44.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    SEMICOLON45=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_instruction845);  
                    stream_SEMICOLON.add(SEMICOLON45);



                    // AST REWRITE
                    // elements: e2, e2, obj_def, LET, e1, obj_def, e1
                    // token labels: 
                    // rule labels: retval, e1, e2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
                    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 141:4: -> {isMut}? ^( LETMUT $e1 ( $e2)? ( obj_def )? )
                    if (isMut) {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:141:16: ^( LETMUT $e1 ( $e2)? ( obj_def )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LETMUT, "LETMUT"), root_1);

                        adaptor.addChild(root_1, stream_e1.nextTree());
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:141:29: ( $e2)?
                        if ( stream_e2.hasNext() ) {
                            adaptor.addChild(root_1, stream_e2.nextTree());

                        }
                        stream_e2.reset();
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:141:34: ( obj_def )?
                        if ( stream_obj_def.hasNext() ) {
                            adaptor.addChild(root_1, stream_obj_def.nextTree());

                        }
                        stream_obj_def.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 142:4: -> ^( LET $e1 ( $e2)? ( obj_def )? )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:142:7: ^( LET $e1 ( $e2)? ( obj_def )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_LET.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_e1.nextTree());
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:142:17: ( $e2)?
                        if ( stream_e2.hasNext() ) {
                            adaptor.addChild(root_1, stream_e2.nextTree());

                        }
                        stream_e2.reset();
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:142:22: ( obj_def )?
                        if ( stream_obj_def.hasNext() ) {
                            adaptor.addChild(root_1, stream_obj_def.nextTree());

                        }
                        stream_obj_def.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:143:4: WHILE expr bloc
                    {
                    WHILE46=(Token)match(input,WHILE,FOLLOW_WHILE_in_instruction894);  
                    stream_WHILE.add(WHILE46);

                    pushFollow(FOLLOW_expr_in_instruction896);
                    expr47=expr();

                    state._fsp--;

                    stream_expr.add(expr47.getTree());
                    pushFollow(FOLLOW_bloc_in_instruction898);
                    bloc48=bloc();

                    state._fsp--;

                    stream_bloc.add(bloc48.getTree());


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
                    // 143:20: -> ^( WHILE expr bloc )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:143:23: ^( WHILE expr bloc )
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
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:144:4: RETURN ( expr )? SEMICOLON
                    {
                    RETURN49=(Token)match(input,RETURN,FOLLOW_RETURN_in_instruction913);  
                    stream_RETURN.add(RETURN49);

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:144:11: ( expr )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==CSTE_ENT||LA15_0==LPAREN||LA15_0==MINUS||(LA15_0>=STAR && LA15_0<=EXCL)||LA15_0==AMPS||(LA15_0>=VEC_MACRO && LA15_0<=PRINT_MACRO)||(LA15_0>=TRUE && LA15_0<=FALSE)||(LA15_0>=IDF && LA15_0<=CSTE_STR)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:144:12: expr
                            {
                            pushFollow(FOLLOW_expr_in_instruction916);
                            expr50=expr();

                            state._fsp--;

                            stream_expr.add(expr50.getTree());

                            }
                            break;

                    }

                    SEMICOLON51=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_instruction920);  
                    stream_SEMICOLON.add(SEMICOLON51);



                    // AST REWRITE
                    // elements: expr, RETURN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 144:29: -> ^( RETURN ( expr )? )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:144:32: ^( RETURN ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:144:41: ( expr )?
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
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:145:4: if_expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_expr_in_instruction934);
                    if_expr52=if_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, if_expr52.getTree());

                    }
                    break;
                case 5 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:146:4: bloc
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_bloc_in_instruction939);
                    bloc53=bloc();

                    state._fsp--;

                    adaptor.addChild(root_0, bloc53.getTree());

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

    public static class obj_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "obj_def"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:149:1: obj_def : LBRACKET (i+= IDF COLON o+= obj_expr ( COMMA i+= IDF COLON o+= obj_expr )* )? RBRACKET -> ^( OBJ ( ^( MEMBER $i $o) )* ) ;
    public final mini_rustParser.obj_def_return obj_def() throws RecognitionException {
        mini_rustParser.obj_def_return retval = new mini_rustParser.obj_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LBRACKET54=null;
        Token COLON55=null;
        Token COMMA56=null;
        Token COLON57=null;
        Token RBRACKET58=null;
        Token i=null;
        List list_i=null;
        List list_o=null;
        RuleReturnScope o = null;
        Object LBRACKET54_tree=null;
        Object COLON55_tree=null;
        Object COMMA56_tree=null;
        Object COLON57_tree=null;
        Object RBRACKET58_tree=null;
        Object i_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_obj_expr=new RewriteRuleSubtreeStream(adaptor,"rule obj_expr");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:150:2: ( LBRACKET (i+= IDF COLON o+= obj_expr ( COMMA i+= IDF COLON o+= obj_expr )* )? RBRACKET -> ^( OBJ ( ^( MEMBER $i $o) )* ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:151:2: LBRACKET (i+= IDF COLON o+= obj_expr ( COMMA i+= IDF COLON o+= obj_expr )* )? RBRACKET
            {
            LBRACKET54=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_obj_def951);  
            stream_LBRACKET.add(LBRACKET54);

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:151:11: (i+= IDF COLON o+= obj_expr ( COMMA i+= IDF COLON o+= obj_expr )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDF) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:151:12: i+= IDF COLON o+= obj_expr ( COMMA i+= IDF COLON o+= obj_expr )*
                    {
                    i=(Token)match(input,IDF,FOLLOW_IDF_in_obj_def956);  
                    stream_IDF.add(i);

                    if (list_i==null) list_i=new ArrayList();
                    list_i.add(i);

                    COLON55=(Token)match(input,COLON,FOLLOW_COLON_in_obj_def958);  
                    stream_COLON.add(COLON55);

                    pushFollow(FOLLOW_obj_expr_in_obj_def962);
                    o=obj_expr();

                    state._fsp--;

                    stream_obj_expr.add(o.getTree());
                    if (list_o==null) list_o=new ArrayList();
                    list_o.add(o.getTree());

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:151:37: ( COMMA i+= IDF COLON o+= obj_expr )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:151:38: COMMA i+= IDF COLON o+= obj_expr
                    	    {
                    	    COMMA56=(Token)match(input,COMMA,FOLLOW_COMMA_in_obj_def965);  
                    	    stream_COMMA.add(COMMA56);

                    	    i=(Token)match(input,IDF,FOLLOW_IDF_in_obj_def969);  
                    	    stream_IDF.add(i);

                    	    if (list_i==null) list_i=new ArrayList();
                    	    list_i.add(i);

                    	    COLON57=(Token)match(input,COLON,FOLLOW_COLON_in_obj_def971);  
                    	    stream_COLON.add(COLON57);

                    	    pushFollow(FOLLOW_obj_expr_in_obj_def975);
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

            RBRACKET58=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_obj_def981);  
            stream_RBRACKET.add(RBRACKET58);



            // AST REWRITE
            // elements: o, i
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
            // 151:82: -> ^( OBJ ( ^( MEMBER $i $o) )* )
            {
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:151:85: ^( OBJ ( ^( MEMBER $i $o) )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OBJ, "OBJ"), root_1);

                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:151:91: ( ^( MEMBER $i $o) )*
                while ( stream_o.hasNext()||stream_i.hasNext() ) {
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:151:91: ^( MEMBER $i $o)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MEMBER, "MEMBER"), root_2);

                    adaptor.addChild(root_2, stream_i.nextNode());
                    adaptor.addChild(root_2, stream_o.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_o.reset();
                stream_i.reset();

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
    // $ANTLR end "obj_def"

    public static class obj_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "obj_expr"
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:154:1: obj_expr : expr ( obj_def )? ;
    public final mini_rustParser.obj_expr_return obj_expr() throws RecognitionException {
        mini_rustParser.obj_expr_return retval = new mini_rustParser.obj_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        mini_rustParser.expr_return expr59 = null;

        mini_rustParser.obj_def_return obj_def60 = null;



        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:155:2: ( expr ( obj_def )? )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:156:2: expr ( obj_def )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_obj_expr1010);
            expr59=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr59.getTree());
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:156:7: ( obj_def )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==LBRACKET) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:156:8: obj_def
                    {
                    pushFollow(FOLLOW_obj_def_in_obj_expr1013);
                    obj_def60=obj_def();

                    state._fsp--;

                    adaptor.addChild(root_0, obj_def60.getTree());

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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:159:1: if_expr : IF expr bloc ( else_expr )? -> ^( IF expr bloc ( else_expr )? ) ;
    public final mini_rustParser.if_expr_return if_expr() throws RecognitionException {
        mini_rustParser.if_expr_return retval = new mini_rustParser.if_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF61=null;
        mini_rustParser.expr_return expr62 = null;

        mini_rustParser.bloc_return bloc63 = null;

        mini_rustParser.else_expr_return else_expr64 = null;


        Object IF61_tree=null;
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
        RewriteRuleSubtreeStream stream_else_expr=new RewriteRuleSubtreeStream(adaptor,"rule else_expr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:160:2: ( IF expr bloc ( else_expr )? -> ^( IF expr bloc ( else_expr )? ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:161:2: IF expr bloc ( else_expr )?
            {
            IF61=(Token)match(input,IF,FOLLOW_IF_in_if_expr1028);  
            stream_IF.add(IF61);

            pushFollow(FOLLOW_expr_in_if_expr1030);
            expr62=expr();

            state._fsp--;

            stream_expr.add(expr62.getTree());
            pushFollow(FOLLOW_bloc_in_if_expr1032);
            bloc63=bloc();

            state._fsp--;

            stream_bloc.add(bloc63.getTree());
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:161:15: ( else_expr )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ELSE) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:161:16: else_expr
                    {
                    pushFollow(FOLLOW_else_expr_in_if_expr1035);
                    else_expr64=else_expr();

                    state._fsp--;

                    stream_else_expr.add(else_expr64.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: IF, bloc, expr, else_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 161:28: -> ^( IF expr bloc ( else_expr )? )
            {
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:161:31: ^( IF expr bloc ( else_expr )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                adaptor.addChild(root_1, stream_bloc.nextTree());
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:161:46: ( else_expr )?
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:164:1: else_expr : ELSE ( bloc -> ^( ELSE bloc ) | if_expr -> ^( ELSE if_expr ) ) ;
    public final mini_rustParser.else_expr_return else_expr() throws RecognitionException {
        mini_rustParser.else_expr_return retval = new mini_rustParser.else_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ELSE65=null;
        mini_rustParser.bloc_return bloc66 = null;

        mini_rustParser.if_expr_return if_expr67 = null;


        Object ELSE65_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
        RewriteRuleSubtreeStream stream_if_expr=new RewriteRuleSubtreeStream(adaptor,"rule if_expr");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:165:2: ( ELSE ( bloc -> ^( ELSE bloc ) | if_expr -> ^( ELSE if_expr ) ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:166:2: ELSE ( bloc -> ^( ELSE bloc ) | if_expr -> ^( ELSE if_expr ) )
            {
            ELSE65=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_expr1064);  
            stream_ELSE.add(ELSE65);

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:166:7: ( bloc -> ^( ELSE bloc ) | if_expr -> ^( ELSE if_expr ) )
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
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:166:8: bloc
                    {
                    pushFollow(FOLLOW_bloc_in_else_expr1067);
                    bloc66=bloc();

                    state._fsp--;

                    stream_bloc.add(bloc66.getTree());


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
                    // 166:13: -> ^( ELSE bloc )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:166:16: ^( ELSE bloc )
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
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:166:31: if_expr
                    {
                    pushFollow(FOLLOW_if_expr_in_else_expr1079);
                    if_expr67=if_expr();

                    state._fsp--;

                    stream_if_expr.add(if_expr67.getTree());


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
                    // 166:39: -> ^( ELSE if_expr )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:166:42: ^( ELSE if_expr )
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:169:1: expr : expr_ou ;
    public final mini_rustParser.expr_return expr() throws RecognitionException {
        mini_rustParser.expr_return retval = new mini_rustParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        mini_rustParser.expr_ou_return expr_ou68 = null;



        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:170:2: ( expr_ou )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:171:2: expr_ou
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_ou_in_expr1100);
            expr_ou68=expr_ou();

            state._fsp--;

            adaptor.addChild(root_0, expr_ou68.getTree());

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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:174:1: dot_factorisation : ( IDF -> IDF | LEN LPAREN RPAREN -> LEN );
    public final mini_rustParser.dot_factorisation_return dot_factorisation() throws RecognitionException {
        mini_rustParser.dot_factorisation_return retval = new mini_rustParser.dot_factorisation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF69=null;
        Token LEN70=null;
        Token LPAREN71=null;
        Token RPAREN72=null;

        Object IDF69_tree=null;
        Object LEN70_tree=null;
        Object LPAREN71_tree=null;
        Object RPAREN72_tree=null;
        RewriteRuleTokenStream stream_LEN=new RewriteRuleTokenStream(adaptor,"token LEN");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");

        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:175:2: ( IDF -> IDF | LEN LPAREN RPAREN -> LEN )
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
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:176:4: IDF
                    {
                    IDF69=(Token)match(input,IDF,FOLLOW_IDF_in_dot_factorisation1114);  
                    stream_IDF.add(IDF69);



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
                    // 176:8: -> IDF
                    {
                        adaptor.addChild(root_0, stream_IDF.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:177:4: LEN LPAREN RPAREN
                    {
                    LEN70=(Token)match(input,LEN,FOLLOW_LEN_in_dot_factorisation1123);  
                    stream_LEN.add(LEN70);

                    LPAREN71=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dot_factorisation1125);  
                    stream_LPAREN.add(LPAREN71);

                    RPAREN72=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dot_factorisation1127);  
                    stream_RPAREN.add(RPAREN72);



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
                    // 177:22: -> LEN
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:180:1: expr_ou : (e1= expr_et -> $e1) ( OR e2= expr_et -> ^( OR $expr_ou $e2) )* ;
    public final mini_rustParser.expr_ou_return expr_ou() throws RecognitionException {
        mini_rustParser.expr_ou_return retval = new mini_rustParser.expr_ou_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR73=null;
        mini_rustParser.expr_et_return e1 = null;

        mini_rustParser.expr_et_return e2 = null;


        Object OR73_tree=null;
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_expr_et=new RewriteRuleSubtreeStream(adaptor,"rule expr_et");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:181:2: ( (e1= expr_et -> $e1) ( OR e2= expr_et -> ^( OR $expr_ou $e2) )* )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:182:2: (e1= expr_et -> $e1) ( OR e2= expr_et -> ^( OR $expr_ou $e2) )*
            {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:182:2: (e1= expr_et -> $e1)
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:182:3: e1= expr_et
            {
            pushFollow(FOLLOW_expr_et_in_expr_ou1146);
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
            // 182:14: -> $e1
            {
                adaptor.addChild(root_0, stream_e1.nextTree());

            }

            retval.tree = root_0;
            }

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:182:22: ( OR e2= expr_et -> ^( OR $expr_ou $e2) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==OR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:182:23: OR e2= expr_et
            	    {
            	    OR73=(Token)match(input,OR,FOLLOW_OR_in_expr_ou1155);  
            	    stream_OR.add(OR73);

            	    pushFollow(FOLLOW_expr_et_in_expr_ou1159);
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
            	    // 182:37: -> ^( OR $expr_ou $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:182:40: ^( OR $expr_ou $e2)
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:185:1: expr_et : (e1= expr_comp -> $e1) ( AND e2= expr_comp -> ^( AND $expr_et $e2) )* ;
    public final mini_rustParser.expr_et_return expr_et() throws RecognitionException {
        mini_rustParser.expr_et_return retval = new mini_rustParser.expr_et_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND74=null;
        mini_rustParser.expr_comp_return e1 = null;

        mini_rustParser.expr_comp_return e2 = null;


        Object AND74_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_expr_comp=new RewriteRuleSubtreeStream(adaptor,"rule expr_comp");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:186:2: ( (e1= expr_comp -> $e1) ( AND e2= expr_comp -> ^( AND $expr_et $e2) )* )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:187:2: (e1= expr_comp -> $e1) ( AND e2= expr_comp -> ^( AND $expr_et $e2) )*
            {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:187:2: (e1= expr_comp -> $e1)
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:187:3: e1= expr_comp
            {
            pushFollow(FOLLOW_expr_comp_in_expr_et1188);
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
            // 187:16: -> $e1
            {
                adaptor.addChild(root_0, stream_e1.nextTree());

            }

            retval.tree = root_0;
            }

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:187:24: ( AND e2= expr_comp -> ^( AND $expr_et $e2) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==AND) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:187:25: AND e2= expr_comp
            	    {
            	    AND74=(Token)match(input,AND,FOLLOW_AND_in_expr_et1197);  
            	    stream_AND.add(AND74);

            	    pushFollow(FOLLOW_expr_comp_in_expr_et1201);
            	    e2=expr_comp();

            	    state._fsp--;

            	    stream_expr_comp.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: e2, expr_et, AND
            	    // token labels: 
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 187:42: -> ^( AND $expr_et $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:187:45: ^( AND $expr_et $e2)
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:190:1: expr_comp : (e1= expr_plus -> $e1) (op= LT e2= expr_plus -> ^( $op $expr_comp $e2) | op= LE e2= expr_plus -> ^( $op $expr_comp $e2) | op= GT e2= expr_plus -> ^( $op $expr_comp $e2) | op= GE e2= expr_plus -> ^( $op $expr_comp $e2) | op= EQ e2= expr_plus -> ^( $op $expr_comp $e2) | op= NE e2= expr_plus -> ^( $op $expr_comp $e2) )* ;
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
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:191:2: ( (e1= expr_plus -> $e1) (op= LT e2= expr_plus -> ^( $op $expr_comp $e2) | op= LE e2= expr_plus -> ^( $op $expr_comp $e2) | op= GT e2= expr_plus -> ^( $op $expr_comp $e2) | op= GE e2= expr_plus -> ^( $op $expr_comp $e2) | op= EQ e2= expr_plus -> ^( $op $expr_comp $e2) | op= NE e2= expr_plus -> ^( $op $expr_comp $e2) )* )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:192:3: (e1= expr_plus -> $e1) (op= LT e2= expr_plus -> ^( $op $expr_comp $e2) | op= LE e2= expr_plus -> ^( $op $expr_comp $e2) | op= GT e2= expr_plus -> ^( $op $expr_comp $e2) | op= GE e2= expr_plus -> ^( $op $expr_comp $e2) | op= EQ e2= expr_plus -> ^( $op $expr_comp $e2) | op= NE e2= expr_plus -> ^( $op $expr_comp $e2) )*
            {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:192:3: (e1= expr_plus -> $e1)
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:192:4: e1= expr_plus
            {
            pushFollow(FOLLOW_expr_plus_in_expr_comp1234);
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
            // 192:19: -> $e1
            {
                adaptor.addChild(root_0, stream_e1.nextTree());

            }

            retval.tree = root_0;
            }

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:193:2: (op= LT e2= expr_plus -> ^( $op $expr_comp $e2) | op= LE e2= expr_plus -> ^( $op $expr_comp $e2) | op= GT e2= expr_plus -> ^( $op $expr_comp $e2) | op= GE e2= expr_plus -> ^( $op $expr_comp $e2) | op= EQ e2= expr_plus -> ^( $op $expr_comp $e2) | op= NE e2= expr_plus -> ^( $op $expr_comp $e2) )*
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
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:193:3: op= LT e2= expr_plus
            	    {
            	    op=(Token)match(input,LT,FOLLOW_LT_in_expr_comp1246);  
            	    stream_LT.add(op);

            	    pushFollow(FOLLOW_expr_plus_in_expr_comp1252);
            	    e2=expr_plus();

            	    state._fsp--;

            	    stream_expr_plus.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: expr_comp, e2, op
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
            	    // 193:24: -> ^( $op $expr_comp $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:193:27: ^( $op $expr_comp $e2)
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
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:194:3: op= LE e2= expr_plus
            	    {
            	    op=(Token)match(input,LE,FOLLOW_LE_in_expr_comp1271);  
            	    stream_LE.add(op);

            	    pushFollow(FOLLOW_expr_plus_in_expr_comp1277);
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
            	    // 194:24: -> ^( $op $expr_comp $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:194:27: ^( $op $expr_comp $e2)
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
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:195:3: op= GT e2= expr_plus
            	    {
            	    op=(Token)match(input,GT,FOLLOW_GT_in_expr_comp1297);  
            	    stream_GT.add(op);

            	    pushFollow(FOLLOW_expr_plus_in_expr_comp1303);
            	    e2=expr_plus();

            	    state._fsp--;

            	    stream_expr_plus.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: e2, expr_comp, op
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
            	    // 195:25: -> ^( $op $expr_comp $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:195:28: ^( $op $expr_comp $e2)
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
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:196:3: op= GE e2= expr_plus
            	    {
            	    op=(Token)match(input,GE,FOLLOW_GE_in_expr_comp1322);  
            	    stream_GE.add(op);

            	    pushFollow(FOLLOW_expr_plus_in_expr_comp1328);
            	    e2=expr_plus();

            	    state._fsp--;

            	    stream_expr_plus.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: op, expr_comp, e2
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
            	    // 196:24: -> ^( $op $expr_comp $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:196:27: ^( $op $expr_comp $e2)
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
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:197:3: op= EQ e2= expr_plus
            	    {
            	    op=(Token)match(input,EQ,FOLLOW_EQ_in_expr_comp1347);  
            	    stream_EQ.add(op);

            	    pushFollow(FOLLOW_expr_plus_in_expr_comp1353);
            	    e2=expr_plus();

            	    state._fsp--;

            	    stream_expr_plus.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: op, expr_comp, e2
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
            	    // 197:25: -> ^( $op $expr_comp $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:197:28: ^( $op $expr_comp $e2)
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
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:198:3: op= NE e2= expr_plus
            	    {
            	    op=(Token)match(input,NE,FOLLOW_NE_in_expr_comp1373);  
            	    stream_NE.add(op);

            	    pushFollow(FOLLOW_expr_plus_in_expr_comp1379);
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
            	    // 198:25: -> ^( $op $expr_comp $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:198:28: ^( $op $expr_comp $e2)
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:202:1: expr_plus : (e1= expr_mult -> $e1) ( PLUS e2= expr_mult -> ^( PLUS $expr_plus $e2) | MINUS e2= expr_mult -> ^( MINUS $expr_plus $e2) )* ;
    public final mini_rustParser.expr_plus_return expr_plus() throws RecognitionException {
        mini_rustParser.expr_plus_return retval = new mini_rustParser.expr_plus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS75=null;
        Token MINUS76=null;
        mini_rustParser.expr_mult_return e1 = null;

        mini_rustParser.expr_mult_return e2 = null;


        Object PLUS75_tree=null;
        Object MINUS76_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_expr_mult=new RewriteRuleSubtreeStream(adaptor,"rule expr_mult");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:203:2: ( (e1= expr_mult -> $e1) ( PLUS e2= expr_mult -> ^( PLUS $expr_plus $e2) | MINUS e2= expr_mult -> ^( MINUS $expr_plus $e2) )* )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:204:2: (e1= expr_mult -> $e1) ( PLUS e2= expr_mult -> ^( PLUS $expr_plus $e2) | MINUS e2= expr_mult -> ^( MINUS $expr_plus $e2) )*
            {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:204:2: (e1= expr_mult -> $e1)
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:204:3: e1= expr_mult
            {
            pushFollow(FOLLOW_expr_mult_in_expr_plus1414);
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
            // 204:16: -> $e1
            {
                adaptor.addChild(root_0, stream_e1.nextTree());

            }

            retval.tree = root_0;
            }

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:205:2: ( PLUS e2= expr_mult -> ^( PLUS $expr_plus $e2) | MINUS e2= expr_mult -> ^( MINUS $expr_plus $e2) )*
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
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:205:3: PLUS e2= expr_mult
            	    {
            	    PLUS75=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_plus1424);  
            	    stream_PLUS.add(PLUS75);

            	    pushFollow(FOLLOW_expr_mult_in_expr_plus1428);
            	    e2=expr_mult();

            	    state._fsp--;

            	    stream_expr_mult.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: PLUS, expr_plus, e2
            	    // token labels: 
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 205:21: -> ^( PLUS $expr_plus $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:205:24: ^( PLUS $expr_plus $e2)
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
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:206:4: MINUS e2= expr_mult
            	    {
            	    MINUS76=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_plus1445);  
            	    stream_MINUS.add(MINUS76);

            	    pushFollow(FOLLOW_expr_mult_in_expr_plus1449);
            	    e2=expr_mult();

            	    state._fsp--;

            	    stream_expr_mult.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: MINUS, expr_plus, e2
            	    // token labels: 
            	    // rule labels: retval, e2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 206:23: -> ^( MINUS $expr_plus $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:206:26: ^( MINUS $expr_plus $e2)
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:210:1: expr_mult : (e1= expr_unaire -> $e1) (op= STAR e2= expr_unaire -> ^( $op $expr_mult $e2) | op= DIV e2= expr_unaire -> ^( $op $expr_mult $e2) )* ;
    public final mini_rustParser.expr_mult_return expr_mult() throws RecognitionException {
        mini_rustParser.expr_mult_return retval = new mini_rustParser.expr_mult_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        mini_rustParser.expr_unaire_return e1 = null;

        mini_rustParser.expr_unaire_return e2 = null;


        Object op_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_DIV=new RewriteRuleTokenStream(adaptor,"token DIV");
        RewriteRuleSubtreeStream stream_expr_unaire=new RewriteRuleSubtreeStream(adaptor,"rule expr_unaire");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:211:2: ( (e1= expr_unaire -> $e1) (op= STAR e2= expr_unaire -> ^( $op $expr_mult $e2) | op= DIV e2= expr_unaire -> ^( $op $expr_mult $e2) )* )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:212:2: (e1= expr_unaire -> $e1) (op= STAR e2= expr_unaire -> ^( $op $expr_mult $e2) | op= DIV e2= expr_unaire -> ^( $op $expr_mult $e2) )*
            {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:212:2: (e1= expr_unaire -> $e1)
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:212:3: e1= expr_unaire
            {
            pushFollow(FOLLOW_expr_unaire_in_expr_mult1481);
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
            // 212:18: -> $e1
            {
                adaptor.addChild(root_0, stream_e1.nextTree());

            }

            retval.tree = root_0;
            }

            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:213:2: (op= STAR e2= expr_unaire -> ^( $op $expr_mult $e2) | op= DIV e2= expr_unaire -> ^( $op $expr_mult $e2) )*
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
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:213:3: op= STAR e2= expr_unaire
            	    {
            	    op=(Token)match(input,STAR,FOLLOW_STAR_in_expr_mult1493);  
            	    stream_STAR.add(op);

            	    pushFollow(FOLLOW_expr_unaire_in_expr_mult1497);
            	    e2=expr_unaire();

            	    state._fsp--;

            	    stream_expr_unaire.add(e2.getTree());


            	    // AST REWRITE
            	    // elements: expr_mult, op, e2
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
            	    // 213:26: -> ^( $op $expr_mult $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:213:29: ^( $op $expr_mult $e2)
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
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:214:4: op= DIV e2= expr_unaire
            	    {
            	    op=(Token)match(input,DIV,FOLLOW_DIV_in_expr_mult1520);  
            	    stream_DIV.add(op);

            	    pushFollow(FOLLOW_expr_unaire_in_expr_mult1524);
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
            	    // 214:28: -> ^( $op $expr_mult $e2)
            	    {
            	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:214:31: ^( $op $expr_mult $e2)
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:218:1: expr_unaire : ( (op= MINUS ) expr_unaire -> ^( MOINS_UNITAIRE ^( expr_unaire ) ) | (op= EXCL | op= STAR | op= AMPS ) expr_unaire -> ^( $op ^( expr_unaire ) ) | (a= atom -> $a) ( LSQBRACKET expr RSQBRACKET -> ^( INDEX $expr_unaire expr ) )* ( DOT dot_factorisation -> ^( DOT $expr_unaire dot_factorisation ) )* );
    public final mini_rustParser.expr_unaire_return expr_unaire() throws RecognitionException {
        mini_rustParser.expr_unaire_return retval = new mini_rustParser.expr_unaire_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        Token LSQBRACKET79=null;
        Token RSQBRACKET81=null;
        Token DOT82=null;
        mini_rustParser.atom_return a = null;

        mini_rustParser.expr_unaire_return expr_unaire77 = null;

        mini_rustParser.expr_unaire_return expr_unaire78 = null;

        mini_rustParser.expr_return expr80 = null;

        mini_rustParser.dot_factorisation_return dot_factorisation83 = null;


        Object op_tree=null;
        Object LSQBRACKET79_tree=null;
        Object RSQBRACKET81_tree=null;
        Object DOT82_tree=null;
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
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:219:2: ( (op= MINUS ) expr_unaire -> ^( MOINS_UNITAIRE ^( expr_unaire ) ) | (op= EXCL | op= STAR | op= AMPS ) expr_unaire -> ^( $op ^( expr_unaire ) ) | (a= atom -> $a) ( LSQBRACKET expr RSQBRACKET -> ^( INDEX $expr_unaire expr ) )* ( DOT dot_factorisation -> ^( DOT $expr_unaire dot_factorisation ) )* )
            int alt31=3;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                alt31=1;
                }
                break;
            case STAR:
            case EXCL:
            case AMPS:
                {
                alt31=2;
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
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:220:4: (op= MINUS ) expr_unaire
                    {
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:220:4: (op= MINUS )
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:220:5: op= MINUS
                    {
                    op=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_unaire1558);  
                    stream_MINUS.add(op);


                    }

                    pushFollow(FOLLOW_expr_unaire_in_expr_unaire1561);
                    expr_unaire77=expr_unaire();

                    state._fsp--;

                    stream_expr_unaire.add(expr_unaire77.getTree());


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
                    // 220:27: -> ^( MOINS_UNITAIRE ^( expr_unaire ) )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:220:30: ^( MOINS_UNITAIRE ^( expr_unaire ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MOINS_UNITAIRE, "MOINS_UNITAIRE"), root_1);

                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:220:47: ^( expr_unaire )
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
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:221:4: (op= EXCL | op= STAR | op= AMPS ) expr_unaire
                    {
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:221:4: (op= EXCL | op= STAR | op= AMPS )
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
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:221:5: op= EXCL
                            {
                            op=(Token)match(input,EXCL,FOLLOW_EXCL_in_expr_unaire1579);  
                            stream_EXCL.add(op);


                            }
                            break;
                        case 2 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:221:15: op= STAR
                            {
                            op=(Token)match(input,STAR,FOLLOW_STAR_in_expr_unaire1585);  
                            stream_STAR.add(op);


                            }
                            break;
                        case 3 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:221:25: op= AMPS
                            {
                            op=(Token)match(input,AMPS,FOLLOW_AMPS_in_expr_unaire1591);  
                            stream_AMPS.add(op);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_unaire_in_expr_unaire1594);
                    expr_unaire78=expr_unaire();

                    state._fsp--;

                    stream_expr_unaire.add(expr_unaire78.getTree());


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
                    // 221:46: -> ^( $op ^( expr_unaire ) )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:221:49: ^( $op ^( expr_unaire ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_op.nextNode(), root_1);

                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:221:55: ^( expr_unaire )
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
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:222:4: (a= atom -> $a) ( LSQBRACKET expr RSQBRACKET -> ^( INDEX $expr_unaire expr ) )* ( DOT dot_factorisation -> ^( DOT $expr_unaire dot_factorisation ) )*
                    {
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:222:4: (a= atom -> $a)
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:222:5: a= atom
                    {
                    pushFollow(FOLLOW_atom_in_expr_unaire1613);
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
                    // 222:12: -> $a
                    {
                        adaptor.addChild(root_0, stream_a.nextTree());

                    }

                    retval.tree = root_0;
                    }

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:222:19: ( LSQBRACKET expr RSQBRACKET -> ^( INDEX $expr_unaire expr ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==LSQBRACKET) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:222:20: LSQBRACKET expr RSQBRACKET
                    	    {
                    	    LSQBRACKET79=(Token)match(input,LSQBRACKET,FOLLOW_LSQBRACKET_in_expr_unaire1622);  
                    	    stream_LSQBRACKET.add(LSQBRACKET79);

                    	    pushFollow(FOLLOW_expr_in_expr_unaire1624);
                    	    expr80=expr();

                    	    state._fsp--;

                    	    stream_expr.add(expr80.getTree());
                    	    RSQBRACKET81=(Token)match(input,RSQBRACKET,FOLLOW_RSQBRACKET_in_expr_unaire1626);  
                    	    stream_RSQBRACKET.add(RSQBRACKET81);



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
                    	    // 222:47: -> ^( INDEX $expr_unaire expr )
                    	    {
                    	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:222:50: ^( INDEX $expr_unaire expr )
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
                    	    break loop29;
                        }
                    } while (true);

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:222:79: ( DOT dot_factorisation -> ^( DOT $expr_unaire dot_factorisation ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==DOT) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:222:80: DOT dot_factorisation
                    	    {
                    	    DOT82=(Token)match(input,DOT,FOLLOW_DOT_in_expr_unaire1642);  
                    	    stream_DOT.add(DOT82);

                    	    pushFollow(FOLLOW_dot_factorisation_in_expr_unaire1644);
                    	    dot_factorisation83=dot_factorisation();

                    	    state._fsp--;

                    	    stream_dot_factorisation.add(dot_factorisation83.getTree());


                    	    // AST REWRITE
                    	    // elements: dot_factorisation, expr_unaire, DOT
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 222:102: -> ^( DOT $expr_unaire dot_factorisation )
                    	    {
                    	        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:222:105: ^( DOT $expr_unaire dot_factorisation )
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
                    	    break loop30;
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:225:1: atom : ( CSTE_ENT | CSTE_STR | TRUE | FALSE | IDF ( LPAREN ( params )? RPAREN )? -> {isFunctionCall}? ^( FUNCTION_CALL IDF ( params )? ) -> IDF | LPAREN expr RPAREN -> expr | VEC_MACRO EXCL LSQBRACKET (e+= expr ( COMMA e+= expr )* )? RSQBRACKET -> ^( VEC_MACRO ( $e)* ) | PRINT_MACRO EXCL LPAREN expr RPAREN -> ^( PRINT_MACRO expr ) );
    public final mini_rustParser.atom_return atom() throws RecognitionException {
        mini_rustParser.atom_return retval = new mini_rustParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CSTE_ENT84=null;
        Token CSTE_STR85=null;
        Token TRUE86=null;
        Token FALSE87=null;
        Token IDF88=null;
        Token LPAREN89=null;
        Token RPAREN91=null;
        Token LPAREN92=null;
        Token RPAREN94=null;
        Token VEC_MACRO95=null;
        Token EXCL96=null;
        Token LSQBRACKET97=null;
        Token COMMA98=null;
        Token RSQBRACKET99=null;
        Token PRINT_MACRO100=null;
        Token EXCL101=null;
        Token LPAREN102=null;
        Token RPAREN104=null;
        List list_e=null;
        mini_rustParser.params_return params90 = null;

        mini_rustParser.expr_return expr93 = null;

        mini_rustParser.expr_return expr103 = null;

        RuleReturnScope e = null;
        Object CSTE_ENT84_tree=null;
        Object CSTE_STR85_tree=null;
        Object TRUE86_tree=null;
        Object FALSE87_tree=null;
        Object IDF88_tree=null;
        Object LPAREN89_tree=null;
        Object RPAREN91_tree=null;
        Object LPAREN92_tree=null;
        Object RPAREN94_tree=null;
        Object VEC_MACRO95_tree=null;
        Object EXCL96_tree=null;
        Object LSQBRACKET97_tree=null;
        Object COMMA98_tree=null;
        Object RSQBRACKET99_tree=null;
        Object PRINT_MACRO100_tree=null;
        Object EXCL101_tree=null;
        Object LPAREN102_tree=null;
        Object RPAREN104_tree=null;
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
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:226:2: ( CSTE_ENT | CSTE_STR | TRUE | FALSE | IDF ( LPAREN ( params )? RPAREN )? -> {isFunctionCall}? ^( FUNCTION_CALL IDF ( params )? ) -> IDF | LPAREN expr RPAREN -> expr | VEC_MACRO EXCL LSQBRACKET (e+= expr ( COMMA e+= expr )* )? RSQBRACKET -> ^( VEC_MACRO ( $e)* ) | PRINT_MACRO EXCL LPAREN expr RPAREN -> ^( PRINT_MACRO expr ) )
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
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:227:4: CSTE_ENT
                    {
                    root_0 = (Object)adaptor.nil();

                    CSTE_ENT84=(Token)match(input,CSTE_ENT,FOLLOW_CSTE_ENT_in_atom1671); 
                    CSTE_ENT84_tree = (Object)adaptor.create(CSTE_ENT84);
                    adaptor.addChild(root_0, CSTE_ENT84_tree);


                    }
                    break;
                case 2 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:228:4: CSTE_STR
                    {
                    root_0 = (Object)adaptor.nil();

                    CSTE_STR85=(Token)match(input,CSTE_STR,FOLLOW_CSTE_STR_in_atom1676); 
                    CSTE_STR85_tree = (Object)adaptor.create(CSTE_STR85);
                    adaptor.addChild(root_0, CSTE_STR85_tree);


                    }
                    break;
                case 3 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:229:4: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    TRUE86=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1681); 
                    TRUE86_tree = (Object)adaptor.create(TRUE86);
                    adaptor.addChild(root_0, TRUE86_tree);


                    }
                    break;
                case 4 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:230:4: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    FALSE87=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1686); 
                    FALSE87_tree = (Object)adaptor.create(FALSE87);
                    adaptor.addChild(root_0, FALSE87_tree);


                    }
                    break;
                case 5 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:232:4: IDF ( LPAREN ( params )? RPAREN )?
                    {
                     boolean isFunctionCall = false; 
                    IDF88=(Token)match(input,IDF,FOLLOW_IDF_in_atom1699);  
                    stream_IDF.add(IDF88);

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:233:8: ( LPAREN ( params )? RPAREN )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==LPAREN) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:233:9: LPAREN ( params )? RPAREN
                            {
                            LPAREN89=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom1702);  
                            stream_LPAREN.add(LPAREN89);

                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:233:16: ( params )?
                            int alt32=2;
                            int LA32_0 = input.LA(1);

                            if ( (LA32_0==CSTE_ENT||LA32_0==LPAREN||LA32_0==MINUS||(LA32_0>=STAR && LA32_0<=EXCL)||LA32_0==AMPS||(LA32_0>=VEC_MACRO && LA32_0<=PRINT_MACRO)||(LA32_0>=TRUE && LA32_0<=FALSE)||(LA32_0>=IDF && LA32_0<=CSTE_STR)) ) {
                                alt32=1;
                            }
                            switch (alt32) {
                                case 1 :
                                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:233:17: params
                                    {
                                    pushFollow(FOLLOW_params_in_atom1705);
                                    params90=params();

                                    state._fsp--;

                                    stream_params.add(params90.getTree());

                                    }
                                    break;

                            }

                            RPAREN91=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom1709);  
                            stream_RPAREN.add(RPAREN91);

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
                    // 234:4: -> {isFunctionCall}? ^( FUNCTION_CALL IDF ( params )? )
                    if (isFunctionCall) {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:234:25: ^( FUNCTION_CALL IDF ( params )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:234:45: ( params )?
                        if ( stream_params.hasNext() ) {
                            adaptor.addChild(root_1, stream_params.nextTree());

                        }
                        stream_params.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 235:4: -> IDF
                    {
                        adaptor.addChild(root_0, stream_IDF.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:236:4: LPAREN expr RPAREN
                    {
                    LPAREN92=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom1741);  
                    stream_LPAREN.add(LPAREN92);

                    pushFollow(FOLLOW_expr_in_atom1743);
                    expr93=expr();

                    state._fsp--;

                    stream_expr.add(expr93.getTree());
                    RPAREN94=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom1745);  
                    stream_RPAREN.add(RPAREN94);



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
                    // 236:23: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:237:4: VEC_MACRO EXCL LSQBRACKET (e+= expr ( COMMA e+= expr )* )? RSQBRACKET
                    {
                    VEC_MACRO95=(Token)match(input,VEC_MACRO,FOLLOW_VEC_MACRO_in_atom1754);  
                    stream_VEC_MACRO.add(VEC_MACRO95);

                    EXCL96=(Token)match(input,EXCL,FOLLOW_EXCL_in_atom1756);  
                    stream_EXCL.add(EXCL96);

                    LSQBRACKET97=(Token)match(input,LSQBRACKET,FOLLOW_LSQBRACKET_in_atom1758);  
                    stream_LSQBRACKET.add(LSQBRACKET97);

                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:237:30: (e+= expr ( COMMA e+= expr )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==CSTE_ENT||LA35_0==LPAREN||LA35_0==MINUS||(LA35_0>=STAR && LA35_0<=EXCL)||LA35_0==AMPS||(LA35_0>=VEC_MACRO && LA35_0<=PRINT_MACRO)||(LA35_0>=TRUE && LA35_0<=FALSE)||(LA35_0>=IDF && LA35_0<=CSTE_STR)) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:237:31: e+= expr ( COMMA e+= expr )*
                            {
                            pushFollow(FOLLOW_expr_in_atom1763);
                            e=expr();

                            state._fsp--;

                            stream_expr.add(e.getTree());
                            if (list_e==null) list_e=new ArrayList();
                            list_e.add(e.getTree());

                            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:237:39: ( COMMA e+= expr )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==COMMA) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:237:40: COMMA e+= expr
                            	    {
                            	    COMMA98=(Token)match(input,COMMA,FOLLOW_COMMA_in_atom1766);  
                            	    stream_COMMA.add(COMMA98);

                            	    pushFollow(FOLLOW_expr_in_atom1770);
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

                    RSQBRACKET99=(Token)match(input,RSQBRACKET,FOLLOW_RSQBRACKET_in_atom1776);  
                    stream_RSQBRACKET.add(RSQBRACKET99);



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
                    // 237:69: -> ^( VEC_MACRO ( $e)* )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:237:72: ^( VEC_MACRO ( $e)* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_VEC_MACRO.nextNode(), root_1);

                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:237:84: ( $e)*
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
                    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:238:4: PRINT_MACRO EXCL LPAREN expr RPAREN
                    {
                    PRINT_MACRO100=(Token)match(input,PRINT_MACRO,FOLLOW_PRINT_MACRO_in_atom1793);  
                    stream_PRINT_MACRO.add(PRINT_MACRO100);

                    EXCL101=(Token)match(input,EXCL,FOLLOW_EXCL_in_atom1795);  
                    stream_EXCL.add(EXCL101);

                    LPAREN102=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom1797);  
                    stream_LPAREN.add(LPAREN102);

                    pushFollow(FOLLOW_expr_in_atom1799);
                    expr103=expr();

                    state._fsp--;

                    stream_expr.add(expr103.getTree());
                    RPAREN104=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom1801);  
                    stream_RPAREN.add(RPAREN104);



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
                    // 238:40: -> ^( PRINT_MACRO expr )
                    {
                        // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:238:43: ^( PRINT_MACRO expr )
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
    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:241:1: params : ( expr ( COMMA expr )* ) -> ^( PARAMS ( expr )+ ) ;
    public final mini_rustParser.params_return params() throws RecognitionException {
        mini_rustParser.params_return retval = new mini_rustParser.params_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA106=null;
        mini_rustParser.expr_return expr105 = null;

        mini_rustParser.expr_return expr107 = null;


        Object COMMA106_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:242:2: ( ( expr ( COMMA expr )* ) -> ^( PARAMS ( expr )+ ) )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:243:2: ( expr ( COMMA expr )* )
            {
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:243:2: ( expr ( COMMA expr )* )
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:243:3: expr ( COMMA expr )*
            {
            pushFollow(FOLLOW_expr_in_params1822);
            expr105=expr();

            state._fsp--;

            stream_expr.add(expr105.getTree());
            // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:243:8: ( COMMA expr )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==COMMA) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:243:9: COMMA expr
            	    {
            	    COMMA106=(Token)match(input,COMMA,FOLLOW_COMMA_in_params1825);  
            	    stream_COMMA.add(COMMA106);

            	    pushFollow(FOLLOW_expr_in_params1827);
            	    expr107=expr();

            	    state._fsp--;

            	    stream_expr.add(expr107.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
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
            // 243:23: -> ^( PARAMS ( expr )+ )
            {
                // D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\src\\eu\\telecomnancy\\mini_rust\\mini_rust.g:243:26: ^( PARAMS ( expr )+ )
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


 

    public static final BitSet FOLLOW_decl_in_fichier478 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_decl_func_in_decl503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_struct_in_decl508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FN_in_decl_func520 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDF_in_decl_func522 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_decl_func524 = new BitSet(new long[]{0x4000000000200000L});
    public static final BitSet FOLLOW_arguments_in_decl_func527 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_decl_func531 = new BitSet(new long[]{0x2000000000400000L});
    public static final BitSet FOLLOW_ARROW_in_decl_func534 = new BitSet(new long[]{0x40E0020000000000L});
    public static final BitSet FOLLOW_type_in_decl_func536 = new BitSet(new long[]{0x2000000000400000L});
    public static final BitSet FOLLOW_bloc_in_decl_func540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUCT_in_decl_struct572 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDF_in_decl_struct576 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LBRACKET_in_decl_struct578 = new BitSet(new long[]{0x4000000000800000L});
    public static final BitSet FOLLOW_IDF_in_decl_struct583 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_COLON_in_decl_struct585 = new BitSet(new long[]{0x40E0020000000000L});
    public static final BitSet FOLLOW_type_in_decl_struct589 = new BitSet(new long[]{0x0400000000800000L});
    public static final BitSet FOLLOW_COMMA_in_decl_struct592 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDF_in_decl_struct596 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_COLON_in_decl_struct598 = new BitSet(new long[]{0x40E0020000000000L});
    public static final BitSet FOLLOW_type_in_decl_struct602 = new BitSet(new long[]{0x0400000000800000L});
    public static final BitSet FOLLOW_RBRACKET_in_decl_struct608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_arguments640 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_COMMA_in_arguments643 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_argument_in_arguments645 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_IDF_in_type670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEC_TYPE_in_type675 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LT_in_type677 = new BitSet(new long[]{0x40E0020000000000L});
    public static final BitSet FOLLOW_type_in_type679 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_GT_in_type681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPS_in_type694 = new BitSet(new long[]{0x40E0020000000000L});
    public static final BitSet FOLLOW_type_in_type696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT32_TYPE_in_type702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_TYPE_in_type707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_argument719 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_COLON_in_argument721 = new BitSet(new long[]{0x40E0020000000000L});
    public static final BitSet FOLLOW_type_in_argument723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_bloc745 = new BitSet(new long[]{0xEB1D8A6800D01000L});
    public static final BitSet FOLLOW_instruction_bloc_in_bloc747 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACKET_in_bloc749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_instruction_bloc772 = new BitSet(new long[]{0xEB1D8A6800501000L});
    public static final BitSet FOLLOW_instruction_bloc_in_instruction_bloc774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_instruction_bloc780 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_instruction_bloc785 = new BitSet(new long[]{0xEB1D8A6800501000L});
    public static final BitSet FOLLOW_instruction_bloc_in_instruction_bloc787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LET_in_instruction817 = new BitSet(new long[]{0xC318126800101000L});
    public static final BitSet FOLLOW_MUT_in_instruction820 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_expr_in_instruction828 = new BitSet(new long[]{0x0800008000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_instruction832 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_expr_in_instruction836 = new BitSet(new long[]{0x0800000000400000L});
    public static final BitSet FOLLOW_obj_def_in_instruction839 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_instruction845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_instruction894 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_expr_in_instruction896 = new BitSet(new long[]{0x2000000000400000L});
    public static final BitSet FOLLOW_bloc_in_instruction898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_instruction913 = new BitSet(new long[]{0xCB18026800101000L});
    public static final BitSet FOLLOW_expr_in_instruction916 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_instruction920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_instruction934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bloc_in_instruction939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_obj_def951 = new BitSet(new long[]{0x4000000000800000L});
    public static final BitSet FOLLOW_IDF_in_obj_def956 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_COLON_in_obj_def958 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_obj_expr_in_obj_def962 = new BitSet(new long[]{0x0400000000800000L});
    public static final BitSet FOLLOW_COMMA_in_obj_def965 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_IDF_in_obj_def969 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_COLON_in_obj_def971 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_obj_expr_in_obj_def975 = new BitSet(new long[]{0x0400000000800000L});
    public static final BitSet FOLLOW_RBRACKET_in_obj_def981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_obj_expr1010 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_obj_def_in_obj_expr1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_expr1028 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_expr_in_if_expr1030 = new BitSet(new long[]{0x2000000000400000L});
    public static final BitSet FOLLOW_bloc_in_if_expr1032 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_else_expr_in_if_expr1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_expr1064 = new BitSet(new long[]{0x2001000000400000L});
    public static final BitSet FOLLOW_bloc_in_else_expr1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_else_expr1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_ou_in_expr1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_dot_factorisation1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEN_in_dot_factorisation1123 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_dot_factorisation1125 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_dot_factorisation1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_et_in_expr_ou1146 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_OR_in_expr_ou1155 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_expr_et_in_expr_ou1159 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_expr_comp_in_expr_et1188 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_AND_in_expr_et1197 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_expr_comp_in_expr_et1201 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_expr_plus_in_expr_comp1234 = new BitSet(new long[]{0x00000000FC000002L});
    public static final BitSet FOLLOW_LT_in_expr_comp1246 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_expr_plus_in_expr_comp1252 = new BitSet(new long[]{0x00000000FC000002L});
    public static final BitSet FOLLOW_LE_in_expr_comp1271 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_expr_plus_in_expr_comp1277 = new BitSet(new long[]{0x00000000FC000002L});
    public static final BitSet FOLLOW_GT_in_expr_comp1297 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_expr_plus_in_expr_comp1303 = new BitSet(new long[]{0x00000000FC000002L});
    public static final BitSet FOLLOW_GE_in_expr_comp1322 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_expr_plus_in_expr_comp1328 = new BitSet(new long[]{0x00000000FC000002L});
    public static final BitSet FOLLOW_EQ_in_expr_comp1347 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_expr_plus_in_expr_comp1353 = new BitSet(new long[]{0x00000000FC000002L});
    public static final BitSet FOLLOW_NE_in_expr_comp1373 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_expr_plus_in_expr_comp1379 = new BitSet(new long[]{0x00000000FC000002L});
    public static final BitSet FOLLOW_expr_mult_in_expr_plus1414 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_PLUS_in_expr_plus1424 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_expr_mult_in_expr_plus1428 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_MINUS_in_expr_plus1445 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_expr_mult_in_expr_plus1449 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_expr_unaire_in_expr_mult1481 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_STAR_in_expr_mult1493 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_expr_unaire_in_expr_mult1497 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_DIV_in_expr_mult1520 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_expr_unaire_in_expr_mult1524 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_MINUS_in_expr_unaire1558 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_expr_unaire_in_expr_unaire1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCL_in_expr_unaire1579 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_STAR_in_expr_unaire1585 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_AMPS_in_expr_unaire1591 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_expr_unaire_in_expr_unaire1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_expr_unaire1613 = new BitSet(new long[]{0x0000010001000002L});
    public static final BitSet FOLLOW_LSQBRACKET_in_expr_unaire1622 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_expr_in_expr_unaire1624 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RSQBRACKET_in_expr_unaire1626 = new BitSet(new long[]{0x0000010001000002L});
    public static final BitSet FOLLOW_DOT_in_expr_unaire1642 = new BitSet(new long[]{0x4000040000000000L});
    public static final BitSet FOLLOW_dot_factorisation_in_expr_unaire1644 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_CSTE_ENT_in_atom1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTE_STR_in_atom1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_atom1699 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_LPAREN_in_atom1702 = new BitSet(new long[]{0xC318026800301000L});
    public static final BitSet FOLLOW_params_in_atom1705 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_atom1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom1741 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_expr_in_atom1743 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_atom1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEC_MACRO_in_atom1754 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EXCL_in_atom1756 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LSQBRACKET_in_atom1758 = new BitSet(new long[]{0xC318026802101000L});
    public static final BitSet FOLLOW_expr_in_atom1763 = new BitSet(new long[]{0x0400000002000000L});
    public static final BitSet FOLLOW_COMMA_in_atom1766 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_expr_in_atom1770 = new BitSet(new long[]{0x0400000002000000L});
    public static final BitSet FOLLOW_RSQBRACKET_in_atom1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_MACRO_in_atom1793 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EXCL_in_atom1795 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_atom1797 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_expr_in_atom1799 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_atom1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_params1822 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_COMMA_in_params1825 = new BitSet(new long[]{0xC318026800101000L});
    public static final BitSet FOLLOW_expr_in_params1827 = new BitSet(new long[]{0x0400000000000002L});

}