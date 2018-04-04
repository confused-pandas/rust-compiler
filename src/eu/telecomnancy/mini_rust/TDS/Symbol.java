package eu.telecomnancy.mini_rust.TDS;

import org.antlr.runtime.tree.CommonTree;

public abstract class Symbol {
    private String name;
    protected final CommonTree node;

    public Symbol(final CommonTree node) {
        this.node = node;
    }

    public abstract String getHashName();

    public void setName(String name) {
        this.name = name;
    }
}
