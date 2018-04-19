import java.util.LinkedList;

public class FunctionSymbol extends SymbolTableSymbolComposed{
	
	private Type returnType;
	private LinkedList<VariableSymbol> arguments;
	public static String suffixHash = "_F";


	public String genHash(){
		return this.getName() + suffixHash;
	}

	public Type getReturnType(){
		return this.returnType;
	}

	public LinkedList<VariableSymbol> getArguments() {
		return arguments;
	}
}
