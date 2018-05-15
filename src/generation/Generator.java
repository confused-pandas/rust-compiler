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

        this.generatePrintFunction();
        this.generateItoaFunction();

        // Dump le buffer restant dans le fichier
        this.code.close();
    }

    private void openEnvironment(int environmentSize) throws IOException {
        this.code
                .append("// Ouverture de l'environnement")
                .append("STW BP, -(SP)")
                .append("LDW BP, SP")
                .append("// Reservation sur la pile des variables")
                .append("LDQ " + environmentSize + ", R0")
                .append("SUB SP, R0, SP");
    }

    private void closeEnvironment() throws IOException {
        this.code
                .append("// Fermeture de l'environnement")
                .append("LDW SP, BP")
                .append("LDW BP, (SP)+");
    }

    private void generateFunction(Tree functionNode, FunctionSymbol functionSymbol) throws IOException {
        String functionLabel = functionSymbol.getName() + "_";

        this.code
                .append(functionLabel);

        this.openEnvironment(functionSymbol.getSymbolTable().getEnvironmentSize());

        this.generateBloc(
                functionNode.getChild(1),
                functionSymbol.getSymbolTable()
        );

        this.closeEnvironment();
    }

    private void generateBloc(Tree blocNode, SymbolTable currentSymbolTable) throws IOException {
        // Parcours des instructions du bloc
        for(int i = 0; i < blocNode.getChildCount(); i++) {
            Tree child = blocNode.getChild(i);

            switch (child.getType()) {
                case mini_rustLexer.LET:
                case mini_rustLexer.LETMUT:
                    this.generateLet(child, currentSymbolTable);
                    break;
                case mini_rustLexer.WHILE:
                    this.generateWhile(child, currentSymbolTable.getBloc(child.getChild(1).hashCode()));
                    break;
                case mini_rustLexer.IF:
                    this.generateIf(child, currentSymbolTable.getBloc(child.getChild(1).hashCode()));
                    break;
                case mini_rustLexer.PRINT_MACRO:
                    this.generatePrint(child, currentSymbolTable);
                    break;
            }
        }
    }


    // PROTOYPE DE WHILE
    private void generateWhile(Tree whileNode, SymbolTable currentSymbolTable) throws IOException {
        Tree condition = whileNode.getChild(0);
        Tree bloc = whileNode.getChild(1);

        this.code
                .append("bwhile_" + bloc.hashCode());

        this.generateExpr(condition, currentSymbolTable, "ewhile_" + bloc.hashCode());
        this.generateBloc(bloc, currentSymbolTable);

        this.code
                .append("BMP bwhile_" + bloc.hashCode() + "-$-2")
                .append("ewhile_" + bloc.hashCode());
    }

    private void generateIf(Tree ifNode, SymbolTable currentSymbolTable) throws IOException {

    }

    private void generateLet(Tree letNode, SymbolTable currentSymbolTable) throws IOException {
        VariableSymbol variableSymbol = currentSymbolTable.getVariableSymbol(letNode.getChild(0).getText(), true);

        // Si le type de la variable n'est pas défini, elle n'est pas utilisée
        // on ne la génère donc pas
        if(!variableSymbol.getType().isUnknown()) {
            if(letNode.getChildCount() > 1) {
                this.generateExpr(letNode.getChild(1), currentSymbolTable, null);
                int register = this.registersManager.getReturnRegister();

                this.code
                        .append("STW R" + register + ", (BP)-" + variableSymbol.getOffset() + "");
            }
        }
    }

    private void generateExpr(Tree exprNode, SymbolTable currentSymbolTable, String label) throws IOException {
        int register;

        switch(exprNode.getType()) {
            case mini_rustLexer.BLOC:
                break;
            case mini_rustLexer.OR:
                break;
            case mini_rustLexer.AND:
                this.generateLogicalExpr(exprNode.getChild(0), currentSymbolTable, label);
                this.generateLogicalExpr(exprNode.getChild(1), currentSymbolTable, label);
                break;
            case mini_rustLexer.LT:
            case mini_rustLexer.LE:
            case mini_rustLexer.GT:
            case mini_rustLexer.GE:
            case mini_rustLexer.EQ:
            case mini_rustLexer.NE:
            	this.generateLogicalExpr(exprNode, currentSymbolTable, label);
                break;
            case mini_rustLexer.PLUS:
            case mini_rustLexer.MINUS:
            case mini_rustLexer.MUL:
            case mini_rustLexer.DIV:
                this.generateArithmeticExpr(exprNode, currentSymbolTable, label);
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

    private void generateArithmeticExpr(Tree arithmeticExprNode, SymbolTable currentSymbolTable, String label) throws IOException {
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
        this.generateExpr(arithmeticExprNode.getChild(0), currentSymbolTable, label);
        this.generateExpr(arithmeticExprNode.getChild(1), currentSymbolTable, label);

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

    private void generateLogicalExpr(Tree logicalExprNode, SymbolTable currentSymbolTable, String label) throws IOException {
    	/*
         * Une expression logique a deux membres, chacun des membres
         * va assigner leurs valeurs à un registre
         *
         * Par exemple 3 < 5, 3 sera assigné à R0 et 5 sera assigné à R1
         * (s'ils sont libres)
		 *
         */

    	this.generateExpr(logicalExprNode.getChild(0), currentSymbolTable, label);
    	this.generateExpr(logicalExprNode.getChild(1), currentSymbolTable, label);

    	int r2 = this.registersManager.getReturnRegister();
    	int r1 = this.registersManager.getReturnRegister();

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
                .append(op + " " + label + "-$-2");
    }

    private void generateVec(Tree vecNode, SymbolTable currentSymbolTable) throws IOException {
        /*
         * Un vecteur a un ou plusieurs paramètres qui
         * vont assigner leur valeur à un registre
         */

        for (int i = 0; i < vecNode.getChildCount(); i++){
            this.generateExpr(vecNode.getChild(i), currentSymbolTable, null);
            int register = this.registersManager.getFreeRegister();
            this.code
                 .append("LDW R" + register + ", #" + vecNode.getChild(i));
        }
    }

    private void generatePrint(Tree exprNode, SymbolTable currentSymbolTable) throws IOException {
        this.generateExpr(exprNode.getChild(0), currentSymbolTable, null);
        int r = this.registersManager.getReturnRegister();

        this.code
                .append("\t\t\t\t\t// réserve 7+1 = 8 caractères en pile\n" +
                        "\t\t\t\t\t// (entier pair supérieur à 7 demandé pour pas désaligner pile)\n" +
                        "adi SP, SP, #-8   \t// réserve place pour text sur pile (8 octets); \n" +
                        "\t\t\t\t\t// déplacement du début du tableau est -8\n" +
                        "\t\t\t\t\t// int value;\n" +
                        "adi SP, SP, #-2   \t// réserve place pour variable value;\n" +
                        "\t\t\t\t\t// déplacement de value est -10\n" +
                        "\t\t\t\t\t// value = -23; \n" +
                        "ldw r0, r0\t\t\t// charge r0 avec -23 = C2(23) = FFE9\n" +
                        "stw r0, (BP)-10   \t// sauve r0 à l'adresse BP-10       \n" +
                        "\t\t\t\t\t// itoa(value, text, 10);\n" +
                        "\t\t\t\t\t// appelle itoa avec i = value, p = text, b = 10\n" +
                        "ldw r0, #10       \t// charge 10 (pour base décimale) dans r0\n" +
                        "stw r0, -(SP)     \t// empile contenu de r0 (paramètre b)\n" +
                        "adi BP, r0, #-8   \t// r0 = BP - 8 = adresse du tableau text\n" +
                        "stw r0, -(SP)     \t// empile contenu de r0 (paramètre p)\n" +
                        "ldw r0, (BP)-10   \t// charge r0 avec value\n" +
                        "stw r0, -(SP)     \t// empile contenu de r0 (paramètre i)\n" +
                        "jsr @itoa_        \t// appelle fonction itoa d'adresse itoa_\n" +
                        "adi SP, SP, #6    \t// nettoie la pile des paramètres \n" +
                        "\t\t\t\t\t// de taille totale 6 octets\n" +
                        "\t\t\t\t\t// print(text);\n" +
                        "adi BP, r0, #-8   \t// r0 = BP - 8 = adresse du tableau text\n" +
                        "stw r0, -(SP)    \t// empile contenu de r0 (paramètre p)\n" +
                        "jsr @print_       \t// appelle fonction print d'adresse print_\n" +
                        "adi SP, SP, #2    \t// nettoie la pile des paramètres\n" +
                        "\t\t\t\t\t// de taille totale 2 octets");
    }

    private void generateItoaFunction() throws IOException {
        this.code
        .append("ITOA_I      equ 4      // offset du paramètre i\n" +
                "ITOA_P      equ 6      // offset du paramètre p\n" +
                "ITOA_B      equ 8      // offset du paramètre b\n" +
                "ASCII_MINUS equ 45     // code ASCII de -\n" +
                "ASCII_PLUS  equ 43     // code ASCII de +\n" +
                "ASCII_SP    equ 32     // code ASCII d'eSPace SP\n" +
                "ASCII_0     equ 48     // code ASCII de zéro (les autres chiffres jusqu'à 9 suivent dans l'ordre)\n" +
                "ASCII_A     equ 65     // code ASCII de A (les autres lettres jusqu'à Z suivent dans l'ordre alphabétique)\n" +
                "itoa_\n" +
                "stw BP, -(SP)\n" +
                "ldw BP, SP\n" +
                "// récupération des paramètres depuis pile vers registres\n" +
                "ldw r0, (BP)ITOA_I    // r0 = i    \n" +
                "ldw r1, (BP)ITOA_B    // r1 = b\n" +
                "// gère le signe: normalement itoa gère des int c'est à dire des entiers signés, \n" +
                "// mais en fait seulement pour b=10;\n" +
                "// dans ce cas calcule le signe dans r3 et charge r0 avec la valeur absolue de i\n" +
                "ldq ASCII_SP, r3      // code ASCII de eSPace (SPace) -> r3\n" +
                "ldq 10, WR            // 10 -> WR\n" +
                "cmp r1, WR            // charge les indicateurs de b - 10\n" +
                "bne NOSIGN-$-2        // si non égal (donc si b != 10) saute en NOSIGN, sinon calcule signe\n" +
                "ldq ASCII_PLUS, r3    // charge le code ASCII du signe plus + dans r3\n" +
                "tst r0                // charge les indicateurs de r0 et donc de i\n" +
                "bge POSIT-$-2         // saute en POSIT si i >= 0\n" +
                "neg r0, r0            // change le signe de r0\n" +
                "ldq ASCII_MINUS, r3   // charge le code ASCII du signe moins - dans r3\n" +
                "POSIT   NOP                   // r3 = code ASCII de signe: SP pour aucun, - ou +\n" +
                "\n" +
                "// convertit l'entier i en chiffres et les empile de droite à gauche\n" +
                "NOSIGN  ldw r2, r0            // r2 <- r0\n" +
                "CNVLOOP ldw r0, r2            // r0 <- r2\n" +
                "// effectue \"créativement\" la division par b supposé pair (car l'instruction div est hélas signée ...)\n" +
                "// d=2*d' , D = d * q + r  , D = 2*D'+r\" , D' = d' * q + r' => r = 2*r'+r\"\n" +
                "// un bug apparaît avec SRL R0, R0 avec R0 = 2 : met CF à 1 !!\n" +
                "srl r1, r1            // r1 = b/2\n" +
                "ani r0, r4, #1        // ANd Immédiate entre r0 et 00...01 vers r4:\n" +
                "\t\t\t\t  // bit n°0 de r0 -> r4; r4 = reste\" de r0/2\n" +
                "srl r0, r0            // r0 / 2 -> r0\n" +
                "div r0, r1, r2        // quotient = r0 / r1 -> r2, reste' = r0 % r1 -> r0\n" +
                "shl r0, r0            // r0 = 2 * reste'\n" +
                "add r0, r4, r0        // r0 = reste = 2 * reste' + reste\" => r0 = chiffre\n" +
                "shl r1, r1            // r1 = b\n" +
                "\n" +
                "adq -10, r0           // chiffre - 10 -> r0 \n" +
                "bge LETTER-$-2        // saute en LETTER si chiffre >= 10\n" +
                "adq 10+ASCII_0, r0    // ajoute 10 => r0 = chiffre, ajoute code ASCII de 0 \n" +
                "\t\t\t\t  // => r0 = code ASCII de chiffre\n" +
                "bmp STKCHR-$-2        // saute en STKCHR \n" +
                "LETTER  adq ASCII_A, r0       // r0 = ASCII(A) pour chiffre = 10, ASCII(B) pour 11 ...\n" +
                "\t\t\t\t  // ajoute code ASCII de A => r = code ASCII de chiffre\n" +
                "STKCHR  stw r0, -(SP)         // empile code ASCII du chiffre \n" +
                "\t\t\t\t  // (sur un mot complet pour pas désaligner pile)\n" +
                "tst r2                // charge les indicateurs en fonction du quotient ds r2)\n" +
                "bne CNVLOOP-$-2       // boucle si quotient non nul; sinon sort\n" +
                "// les caractères sont maintenant empilés : gauche en haut et droit en bas\n" +
                "// recopie les caractères dans le tampon dans le bon ordre: de gauche à droite\n" +
                "ldw r1, (BP)ITOA_P    // r1 pointe sur le début du tampon déjà alloué \n" +
                "stb r3, (r1)+         // copie le signe dans le tampon\n" +
                "CPYLOOP ldw r0, (SP)+         // dépile code du chiffre gauche (sur un mot) dans r0\n" +
                "stb r0, (r1)+         // copie code du chiffre dans un Byte du tampon de gauche à droite\n" +
                "cmp SP, BP            // compare SP et sa valeur avant empilement des caractères qui était BP\n" +
                "bne CPYLOOP-$-2       // boucle s'il reste au moins un chiffre sur la pile\n" +
                "ldq 10, r0\n" +
                "stb r0, (r1)+\n" +
                "ldq NUL, r0           // charge le code du caractère NUL dans r0\n" +
                "stb r0, (r1)+         // sauve code NUL pour terminer la chaîne de caractères\n" +
                "// termine\n" +
                "ldw r0, (BP)ITOA_P    // retourne le pointeur sur la chaîne de caractères\n" +
                "// UNLINK: fermeture de l'environnement de la fonction itoa\n" +
                "ldw SP, BP            // SP <- BP : abandonne infos locales; SP pointe sur ancinne valeur de BP\n" +
                "ldw BP, (SP)+         // dépile ancienne valeur de BP dans BP; SP pointe sur adresse de retour\n" +
                "rts                   // retourne au programme appelant");
    }

    private void generatePrintFunction() throws IOException {
        this.code
                .append("print_");
        this.openEnvironment(0);

        this.code
                .append("STW BP, -(SP)")
                .append("STW BP, SP");

        int r = this.registersManager.setReturnRegister();

        this.code
                .append("LDW R" + r + ", (BP)4")
                .append("TRP #WRITE_EXC");

        this.registersManager.getReturnRegister();

        this.closeEnvironment();

        this.code
                .append("RTS");
    }
}
