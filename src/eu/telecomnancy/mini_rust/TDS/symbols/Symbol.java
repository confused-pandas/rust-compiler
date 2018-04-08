package eu.telecomnancy.mini_rust.TDS.symbols;

import eu.telecomnancy.mini_rust.TDS.Scope;
import eu.telecomnancy.mini_rust.Utils;
import org.antlr.runtime.tree.CommonTree;

/**
 * Classe abstraite définissant les symboles,
 * les symboles sont stockés dans la TDS
 *
 * L'avantage de la classe abstraite permet
 * de stocker tout les symboles dans une seul
 * HashMap et de faire les opérations sur une
 * seule HashMap
 */
public abstract class Symbol {
    /**
     * Variable lien le symbole au noeud
     * lui correspondant dans l'AST
     *
     * Permet d'accéder à plein d'information comme
     * la fonction .getLine() de CommonTree retournant
     * la ligne dans le code de l'élément parsé (très
     * pratique pour afficher la ligne dans les erreurs
     * sémantiques)
     */
    protected final CommonTree node;

    /**
     * Nom du symbole
     */
    private String name;

    /**
     * Déplacement dans la mémoire du symbole
     *
     * Un symbole qui est un paramètre de fonction
     * à un déplacement négatif, les autres symboles
     * présent dans le bloc de la fonction auront
     * un déplacement positif (0 inclu)
     */
    private int shift;

    /**
     * Porée du symbole
     */
    private Scope scope;

    /**
     *
     * @param node Noeud de l'AST représentant le symbole

     */
    public Symbol(final CommonTree node) {
        this.node = node;
        this.scope = Scope.LOCAL;
    }

    /**
     * Retourne le hash de la fonction. Utilisé
     * pour stocker les symboles dans les TDS
     * @return hash du symbole
     */
    public abstract String getHashName();

    /**
     * Pour définir le nom du symbole
     * @param name nom du symbole
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retourne le nom du symbole
     * @return nom du symbole
     */
    public String getName() {
        return this.name;
    }

    /**
     * Retourne le noeud du symbole
     * @return noeud de l'AST
     */
    public CommonTree getNode() {
        return this.node;
    }

    /**
     * Définit le déplacement dans la mémoire du
     * symbole
     *
     * @param shift déplacement dans la mémoire
     *              du symbole
     */
    public void setShift(int shift) {
        this.shift = shift;
    }

    /**
     * Retourne le déplacement dans la mémoire du
     * symbole
     * @return déplacement dans la mémoire du
     * sumbole
     */
    public int getShift() {
        return this.shift;
    }

    /**
     * Définit la portée du symbole
     * @param scope portée du symbole
     */
    public void setScope(Scope scope) {
        this.scope = scope;
    }

    /**
     * Retourne la portée du symbole
     * @return portée du symbole
     */
    public Scope getScope() {
        return this.scope;
    }

    public String getAsRow() {
        StringBuilder str = new StringBuilder();

        str.append("| ").append(Utils.padRight(this.getName(), 15));

        return str.toString();
    }
}
