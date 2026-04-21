public class TicTacToe {
    // Define the board as a 2D character array
    private char[][] board;

    public TicTacToe() {
        // Initialize a 3x3 board
        board = new char[3][3];
        initializeBoard();
    }

    // UC1: Initialization Logic
    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Set each cell to a dash '-'
                board[i][j] = '-';
            }
        }
    }

    // UC1: Console Output Formatting
    public void displayBoard() {
        System.out.println("Current Board:");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                // Print the cell value and a divider
                System.out.print(board[i][j] + " | ");
            }
            System.out.println(); // Move to the next row
            System.out.println("-------------"); // Row separator
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.displayBoard();
    }
}