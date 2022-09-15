import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.RemoteException;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int number = Integer.parseInt(READER.readLine());

        if (number < 1 || number > 4000) {
            throw new RemoteException("Input number is not valid");
        }

        List<Integer> numbersLIst = getListOfNumbers(number);

        int queriesQuantity = Integer.parseInt(READER.readLine());

        if (queriesQuantity < 1 || queriesQuantity > 4000) {
            throw new RemoteException("Input quantity of the queries is not valid");
        }

        while (queriesQuantity > 0) {
            String query = READER.readLine();

            if (query.equals("Insert")) {
                numbersLIst = Collections.unmodifiableList(add(numbersLIst));
            } else if (query.equals("Delete")) {
                numbersLIst = Collections.unmodifiableList(delete(numbersLIst));
            } else {
                throw new RuntimeException("Input query is not valid");
            }

            queriesQuantity--;
        }

        READER.close();

        System.out.println(convertToString(numbersLIst));
    }

    public static List<Integer> getListOfNumbers(int number) throws IOException {
        String numbersLine = READER.readLine();

        List<Integer> numbersList = Arrays.stream(numbersLine.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        if (numbersList.size() != number) {
            throw new RuntimeException("Wrong input data");
        }

        return numbersList;
    }

    public static List<Integer> delete(List<Integer> listNumbers) throws IOException {
        int numberToDelete = Integer.parseInt(READER.readLine());

        List<Integer> result = new ArrayList<>(listNumbers);
        result.remove(numberToDelete);

        return result;
    }

    public static List<Integer> add(List<Integer> listNumbers) throws IOException {
        String coordinate = READER.readLine();
        List<Integer> coordinateList = Arrays.stream(coordinate.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        if (coordinateList.size() > 2) {
            throw new RuntimeException("Wrong input data");
        }

        int x = coordinateList.get(0);
        int y = coordinateList.get(1);

        listNumbers.add(x, y);

        return listNumbers;
    }

    public static String convertToString(List<Integer> list) {
        StringBuilder strbul = new StringBuilder();
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            strbul.append(iter.next());
            if (iter.hasNext()) {
                strbul.append(" ");
            }
        }

        return strbul.toString();
    }
}
