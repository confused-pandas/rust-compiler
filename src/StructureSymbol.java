public class StructureSymbol extends SymbolTableSymbolComposed {
	public static String suffixHash = "_S";

	public StructureSymbol(String name, int offset, Scope scope, SymbolTable symbolTable) {
		super(name, offset, scope, symbolTable);
	}

	@Override
	public String getHashName(){
		return this.getName() + suffixHash;
	}
}
