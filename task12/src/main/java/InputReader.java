import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputReader implements AutoCloseable{

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public int readInputInt() throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    public List<String> inputText(int quantity) throws IOException {
        List<String> inputList = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
            inputList.add(reader.readLine());
        }

        return inputList;
    }

    public void close() throws IOException {
        reader.close();
    }
}
