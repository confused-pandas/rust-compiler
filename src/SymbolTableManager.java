import java.util.Stack;

public class SymbolTableManager {
    private final Stack<SymbolTable> stack;
    private boolean ignoreNext;

    public SymbolTableManager() {
        this.stack = new Stack<>();
    }

    public SymbolTable openSymbolTable(boolean ignoreNext) {
        if(this.ignoreNext) {
            this.ignoreNext = false;
            return this.stack.peek();
        }
        else {
            this.ignoreNext = ignoreNext;

            SymbolTable parent;

            if(this.stack.empty()) {
                parent  = null;
            }
            else {
                parent = stack.peek();
            }

            SymbolTable symbolTable = new SymbolTable(parent, this.stack.size());
            this.stack.push(symbolTable);

            return symbolTable;
        }
    }

    public SymbolTable openSymbolTable() {
        return openSymbolTable(false);
    }

    public SymbolTable closeSymbolTable() {
        return this.stack.pop();
    }

    public SymbolTable getCurrentTable() {
        return this.stack.peek();
    }
}
