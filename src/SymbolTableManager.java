import java.util.Stack;

public class SymbolTableManager {
    private final Stack<SymbolTable> stack;

    public SymbolTableManager(Stack<SymbolTable> stack) {
        this.stack = stack;
    }

    public SymbolTable openSymbolTable() {
        SymbolTable parent;

        if(this.stack.empty()) {
            parent  = null;
        }
        else {
            parent = stack.peek();
        }

        SymbolTable symbolTable = new SymbolTable(parent);
        this.stack.push(symbolTable);

        return symbolTable;
    }

    public SymbolTable closeSymbolTable() {
        return this.stack.pop();
    }
}
