package eu.telecomnancy.mini_rust.TDS.symbols;

import eu.telecomnancy.mini_rust.TDS.TDS;
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
}
