import java.lang.reflect.Method;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        ValidChecker validChecker = new ValidChecker();
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        validChecker.checkInputNumber(testCases);

        while (testCases > 0) {
            UserRole role = validChecker.checkRole(scanner.next());
            int spend = scanner.nextInt();
            validChecker.checkMoneySpend(spend);

            try {
                Class annotatedClass = FamilyMember.class;
                Method[] methods = annotatedClass.getMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(FamilyBudget.class)) {
                        FamilyBudget family = method.getAnnotation(FamilyBudget.class);
                        UserRole userRole = family.userRole();
                        int budgetLimit = family.limit();
                        if (userRole.equals(role)) {
                            if (budgetLimit >= spend) {
                                method.invoke(FamilyMember.class.newInstance(), budgetLimit, spend);
                            } else {
                                System.out.println("Budget Limit Over");
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            testCases--;
        }
    }
}
