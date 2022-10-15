import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        List<Object> myList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if (s.equals("Student")) myList.add(new Student());
            if (s.equals("Rockstar")) myList.add(new Rockstar());
            if (s.equals("Hacker")) myList.add(new Hacker());
        }
        sc.close();
        System.out.println(count(myList));
    }

    private static String count(List<Object> myList) {
        int a = 0, b = 0, c = 0;
        for (Object element : myList) {
            if (element instanceof Student)
                a++;
            if (element instanceof Rockstar)
                b++;
            if (element instanceof Hacker)
                c++;
        }

        return a + " " + b + " " + c;
    }
}
