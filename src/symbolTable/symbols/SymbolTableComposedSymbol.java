package symbolTable.symbols;

import symbolTable.Scope;
import symbolTable.Symbol;
import symbolTable.SymbolTable;

public abstract class SymbolTableComposedSymbol extends Symbol {
    public final SymbolTable symbolTable;

	public SymbolTableComposedSymbol(String name, Scope scope, SymbolTable symbolTable) {
		super(name, scope);
		this.symbolTable = symbolTable;
	}

	public SymbolTable getSymbolTable() {
	    return this.symbolTable;
    }
}
