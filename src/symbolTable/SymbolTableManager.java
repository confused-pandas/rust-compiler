package symbolTable;

import java.util.Stack;

public class SymbolTableManager {
    private final Stack<SymbolTable> stack;

    public SymbolTableManager() {
        this.stack = new Stack<>();
    }

    public SymbolTable openSymbolTable() {
        SymbolTable parent = null;

        if(!this.stack.empty()) {
            parent = stack.peek();
        }

        return this.stack.push(new SymbolTable(parent, this.stack.size()));
    }

    public SymbolTable openSymbolTable(SymbolTable symbolTable) {
        return this.stack.push(symbolTable);
    }

    public SymbolTable closeSymbolTable() {
        return this.stack.pop();
    }

    public SymbolTable getCurrentTable() {
        return this.stack.peek();
    }
}
