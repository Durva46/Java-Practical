import java.util.Random;
import java.util.Scanner;

enum Move { ROCK, PAPER, SCISSORS, LIZARD, SPOCK }

public class Main {
    static int winner(Move a, Move b) {
        if (a == b) return 0;
        if ((a == Move.ROCK && (b == Move.SCISSORS || b == Move.LIZARD)) ||
            (a == Move.PAPER && (b == Move.ROCK || b == Move.SPOCK)) ||
            (a == Move.SCISSORS && (b == Move.PAPER || b == Move.LIZARD)) ||
            (a == Move.LIZARD && (b == Move.PAPER || b == Move.SPOCK)) ||
            (a == Move.SPOCK && (b == Move.ROCK || b == Move.SCISSORS))) return 1;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); Random random = new Random();
        int playerScore = 0, computerScore = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Move " + i + " (ROCK/PAPER/SCISSORS/LIZARD/SPOCK): ");
            Move player;
            try { player = Move.valueOf(sc.next().toUpperCase()); }
            catch (IllegalArgumentException e) { System.out.println("Invalid move; round skipped."); i--; continue; }
            Move computer = Move.values()[random.nextInt(Move.values().length)];
            System.out.println("You: " + player + " | Computer: " + computer);
            int result = winner(player, computer);
            if (result > 0) { playerScore++; System.out.println("You won!"); }
            else if (result < 0) { computerScore++; System.out.println("Computer won!"); }
            else System.out.println("Tie!");
        }
        System.out.println("Final Score: You=" + playerScore + ", Computer=" + computerScore);
        sc.close();
    }
}
