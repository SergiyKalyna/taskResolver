import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputInteger = Integer.parseInt(reader.readLine());
        double inputDouble = Double.parseDouble(reader.readLine());
        String inputText = reader.readLine();

        System.out.println("String: " + inputText);
        System.out.println("Double: " + inputDouble);
        System.out.println("Int: " + inputInteger);
    }
}
