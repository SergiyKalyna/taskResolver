import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String parentheses = scanner.next();
            System.out.println(isParentheses(parentheses));
        }
        scanner.close();
    }

    private static Boolean isParentheses(String text) {
        while (text.contains("{}") || text.contains("()") || text.contains("[]")) {
            if (text.contains("{}")) {
                text = text.replace("{}", "");
            }
            if (text.contains("()")) {
                text = text.replace("()", "");
            }
            if (text.contains("[]")) {
                text = text.replace("[]", "");
            }
        }

        return text.length() == 0;
    }
}
