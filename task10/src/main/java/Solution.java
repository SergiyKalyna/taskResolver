import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String ip = bufferedReader.readLine();

        MyRegex regex = new MyRegex(ip);

        bufferedReader.close();
    }
}
