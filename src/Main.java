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

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        String source = "";
        String out = "";
        String outSt = "";

        for(int i = 0; i < args.length; i++) {
            if(args[i].equals("-s")) {
                source = args[++i];
            }
            else if(args[i].equals("-o")) {
                out = args[++i];
            }
            else if(args[i].equals("-sto")) {
                outSt = args[++i];
            }
            else if(args[i].equals("-h")) {
                String str = "" +
                        "Utilisation du générateur de code :\n" +
                        "-s : Fichier source en .rs\n" +
                        "-o : Fichier de sortie .src\n" +
                        "-sto : Fichier de sortie pour la table des symboles\n";

                System.out.println(str);
                return;
            }
        }

        //source = "fichiers_tests/ex3.rs";
        mini_rustLexer lex = new mini_rustLexer(new ANTLRFileStream(source, "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        mini_rustParser g = new mini_rustParser(tokens, null);

        try {
            mini_rustParser.fichier_return ret = g.fichier();
            Tree root = (Tree)ret.getTree();
            TreeTraversal treeTraversal = new TreeTraversal(root);
            SymbolTable symbolTable = treeTraversal.buildSymbolTable();

            if(!outSt.equals("")) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(outSt));
                writer.write(symbolTable.toTable());
                writer.close();
            }

            File sourceFile = new File(source);
            File genFile = new File(out);
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