import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String number = bufferedReader.readLine();
        if (number.length() > 100) {
            throw new RuntimeException("Input data is not valid");
        }

        bufferedReader.close();

        BigInteger bigInteger = new BigInteger(number);

        if (bigInteger.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
