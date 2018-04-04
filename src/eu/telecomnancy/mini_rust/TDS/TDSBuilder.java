package eu.telecomnancy.mini_rust.TDS;

import java.util.Stack;

public class TDSBuilder extends TDS {
    private Stack<TDS> flow;

    public TDSBuilder() {
        super(0);
    }

    public TDS getCurrentTDS() {
        return this.flow.peek();
    }

    public int getNestedLevel() {
        return this.flow.size();
    }

    public TDS pushTDS() {
        if(this.flow == null) {
            this.flow = new Stack<>();
        }

        TDS tds = new TDS(this.getNestedLevel());

        if(!this.flow.empty()) {
            this.flow.peek().addTDS(tds);
        }

        this.flow.push(tds);

        return tds;
    }

    public TDS popTDS() {
        return this.flow.pop();
    }
}
