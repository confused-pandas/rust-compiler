package symbolTable.symbols;

import symbolTable.Scope;
import symbolTable.SymbolTable;

public class StructureSymbol extends SymbolTableComposedSymbol {
	public StructureSymbol(String name, Scope scope, SymbolTable symbolTable) {
		super(EnumSymbolType.STRUCTURE, name, scope, symbolTable);
	}
}
