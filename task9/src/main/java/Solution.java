import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String inputText = bufferedReader.readLine();

        String reverseText = reverseString(inputText);

        if (inputText.equals(reverseText)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        bufferedReader.close();
    }

    public static String reverseString(String text) {
        StringBuilder sb = new StringBuilder(text);

        return sb.reverse().toString();
    }
}
