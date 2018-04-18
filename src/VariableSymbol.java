
public class VariableSymbol extends Symbol {

	public Type type;
	public boolean isMutable;
	public static String suffixHash = "_V";

	public static String genHash(String name){
		return name + suffixHash;
	}

	public String getHash(){
		return genHash(this.getName());
	}

	public boolean CheckMutable(){
		return this.isMutable;
	}

	public Type getType(){
		return this.type;
	}




}
