package symbolTable;

public enum EnumType {
    VOID("void"),
    I32("i32"),
    BOOL("bool"),
    UNKNOWN("unknown");

    private final String token;

    EnumType(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
