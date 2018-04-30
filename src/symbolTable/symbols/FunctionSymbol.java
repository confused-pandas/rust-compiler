package symbolTable.symbols;

import symbolTable.Scope;
import symbolTable.SymbolTable;
import symbolTable.Type;

import java.util.LinkedList;

public class FunctionSymbol extends SymbolTableComposedSymbol {
	private Type returnType;

	public FunctionSymbol(String name, Scope scope, Type returnType, SymbolTable symbolTable) {
		super(EnumSymbolType.FUNCTION, name, scope, symbolTable);
		this.returnType = returnType;
	}

	public Type getReturnType(){
		return this.returnType;
	}

	public LinkedList<VariableSymbol> getParameters() {
		LinkedList<VariableSymbol> parameters = new LinkedList<>();

		for(Symbol symbol: this.getSymbolTable().getSymbols().values()) {
		    if(symbol instanceof VariableSymbol) {
		        VariableSymbol variableSymbol = (VariableSymbol)symbol;

		        if(variableSymbol.getOffset() < 0) {
                    parameters.add(variableSymbol);
                }
            }
        }

        return parameters;
	}
}
