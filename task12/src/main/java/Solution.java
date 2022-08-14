import java.io.IOException;
import java.util.List;

public class Solution {
    /*
    In this challenge, we use regular expressions (RegEx) to remove instances of words that are repeated more than once,
    but retain the first occurrence of any case-insensitive repeated word.
    For example, the words love and to are repeated in the sentence I love Love to To tO code.
     */
    public static void main(String[] args) throws IOException {
        InputReader inputReader = new InputReader();
        Regex regex = new Regex();

        int inputNumber = inputReader.readInputInt();
        if (checkValidNumber(inputNumber)) {

            List<String> inputList = inputReader.inputText(inputNumber);

            regex.getListWithoutDuplicate(inputList).forEach(System.out::println);
        }

        inputReader.close();
    }

    public static boolean checkValidNumber(int number) {
        return number >= 1 || number <= 100;
    }
}
