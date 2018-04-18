import java.util.LinkedList;

public class FunctionSymbol extends SymbolTableSymbolComposed{
	
	private Type returnType;
	private LinkedList<VariableSymbol> arguments;
	public static String suffixHash = "_F";


	public static String genHash(String name){
		return name + suffixHash;
	}

	public String getHash(){
		return genHash(this.getName());
	}

	public Type getReturnType(){
		return this.returnType;
	}

	public LinkedList<VariableSymbol> getArguments() {
		return arguments;
	}
}
