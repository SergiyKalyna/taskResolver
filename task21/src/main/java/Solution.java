import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int number = Integer.parseInt(READER.readLine());
        if (number < 1) {
            throw new RemoteException("Input data is not valid");
        }

        List<String> stringList = getInputCases(number);
        READER.close();

        printResult(stringList);
    }

    public static List<String> getInputCases(int number) throws IOException {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            stringList.add(READER.readLine());
        }

        return stringList;
    }

    private static String checkPatternSyntax(String text) {
        try {
            Pattern.compile(text);
            return "Valid";
        } catch (PatternSyntaxException e) {
            return "Invalid";
        }
    }

    public static void printResult(List<String> list) {
        for (String text : list) {
            System.out.println(checkPatternSyntax(text));
        }
    }
}
