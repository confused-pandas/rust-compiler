import exception.UnknownNodeException;
import exception.semantic.SemanticException;
import generation.Compiler;
import generation.Generator;
import grammar.mini_rustLexer;
import grammar.mini_rustParser;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;
import symbolTable.SymbolTable;
import symbolTable.TreeTraversal;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        String source = "fichiers_tests/test1.rs";
        mini_rustLexer lex = new mini_rustLexer(new ANTLRFileStream(source, "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        mini_rustParser g = new mini_rustParser(tokens, null);

        try {
            mini_rustParser.fichier_return ret = g.fichier();
            Tree root = (Tree)ret.getTree();
            TreeTraversal treeTraversal = new TreeTraversal(root);
            SymbolTable symbolTable = treeTraversal.buildSymbolTable();
            System.out.println(symbolTable.toTable());

            File sourceFile = new File(source);
            File genFile = new File("gen.src");
            Generator generator = new Generator(sourceFile, genFile, symbolTable);
            generator.generate();

            Compiler compiler = new Compiler(genFile);
            compiler.compile();
        } catch (RecognitionException e) {
            e.printStackTrace();
        } catch (SemanticException e) {
            e.printStackTrace();
        } catch (UnknownNodeException e) {
            e.printStackTrace();
        }
    }
}