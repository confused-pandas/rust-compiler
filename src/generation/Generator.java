package generation;

import grammar.mini_rustLexer;
import org.antlr.runtime.tree.Tree;
import symbolTable.SymbolTable;
import symbolTable.symbols.FunctionSymbol;
import symbolTable.symbols.VariableSymbol;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Generator {
    /**
     * Gère le fichier de génération
     */
    private final BufferedStringBuilder code;

    /**
     * Table des symboles générale
     */
    private final SymbolTable symbolTable;

    private final RegistersManager registersManager;

    public Generator(File genFile, SymbolTable symbolTable) throws FileNotFoundException {
        if(genFile.exists() && genFile.length() > 0) {
            genFile.delete();
        }

        this.code = new BufferedStringBuilder(new FileOutputStream(genFile));
        this.symbolTable = symbolTable;
        this.registersManager = new RegistersManager(0, 10);
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
        this.code
                .append("// Registres usuels")
                .append("SP EQU R15")
                .append("WR EQU R14")
                .append("BP EQU R13")
                .append("// Trappes usuelles")
                .append("EXIT_EXC EQU 64")
                .append("READ_EXC EQU 65")
                .append("WRITE_EXC EQU 66")
                .append("// Definitions de la valeur NULL")
                .append("NUL EQU 0")
                .append("NULL EQU 0")
                .append("NIL EQU 0")
                .append("// Adresse debut de la pile")
                .append("STACK_ADDRS EQU 0x1000")
                .append("// Adresse debut de programme")
                .append("LOAD_ADDRS EQU 0xFE00")
                .append("ORG LOAD_ADDRS")
                .append("START main_")
                .append("LDW SP, #STACK_ADDRS")
                .append("LDW BP, #NIL");

        /*
         * Génération du code, point de départ :
         * Fonction main
         */
        this.generateFunction(
                mainNode,
                main
        );

        // Code fin du programme
        this.code
                .append("TRP #EXIT_EXC")
                .append("JEA @main_");

        // Dump le buffer restant dans le fichier
        this.code.close();
    }

    private void generateFunction(Tree functionNode, FunctionSymbol functionSymbol) throws IOException {
        String functionLabel = functionSymbol.getName() + "_";

        this.code
                .append(functionLabel);

        this.generateBloc(
                functionNode.getChild(1),
                functionSymbol.getSymbolTable()
        );
    }

    private void generateBloc(Tree blocNode, SymbolTable currentSymbolTable) throws IOException {
        // Ouverture de l'environnement
        this.code
                .append("// Ouverture de l'environnement")
                .append("STW BP, -(SP)")
                .append("LDW BP, SP");

        int environmentSize = currentSymbolTable.getEnvironmentSize();

        // Réservation mémoire pour les variables de l'environnement
        this.code
                .append("// Reservation sur la pile des variables")
                .append("LDQ " + environmentSize + ", R0")
                .append("SUB SP, R0, SP");

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
        this.code
                .append("// Fermeture de l'environnement")
                .append("LDW SP, BP")
                .append("LDW BP, (SP)+");
    }

    private void generateLet(Tree letNode, SymbolTable currentSymbolTable) throws IOException {
        VariableSymbol variableSymbol = currentSymbolTable.getVariableSymbol(letNode.getChild(0).getText(), true);

        // Si le type de la variable n'est pas défini, elle n'est pas utilisée
        // on ne la génère donc pas
        if(!variableSymbol.getType().isUnknown()) {
            if(letNode.getChildCount() > 1) {
                this.generateExpr(letNode.getChild(1), currentSymbolTable);
                int register = this.registersManager.getReturnRegister();

                this.code
                        .append("STW R" + register + ", (BP)-" + variableSymbol.getOffset() + "");
            }
        }
    }

    private void generateExpr(Tree exprNode, SymbolTable currentSymbolTable) throws IOException {
        int register;

        switch(exprNode.getType()) {
            case mini_rustLexer.BLOC:
                break;
            case mini_rustLexer.OR:
            case mini_rustLexer.AND:
                break;
            case mini_rustLexer.LT:
            case mini_rustLexer.LE:
            case mini_rustLexer.GT:
            case mini_rustLexer.GE:
            case mini_rustLexer.EQ:
            case mini_rustLexer.NE:
            	this.generateLogicalExpr(exprNode, currentSymbolTable);
                break;
            case mini_rustLexer.PLUS:
            case mini_rustLexer.MINUS:
            case mini_rustLexer.MUL:
            case mini_rustLexer.DIV:
                this.generateArithmeticExpr(exprNode, currentSymbolTable);
                break;
            case mini_rustLexer.UNARY_MINUS:
                break;
            case mini_rustLexer.NEG:
                break;
            case mini_rustLexer.POINTER:
            case mini_rustLexer.REF:
                break;
            case mini_rustLexer.INDEX:
            case mini_rustLexer.DOT:
                break;
            case mini_rustLexer.FUNCTION_CALL:
                break;
            case mini_rustLexer.VEC_MACRO:
                this.generateVec(exprNode, currentSymbolTable);
                break;
            case mini_rustLexer.PRINT_MACRO:
                break;
            case mini_rustLexer.CSTE_ENT:
                register = this.registersManager.setReturnRegister();

                this.code
                        .append("LDW R" + register + ", #" + Integer.parseInt(exprNode.getText()) + "");
                break;
            case mini_rustLexer.TRUE:
            case mini_rustLexer.FALSE:
                break;
            case mini_rustLexer.IDF:
                register = this.registersManager.setReturnRegister();

                this.code
                        .append("LDW R" + register + ", (BP)-" + currentSymbolTable.getVariableSymbol(exprNode.getText(), true).getOffset());
                break;
            case mini_rustLexer.OBJ:
                break;
        }
    }

    private void generateArithmeticExpr(Tree arithmeticExprNode, SymbolTable currentSymbolTable) throws IOException {
        /*
         * Une expression arithmétique a deux membres, chacun des membres
         * va assigner leur valeur à un registre
         *
         * Par exemple 3 + 5, 3 sera assigné à R0 et 5 sera assigné à R1
         * (s'ils sont libres)
         *
         * On utilise generateExpr, les expressions d'une opération arithmétique
         * ne sont pas forcément arithmétique, appel de fonction qui retourne
         * une valeur, une variable entière, ...
         */
        this.generateExpr(arithmeticExprNode.getChild(0), currentSymbolTable);
        this.generateExpr(arithmeticExprNode.getChild(1), currentSymbolTable);

        /*
         * L'ordre est important pour la soustraction, les registres sont
         * réservés sur un stack
         *
         * 3 - 5, R0 -> 3, R1 -> 5
         * Si on inverse pas les variables r1 et r2, on fera l'opération :
         * 5 - 3
         */
        int r2 = this.registersManager.getReturnRegister();
        int r1 = this.registersManager.getReturnRegister();

        /*
         * Réserve un registre pour le retour de l'opération (récupéré
         * soit par generateArithmetiqueExpr ou generateLet pour assigner
         * le résultat
         *
         * On peut voir ça comme ça :
         * ADD R0, R1, R2
         * R0 et R1 registres "d'entrée" pour l'opération ADD
         * R2 registre de "retour"
         */
        int r3 = this.registersManager.setReturnRegister();
        String op;

        switch (arithmeticExprNode.getType()) {
            case mini_rustLexer.PLUS:
                op = "ADD";
                break;
            case mini_rustLexer.MINUS:
                op = "SUB";
                break;
            case mini_rustLexer.MUL:
                op = "MUL";
                break;
            default:
                op = "DIV";
                break;
        }

        this.code
                .append(op + " R" + r1 + ", R" + r2 + ", R" + r3 + "");
    }

    private void generateLogicalExpr(Tree logicalExprNode, SymbolTable currentSymbolTable) throws IOException {
    	/*
         * Une expression logique a deux membres, chacun des membres
         * va assigner leurs valeurs à un registre
         *
         * Par exemple 3 < 5, 3 sera assigné à R0 et 5 sera assigné à R1
         * (s'ils sont libres)
		 *
         */

    	this.generateExpr(logicalExprNode.getChild(0), currentSymbolTable);
    	this.generateExpr(logicalExprNode.getChild(1), currentSymbolTable);

    	int r2 = this.registersManager.getReturnRegister();
    	int r1 = this.registersManager.getReturnRegister();

    	int r3 = this.registersManager.setReturnRegister();
    	String op;

    	switch (logicalExprNode.getType()) {
    		case mini_rustLexer.EQ:
    			op = "BNE";
    			break;
    		case mini_rustLexer.LE:
    			op = "BGT";
    			break;
    		case mini_rustLexer.LT:
    			op = "BGE";
    			break;
    		case mini_rustLexer.GE:
    			op = "BLW";
    			break;
    		case mini_rustLexer.GT:
    			op = "BLE";
    			break;
    		default:
    			op = "BEQ";
    			break;
    	}

    	this.code
    			.append("CMP "+ "R" + r1 + "," + " R"+ r2)
    			.append(op + " 6")
    			.append("LDW" + " R"+ r3 + ", #0")
    			.append("BMP" + " 2")
    			.append("LDW" + " R" + r3 + ", #1")
    			;
    }

    private void generateVec(Tree vecNode, SymbolTable currentSymbolTable) throws IOException {
        /*
         * Un vecteur a un ou plusieurs paramètres qui
         * vont assigner leur valeur à un registre
         */

        for (int i = 0; i < vecNode.getChildCount(); i++){
            this.generateExpr(vecNode.getChild(i), currentSymbolTable);
            int register = this.registersManager.getFreeRegister();
            this.code
                 .append("LDW R" + register + ", #" + vecNode.getChild(i));
        }
    }
}
