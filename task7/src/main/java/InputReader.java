import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String inputRead() throws IOException {
        return reader.readLine();
    }

    public void closeReader() throws IOException {
        reader.close();
    }
}
