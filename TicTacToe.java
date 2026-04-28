public class TicTacToe {

    // Initialize the board
    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {          // rows
            for (int j = 0; j < 3; j++) {      // columns
                board[i][j] = '-';
            }
        }
    }

    // Print the board
    public static void printBoard(char[][] board) {
        System.out.println("Tic-Tac-Toe Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // move to next line after each row
        }
    }

    public static void main(String[] args) {
        char[][] board = new char[3][3];  // 2D array

        initializeBoard(board);  // Step 1: initialize with '-'
        printBoard(board);       // Step 2: display board
    }
}