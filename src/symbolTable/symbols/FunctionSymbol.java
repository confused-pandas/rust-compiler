package symbolTable.symbols;

import symbolTable.Scope;
import symbolTable.Symbol;
import symbolTable.SymbolTable;
import symbolTable.Type;

import java.util.LinkedList;

public class FunctionSymbol extends SymbolTableComposedSymbol {
	private Type returnType;
	private LinkedList<VariableSymbol> arguments;

	public FunctionSymbol(String name, Scope scope, SymbolTable symbolTable) {
		super(name, scope, symbolTable);
	}

	@Override
	public String getHashName(){
		return this.getName() + Symbol.SUFFIX_HASH_FUNCTION;
	}

	public Type getReturnType(){
		return this.returnType;
	}

	public LinkedList<VariableSymbol> getArguments() {
		return arguments;
	}
}
