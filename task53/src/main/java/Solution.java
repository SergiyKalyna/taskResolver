import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        SHA256 sha256 = new SHA256();
        Scanner scanner = new Scanner(System.in);

        String pattern = "^[a-zA-Z0-9]{6,20}$";
        String password = scanner.next(pattern);
        scanner.close();

        byte[] encodedPassword = sha256.encodePassword(password);
        
        for (byte symbol : encodedPassword) {
            System.out.format("%02x", symbol);
        }
    }
}
