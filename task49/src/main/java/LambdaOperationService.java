import java.math.BigInteger;

public class LambdaOperationService {

    public String isOdd(int number) {
        return number % 2 == 0 ? "EVEN" : "ODD";
    }

    public String isPrime(int number) {
        BigInteger bigInteger = new BigInteger(String.valueOf(number));

        return bigInteger.isProbablePrime(number) ? "PRIME" : "COMPOSITE";
    }

    public String isPalindrome(int number) {
        String reversNumber = new StringBuffer(String.valueOf(number)).reverse().toString();

        return number == Integer.parseInt(reversNumber) ? "PALINDROME" : "NOT PALINDROME";
    }
}
