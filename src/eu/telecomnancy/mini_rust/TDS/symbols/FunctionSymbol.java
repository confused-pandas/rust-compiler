package eu.telecomnancy.mini_rust.TDS.symbols;

import eu.telecomnancy.mini_rust.TDS.Type;
import org.antlr.runtime.tree.CommonTree;

import java.util.LinkedList;

public class FunctionSymbol extends SymbolTDSComposed {
    private Type returnType;
    private final LinkedList<VarSymbol> arguments;

    public FunctionSymbol(CommonTree node) {
        super(node);
        this.arguments = new LinkedList<>();
    }

    public void addArgument(VarSymbol argument) {
        this.arguments.add(argument);
    }

    public LinkedList<VarSymbol> getArguments() {
        return this.arguments;
    }

    @Override
    public String getHashName() {
        return FunctionSymbol.genHashName(this.node.getChild(0).getText());
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public Type getReturnType() {
        return this.returnType;
    }

    public static String genHashName(String name) {
        return name + "_F";
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof FunctionSymbol)) {
            return false;
        }

        FunctionSymbol functionSymbol = (FunctionSymbol)o;

        if(!this.getName().equals(functionSymbol.getName())) {
            return false;
        }
        else {
            if(this.getArguments().size() != functionSymbol.getArguments().size()) {
                return false;
            }
            else {
                for(int i = 0; i < this.getArguments().size(); i++) {
                    if(!this.getArguments().get(i).getType().equals(functionSymbol.getArguments().get(i).getType())) {
                        return false;
                    }
                }

                return true;
            }
        }
    }
}
