package utils;

import generation.BufferedStringBuilder;

import java.io.*;

public class Utils {
    private Utils() {

    }

    public static String padRight(String str, int length) {
        return String.format("%1$-" + length + "s", str);
    }

    public static void dumpInToOut(InputStream in, OutputStream out) throws IOException {
        BufferedStringBuilder stringBuilder = new BufferedStringBuilder(out);

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
            String line;

            while((line = reader.readLine()) != null) {
                stringBuilder.append(line + "\n");
            }

            if(out instanceof PrintStream) {
                stringBuilder.dumpWithoutClose();
            }
            else {
                stringBuilder.close();
            }
        }
    }
}
