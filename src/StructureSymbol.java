
public class StructureSymbol extends SymbolTableSymbolComposed{


	public static String suffixHash = "_S";

	public String genHash(){
		return this.getName() + suffixHash;
	}

}
