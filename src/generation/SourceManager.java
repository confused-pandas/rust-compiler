package generation;

import java.io.*;
import java.util.Objects;
import java.util.Optional;

public class SourceManager {
    private File file;
    private BufferedReader reader;

    public SourceManager(File file) {
        this.file = file;
    }

    public String getLine(int n) throws IOException {
        if(this.reader == null) {
            this.reader = new BufferedReader(
                    new FileReader(this.file)
            );
        }

        Optional<String> line = this.reader.lines().skip(n - 1).findFirst();
        this.reader.close();
        this.reader = null;

        return line.map(String::trim).orElse(null);
    }
}
