
public class VariableSymbol extends Symbol {

	public Type type;
	public boolean isMutable;
	public static String suffixHash = "_V";

	public String genHash(){
		return this.getName() + suffixHash;
	}

	public boolean CheckMutable(){
		return this.isMutable;
	}

	public Type getType(){
		return this.type;
	}




}
