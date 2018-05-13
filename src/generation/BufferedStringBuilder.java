package generation;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class BufferedStringBuilder {
    private final StringBuilder stringBuilder;
    private final OutputStream out;

    private int bufferSize;
    private BufferedWriter writer;

    public BufferedStringBuilder(OutputStream out) {
        this.stringBuilder = new StringBuilder();
        this.out = out;

        this.bufferSize = 1000;
        this.writer = null;
    }

    public BufferedStringBuilder append(String str) throws IOException {
        this.stringBuilder.append(str).append("\n");

        if(this.doDump()) {
            this.dump();
        }

        return this;
    }

    private void dump() throws IOException {
        if(this.writer == null) {
            this.writer = new BufferedWriter(new OutputStreamWriter(out));
        }

        this.writer.write(this.stringBuilder.toString());
        this.writer.flush();
        this.stringBuilder.setLength(0);
    }

    public void dumpWithoutClose() throws IOException {
        this.dump();
    }

    public void close() throws IOException {
        this.dump();
        this.writer.close();
    }

    private boolean doDump() {
        return this.stringBuilder.length() > this.getBufferSize();
    }

    public void setBufferSize(int bufferSize) {
        this.bufferSize = bufferSize;
    }

    public int getBufferSize() {
        return this.bufferSize;
    }
}
