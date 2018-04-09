package eu.telecomnancy.mini_rust.semantic;

import eu.telecomnancy.mini_rust.TDS.symbols.Symbol;
import org.antlr.runtime.tree.CommonTree;

import javax.print.DocFlavor;

public class SemanticErrorMessage {
    private SemanticErrorMessage() {

    }

    private static String appendLine(CommonTree node, String message) {
        return "[line : " + node.getLine() + "] " + message;
    }

    public static String undefinedSymbol(String name, CommonTree node) {
        return SemanticErrorMessage.appendLine(node, "Undefined symbol : " + name);
    }

    public static String callingUndefinedFunction(String name, CommonTree node) {
        return SemanticErrorMessage.appendLine(node, "Calling undefined function : " + name);
    }

    public static String undefinedType(String name, CommonTree node){
        return SemanticErrorMessage.appendLine(node, "Undefined type : " + name);
    }
    
    public static String boolExprIf(String name, CommonTree node){
        return SemanticErrorMessage.appendLine(node, "Non bool expr in if " + name);
    }

    public static String modifyingNotMutableSymbol(Symbol symbol) {
        return SemanticErrorMessage.appendLine(symbol.getNode(), "Modifying a not mutable symbol : " + symbol.getName());
    }

    public static String redefiningFunction(Symbol symbol) {
        return SemanticErrorMessage.appendLine(symbol.getNode(), "Redefining function : " + symbol.getName());
    }

    public static String redefiningStructure(Symbol symbol) {
        return SemanticErrorMessage.appendLine(symbol.getNode(), "Redefining structure : " + symbol.getName());
    }

    public static String mainFunctionHasParameters(Symbol symbol) {
        return SemanticErrorMessage.appendLine(symbol.getNode(), "Function main has parameters");
    }

    public static String uncorrectNbSymbols(Symbol symbol) {
        return SemanticErrorMessage.appendLine(symbol.getNode(), "Initializing structure : " + symbol.getName() + " with wrong number of elements");
    }

    public static String uncorrectNbSymbolsFunction(Symbol symbol) {
        return SemanticErrorMessage.appendLine(symbol.getNode(), "Calling function : " + symbol.getName() + " with wrong number of parameters");
    }


    public static String noMainFunction() {
        return "No main function";
    }
}
