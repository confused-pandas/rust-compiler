
public class StructureSymbol extends SymbolTableSymbolComposed{


	public static String suffixHash = "_S";

	public static String genHash(String name){
		return name + suffixHash;
	}

	public String getHash(){
		return genHash(this.getName());

	}
}
