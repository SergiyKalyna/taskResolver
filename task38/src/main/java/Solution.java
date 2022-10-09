import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = new ArrayList<>();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        checkInputData(n, m);

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            checkInputNumber(num);
            numbersList.add(num);
        }
        scanner.close();

        int unique = getUniqueNumber(numbersList, m);

        System.out.println(unique);
    }

    public static int getUniqueNumber(List<Integer> numbersList, int m) {
        Deque deque = new ArrayDeque<>();
        int unique = 0;

        for (int i = 0; i < numbersList.size() - 2; i++) {
            if (i != 0) {
                deque.add(numbersList.get(i + 2));
            } else {
                for (int j = i; j < m + i; j++) {
                    deque.add(numbersList.get(j));
                }
            }
            int sublistUnique = (int) deque.stream().distinct().count();
            if (sublistUnique > unique) {
                unique = sublistUnique;
            }
            deque.removeFirst();
        }

        return unique;
    }

    public static void checkInputData(int n, int m) {
        if (n < 1 || n > 100000) {
            throw new RuntimeException("Input data 'N' is not valid");
        }

        if (m < 1 || m > 100000) {
            throw new RuntimeException("Input data 'M' is not valid");
        }

        if (m > n) {
            throw new RuntimeException("Input data 'M' is not valid");
        }
    }

    public static void checkInputNumber(int number) {
        if (number < 0 || number > 10000000) {
            throw new RuntimeException("Input number is not valid");
        }
    }
}
