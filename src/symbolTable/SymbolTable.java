package symbolTable;

import symbolTable.symbols.*;
import utils.Utils;

import java.util.*;

public class SymbolTable {
	private static int regionCounter = 0;

	public static int NAME_COL_WIDTH = 20;
	public static int OFFSET_COL_WIDTH = 6;
	public static int SYMBOL_TYPE_COL_WIDTH = 15;
	public static int TYPE_COL_WIDTH = 15;

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
		boolean exists = symbols.containsKey(symbol.getHashName());
		
		if(!exists && checkParent){
			if(this.getParent() != null){
				return this.getParent().symbolExists(symbol, true);
			}
		}
		return exists;
	}

	public void addSymbol(Symbol symbol){
		this.symbols.put(symbol.getHashName(), symbol);
		if (symbol instanceof VariableSymbol && symbol.getScope()== Scope.FUNCTION){
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
		return (FunctionSymbol) getSymbol(name + EnumSymbolType.FUNCTION.getSuffix(), checkParent);
	}

	public StructureSymbol getStructureSymbol(String name, boolean checkParent){
		return (StructureSymbol) getSymbol(name + EnumSymbolType.STRUCTURE.getSuffix(), checkParent);
	}

	public VariableSymbol getVariableSymbol(String name, boolean checkParent){
		return (VariableSymbol) getSymbol(name + EnumSymbolType.VARIABLE.getSuffix(), checkParent);
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

	public String toTable() {
		LinkedList<SymbolTable> toVisit = new LinkedList<>();
		StringBuilder str = new StringBuilder();

		List<Map.Entry<String, Symbol>> list = new ArrayList<>(this.symbols.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Symbol>>() {
            @Override
            public int compare(Map.Entry<String, Symbol> o1, Map.Entry<String, Symbol> o2) {
                return o1.getValue().getOffset() - o2.getValue().getOffset();
            }
        });

		str.append("|").append(this.getRegionNum())
				.append("|").append(this.getNestingLevel())
				.append("|").append("\n");

		str.append("|").append(Utils.padRight("NAME", SymbolTable.NAME_COL_WIDTH))
				.append("|").append(Utils.padRight("OFFSET", SymbolTable.OFFSET_COL_WIDTH))
				.append("|").append(Utils.padRight("SYMB", SymbolTable.SYMBOL_TYPE_COL_WIDTH))
				.append("|").append(Utils.padRight("TYPE", SymbolTable.TYPE_COL_WIDTH))
				.append("|").append("\n");

		for(Map.Entry<String, Symbol> entry: list) {
		    Symbol symbol = entry.getValue();

			str.append(symbol.toTable());

			if(symbol instanceof SymbolTableComposedSymbol) {
				toVisit.offer(((SymbolTableComposedSymbol) symbol).getSymbolTable());
			}
		}

		while(!toVisit.isEmpty()) {
			SymbolTable symbolTable = toVisit.poll();
			str.append("\n").append("\n")
					.append(symbolTable.toTable());
		}

		return str.toString();
	}
}
