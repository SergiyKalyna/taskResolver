import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("Hello world \nI am a file \nRead me until end-of-file.");
        List<String> inputText = new ArrayList<>();

        while (scanner.hasNextLine()) {
            inputText.add(scanner.nextLine());
        }

        printResult(inputText);

        scanner.close();
    }

    public static void printResult(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1) + " "  + list.get(i));
        }
    }
}
