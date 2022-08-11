import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int quantityNumbers = Integer.parseInt(bufferedReader.readLine());
        checkInputNumber(quantityNumbers);

        List<Integer> inputList = new ArrayList<>();

        for (int i = 0; i < quantityNumbers; i++) {
            inputList.add(Integer.parseInt(bufferedReader.readLine()));
        }

        printer(sortArray(inputList));
    }

    public static List<Integer> sortArray(List<Integer> list) {
//        Collections.sort(list);
//        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    int swap = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, swap);
                }
            }
        }

        return list;
    }

    public static void checkInputNumber(int number) {
        if (number < 1 || number > 200) {
            throw new RuntimeException("Input number is not valid");
        }
    }

    public static void printer(List<Integer> list) {
        list.forEach(System.out::println);
    }
}
