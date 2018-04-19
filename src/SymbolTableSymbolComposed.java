public abstract class SymbolTableSymbolComposed extends Symbol {
    public final SymbolTable symbolTable;

	public SymbolTableSymbolComposed(String name, int offset, Scope scope, SymbolTable symbolTable) {
		super(name, offset, scope);
		this.symbolTable = symbolTable;
	}

	public SymbolTable getSymbolTable() {
	    return this.symbolTable;
    }
}
