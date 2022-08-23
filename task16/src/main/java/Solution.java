import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        int quantity = Integer.parseInt(READER.readLine());
        checkInputNumber(quantity);

    }

    public static void checkInputNumber(int number) {
        if (number < 0) {
            throw new RuntimeException("Input number is not valid");
        }
    }

    public List<String> getListTestCases(int quantity) throws IOException {
        List<String> inputList = new ArrayList<>();

        for(int i =0; i<quantity; i++){
            inputList.add(READER.readLine());
        }

        return inputList;
    }

    public static void getCastType(String number){

    }
}
