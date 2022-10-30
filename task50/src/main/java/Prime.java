import java.math.BigInteger;

public class Prime {

    public boolean checkPrime(int number) {
        BigInteger bigInteger = new BigInteger(String.valueOf(number));

        return bigInteger.isProbablePrime(number);
    }
}
