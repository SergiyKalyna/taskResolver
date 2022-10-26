import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        FoodFactory foodFactory = new FoodFactory();

        Food food = foodFactory.getFood(sc.nextLine());

        System.out.println("The factory returned "+food.getClass());
        System.out.println(food.getType());
    }
}
