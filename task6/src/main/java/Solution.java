import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        checkValidYear(year);

        System.out.println(Result.findDay(month, day, year));

        bufferedReader.close();
    }

    public static void checkValidYear(int year) {
        if (year < 2000 || year > 3000) {
            throw new RuntimeException("Input year is not valid");
        }
    }
}
