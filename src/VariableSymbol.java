
public class VariableSymbol extends Symbol {

	public VariableSymbol(String name, int offset, Scope scope) {
		super(name, offset, scope);
		// TODO Auto-generated constructor stub
	}

	public Type type;
	public boolean isMutable;
	public static String suffixHash = "_V";

	public boolean CheckMutable(){
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
