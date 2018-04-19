public class StructureSymbol extends SymbolTableSymbolComposed {


	public StructureSymbol(String name, int offset, Scope scope, SymbolTable symbolTable) {
		super(name, offset, scope, symbolTable);
	}

	@Override
	public String getHashName(){
		return this.getName() + SUFFIX_HASH_STRUCTURE;
	}
}
