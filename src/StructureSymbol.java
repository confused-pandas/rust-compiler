
public class StructureSymbol extends SymbolTableSymbolComposed{


	public StructureSymbol(String name, int offset, Scope scope) {
		super(name, offset, scope);
		// TODO Auto-generated constructor stub
	}

	public static String suffixHash = "_S";

	public String getHashName(){
		return this.getName() + suffixHash;
	}



}
