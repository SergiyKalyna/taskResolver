import java.security.NoSuchAlgorithmException;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MD5 md5 = new MD5();
        Scanner scanner = new Scanner(System.in);

        String pattern = "^[a-zA-Z0-9]{6,20}$";
        String password = scanner.next(pattern);
        scanner.close();

        String encodedPassword = md5.encodePassword(password);
        System.out.println(encodedPassword);
    }
}
