import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int quantity = Integer.parseInt(READER.readLine());
        checkInputNumber(quantity);

        List<String> inputList = getInputList(quantity);

        showResult(inputList);
    }

    public static void checkInputNumber(int number) {
        if (number < 1 || number > 100) {
            throw new RuntimeException("Input number is not valid");
        }
    }

    public static List<String> getInputList(int quantityCases) throws IOException {
        List<String> inputList = new ArrayList<>();

        for (int i = 0; i < quantityCases; i++) {
            inputList.add(READER.readLine());
        }
        READER.close();

        return inputList;
    }

    private static String checkNameOnValid(String name) {
        String regex = "^[a-zA-Z][\\w]{7,29}$";

        if (!name.matches(regex)) {
            return "Invalid";
        } else {
            return "Valid";
        }
    }

    public static void showResult(List<String> list) {
        for (String sentence : list) {
            System.out.println(checkNameOnValid(sentence));
        }
    }
}
