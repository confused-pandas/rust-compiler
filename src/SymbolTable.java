import java.util.HashMap;

public class SymbolTable {

	private final int regionCounter;
	private int nestingLevel;
	private int regionNum;
	private HashMap<String,Symbol> symbols;
	private final SymbolTable parent;

	public SymbolTable(SymbolTable parent, int regionNum) {
		this.parent = parent;
		this.regionCounter = regionNum;
	}

	public boolean SymbolExists(Symbol symbol,SymbolTable ST){
		if(ST.getSymbols().containsValue(symbol)){
			return true;
		} 
		if(ST.getParent() == null) {
			return false;
		}
		return SymbolExists(symbol, ST.getParent());

	}



	public void AddFunctionSymbol(FunctionSymbol symbol){
		String key = symbol.getName() + FunctionSymbol.suffixHash;
		symbols.put(key,symbol);
	}
	
	public void AddStructureSymbol(StructureSymbol symbol){
		String key = symbol.getName() + StructureSymbol.suffixHash;
		symbols.put(key, symbol);
	}
	
	public void AddVariableSymbol(VariableSymbol symbol){
		String key = symbol.getName() + VariableSymbol.suffixHash;
		symbols.put(key, symbol);
	}


	public FunctionSymbol getFunctionSymbol(String key){
		FunctionSymbol functionSymbol = (FunctionSymbol) symbols.get(key + FunctionSymbol.suffixHash);
		return functionSymbol;
	}

	public StructureSymbol getStructureSymbol(String key){
		StructureSymbol structureSymbol = (StructureSymbol) symbols.get(key + StructureSymbol.suffixHash);
		return structureSymbol;
	}

	public VariableSymbol getVariableSymbol(String key){
		VariableSymbol variableSymbol = (VariableSymbol) symbols.get(key + VariableSymbol.suffixHash);
		return variableSymbol;
	}

	public HashMap<String,Symbol> getSymbols(){
		return symbols;
	}
	
	public SymbolTable getParent(){
		return parent;
	}

	public int getNestingLevel() {
		return nestingLevel;
	}

	public void setNestingLevel(int nestingLevel) {
		this.nestingLevel = nestingLevel;
	}

	public int getRegionCounter() {
		return regionCounter;
	}
}
