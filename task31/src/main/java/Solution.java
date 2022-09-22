import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        if (number < 1 || number > 100) throw new RuntimeException("Wrong input data");

        List<Integer> inputList = Stream.of(bufferedReader.readLine()
                        .replaceAll("\\s+$", "")
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        bufferedReader.close();
        if (inputList.size() > number) throw new RuntimeException("Wrong input data");

        int count = 0;

        for (int i = 0; i < inputList.size(); i++) {
           int sum = 0;
            for (int j = i; j < inputList.size(); j++) {
                sum += inputList.get(j);
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
