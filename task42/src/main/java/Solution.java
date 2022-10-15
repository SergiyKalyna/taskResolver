import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        System.out.println(String.format("I implemented %s", getInterfaceName(myCalculator)));

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        checkNumber(number);
        scanner.close();

        int divisors = myCalculator.divisor_sum(number);
        System.out.println(divisors);
    }

    private static String getInterfaceName(Object o) {
        Class<?>[] interfaces = o.getClass().getInterfaces();
        String interfaceName = "";
        for (Class<?> anInterface : interfaces) {
            interfaceName += anInterface.getName();
        }

        return interfaceName;
    }

    private static void checkNumber(int number) {
        if (number > 1000 || number < 0) {
            throw new RuntimeException("Input number is not valid");
        }
    }
}

