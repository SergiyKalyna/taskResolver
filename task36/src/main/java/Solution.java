import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 2 || number > 1000) {
            throw new RuntimeException("Wrong input quantity");
        }

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            Student student = new Student(scanner.nextInt(), scanner.next(), scanner.nextDouble());
            checkValidStudent(student);

            students.add(student);
        }

        scanner.close();

        students.stream()
                .sorted(Comparator
                        .comparing(Student::getCGPA)
                        .reversed()
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getId))
                .forEach(System.out::println);
    }

    private static void checkValidStudent(Student student) {
        String regex = "^[a-z]{5,30}$";
        if (student.getId() < 0 || student.getId() > 100000) {
            throw new RuntimeException(String.format("Wrong input student id - [%s]", student.getId()));
        } else if (!student.getName().matches(regex)) {
            throw new RuntimeException(String.format("Wrong input student name - [%s]", student.getName()));
        } else if (student.getCGPA() < 0.0 || student.getCGPA() > 4.00) {
            throw new RuntimeException(String.format("Wrong input student CGPA - [%s]", student.getCGPA()));
        }
    }
}
