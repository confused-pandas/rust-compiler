package symbolTable.symbols;

import org.antlr.runtime.tree.Tree;
import symbolTable.Scope;
import symbolTable.SymbolTable;

public abstract class SymbolTableComposedSymbol extends Symbol {
    public final SymbolTable symbolTable;

	protected SymbolTableComposedSymbol(Tree node, EnumSymbolType symbolType, String name, Scope scope, SymbolTable symbolTable) {
		super(node, symbolType, name, scope);
		this.symbolTable = symbolTable;
	}

	public SymbolTable getSymbolTable() {
	    return this.symbolTable;
    }
}
