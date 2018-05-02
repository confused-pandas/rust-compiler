package symbolTable;

import org.antlr.runtime.tree.Tree;

public class BlocType extends Type {
    private final boolean determinedByReturn;
    private final Tree lastNode;

    public BlocType(EnumType type, boolean determinedByReturn, Tree lastNode) {
        super(type);
        this.determinedByReturn = determinedByReturn;
        this.lastNode = lastNode;
    }

    public BlocType(Type type, boolean determinedByReturn, Tree lastNode) {
        super(type.getType(),
                type.getStructure(),
                type.getVec(),
                type.getPointer(),
                type.getRef());
        this.determinedByReturn = determinedByReturn;
        this.lastNode = lastNode;
    }

    public boolean isDeterminedByReturn() {
        return determinedByReturn;
    }

    public Tree getLastNode() {
        return lastNode;
    }
}
