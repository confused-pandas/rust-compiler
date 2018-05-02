package symbolTable.symbols;

import symbolTable.Scope;
import symbolTable.SymbolTable;
import symbolTable.Type;
import utils.Utils;

public class VariableSymbol extends Symbol {
	public Type type;
	public boolean isMutable;

	public VariableSymbol(String name, Scope scope, Type type, boolean isMutable) {
		super(EnumSymbolType.VARIABLE, name, scope);
		this.type = type;
		this.isMutable = isMutable;
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

	@Override
	public String toTable() {
		String str = super.toTable();

		str += "|" + Utils.padRight("VAR", SymbolTable.SYMBOL_TYPE_COL_WIDTH);
		str += "|" + Utils.padRight(String.valueOf(this.getType()), SymbolTable.TYPE_COL_WIDTH);
		str += "\n";

		return str;
	}
}
