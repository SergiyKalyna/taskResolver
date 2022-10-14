import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyCalculator myCalculator = new MyCalculator();

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            int power = scanner.nextInt();

            try {
                checkValidInputData(number, power);
                long result = myCalculator.power(number, power);
                System.out.println(result);
            } catch (Exception e){
                System.out.println(e);
            }
        }

        scanner.close();
    }

    private static void checkValidInputData(int number, int power) throws Exception {
        if (number < 0 || power < 0) {
            throw new Exception("n or p should not be negative.");
        }

        if (number == 0 && power == 0) {
            throw new Exception("n and p should not be zero.");
        }

        if (number < -10 || power < -10 || number > 10 || power > 10) {
            throw new Exception("n or p data is not valid.");
        }
    }
}
