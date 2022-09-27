import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int quantityLines = Integer.parseInt(reader.readLine());
        if (quantityLines < 1 || quantityLines > 100000) throw new RuntimeException("Wrong input quantity lines");

        Set<String> inputSet = new HashSet<>();
        List<Integer> countList = new ArrayList<>();

        for (int i = 0; i < quantityLines; i++) {
            String inputLine = reader.readLine();
            if (inputSet.contains(inputLine)) {
                countList.add(inputSet.size());
            } else {
                inputSet.add(inputLine);
                countList.add(inputSet.size());
            }
        }

        countList.forEach(System.out::println);
    }

    public static void checkLine(String line){
        String regex = "^[a-z]{1,5}\\s[a-z]{1,5}$";
        if(!line.matches(regex)){
            throw new RuntimeException("Wrong input line");
        }
    }
}
