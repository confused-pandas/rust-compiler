package symbolTable;

public class BlocType extends Type {
    private final boolean determinedByReturn;

    public BlocType(EnumType type, boolean determinedByReturn) {
        super(type);
        this.determinedByReturn = determinedByReturn;
    }

    public BlocType(Type type, boolean determinedByReturn) {
        super(type.getType(),
                type.getStructure(),
                type.getVec(),
                type.getPointer(),
                type.getRef());
        this.determinedByReturn = determinedByReturn;
    }

    public boolean isDeterminedByReturn() {
        return determinedByReturn;
    }
}
