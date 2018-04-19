import java.util.HashMap;

public class SymbolTable {
	private static int regionCounter = 0;

    private final SymbolTable parent;
    private final HashMap<String,Symbol> symbols;
	private final int nestingLevel;
	private final int regionNum;

	public SymbolTable(SymbolTable parent, int nestingLevel) {
		this.parent = parent;
		this.regionNum = SymbolTable.regionCounter++;
		this.nestingLevel = nestingLevel;
		this.symbols = new HashMap<>();
	}

	public boolean SymbolExists(Symbol symbol,boolean checkParent){
		boolean exists = symbols.containsValue(symbol);
		
		if(!exists && checkParent){
			if(this.getParent() != null){
				return this.getParent().SymbolExists(symbol, true);
			}
		}
		return exists;
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

	public int getRegionCounter() {
		return regionCounter;
	}
}
