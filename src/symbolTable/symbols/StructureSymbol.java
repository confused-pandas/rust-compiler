package symbolTable.symbols;

import org.antlr.runtime.tree.Tree;
import symbolTable.Scope;
import symbolTable.SymbolTable;
import utils.Utils;

public class StructureSymbol extends SymbolTableComposedSymbol {
	public StructureSymbol(Tree node, String name, Scope scope, SymbolTable symbolTable) {
		super(node, EnumSymbolType.STRUCTURE, name, scope, symbolTable);
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
