package eu.telecomnancy.mini_rust.semantic;

import eu.telecomnancy.mini_rust.TDS.symbols.FunctionSymbol;
import eu.telecomnancy.mini_rust.TDS.symbols.Symbol;
import org.antlr.runtime.tree.CommonTree;

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
    
    public static String boolExprIf(CommonTree node){
        return SemanticErrorMessage.appendLine(node, "No bool in if expression");
    }
    
    public static String boolExprWhile(CommonTree node){
        return SemanticErrorMessage.appendLine(node, "No bool in while expression ");
    }
    
    public static String vecExprSameType(CommonTree node) {
    	return SemanticErrorMessage.appendLine(node, "Expressions in Vector are not of same type");
    }
    
    public static String compBoolExpr(String name, CommonTree node) {
    	return SemanticErrorMessage.appendLine(node, "Comparaison is not of boolean type " + name );
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

    public static String incorrectNbSymbolsStructure(Symbol symbol) {
        return SemanticErrorMessage.appendLine(symbol.getNode(), "Initializing structure : " + symbol.getName() + " with wrong number of elements");
    }

    public static String incorrectNbSymbolsFunction(Symbol symbol) {
        return SemanticErrorMessage.appendLine(symbol.getNode(), "Calling function : " + symbol.getName() + " with wrong number of parameters");
    }

    public static String wrongTypeParam(Symbol symbol) {
        return SemanticErrorMessage.appendLine(symbol.getNode(), "Calling function : " + symbol.getName() + " with wrong type");
    }

    public static String wrongReturnType(Symbol symbol, CommonTree node) {
        return SemanticErrorMessage.appendLine(node, "Wrong return type, expecting : " + ((FunctionSymbol)symbol).getReturnType());
    }

    public static String lenNotOnVector(CommonTree node) {
        return SemanticErrorMessage.appendLine(node, "len() can't be applied on scalar type");
    }

    public static String lenNotAtEnd(CommonTree node) {
        return SemanticErrorMessage.appendLine(node, "Misuse of len.");
    }

    public static String binaryExpressionMismatchType(CommonTree node) {
        return SemanticErrorMessage.appendLine(node, "Binary expression mismatch type");
    }

    public static String structWrongType(CommonTree node) {
        return SemanticErrorMessage.appendLine(node, "Wrong type structure initialization");
    }

    public static String noMainFunction() {
        return "No main function";
    }
}
