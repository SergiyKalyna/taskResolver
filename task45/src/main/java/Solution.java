import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        List<String> methodList = new ArrayList<>();

        for (Method method : methods) {
            methodList.add(method.getName());
        }

        Collections.sort(methodList);
        methodList.forEach(System.out::println);
    }
}
