package eu.telecomnancy.mini_rust.TDS.symbols;

import org.antlr.runtime.tree.CommonTree;

public class StructSymbol extends SymbolTDSComposed {
    public StructSymbol(CommonTree node) {
        super(node);
    }

    @Override
    public String getHashName() {
        return StructSymbol.genHashName(this.node.getChild(0).getText());
    }

    public static String genHashName(String name) {
        return name + "_S";
    }
}
