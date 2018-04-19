public abstract class SymbolTableSymbolComposed extends Symbol {
    public final SymbolTable symbolTable;

	public SymbolTableSymbolComposed(String name, Scope scope, SymbolTable symbolTable) {
		super(name, scope);
		this.symbolTable = symbolTable;
	}

	public SymbolTable getSymbolTable() {
	    return this.symbolTable;
    }
}
