import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int quantity = Integer.parseInt(READER.readLine());
        checkNumber(quantity);

        List<String> inputList = getInputList(quantity);
        READER.close();
        checkList(inputList);

        List<String> withoutDuplicatesList = makeListWithoutDuplicates(inputList);

        printResult(withoutDuplicatesList);
    }

    public static void checkNumber(int number) {
        if (number < 1 || number > 100) {
            throw new RuntimeException("Input number is not valid");
        }
    }

    public static List<String> getInputList(int quantityCases) throws IOException {
        List<String> inputList = new ArrayList<>();

        for (int i = 0; i < quantityCases; i++) {
            inputList.add(READER.readLine());
        }

        return inputList;
    }

    public static void checkList(List<String> list) {
        for (String sentence : list) {
            if (sentence.length() < 1 || sentence.length() > Math.pow(10, 4)) {
                throw new RuntimeException("Input text is not valid");
            }
        }
    }

    public static List<String> makeListWithoutDuplicates(List<String> inputList) {
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        List<String> withoutDuplicatesList = new ArrayList<>();
        for (String sentence : inputList) {
            Matcher matcher = pattern.matcher(sentence);

            while (matcher.find()) {
                sentence = sentence.replaceAll(matcher.group(0), matcher.group(1));
            }
            withoutDuplicatesList.add(sentence);
        }

        return withoutDuplicatesList;
    }

    public static void printResult(List<String> list) {
        list.forEach(System.out::println);
    }
}
