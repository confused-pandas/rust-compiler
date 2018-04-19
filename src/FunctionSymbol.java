import java.util.LinkedList;

public class FunctionSymbol extends SymbolTableSymbolComposed{
	private Type returnType;
	private LinkedList<VariableSymbol> arguments;

	public FunctionSymbol(String name, Scope scope, SymbolTable symbolTable) {
		super(name, scope, symbolTable);
	}

	@Override
	public String getHashName(){
		return this.getName() + SUFFIX_HASH_FUNCTION;
	}

	public Type getReturnType(){
		return this.returnType;
	}

	public LinkedList<VariableSymbol> getArguments() {
		return arguments;
	}
}
