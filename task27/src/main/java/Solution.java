import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int quantity = Integer.parseInt(bufferedReader.readLine());

        int[] array = new int[quantity];
        for (int i =0; i<array.length; i++){
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int numb : array) {
            System.out.println(numb);
        }

        bufferedReader.close();
    }
}
