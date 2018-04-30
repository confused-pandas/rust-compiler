package symbolTable.symbols;

public enum EnumSymbolType {
    STRUCTURE("_S"),
    FUNCTION("_F"),
    VARIABLE("_V");

    private final String suffix;

    EnumSymbolType(String suffix) {
        this.suffix = suffix;
    }

    public String getSuffix() {
        return this.suffix;
    }
}
