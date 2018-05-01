package symbolTable;

public class Type {
	private final EnumType type;
	private final String structure;
	private final int vec;
	private final int ref;
	private final int pointer;

    public static boolean isDefaultType(String type) {
        switch (type) {
            case "i32":
            case "bool":
                return true;
            default:
                return false;
        }
    }

    public static EnumType getDefaultType(String type) {
        EnumType enumType;

        switch (type) {
            case "i32":
                enumType = EnumType.I32;
                break;
            case "bool":
                enumType = EnumType.BOOL;
                break;
            default:
                enumType = null;
        }

        return enumType;
    }

    private Type(EnumType type, String structure, int vec, int ref, int pointer) {
        this.type = type;
        this.structure = structure;
        this.vec = vec;
        this.ref = ref;
        this.pointer = pointer;
    }

	public Type(EnumType type, int vec, int ref, int pointer) {
		this(type, null, vec, ref, pointer);
	}

    public Type(String structure, int vec, int ref, int pointer) {
        this(null, structure, vec, ref, pointer);
    }

	public Type(EnumType type) {
		this(type, null, 0, 0, 0);
	}

	public Type() {
		this(EnumType.VOID, null, 0, 0, 0);
	}

    public boolean isStructure() {
        return this.structure != null;
    }

    public boolean isVec() {
        return this.vec > 0;
    }

    public boolean isRef() {
        return this.ref > 0;
    }

    public boolean isPointer() {
        return this.pointer > 0;
    }

    public boolean isUnknown() {
        return this.type == EnumType.UNKNOWN;
    }

    public boolean isInt() {
        return this.type == EnumType.I32;
    }

    public boolean isBool() {
        return this.type == EnumType.BOOL;
    }

    public boolean isVoid() {
        return this.type == EnumType.VOID;
    }

    public EnumType getType() {
        return type;
    }

    public String getStructure() {
        return structure;
    }

    public int getVec() {
        return vec;
    }

    public int getRef() {
        return ref;
    }

    public int getPointer() {
        return pointer;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Type) {
            Type a = (Type)o;

            return ((a.type == null && this.type == null) || (a.type != null && a.type.equals(this.type)))
                    && ((a.structure == null && this.structure == null) || (a.structure != null && a.structure.equals(this.structure)))
                    && a.vec == this.vec
                    && a.ref == this.ref
                    && a.pointer == this.pointer;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        String str;

        if(this.isStructure()) {
            str = this.getStructure();
        }
        else {
            str = this.type.getToken();
        }

        for(int i = 0; i < this.getVec(); i++) {
            str = "Vec<" + str + ">";
        }

        return str;
    }
}
