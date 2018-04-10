package eu.telecomnancy.mini_rust.TDS.symbols;

import eu.telecomnancy.mini_rust.TDS.TDS;
import org.antlr.runtime.tree.CommonTree;

/**
 * Spécialisation de Symbol en SymbolTDSComposed
 * Permet de gérer les symboles qui sont liés à une
 * TDS, comme les structures et les fonctions
 */
public abstract class SymbolTDSComposed extends Symbol {
    /**
     * TDS liée au symbole
     */
    private TDS TDS;

    public SymbolTDSComposed(CommonTree node) {
        super(node);
    }

    /**
     * Définit la TDS du symbole
     * @param TDS du symbole à lier
     */
    public void setTDS(TDS TDS) {
        this.TDS = TDS;
        this.TDS.setFunction(this);
    }

    /**
     * Retourne la TDS liée au symbole
     * @return TDS liée au symbole
     */
    public TDS getTDS() {
        return this.TDS;
    }
}
