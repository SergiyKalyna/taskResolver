import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();

        inputList.add(scanner.nextInt());
        inputList.add(scanner.nextInt());
        inputList.add(scanner.nextInt());

        inputList.forEach(System.out::println);
    }
}
