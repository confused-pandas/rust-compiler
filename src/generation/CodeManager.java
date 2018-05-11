package generation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CodeManager {
    private final BufferedStringBuilder code;

    public CodeManager(File genFile) throws FileNotFoundException {
        if(genFile.exists() && genFile.length() > 0) {
            genFile.delete();
        }

        this.code = new BufferedStringBuilder(new FileOutputStream(genFile, true));
    }

    public StringBuilder append(String string) throws IOException {
        return this.code.append(string);
    }

    public void end() throws IOException {
        this.code.close();
    }
}
