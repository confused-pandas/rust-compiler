package eu.telecomnancy.mini_rust.TDS;

import org.antlr.runtime.tree.CommonTree;

public class VarSymbol extends Symbol {
    private Scope scope;
    private Type type;

    public VarSymbol(CommonTree node) {
        this(node, Scope.LOCAL);
    }

    public VarSymbol(CommonTree node, Scope scope) {
        super(node);
        this.scope = scope;
    }

    @Override
    public String getHashName() {
        return this.node.getChild(0).getText() + "_V";
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }
}
