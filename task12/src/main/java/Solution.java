import java.io.IOException;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputReader inputReader = new InputReader();
        Regex regex = new Regex();

        int inputNumber = inputReader.readInputInt();
        if (checkValidNumber(inputNumber)) {

            List<String> inputList = inputReader.inputText(inputNumber);

            regex.getListWithoutDuplicate(inputList).forEach(System.out::println);
        }
    }

    public static boolean checkValidNumber(int number) {
        return number >= 1 || number <= 100;
    }
}
