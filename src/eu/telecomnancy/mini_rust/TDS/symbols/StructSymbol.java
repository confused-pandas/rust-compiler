package eu.telecomnancy.mini_rust.TDS.symbols;

import eu.telecomnancy.mini_rust.TDS.TDS;
import eu.telecomnancy.mini_rust.Utils;
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

    @Override
    public String getAsRow() {
        StringBuilder str = new StringBuilder();

        str.append(super.getAsRow())
                .append("| ").append(Utils.padRight("STRUCT(" + this.getTDS().getRegion() + ")", TDS.ELEMENT_TYPE_COL_WIDTH))
                .append("| ").append(Utils.padRight(String.valueOf(this.getShift()), TDS.SHIFT_COL_WIDTH))
                .append("| ");

        return str.toString();
    }
}
