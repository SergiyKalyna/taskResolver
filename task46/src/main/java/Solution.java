import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Solution {
    public static void main(String[] args) throws Exception {
        DoNotTerminate.forbidExit();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(br.readLine().trim());
            checkValidInputNumber(num);

            Solution.Inner innerObject = new Solution.Inner();

            Object object;

            Class<?> innerClass = Solution.Inner.class;
            Class<?>[] classes = innerClass.getDeclaredClasses();
            Class clazz = classes[0];

            Constructor<?> constructor = clazz.getDeclaredConstructor(innerClass);
            constructor.setAccessible(true);
            object = constructor.newInstance(innerObject);

            Method powerOf2 = clazz.getDeclaredMethod("powerOf2", new Class[]{int.class});
            powerOf2.setAccessible(true);
            String result = (String) powerOf2.invoke(object, num);
            System.out.println(num + " is " + result);

            System.out.println("An instance of class: " + object.getClass().getCanonicalName() + " has been created");

        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }

    private static void checkValidInputNumber(int number) {
        if (number < 1 || number > Math.pow(2, 30)) {
            throw new RuntimeException("Input number is not valid");
        }
    }

    static class Inner {
        private class Private {
            private String powerOf2(int num) {
                return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
            }
        }
    }
}

