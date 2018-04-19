import java.util.LinkedList;

public class FunctionSymbol extends SymbolTableSymbolComposed{
	private Type returnType;
	private LinkedList<VariableSymbol> arguments;
	public static String suffixHash = "_F";

	public FunctionSymbol(String name, int offset, Scope scope, SymbolTable symbolTable) {
		super(name, offset, scope, symbolTable);
	}

	@Override
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
