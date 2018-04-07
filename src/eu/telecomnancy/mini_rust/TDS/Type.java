package eu.telecomnancy.mini_rust.TDS;

/**
 * Classe définissant les types du langage mini rust
 */
public class Type {
    private TypeEnum typeEnum;
    private int vecDimension;
    private String structType;

    public Type(TypeEnum typeEnum) {
        this(typeEnum, 0);
    }

    public Type(TypeEnum typeEnum, int vecDimension) {
        this.typeEnum = typeEnum;
        this.vecDimension = vecDimension;
    }

    /**
     * Retourne si le type est un type
     * vecteur
     *
     * @return booléen définissant si le
     * type est un vecteur ou non
     */
    public boolean isVec() {
        return this.vecDimension > 0;
    }

    public void setStructType(String structType) {
        this.structType = structType;
        this.typeEnum = TypeEnum.STRUCTURE;
    }

    public TypeEnum getTypeEnum() {
        return this.typeEnum;
    }

    public static TypeEnum stringToExprType(String type) {
        TypeEnum typeEnum;

        switch (type) {
            case "i32":
                typeEnum = TypeEnum.I32;
                break;
            case "bool":
                typeEnum = TypeEnum.BOOL;
                break;
            //TODO : String ?
            default:
                typeEnum = TypeEnum.UNKNOWN;
                break;
        }

        return typeEnum;
    }
    /**
     * Retourne une chaine de caractère représentant le type
     *
     * @return chaine de caractère représentant le type
     */
    @Override
    public String toString() {
        String str;

        if(this.structType == null) {
            str = this.typeEnum.toString();
        }
        else {
            str = this.structType;
        }

        for(int i = 0; i < this.vecDimension; i++) {
            str = "Vec<" + str + ">";
        }

        return str;
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
