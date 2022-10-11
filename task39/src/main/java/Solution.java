import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Checker checker = new Checker();
        Queue<Student> queue = new PriorityQueue<>(
                Comparator.comparing(Student::getcGPA).reversed()
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getId));

        int cases = Integer.parseInt(scanner.nextLine());
        checker.checkInputCases(cases);

        for (int i = 0; i < cases; i++) {
            String event = scanner.nextLine();

            if (event.equals(EventType.SERVED.getValue())) {
                if (!queue.isEmpty()) {
                    queue.poll();
                }
            } else {
                String[] details = event.split(" ");
                Student student = new Student(details[1],
                        Double.parseDouble(details[2]),
                        Integer.parseInt(details[3]));

                checker.checkInputStudent(student);
                queue.add(student);
            }
        }
        scanner.close();

        queue.forEach(System.out::println);
    }
}
