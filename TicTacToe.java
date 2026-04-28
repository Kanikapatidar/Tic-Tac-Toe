import java.util.Random;

public class TicTacToe {

    static char humanSymbol;
    static char computerSymbol;
    static String currentPlayer;

    // Toss to decide who starts
    public static void toss() {
        Random rand = new Random();
        int result = rand.nextInt(2); // 0 or 1

        if (result == 0) {
            currentPlayer = "Human";
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            currentPlayer = "Computer";
            humanSymbol = 'O';
            computerSymbol = 'X';
        }

        // Display results
        System.out.println("Toss Result: " + currentPlayer + " starts first!");
        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }

    public static void main(String[] args) {
        toss();
    }
}