import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256 {
    public byte[] encodePassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes());

        return md.digest();
    }
}
