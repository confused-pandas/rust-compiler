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

	public boolean symbolExists(Symbol symbol,boolean checkParent){
		boolean exists = symbols.containsValue(symbol);
		
		if(!exists && checkParent){
			if(this.getParent() != null){
				return this.getParent().symbolExists(symbol, true);
			}
		}
		return exists;
	}

	public void addSymbol(Symbol symbol){
		this.symbols.put(symbol.getHashName(), symbol);
	}
	
	private Symbol getSymbol(String key){
		return symbols.get(key);
	}
	
	public FunctionSymbol getFunctionSymbol(String name){	
		return (FunctionSymbol) getSymbol(name + Symbol.SUFFIX_HASH_FUNCTION);
	}

	public StructureSymbol getStructureSymbol(String name){	
		return (StructureSymbol) getSymbol(name + Symbol.SUFFIX_HASH_STRUCTURE);
	}

	public VariableSymbol getVariableSymbol(String name){	
		return (VariableSymbol) getSymbol(name + Symbol.SUFFIX_HASH_VARIABLE);
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
