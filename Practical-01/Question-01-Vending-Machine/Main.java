import java.util.Scanner;

enum Coin { ONE, TWO, FIVE, TEN }

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = 15, total = 0;
        while (total < price) {
            System.out.print("Enter coin (ONE, TWO, FIVE, TEN): ");
            try {
                Coin coin = Coin.valueOf(sc.next().toUpperCase());
                total += switch (coin) {
                    case ONE -> 1;
                    case TWO -> 2;
                    case FIVE -> 5;
                    case TEN -> 10;
                };
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid coin. Try again.");
            }
        }
        System.out.println("Total=" + total);
        System.out.println("Paid Change=" + (total - price));
        sc.close();
    }
}
