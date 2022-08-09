import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String text = bufferedReader.readLine();
        String numbers = bufferedReader.readLine();
        int start = Integer.parseInt(numbers.substring(0, 1));
        int end = Integer.parseInt(numbers.substring(2, 3));

        checkInputData(text, start, end);

        System.out.printf(getTextConversion(text, start, end));

        bufferedReader.close();
    }

    public static void checkInputData(String inputText, int inputNumber1, int inputNumber2) {
        if (inputText.length() < 1 && inputText.length() > 100 && inputText.length() < inputNumber2) {
            System.out.printf("Input text is not valid");
        }

        if (inputNumber1 < 0 && inputNumber1 > inputNumber2) {
            System.out.println("Input numbers is not valid");
        }
    }

    public static String getTextConversion(String inputText, int inputNumber1, int inputNumber2) {
        return inputText.substring(inputNumber1, inputNumber2);
    }
}
