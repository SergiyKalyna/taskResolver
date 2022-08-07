import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int parallelogramBreadth;
    private static final int parallelogramHeight;

    static {
        parallelogramBreadth = scanner.nextInt();
        parallelogramHeight = scanner.nextInt();
        scanner.close();
    }

    public static void main(String[] args) {
        if (parallelogramBreadth <= 0 || parallelogramHeight <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(parallelogramBreadth * parallelogramHeight);
        }
    }
}


