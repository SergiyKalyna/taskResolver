public class FoodFactory {
    public Food getFood(String order) {
        if (order.equalsIgnoreCase("Pizza")) {
            return new Pizza();
        } else if (order.equalsIgnoreCase("Cake")) {
            return new Cake();
        } else {
            throw new RuntimeException("Wrong input data");
        }
    }
}
