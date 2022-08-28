import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String text = bufferedReader.readLine();
        String numbers = bufferedReader.readLine();
        bufferedReader.close();

        String[] arr = numbers.split(" ");

        int start = Integer.parseInt(arr[0]);
        int end = Integer.parseInt(arr[1]);

        checkInputData(text, start, end);

        System.out.println(getTextConversion(text, start, end));
    }

    public static void checkInputData(String inputText, int inputNumber1, int inputNumber2) {
        String regex = "^[a-zA-Z]*$";

        if (!inputText.matches(regex)) {
            throw new RuntimeException("Input string is not valid");
        }

        if (inputText.length() < 1 || inputText.length() > 100 || inputText.length() < inputNumber2) {
            throw new RuntimeException("Input string is not valid");
        }

        if (inputNumber1 < 0 || inputNumber1 > inputNumber2) {
            throw new RuntimeException("Input numbers is not valid");
        }
    }

    public static String getTextConversion(String inputText, int inputNumber1, int inputNumber2) {
        return inputText.substring(inputNumber1, inputNumber2);
    }
}
