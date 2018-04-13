package eu.telecomnancy.mini_rust;

import eu.telecomnancy.mini_rust.grammar.mini_rustLexer;
import eu.telecomnancy.mini_rust.grammar.mini_rustParser;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        mini_rustLexer lex = new mini_rustLexer(new ANTLRFileStream("fichiers_tests/symetrie_points.rs", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        mini_rustParser g = new mini_rustParser(tokens, null);
        try {
            mini_rustParser.fichier_return ret = g.fichier();
            Tree root = (Tree)ret.getTree();

        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}