public class VariableSymbol extends Symbol {
	public Type type;
	public boolean isMutable;
	public static String suffixHash = "_V";

	public VariableSymbol(String name, int offset, Scope scope) {
		super(name, offset, scope);
	}

	public boolean isMutable(){
		return this.isMutable;
	}

	public Type getType(){
		return this.type;
	}

	@Override
	public String getHashName() {
		return this.getName() + suffixHash;
	}
}
