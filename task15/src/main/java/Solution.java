import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int quantityQueries = Integer.parseInt(READER.readLine());
        checkInputNumber(quantityQueries);

        List<String> queries = getInputQuery(quantityQueries);
        checkInputQueries(queries);

        getMathResult(queries).forEach(System.out::println);

        READER.close();
    }

    public static void checkInputNumber(int number) {
        if (number < 0 || number > 500) {
            throw new RuntimeException("Invalid input number");
        }
    }

    public static void checkInputQueries(List<String> queries) {
        for (String query : queries) {
            if (query.length() < 5) {
                throw new RuntimeException("Invalid input query data");
            }
            String[] arr = query.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int n = Integer.parseInt(arr[2]);

            if (a < 0 || b < 0 || n < 1 || a > 50 || b > 50 || n > 15) {
                throw new RuntimeException("Invalid input query data");
            }
        }
    }

    public static List<String> getMathResult(List<String> queries) {
        List<String> result = new ArrayList<>();

        for (String query : queries) {
            String[] arr = query.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int n = Integer.parseInt(arr[2]);

            String counter = "";

            for (int i = 1; i <= n; i++) {
                int count = a + getLoopResult(b, i);
                counter += String.valueOf(count).concat(" ");
            }
            result.add(counter);
        }

        return result;
    }

    public static int getLoopResult(int b, int n) {
        if (n == 1) {
            return b;
        } else {
            return (powerOf2(n) * b) + getLoopResult(b, n - 1);
        }
    }

    public static int powerOf2(int number) {
        if (number == 2) {
            return 2;
        } else {
            return powerOf2(number - 1) * 2;
        }
    }

    public static List<String> getInputQuery(int quantity) throws IOException {
        List<String> queries = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
            queries.add(READER.readLine());
        }

        return queries;
    }
}
