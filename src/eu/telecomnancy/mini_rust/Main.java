package eu.telecomnancy.mini_rust;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;

public class Main {
    public static void main(String args[]) throws Exception {
        mini_rustLexer lex = new mini_rustLexer(new ANTLRFileStream("fichiers_tests/ex4.rs", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        mini_rustParser g = new mini_rustParser(tokens, null);
        try {
            mini_rustParser.fichier_return ret = g.fichier();
            CommonTree root = (CommonTree)ret.getTree();

            TreeTraversal traversal = new TreeTraversal(root);
            traversal.explore();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}