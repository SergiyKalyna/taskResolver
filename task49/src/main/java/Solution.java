import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        LambdaOperationService lambdaOperationService = new LambdaOperationService();
        Scanner scanner = new Scanner(System.in);
        List<String> results = new ArrayList<>();

        int testCases = scanner.nextInt();
        checkInputNumber(testCases);

        for (int i = 0; i < testCases; i++) {
            TestCase testCase = new TestCase(scanner.nextInt(), scanner.nextInt());
            results.add(doOperation(lambdaOperationService,testCase));
        }

        results.forEach(System.out::println);
    }

    private static void checkInputNumber(int number) {
        if (number < 0) throw new RuntimeException("Input number is not valid");
    }

    private static String doOperation(LambdaOperationService operationService, TestCase testCase) {
        switch (testCase.getNumberOperation()) {
            case 1:
                return operationService.isOdd(testCase.getValue());
            case 2:
                return operationService.isPrime(testCase.getValue());
            case 3:
                return operationService.isPalindrome(testCase.getValue());
            default:
                throw new RuntimeException("Number of the operation is not valid");
        }
    }
}
