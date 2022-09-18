import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        int max = getMaxValue(arr);
        System.out.println(max);
    }

    public static int getMaxValue(List<List<Integer>> inputLists) {
        int max = 0;
        for (int i = 2; i < 6; i++) {
            for (int j = 2; j < 6; j++) {
                int currentResult = inputLists.get(i - 2).get(j - 2) + inputLists.get(i - 2).get(j - 1) +
                        inputLists.get(i - 2).get(j) + inputLists.get(i - 1).get(j - 1) +
                        inputLists.get(i).get(j) + inputLists.get(i).get(j - 1) + inputLists.get(i).get(j - 2);
                max = Math.max(max, currentResult);
            }
        }
        return max;
    }
}
