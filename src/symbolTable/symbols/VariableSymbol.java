package symbolTable.symbols;

import org.antlr.runtime.tree.Tree;
import symbolTable.Scope;
import symbolTable.SymbolTable;
import symbolTable.Type;
import utils.Utils;

public class VariableSymbol extends Symbol {
	public Type type;
	public boolean isMutable;
	private boolean isDefined;

	public VariableSymbol(Tree node, String name, Scope scope, Type type, boolean isMutable) {
		super(node, EnumSymbolType.VARIABLE, name, scope);
		this.type = type;
		this.isMutable = isMutable;
		this.isDefined = false;
	}

	public boolean isMutable(){
		return this.isMutable;
	}

	public Type getType(){
		return this.type;
	}

	public void setType(Type type){
		this.type = type;
	}

	public boolean isDefined() {
		return isDefined;
	}

	public void setDefined(boolean defined) {
		isDefined = defined;
	}

	@Override
	public String toTable() {
		String str = super.toTable();

		str += "|" + Utils.padRight("VAR", SymbolTable.SYMBOL_TYPE_COL_WIDTH);
		str += "|" + Utils.padRight(String.valueOf(this.getType()), SymbolTable.TYPE_COL_WIDTH);
		str += "\n";

		return str;
	}
}
