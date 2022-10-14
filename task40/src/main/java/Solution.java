import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        try (Scanner scanner = new Scanner(System.in)) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x/y);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        }

    }
}
