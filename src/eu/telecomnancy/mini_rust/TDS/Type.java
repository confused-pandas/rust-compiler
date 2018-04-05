package eu.telecomnancy.mini_rust.TDS;

public class Type {
    private final Type vec;
    private final String type;

    public Type(Type vec, String type) {
        this.vec = vec;
        this.type = type;
    }
    public Type(Type vec) {
        this(vec, null);
    }

    public Type(String type) {
        this(null, type);
    }

    public boolean isVec() {
        return this.vec != null;
    }

    @Override
    public String toString() {
        if(this.isVec()) {
            return "Vec<" + this.vec.toString() + ">";
        }
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
