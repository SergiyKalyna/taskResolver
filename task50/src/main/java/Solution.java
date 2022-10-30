import java.util.Scanner;

import static java.lang.System.in;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Prime prime = new Prime();
        String result = "";

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            result += prime.checkPrime(number) ? number : " ";
            System.out.println(result);
        }
    }
}
