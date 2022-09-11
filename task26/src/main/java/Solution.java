import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String first = reader.readLine();
        String second = reader.readLine();
        reader.close();

        checkInputData(first);
        checkInputData(second);

        BigInteger firstInt = new BigInteger(first);
        BigInteger secondInt = new BigInteger(second);

        BigInteger firstResult = firstInt.add(secondInt);
        BigInteger secondResult = firstInt.multiply(secondInt);

        System.out.println(firstResult);
        System.out.println(secondResult);
    }

    public static void checkInputData(String inputNumber) {
        if (inputNumber.startsWith("-") || inputNumber.length() > 200) {
            throw new RuntimeException("Input data is not valid");
        }
    }
}
