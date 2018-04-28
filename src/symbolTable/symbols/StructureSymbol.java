package symbolTable.symbols;

import symbolTable.Scope;
import symbolTable.Symbol;
import symbolTable.SymbolTable;

public class StructureSymbol extends SymbolTableComposedSymbol {
	public StructureSymbol(String name, Scope scope, SymbolTable symbolTable) {
		super(name, scope, symbolTable);
	}

	@Override
	public String getHashName(){
		return this.getName() + Symbol.SUFFIX_HASH_STRUCTURE;
	}
}
