package eu.telecomnancy.mini_rust.TDS.symbols;

import eu.telecomnancy.mini_rust.TDS.TDS;
import eu.telecomnancy.mini_rust.TDS.Type;
import eu.telecomnancy.mini_rust.TDS.TypeEnum;
import eu.telecomnancy.mini_rust.Utils;
import org.antlr.runtime.tree.CommonTree;

import java.util.LinkedList;

/**
 * Spécialisation de la classe Symbol en FunctionSymbol
 *
 * Ajoute un type de retour et les arguments au
 * symbole
 */
public class FunctionSymbol extends SymbolTDSComposed {
    /**
     * Type de retour de la fonction
     * Est null si la fonction n'a pas de type
     * retour
     */
    private Type returnType;

    /**
     * Liste des arguments de la fonction
     * Est vide si la fonction n'a pas d'arguments
     */
    private final LinkedList<VarSymbol> arguments;

    public FunctionSymbol(CommonTree node) {
        super(node);
        this.arguments = new LinkedList<>();
        this.returnType = new Type(TypeEnum.VOID);
    }

    /**
     * Ajoute un argument à la fonction
     *
     * @param argument argument à ajouter
     *                 à la fonction
     */
    public void addArgument(VarSymbol argument) {
        this.arguments.add(argument);
    }

    /**
     * Retourne la liste des arguments de la fonction
     * La liste est vide si la fonction n'a pas
     * d'arguments
     *
     * @return list des arguments de la fonction
     */
    public LinkedList<VarSymbol> getArguments() {
        return this.arguments;
    }

    /**
     * Définit le type de retour de la fonction
     *
     * @param returnType type de retour de la fonction
     */
    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    /**
     * Retourne le type de retour de la fonctino
     * Retourne null si la fonction n'a pas de
     * type retour
     *
     * @return type de retour de la fonction
     */
    public Type getReturnType() {
        return this.returnType;
    }

    public static String genHashName(String name) {
        return name + "_F";
    }

    @Override
    public String getHashName() {
        return FunctionSymbol.genHashName(this.node.getChild(0).getText());
    }

    /**
     * Test l'égalité de deux fonctions.
     * L'égalité de deux fonctions est basé sur le nom de
     * la fonction et aussi sur le type de ses arguments
     * Permet la surchage de fonction
     *
     * @param o objet à comparer avec la fonction
     * @return booléen déterminant si la fonction est
     * égale à l'objet o passé en paramètre
     */
    @Override
    public boolean equals(Object o) {
        // Si l'objet n'est pas un FunctionSymbol, alors
        // forcément les deux objets ne peuvent pas être
        // égaux
        if(!(o instanceof FunctionSymbol)) {
            return false;
        }

        FunctionSymbol functionSymbol = (FunctionSymbol)o;

        // Si les fonctions n'ont pas le même nom, pas
        // la peine d'aller plus loin, les fonctions
        // net sont pas égales
        if(!this.getName().equals(functionSymbol.getName())) {
            return false;
        }
        else {
            // Si les fonctions ont le même nom mais pas le même nombre
            // d'arguments, pas la peine d'aller plus loin, les fonctions
            // ne sont pas égales
            if(this.getArguments().size() != functionSymbol.getArguments().size()) {
                return false;
            }
            else {
                /**
                 * Test si tout les types d'arguments sont égaux, on peut
                 * différencier les fonctions par rapport au types de leurs
                 * arguments et à l'ordre de ceux-ci.
                 * Les arguments sont ajoutés dans l'ordre d'apparition dans la
                 * liste retournée par .getArguments()
                 *
                 * Ex :
                 * fn(a: i32, b: bool) et fn(a: bool, b: i32) sont deux fonctions
                 * différentes, i32 != bool pour le premier argument et bool != i32
                 * pour le second
                 */

                for(int i = 0; i < this.getArguments().size(); i++) {
                    // Dès qu'un argument n'a pas le même type, on peut arrêter la boucle,
                    // les fonctions ne sont pas égales
                    if(!this.getArguments().get(i).getType().equals(functionSymbol.getArguments().get(i).getType())) {
                        return false;
                    }
                }

                // Si aucun des tests d'avant n'est concluant, les fonctions sont égales
                return true;
            }
        }
    }

    @Override
    public String getAsRow() {
        StringBuilder str = new StringBuilder();

        str.append(super.getAsRow())
                .append("| ").append(Utils.padRight("FUNC(" + this.getTDS().getRegion() + ")", TDS.ELEMENT_TYPE_COL_WIDTH))
                .append("| ").append(Utils.padRight(String.valueOf(this.getShift()), TDS.SHIFT_COL_WIDTH))
                .append("| ").append(Utils.padRight("RT : " + this.getReturnType(), TDS.TYPE_COL_WIDTH))
                .append("| ");

        return str.toString();
    }
}
