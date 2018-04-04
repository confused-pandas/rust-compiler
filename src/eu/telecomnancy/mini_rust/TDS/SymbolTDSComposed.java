package eu.telecomnancy.mini_rust.TDS;

import org.antlr.runtime.tree.CommonTree;

public abstract class SymbolTDSComposed extends Symbol {
    private TDS TDS;

    public SymbolTDSComposed(CommonTree node) {
        super(node);
    }

    public void setTDS(TDS TDS) {
        this.TDS = TDS;
    }

    public TDS getTDS() {
        return this.TDS;
    }

    public void addSymbol(Symbol symbol) {
        this.TDS.addSymbol(symbol);
    }
}
