package symbolTable;

import grammar.mini_rustParser;

public class Type {
	
	String type;
	private int vecSize;
	private String structureType;
	
	public Type(String type) {
		this.type = type;
	}
	
	public Type(String type, int vecSize) {
		this.type = type;
		this.vecSize = vecSize;
	}
	
	public boolean isVec() {
		return this.vecSize > 0;
	}
	
	public boolean isStruct() {
		return this.type == "struct"; 
	}
	
	public int getVecSize() {
		return this.vecSize;
	}
	
	public String getStructureType() {
		return this.structureType;
	}

	
	@Override
	public boolean equals(Object object) {
	    if(object instanceof Type) {
	        return true;
	    } else {
	        return false;
	    }
	}

	public boolean isInt() {
		if (this.type.equals(mini_rustParser.INT32_TYPE)){
			return true;
		}
		return false;
	}

	public boolean isBool() {
		if (this.type.equals(mini_rustParser.TRUE) || this.type.equals(mini_rustParser.FALSE)){
			return true;
		}
		return false;
	}

}
