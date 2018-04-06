package eu.telecomnancy.mini_rust.semantic;

import eu.telecomnancy.mini_rust.TDS.symbols.Symbol;
import org.antlr.runtime.tree.CommonTree;

public class SemanticErrorMessage {
    private SemanticErrorMessage() {

    }

    private static String appendLine(CommonTree node, String message) {
        return "[line : " + node.getLine() + "] " + message;
    }

    public static String modifyingNotMutableSymbol(Symbol symbol) {
        return SemanticErrorMessage.appendLine(symbol.getNode(), "Modifying a not mutable symbol : " + symbol.getName());
    }

    public static String undefinedSymbol(String name, CommonTree node) {
        return SemanticErrorMessage.appendLine(node, "Undefined symbol : " + name);
    }

    public static String redefiningFunction(Symbol symbol) {
        return SemanticErrorMessage.appendLine(symbol.getNode(), "Redefining function : " + symbol.getName());
    }

    public static String redefiningStructure(Symbol symbol) {
        return SemanticErrorMessage.appendLine(symbol.getNode(), "Redefining structure : " + symbol.getName());
    }
}
