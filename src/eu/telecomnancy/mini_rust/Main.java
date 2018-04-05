package eu.telecomnancy.mini_rust;

import eu.telecomnancy.mini_rust.grammar.mini_rustLexer;
import eu.telecomnancy.mini_rust.grammar.mini_rustParser;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;

import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
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