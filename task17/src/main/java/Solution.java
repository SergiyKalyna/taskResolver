import java.text.NumberFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double payment = scanner.nextDouble();
        checkInputData(payment);

        Map<String, String> result = new LinkedHashMap<>();
        result.put("US", NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        result.put("India", NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment));
        result.put("China", NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        result.put("France", NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));

        printMap(result);

        scanner.close();
    }


    public static long get10toNPower(int n) {
        if (n == 1) {
            return 10;
        } else {
            return 10 * get10toNPower(n - 1);
        }
    }

    public static void checkInputData(double payment) {
        if (payment < 0 || payment > get10toNPower(9)) {
            throw new RuntimeException("Wrong input data");
        }
    }

    public static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
