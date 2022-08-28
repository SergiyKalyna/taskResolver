import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.next();
        int inputInt = scanner.nextInt();
        scanner.close();

        checkInputData(inputString, inputInt);

        System.out.println(getSmallestAndLargest(inputString, inputInt));
    }

    public static void checkInputData(String text, int number) {
        if (text.length() < 1 || text.length() > 1000) {
            throw new RuntimeException("Input string is not valid");
        }

        if (number < 1) {
            throw new RuntimeException("Input number is not valid");
        }
    }

    public static String getSmallestAndLargest(String text, int number) {
        List<String> substrings = new ArrayList<>();

        for (int i = 0; i <= text.length() - number; i++) {
            substrings.add(text.substring(i, number + i));
        }

        Collections.sort(substrings);

        String smallest = substrings.get(0);
        String largest = substrings.get(substrings.size() - 1);

        return smallest + "\n" + largest;
    }
}
