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

	public boolean SymbolExists(Symbol symbol,boolean checkParent){
		boolean exists = symbols.containsValue(symbol);
		if(!exists && checkParent){
			if(this.getParent() != null){
				return this.getParent().SymbolExists(symbol, checkParent);
			}
		} else if(!exists && !checkParent){
			return false;
		}
		return true;
	}

	private void addSymbol(String key, Symbol symbol){
		symbols.put(key,symbol);
	}

	public void addFunctionSymbol(FunctionSymbol symbol){
		String key = symbol.getName() + FunctionSymbol.suffixHash;
		addSymbol(key, symbol);
	}
	
	public void addStructureSymbol(StructureSymbol symbol){
		String key = symbol.getName() + StructureSymbol.suffixHash;
		addSymbol(key, symbol);
	}
	
	public void addVariableSymbol(VariableSymbol symbol){
		String key = symbol.getName() + VariableSymbol.suffixHash;
		addSymbol(key, symbol);
	}

	
	private Symbol getSymbol(String key){
		return symbols.get(key);
	}
	
	public FunctionSymbol getFunctionSymbol(String name){	
		return (FunctionSymbol) getSymbol(name + FunctionSymbol.suffixHash);
	}

	public StructureSymbol getStructureSymbol(String name){	
		return (StructureSymbol) getSymbol(name + StructureSymbol.suffixHash);
	}

	public VariableSymbol getVariableSymbol(String name){	
		return (VariableSymbol) getSymbol(name + VariableSymbol.suffixHash);
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
