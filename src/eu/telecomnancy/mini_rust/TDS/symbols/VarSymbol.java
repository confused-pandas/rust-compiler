package eu.telecomnancy.mini_rust.TDS.symbols;

import eu.telecomnancy.mini_rust.TDS.Type;
import org.antlr.runtime.tree.CommonTree;

public class VarSymbol extends Symbol {
    private Type type;
    private boolean mutable;

    public VarSymbol(CommonTree node) {
        super(node);
        this.mutable = false;
    }

    @Override
    public String getHashName() {
        return VarSymbol.genHashName(this.node.getChild(0).getText());
    }

    public void setMutable(boolean mutable) {
        this.mutable = mutable;
    }

    public boolean isMutable() {
        return this.mutable;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return this.type;
    }

    public static String genHashName(String name) {
        return name + "_V";
    }
}
