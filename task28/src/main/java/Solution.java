import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int quantityN = Integer.parseInt(READER.readLine());
        if (quantityN < 1 || quantityN > 20000) {
            throw new RuntimeException("Input n - data is not valid");
        }

        List<List<Integer>> integersList = getIntegerLists(quantityN);

        int quantityCoordinate = Integer.parseInt(READER.readLine());
        if (quantityCoordinate < 1 || quantityCoordinate > 1000) {
            throw new RuntimeException("Input q - data is not valid");
        }

        List<String> coordinates = getCoordinates(quantityCoordinate);

        List<Integer> resultOfSearch = searchByCoordinates(integersList, coordinates);

        resultOfSearch.forEach(System.out::println);
        READER.close();
    }

    public static List<List<Integer>> getIntegerLists(int number) throws IOException {
        List<List<Integer>> integersList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            String inputNumbers = READER.readLine();
            List<Integer> simpleList = convertStringToList(inputNumbers);
            int quantityD = simpleList.get(0);
            if (quantityD < 0 || quantityD > 50000) {
                throw new RuntimeException("Input d - data is not valid");
            } else if (quantityD == 0) {
                integersList.add(Collections.emptyList());
            } else {
                simpleList.remove(0);
                integersList.add(simpleList);
            }
        }

        return integersList;
    }

    public static List<Integer> convertStringToList(String numbers) {
        return Arrays.stream(numbers.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
    }

    public static List<String> getCoordinates(int quantity) throws IOException {
        List<String> coordinates = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            coordinates.add(READER.readLine());
        }

        return coordinates;
    }

    public static List<Integer> searchByCoordinates(List<List<Integer>> integersList,
                                                    List<String> coordinates) {

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < coordinates.size(); i++) {
            List<Integer> points = convertStringToList(coordinates.get(i));
            int x = points.get(0);
            int y = points.get(1);

            result.add(integersList.get(x - 1).get(y - 1));
        }

        return result;
    }
}
