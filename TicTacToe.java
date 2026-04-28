import java.util.Scanner;

public class TicTacToe {

    // Method to get user input
    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        int slot;

        System.out.print("Enter a slot number (1-9): ");
        slot = sc.nextInt();   // read integer input

        return slot;           // return slot value
    }

    public static void main(String[] args) {
        int userSlot = getUserInput();
        System.out.println("You selected slot: " + userSlot);
    }
}