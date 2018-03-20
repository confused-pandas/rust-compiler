package eu.telecomnancy.mini_rust;

import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

public class Main {
    public static void main(String args[]) throws Exception {
        mini_rustLexer lex = new mini_rustLexer(new ANTLRFileStream("D:\\_Dev\\Java\\Compilation2018-AGHENDA-HURET-VANTOUROUT-WILLAIME\\fichiers_tests\\ex4.rs", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        mini_rustParser g = new mini_rustParser(tokens, null);
        try {
            mini_rustParser.fichier_return ret = g.fichier();
            CommonTree tree = (CommonTree)ret.getTree();
            printTree(tree, 0);
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }

    public static void printTree(CommonTree t, int indent) {
        if ( t != null ) {
            StringBuffer sb = new StringBuffer(indent);

            if (t.getParent() == null){
                System.out.println(sb.toString() + t.getText().toString());
            }
            for ( int i = 0; i < indent; i++ )
                sb = sb.append("   ");
            for ( int i = 0; i < t.getChildCount(); i++ ) {
                System.out.println(sb.toString() + t.getChild(i).toString());
                printTree((CommonTree)t.getChild(i), indent+1);
            }
        }
    }

    static final TreeAdaptor adaptor = new CommonTreeAdaptor() {
        public Object create(Token payload) {
            return new CommonTree(payload);
        }
    };
}