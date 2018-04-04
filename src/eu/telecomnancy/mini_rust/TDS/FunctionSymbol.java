package eu.telecomnancy.mini_rust.TDS;

import org.antlr.runtime.tree.CommonTree;

public class FunctionSymbol extends SymbolTDSComposed {
    private Type returnType;

    public FunctionSymbol(CommonTree node) {
        super(node);
    }

    @Override
    public String getHashName() {
        return this.node.getChild(0).getText() + "_F";
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public Type getReturnType() {
        return this.returnType;
    }
}
