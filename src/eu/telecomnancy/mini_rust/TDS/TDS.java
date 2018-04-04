package eu.telecomnancy.mini_rust.TDS;

import java.util.HashMap;
import java.util.LinkedList;

public class TDS {
    private static int regionCount = 0;

    private final HashMap<String, Symbol> symbols;
    private final LinkedList<TDS> children;
    private TDS parent;
    private int nestedLevel;
    private int region;

    public TDS(int nestedLevel) {
        this.symbols = new HashMap<>();
        this.children = new LinkedList<>();
        this.nestedLevel = nestedLevel;
        this.region = TDS.regionCount++;
    }

    public void addSymbol(Symbol symbol) {
        this.symbols.put(symbol.getHashName(), symbol);
    }

    public void addTDS(TDS tds) {
        tds.parent = this;
        this.children.add(tds);
    }
}
