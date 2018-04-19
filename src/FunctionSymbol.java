import java.util.LinkedList;

public class FunctionSymbol extends SymbolTableSymbolComposed{
	
	public FunctionSymbol(String name, int offset, Scope scope) {
		super(name, offset, scope);
		// TODO Auto-generated constructor stub
	}

	private Type returnType;
	private LinkedList<VariableSymbol> arguments;
	public static String suffixHash = "_F";


	public String getHashName(){
		return this.getName() + suffixHash;
	}

	public Type getReturnType(){
		return this.returnType;
	}

	public LinkedList<VariableSymbol> getArguments() {
		return arguments;
	}
}
