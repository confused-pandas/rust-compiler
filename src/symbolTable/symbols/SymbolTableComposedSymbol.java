package symbolTable.symbols;

import symbolTable.Scope;
import symbolTable.SymbolTable;

public abstract class SymbolTableComposedSymbol extends Symbol {
    public final SymbolTable symbolTable;

	protected SymbolTableComposedSymbol(EnumSymbolType symbolType, String name, Scope scope, SymbolTable symbolTable) {
		super(symbolType, name, scope);
		this.symbolTable = symbolTable;
	}

	public SymbolTable getSymbolTable() {
	    return this.symbolTable;
    }
}
