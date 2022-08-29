import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputText = reader.readLine();
        reader.close();

        checkInputData(inputText);

        printResult(splitTextOnTokens(inputText));
    }

    public static void checkInputData(String text) {
        int get10In5Power = (int) Math.pow(10, 5);
        if (text.length() < 1 || text.length() > 4 * get10In5Power) {
            throw new RuntimeException("Input data is not valid");
        }

        String regex = "[A-Za-z !,?._'@]+";
        if (!text.matches(regex)) {
            throw new RuntimeException("Input data is not valid");
        }
    }

    public static List<String> splitTextOnTokens(String text) {
        String regex = "[ !,?._'@]+";
        return Arrays.stream(text.split(regex)).filter(t -> !t.isBlank()).collect(Collectors.toList());
    }

    public static void printResult(List<String> list) {
        System.out.println(list.size());

        list.forEach(System.out::println);
    }
}
