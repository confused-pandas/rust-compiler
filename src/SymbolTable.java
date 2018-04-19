import java.util.HashMap;

public class SymbolTable {
	private static int regionCounter = 0;

    private final SymbolTable parent;
    private final HashMap<String,Symbol> symbols;
	private final int nestingLevel;
	private final int regionNum;
	private int offsetCount;

	public SymbolTable(SymbolTable parent, int nestingLevel) {
		this.parent = parent;
		this.regionNum = SymbolTable.regionCounter++;
		this.nestingLevel = nestingLevel;
		this.symbols = new HashMap<>();
		this.offsetCount = 0;
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
		if (symbol instanceof VariableSymbol && symbol.getScope()== Scope.LOCAL){
			this.offsetCount --;
			symbol.setOffset(this.offsetCount);
		}
		else{
			if (this.offsetCount <0){
				this.offsetCount = 0;
			}
			symbol.setOffset(this.offsetCount);
			this.offsetCount ++;
		}


	}
	
	private Symbol getSymbol(String key, boolean checkParent){
	    Symbol symbol = symbols.get(key);

	    if(symbol == null && checkParent && this.getParent() != null) {
	        return this.getParent().getSymbol(key, true);
        }
        else {
            return symbol;
        }
    }
	
	public FunctionSymbol getFunctionSymbol(String name, boolean checkParent){
		return (FunctionSymbol) getSymbol(name + Symbol.SUFFIX_HASH_FUNCTION, checkParent);
	}

	public StructureSymbol getStructureSymbol(String name, boolean checkParent){
		return (StructureSymbol) getSymbol(name + Symbol.SUFFIX_HASH_STRUCTURE, checkParent);
	}

	public VariableSymbol getVariableSymbol(String name, boolean checkParent){
		return (VariableSymbol) getSymbol(name + Symbol.SUFFIX_HASH_VARIABLE, checkParent);
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

	public int getRegionNum() {
		return regionNum;
	}
}
