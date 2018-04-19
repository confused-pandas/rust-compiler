public class StructureSymbol extends SymbolTableSymbolComposed {
	public StructureSymbol(String name, Scope scope, SymbolTable symbolTable) {
		super(name, scope, symbolTable);
	}

	@Override
	public String getHashName(){
		return this.getName() + SUFFIX_HASH_STRUCTURE;
	}
}
