import java.util.ArrayList;
import java.util.List;

public class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                numbers.add(i);
            }
        }

        return numbers.stream().mapToInt(Integer::intValue).sum();
    }
}
