import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstString = reader.readLine();
        String secondString = reader.readLine();
        reader.close();

        checkInputData(firstString, secondString);

        System.out.println(checkAnagrams(firstString, secondString));
    }

    public static void checkInputData(String text1, String text2) {
        String regex = "^[a-zA-Z]*$";
        int text1Length = text1.length();
        int text2Length = text2.length();

        if (!text1.matches(regex) || !text2.matches(regex)) {
            throw new RuntimeException("Input data is not valid");
        }

        if (text1Length < 1 || text2Length < 1 || text1Length > 50 || text2Length > 50) {
            throw new RuntimeException("Input data is not valid");
        }
    }

    public static String checkAnagrams(String text1, String text2) {
        text1 = text1.toLowerCase();
        text2 = text2.toLowerCase();

        if (text1.length() != text2.length()) {
            return "Not Anagrams";
        } else {


            char[] charArray1 = text1.toCharArray();
            char[] charArray2 = text2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1, charArray2);
            if (result) {
                return "Anagrams";
            } else {
                return "Not Anagrams";
            }
        }
    }
}
