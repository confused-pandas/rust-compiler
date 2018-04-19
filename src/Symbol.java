
public abstract class Symbol {
	private final String name;
	private final int offset;
	private final Scope scope;
	
	public Symbol(String name, int offset, Scope scope) {
		this.name = name;
		this.offset = offset;
		this.scope = scope;
	}

	public String getName(){
		return name;
	}

	public int getOffset() {
		return offset;
	}

	public Scope getScope() {
		return scope;
	}
	 public abstract String getHashName();
	
}
