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
		if (symbol instanceof VariableSymbol) {
		    if(symbol.getScope()== Scope.FUNCTION) {
                if(this.offsetCount == 0) {
                    this.offsetCount -= 4;
                }

                symbol.setOffset(this.offsetCount);

                this.offsetCount -= this.getVariableSize((VariableSymbol) symbol);
            }
            else{
                if (this.offsetCount <= 0){
                    this.offsetCount = 2;
                }

                symbol.setOffset(this.offsetCount);
                this.offsetCount += this.getVariableSize((VariableSymbol) symbol);
            }
        }
	}

    public int getEnvironmentSize() {
        int size = 0;

        for(Symbol symbol: this.getSymbols().values()) {
            if(symbol instanceof VariableSymbol) {
                size += this.getVariableSize((VariableSymbol) symbol);
            }
            else if(symbol instanceof StructureSymbol) {
                size += this.getStructureSize((StructureSymbol) symbol);
            }
        }

        return size;
    }

    public int getVariableSize(VariableSymbol variableSymbol) {
        int size = 0;
        Type type = variableSymbol.getType();

        if(type.isPointer()) {
            size = 2;
        }
        else if (type.isRef()) {
            size = 2;
        }
        else if(type.isBool()) {
            size = 1;
        }
        else if(type.isInt()) {
            size = 2;
        }
        else if(type.isStructure()) {
            size = this.getStructureSize(this.getStructureSymbol(type.getStructure(), true));
        }

        if(type.isVec()) {
            size *= type.getVec();
        }

        return size;
    }

    public int getStructureSize(StructureSymbol structureSymbol) {
        int size = 0;

        for(Symbol symbol: structureSymbol.getSymbolTable().getSymbols().values()) {
            if(symbol instanceof VariableSymbol) {
                size = this.getVariableSize((VariableSymbol) symbol);
            }
            else if(symbol instanceof StructureSymbol) {
                size = this.getStructureSize((StructureSymbol) symbol);
            }
        }

        return size;
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
