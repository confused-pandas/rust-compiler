package eu.telecomnancy.mini_rust;

public class Utils {
    private Utils() {

    }

    public static String repeatString(String str, int n) {
        return new String(new char[n]).replace("\0", " ");
    }

    public static String padRight(String str, int length) {
        return String.format("%1$-" + length + "s", str);
    }
}
