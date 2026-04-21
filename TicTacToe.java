import java.util.Random;

public class TicTacToe {
    
    // --- Game State Variables ---
    private char player1Symbol;
    private char player2Symbol;
    private int currentPlayer; // 1 represents Player 1, 2 represents Player 2
    private char currentSymbolTurn;

    public void startNewGame() {
        System.out.println("Game starts... Flipping the coin!");
        performToss();
    }

    private void performToss() {
        // --- Random Number Generation ---
        Random random = new Random();
        int tossResult = random.nextInt(2); // Generates either 0 or 1

        // --- Conditional Logic & Assigning Symbols ---
        if (tossResult == 0) {
            System.out.println("Player 1 won the toss!");
            currentPlayer = 1;
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentSymbolTurn = 'X'; 
        } else {
            System.out.println("Player 2 won the toss!");
            currentPlayer = 2;
            player2Symbol = 'X'; 
            player1Symbol = 'O';
            currentSymbolTurn = 'X'; 
        }

        // Output the results stored in the game state variables
        System.out.println("Player 1 is assigned: " + player1Symbol);
        System.out.println("Player 2 is assigned: " + player2Symbol);
        System.out.println("Player " + currentPlayer + " will make the first move playing '" + currentSymbolTurn + "'.");
    }

    // Main method to test the flow
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.startNewGame();
    }
}