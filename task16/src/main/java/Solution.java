import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int quantity = Integer.parseInt(READER.readLine());
        checkInputNumber(quantity);

        List<String> cases = getListTestCases(quantity);

        cases.forEach(testCase -> printCases(testCase));

        READER.close();
    }

    public static void checkInputNumber(int number) {
        if (number < 0) {
            throw new RuntimeException("Input number is not valid");
        }
    }

    public static List<String> getListTestCases(int quantity) throws IOException {
        List<String> inputList = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
            inputList.add(READER.readLine());
        }

        return inputList;
    }

    public static void printCases(String number) {
        try {
            long res = Long.parseLong(number);

            System.out.println(res + " can be fitted in:");
            if (res >= -128 && res <= 127) {
                System.out.println("* byte");
            }
            if (res >= Short.MIN_VALUE && res <= Short.MAX_VALUE) {
                System.out.println("* short");
            }
            if (res >= Integer.MIN_VALUE && res <= Integer.MAX_VALUE) {
                System.out.println("* int");
            }
            if (res >= Long.MIN_VALUE && res <= Long.MAX_VALUE) {
                System.out.println("* long");
            }
        } catch (Exception e) {
            System.out.println(number + " can't be fitted anywhere.");
        }
    }
}
