package generation;

import grammar.mini_rustLexer;
import org.antlr.runtime.tree.Tree;
import symbolTable.SymbolTable;
import symbolTable.symbols.FunctionSymbol;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Generator {
    /**
     * Gère le fichier de génération
     */
    private final CodeManager codeManager;

    /**
     * Table des symboles générale
     */
    private final SymbolTable symbolTable;

    public Generator(File genFile, SymbolTable symbolTable) throws FileNotFoundException {
        this.codeManager = new CodeManager(genFile);
        this.symbolTable = symbolTable;
    }

    /**
     * Génère le code assembleur
     * Point de départ : fonction main
     * @throws IOException
     */
    public void generate() throws IOException {
        // Récupère la fonction main et son noeud
        FunctionSymbol main = symbolTable.getFunctionSymbol("main", true);
        Tree mainNode = main.getNode();

        /*
         * Code assembleur de base, alias des registres usuels,
         * définitions des trappes usuelles, valeurs NULL,
         * début de la pile, début du programme et démarrage
         * à main
         */
        this.codeManager
                .append("// Registres usuels\n")
                .append("SP EQU R15\n")
                .append("WR EQU R14\n")
                .append("BP EQU R13\n")
                .append("// Trappes usuelles\n")
                .append("EXIT_EXC EQU 64\n")
                .append("READ_EXC EQU 65\n")
                .append("WRITE_EXC EQU 66\n")
                .append("// Definitions de la valeur NULL\n")
                .append("NUL EQU 0\n")
                .append("NULL EQU 0\n")
                .append("NIL EQU 0\n")
                .append("// Adresse debut de la pile\n")
                .append("STACK_ADDRS EQU 0x1000\n")
                .append("// Adresse debut de programme\n")
                .append("LOAD_ADDRS EQU 0xFE00\n")
                .append("ORG LOAD_ADDRS\n")
                .append("START main_\n")
                .append("LDW SP, #STACK_ADDRS\n")
                .append("LDW BP, #NIL\n");

        /*
         * Génération du code, point de départ :
         * Fonction main
         */
        this.generateFunction(
                mainNode,
                main
        );

        // Code fin du programme
        this.codeManager
                .append("TRP #EXIT_EXC\n")
                .append("JEA @main_\n");

        // Dump le buffer restant dans le fichier
        this.codeManager.end();
    }

    private void generateFunction(Tree functionNode, FunctionSymbol functionSymbol) throws IOException {
        String functionLabel = functionSymbol.getName() + "_";

        this.codeManager
                .append(functionLabel).append("\n");

        this.generateBloc(
                functionNode.getChild(1),
                functionSymbol.getSymbolTable()
        );
    }

    private void generateBloc(Tree blocNode, SymbolTable currentSymbolTable) throws IOException {
        // Ouverture de l'environnement
        this.codeManager
                .append("// Ouverture de l'environnement\n")
                .append("STW BP, -(SP)\n")
                .append("LDW BP, SP\n");

        int environmentSize = currentSymbolTable.getEnvironmentSize();

        // Réservation mémoire pour les variables de l'environnement
        this.codeManager
                .append("// Reservation sur la pile des variables")
                .append("LDQ ").append(environmentSize).append(", R1\n")
                .append("SUB SP, R1, SP\n");

        // Parcours des instructions du bloc
        for(int i = 0; i < blocNode.getChildCount(); i++) {
            Tree child = blocNode.getChild(i);

            switch (child.getType()) {
                case mini_rustLexer.LET:
                case mini_rustLexer.LETMUT:
                    this.generateLet(child, currentSymbolTable);
                    break;
            }
        }

        // Fermeture de l'environnement
        this.codeManager
                .append("// Fermeture de l'environnement\n")
                .append("LDW SP, BP\n")
                .append("LDW BP, (SP)+\n");
    }

    private void generateLet(Tree letNode, SymbolTable currentSymbolTable) {

    }
}
