package symbolTable.symbols;

import symbolTable.Scope;
import symbolTable.Type;

public class VariableSymbol extends Symbol {
	public Type type;
	public boolean isMutable;

	public VariableSymbol(String name, Type type, Scope scope) {
		super(EnumSymbolType.VARIABLE, name, scope);
		this.type = type;
	}

	public boolean isMutable(){
		return this.isMutable;
	}

	public Type getType(){
		return this.type;
	}
}
