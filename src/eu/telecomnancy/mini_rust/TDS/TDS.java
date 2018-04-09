package eu.telecomnancy.mini_rust.TDS;

import eu.telecomnancy.mini_rust.TDS.symbols.*;
import eu.telecomnancy.mini_rust.Utils;
import eu.telecomnancy.mini_rust.semantic.SemanticExceptionCode;
import eu.telecomnancy.mini_rust.semantic.exceptions.DefinedSymbolException;
import eu.telecomnancy.mini_rust.semantic.exceptions.SemanticException;

import java.util.*;

public class TDS {
    public static int NAME_COL_WIDTH = 20;
    public static int ELEMENT_TYPE_COL_WIDTH = 15;
    public static int SHIFT_COL_WIDTH = 5;
    public static int TYPE_COL_WIDTH = 15;
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

    public int getNbSymbols (){
        return this.symbols.size();
    }

    public void addSymbol(Symbol symbol) throws SemanticException {
        //on teste si c'est une fonction
        if(symbol instanceof FunctionSymbol) {
            FunctionSymbol functionSymbol = (FunctionSymbol) symbol;
            FunctionSymbol dejaVu = this.getFunctionSymbol(symbol.getName());

            //on verifie qu'elle ne figure pas deja dans la TDS
            if (dejaVu != null) {
                //si elle existe deja on verifie si elle n'a pas les memes arguments
                //si oui il y a une erreur semantique sinon on l'ajoute a la TDS

                if (functionSymbol.equals(dejaVu)) {
                    throw new DefinedSymbolException(SemanticExceptionCode.REDEFINING_FUNCTION, symbol);
                }
                else {
                    addSymbolAndUpdateShift(symbol);
                }
            }
            else {
                addSymbolAndUpdateShift(symbol);
            }
        }
        //Le cas des structures
        else if (symbol instanceof StructSymbol) {
            StructSymbol structsymbol = (StructSymbol) symbol;
            StructSymbol dejaVu = this.getStructureSymbol(symbol.getName());

            //on verifie qu'elle ne figure pas deja dans la TDS
            if (dejaVu != null) {
                throw new DefinedSymbolException(SemanticExceptionCode.REDEFINING_STRUCTURE, symbol);
            }
            else {
                addSymbolAndUpdateShift(symbol);
            }
        }
        //Le cas des variables
        else {
            VarSymbol varsymbol = (VarSymbol) symbol;
            VarSymbol dejaVu = this.getVarSymbol(symbol.getName());

            //on verifie qu'elle ne figure pas deja dans la TDS
            if (dejaVu != null) {
                if(dejaVu.isMutable() != true){
                    throw new DefinedSymbolException(SemanticExceptionCode.MODIFYING_NOT_MUTABLE_SYMBOL, symbol);
                }
            }
            else {
                addSymbolAndUpdateShift(symbol);
            }
        }
    }

    /**
     * Calcul le déplacement ( shiftcount )
     */
    private void addSymbolAndUpdateShift(Symbol symbol) {
    	this.symbols.put(symbol.getHashName(), symbol);

    	switch (symbol.getScope()) {
    		case FUNCTION:
    			this.shiftCount = this.shiftCount - 1;
    			symbol.setShift(this.shiftCount);
    			break;
    		default:
    			if (shiftCount < 0) {
    				this.shiftCount = 0;
    			}
    			symbol.setShift(this.shiftCount);
    			this.shiftCount = this.shiftCount + 1;
    			break;    			
    	}
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

    public int getRegion() {
        return this.region;
    }

    public String getAsTable() {
        StringBuilder str = new StringBuilder();
        Queue<TDS> toVisit = new LinkedList<>();

        str.append("| ").append(Utils.padRight(String.valueOf(this.region), 4))
                .append("| ").append(Utils.padRight(String.valueOf(this.nestedLevel), 4))
                .append("|\n");

        str.append("| ").append(Utils.padRight("NAME", TDS.NAME_COL_WIDTH))
                .append("| ").append(Utils.padRight("ELEMENT TYPE", TDS.ELEMENT_TYPE_COL_WIDTH))
                .append("| ").append(Utils.padRight("DEP", TDS.SHIFT_COL_WIDTH))
                .append("| ").append(Utils.padRight("TYPE", TDS.TYPE_COL_WIDTH))
                .append("|")
                .append("\n");

        Symbol[] sortedSymbols = this.symbols.values().toArray(new Symbol[0]);
        Arrays.sort(sortedSymbols);

        for(Symbol symbol: sortedSymbols) {
            str.append(symbol.getAsRow())
                    .append("\n");

            if(symbol instanceof SymbolTDSComposed) {
                toVisit.offer(((SymbolTDSComposed)symbol).getTDS());
            }
        }

        TDS currentTdsToVisit = toVisit.poll();

        while(currentTdsToVisit != null) {
            str.append("\n")
                    .append("\n")
                    .append(currentTdsToVisit.getAsTable());

            currentTdsToVisit = toVisit.poll();
        }

        return str.toString();
    }
}
