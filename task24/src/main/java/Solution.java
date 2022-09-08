import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int quantity = Integer.parseInt(READER.readLine());
        checkInputNumber(quantity);

        List<String> inputList = getInputList(quantity);
        checkValidInputData(inputList);

        getResultWithoutTags(inputList);
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

    public static void checkValidInputData(List<String> inputData) {
        int charCount = 0;
        for (String text : inputData) {
            charCount += text.length();
            if (text.length() > Math.pow(10, 4)) {
                throw new RuntimeException("Input text is not valid");
            }
        }

        if (charCount > Math.pow(10, 6)) {
            throw new RuntimeException("Input text is not valid");
        }
    }

    public static void getResultWithoutTags(List<String> inputData) {
        String regex = "<(.+)>([^<]+)</\\1>";
        Pattern pattern = Pattern.compile(regex);

        for (String text : inputData) {
            boolean matchFound = false;
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                System.out.println(matcher.group(2));
                matchFound = true;
            }
            if (!matchFound) {
                System.out.println("None");
            }
        }
    }
}
