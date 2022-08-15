import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        checkNumber(number);

        scanner.close();
    }

    public static void checkNumber(int number) {
        if (number >= 1 || number <= 100) {
            if (number % 2 != 0) {
                System.out.println("Weird");
            } else if (number >= 2 && number < 5) {
                System.out.println("Not Weird");
            } else if (number >= 6 && number <= 20) {
                System.out.println("Weird");
            } else if (number > 20) {
                System.out.println("Not Weird");
            }
        } else {
            throw new RuntimeException("Input number is not valid");
        }
    }
}
