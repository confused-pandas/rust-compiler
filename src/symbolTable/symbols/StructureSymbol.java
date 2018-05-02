package symbolTable.symbols;

import symbolTable.Scope;
import symbolTable.SymbolTable;
import utils.Utils;

public class StructureSymbol extends SymbolTableComposedSymbol {
	public StructureSymbol(String name, Scope scope, SymbolTable symbolTable) {
		super(EnumSymbolType.STRUCTURE, name, scope, symbolTable);
	}

	@Override
	public String toTable() {
		String str = super.toTable();

		str += "|" + Utils.padRight("STRUCT(" + this.getSymbolTable().getRegionNum() + ")", SymbolTable.SYMBOL_TYPE_COL_WIDTH);
		str += "|" + Utils.padRight(null, SymbolTable.TYPE_COL_WIDTH);
		str += "\n";

		return str;
	}
}
