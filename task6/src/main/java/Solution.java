import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int month = Integer.parseInt(bufferedReader.readLine());

        int day = Integer.parseInt(bufferedReader.readLine());

        int year = Integer.parseInt(bufferedReader.readLine());

        int res = Result.findDay(month, day, year);

        System.out.println(res);
    }
}
