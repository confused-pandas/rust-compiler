package eu.telecomnancy.mini_rust.TDS;

import eu.telecomnancy.mini_rust.TDS.symbols.FunctionSymbol;
import eu.telecomnancy.mini_rust.TDS.symbols.StructSymbol;
import eu.telecomnancy.mini_rust.TDS.symbols.Symbol;
import eu.telecomnancy.mini_rust.TDS.symbols.VarSymbol;

import java.util.HashMap;
import java.util.LinkedList;

public class TDS {
    /**
     * Compteur permettant d'attribuer le numéro
     * de région aux TDS
     */
    private static int regionCount = 0;

    /**
     * HashMap stockant les symboles de la TDS
     * Les symboles sont différencié par un hash
     * généré par la fonction .getHashName() de Symbol
     */
    private final HashMap<String, Symbol> symbols;

    /**
     * TDS des blocs enfants de ce bloc
     */
    private final LinkedList<TDS> children;

    /**
     * TDS mère de cette TDS, la TDS globale
     * n'a pas de parent, cette valeur est donc
     * nulle
     */
    private TDS parent;

    /**
     * Niveau d'imbrication de la TDS
     */
    private int nestedLevel;

    /**
     * Numéro de région de la TDS
     */
    private int region;

    /**
     * Compteur permettant d'attribuer le
     * déplacement mémoire à chaque symbole
     * inséré dans la TDS
     */
    private int shiftCount;

    public TDS(int nestedLevel) {
        this.symbols = new HashMap<>();
        this.children = new LinkedList<>();
        this.nestedLevel = nestedLevel;
        this.shiftCount = 0;

        // A chaque fois qu'on créer une TDS,
        // le numéro de région est incrémenté
        this.region = TDS.regionCount++;
    }

    /**
     * Retourne le symbole s'il est présent dans
     * cette TDS ou dans les TDS mères
     *
     * Si le symbole n'existe pas, retourne
     * null
     *
     * @param hashName hash du symbole à chercher
     * @return symbole si trouvé, sinon null
     */
    private Symbol getSymbol(String hashName) {
        Symbol symbol = this.symbols.get(hashName);

        // Si le symbole n'est pas dans la TDS courante
        if(symbol == null) {
            // Cas de base, si la TDS est la TDS globale,
            // on ne peut plus remonter, le symbole n'exite
            // donc pas
            if(this.parent == null) {
                return null;
            }
            // Sinon, on remonte les TDS par récurrence
            else {
                return this.parent.getSymbol(hashName);
            }
        }
        else {
            return symbol;
        }
    }

    /**
     * Retourne un VarSymbol s'il existe, sinon retourne null
     *
     * @param name nom de la variable à chercher dans la TDS
     * @return le VarSymbol s'il existe, sinon null
     */
    public VarSymbol getVarSymbol(String name) {
        return (VarSymbol)this.getSymbol(VarSymbol.genHashName(name));
    }

    /**
     * Retourne un FunctionSymbol s'il existe, sinon retourne null
     *
     * @param name nom de la fonction à chercher dans la TDS
     * @return le FunctionSymbol s'il existe, sinon retourne null
     */
    public FunctionSymbol getFunctionSymbol(String name) {
        return (FunctionSymbol)this.getSymbol(FunctionSymbol.genHashName(name));
    }

    /**
     * Retourne un StructSymbol s'il existe, sinon retourne null
     *
     * @param name nom de la structure à chercher dans la TDS
     * @return le StructSymbol s'il existe, sinon retoure null
     */
    public StructSymbol getStructureSymbol(String name) {
        return (StructSymbol)this.getSymbol(StructSymbol.genHashName(name));
    }

    public void addSymbol(Symbol symbol) {
        this.symbols.put(symbol.getHashName(), symbol);
    }

    /**
     * Ajoute une TDS fille à la TDS courante
     * et lui assigne comme parent la TDS
     * courante
     *
     * @param tds à ajouter comme fille à
     *            la TDS courante
     */
    public void addTDS(TDS tds) {
        tds.parent = this;
        this.children.add(tds);
    }
}
