package eu.telecomnancy.mini_rust.TDS;

import eu.telecomnancy.mini_rust.TDS.symbols.FunctionSymbol;
import eu.telecomnancy.mini_rust.TDS.symbols.StructSymbol;
import eu.telecomnancy.mini_rust.TDS.symbols.Symbol;
import eu.telecomnancy.mini_rust.TDS.symbols.VarSymbol;

import java.util.HashMap;
import java.util.LinkedList;

public class TDS {
    private static int regionCount = 0;

    private final HashMap<String, Symbol> symbols;
    private final LinkedList<TDS> children;
    private TDS parent;
    private int nestedLevel;
    private int region;
    private int shiftCount;

    public TDS(int nestedLevel) {
        this.symbols = new HashMap<>();
        this.children = new LinkedList<>();
        this.nestedLevel = nestedLevel;
        this.region = TDS.regionCount++;
        this.shiftCount = 0;
    }

    private Symbol getSymbol(String name) {
        Symbol symbol = this.symbols.get(name);

        if(symbol == null) {
            if(this.parent == null) {
                return null;
            }
            else {
                return this.parent.getSymbol(name);
            }
        }
        else {
            return symbol;
        }
    }

    public VarSymbol getVarSymbol(String name) {
        return (VarSymbol)this.getSymbol(VarSymbol.genHashName(name));
    }

    public FunctionSymbol getFunctionSymbol(String name) {
        return (FunctionSymbol)this.getSymbol(FunctionSymbol.genHashName(name));
    }

    public StructSymbol getStructureSymbol(String name) {
        return (StructSymbol)this.getSymbol(StructSymbol.genHashName(name));
    }

    public void addSymbol(Symbol symbol) {
        this.symbols.put(symbol.getHashName(), symbol);
    }

    public void addTDS(TDS tds) {
        tds.parent = this;
        this.children.add(tds);
    }
}
