
public abstract class Symbol {
	private final String name;
	private int offset;
	private final Scope scope;
	public static String SUFFIX_HASH_FUNCTION = "_F";
	public static String SUFFIX_HASH_STRUCTURE = "_S";
	public static String SUFFIX_HASH_VARIABLE = "_V";

	public Symbol(String name) {
	    this(name, Scope.LOCAL);
    }

	public Symbol(String name, Scope scope) {
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

	public abstract String getHashName();
}
