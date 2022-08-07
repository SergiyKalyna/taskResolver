import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bufferedReader.readLine());

        if (number < 2 || number > 20) {
            System.out.println("Sorry, but input number is not available");
        } else {
            showMathOperation(number);
        }

        bufferedReader.close();
    }

    public static void showMathOperation(int number) {
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(String.format("%s x %s = %s", number, i, result));
        }
    }
}
