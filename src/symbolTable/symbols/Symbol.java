package symbolTable.symbols;

import symbolTable.Scope;

public abstract class Symbol {
	private final EnumSymbolType symbolType;
	private final String name;
	private int offset;
	private final Scope scope;

	protected Symbol(EnumSymbolType symbolType, String name) {
	    this(symbolType, name, Scope.LOCAL);
    }

	protected Symbol(EnumSymbolType symbolType, String name, Scope scope) {
		this.symbolType = symbolType;
		this.name = name;
		this.scope = scope;
	}

	public String getName(){
		return name;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
	    this.offset = offset;
    }

	public Scope getScope() {
		return scope;
	}

	public EnumSymbolType getSymbolType() {
		return this.symbolType;
	}

	public String getHashName() {
	    return this.getName() + this.getSymbolType().getSuffix();
    }
}
