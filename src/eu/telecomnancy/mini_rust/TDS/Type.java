package eu.telecomnancy.mini_rust.TDS;

/**
 * Classe définissant les types du langage mini rust
 */
public class Type {
    /**
     * Contient un type si le type
     * est un vecteur
     *
     * Par exemple avec Vec<i32>, l'attribut
     * vec contient une instance de type avec
     * type = null et type = i32
     */
    private final Type vec;

    /**
     * Type de la variable si pas un vecteur
     */
    private final String type;

    /**
     * Constructeur privé, on ne veut pas de mauvaise
     * manipulation, un type ne peut psa avoir
     * les attributs vec et type défini
     *
     * Soit le type est un vecteur, et vecteur contient
     * un type, et type est null
     * Soit le type est un type, et vecteur est null
     *
     * @param vec
     * @param type
     */
    private Type(Type vec, String type) {
        this.vec = vec;
        this.type = type;
    }

    /**
     * Initialise un type vecteur
     *
     * @param vec type de la variable
     */
    public Type(Type vec) {
        this(vec, null);
    }

    /**
     * Initialise un type normal
     *
     * @param type type de la variable
     */
    public Type(String type) {
        this(null, type);
    }

    /**
     * Retourne si le type est un type
     * vecteur
     *
     * @return booléen définissant si le
     * type est un vecteur ou non
     */
    public boolean isVec() {
        return this.vec != null;
    }

    /**
     * Retourne une chaine de caractère représentant le type
     *
     * @return chaine de caractère représentant le type
     */
    @Override
    public String toString() {
        // Si le type est un vecteur, ajoute Vec< > et appel
        // récurvisement la fonction toString sur vec
        if(this.isVec()) {
            return "Vec<" + this.vec.toString() + ">";
        }
        // Sinon retourne la chaine type
        else {
            return this.type;
        }
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Type)) {
            return false;
        }

        Type type = (Type)o;

        return this.toString().equals(type.toString());
    }
}
