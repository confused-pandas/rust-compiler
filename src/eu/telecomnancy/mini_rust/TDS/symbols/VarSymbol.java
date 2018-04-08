package eu.telecomnancy.mini_rust.TDS.symbols;

import eu.telecomnancy.mini_rust.TDS.TDS;
import eu.telecomnancy.mini_rust.TDS.Type;
import eu.telecomnancy.mini_rust.TDS.TypeEnum;
import eu.telecomnancy.mini_rust.Utils;
import org.antlr.runtime.tree.CommonTree;

/**
 * Spécialisation de la classe Symbol
 * en VarSymple
 *
 * Ajoute un type au symbole et si la
 * variable est constante ou non
 */
public class VarSymbol extends Symbol {
    /**
     * Type de la variable
     */
    private Type type;

    /**
     * Si la variable est constante
     * ou non
     *
     * Un VarSymbol est une variable
     * constante par défaut
     */
    private boolean mutable;

    public static String genHashName(String name) {
        return name + "_V";
    }

    public VarSymbol(CommonTree node) {
        super(node);
        this.mutable = false;
        this.type = new Type(TypeEnum.NOT_INITIALIZED);
    }

    /**
     * Définit si la variable est constante ou non
     *
     * @param mutable booléén, si à false, la variable
     *                est une constante
     */
    public void setMutable(boolean mutable) {
        this.mutable = mutable;
    }

    /**
     * Retourne si une variable est constante ou non
     *
     * @return booléen définissant si la variable est
     * constante ou non
     */
    public boolean isMutable() {
        return this.mutable;
    }

    /**
     * Définit le type de la variable
     *
     * @param type type de la variable
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * Retourne le type de la variable
     *
     * @return le type de la variable
     */
    public Type getType() {
        return this.type;
    }

    @Override
    public String getHashName() {
        return VarSymbol.genHashName(this.node.getChild(0).getText());
    }

    @Override
    public String getAsRow() {
        StringBuilder str = new StringBuilder();
        String type = "VAR";

        if(this.getShift() < 0) {
            type = "ARG";
        }

        str.append(super.getAsRow())
                .append("| ").append(Utils.padRight(type, TDS.ELEMENT_TYPE_COL_WIDTH))
                .append("| ").append(Utils.padRight(String.valueOf(this.getShift()), TDS.SHIFT_COL_WIDTH))
                .append("| ").append(Utils.padRight(this.getType().toString(), TDS.TYPE_COL_WIDTH))
                .append("| ");

        return str.toString();
    }
}
