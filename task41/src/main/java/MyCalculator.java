public class MyCalculator {

    public long power(int number, int power) {
        return (long) Math.pow(number, power);

//        if (power == 1) {
//            return number;
//        } else {
//            return number * power(number, power - 1);
//        }
    }
}
