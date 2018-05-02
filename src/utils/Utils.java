package utils;

public class Utils {
    private Utils() {

    }

    public static String padRight(String str, int length) {
        return String.format("%1$-" + length + "s", str);
    }
}
