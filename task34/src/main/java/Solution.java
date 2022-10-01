import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<String> strList = List.of("Hello", "World");

        printArray(intList);
        printArray(strList);
    }

    public static void printArray(List<?> list) {
        list.forEach(System.out::println);
    }
}
