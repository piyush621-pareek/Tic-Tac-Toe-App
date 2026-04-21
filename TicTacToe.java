import java.util.Scanner;
import java.util.InputMismatchException;

public class TicTacToe {
    public int getSlotInput(Scanner scanner) {
        int slot = -1;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Please enter a slot number (1-9): ");
            
            try {
                slot = scanner.nextInt();

                if (slot >= 1 && slot <= 9) {
                    isValid = true; 
                } else {
                    System.out.println("Invalid choice. The slot must be between 1 and 9.");
                }
                
            } catch (InputMismatchException e) {

                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); 
            }
        }
        

        return slot; 
    }

    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        
        System.out.println("--- Player Turn ---");
        int chosenSlot = game.getSlotInput(consoleScanner);
        
        System.out.println("Successfully recorded slot: " + chosenSlot);
        
        consoleScanner.close();
    }
}