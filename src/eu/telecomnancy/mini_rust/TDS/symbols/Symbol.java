package eu.telecomnancy.mini_rust.TDS.symbols;

import eu.telecomnancy.mini_rust.TDS.Scope;
import org.antlr.runtime.tree.CommonTree;

public abstract class Symbol {
    private String name;
    private int shift;
    protected final CommonTree node;
    private Scope scope;

    public Symbol(final CommonTree node) {
        this.node = node;
    }

    public abstract String getHashName();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public CommonTree getNode() {
        return this.node;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public int getShift() {
        return this.shift;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public Scope getScope() {
        return this.scope;
    }
}
