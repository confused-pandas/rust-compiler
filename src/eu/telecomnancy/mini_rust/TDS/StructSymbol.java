package eu.telecomnancy.mini_rust.TDS;

import org.antlr.runtime.tree.CommonTree;

public class StructSymbol extends SymbolTDSComposed {
    public StructSymbol(CommonTree node) {
        super(node);
    }

    @Override
    public String getHashName() {
        return this.node.getChild(0).getText() + "_S";
    }
}
