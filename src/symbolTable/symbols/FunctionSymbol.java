package symbolTable.symbols;

import symbolTable.EnumType;
import symbolTable.Scope;
import symbolTable.SymbolTable;
import symbolTable.Type;
import utils.Utils;

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

		for(String key: this.getSymbolTable().getSymbols().keySet()) {
		    Symbol symbol = this.getSymbolTable().getSymbols().get(key);

			if(symbol instanceof VariableSymbol) {
		        VariableSymbol variableSymbol = (VariableSymbol)symbol;

		        if(variableSymbol.getOffset() < 0) {
                    parameters.add(variableSymbol);
                }
            }
        }

        return parameters;
	}

	@Override
	public String toTable() {
		String str = super.toTable();

		str += "|" + Utils.padRight("FUNC(" + this.getSymbolTable().getRegionNum() + ")", SymbolTable.SYMBOL_TYPE_COL_WIDTH);
		str += "|" + Utils.padRight(String.valueOf(this.getReturnType()), SymbolTable.TYPE_COL_WIDTH);
		str += "\n";

		return str;
	}
}
