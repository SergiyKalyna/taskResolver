import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.stream(player)
                .sorted(Comparator
                        .comparing(Player::getScore)
                        .reversed()
                        .thenComparing(Player::getName))
                .forEach(System.out::println);
    }
}
