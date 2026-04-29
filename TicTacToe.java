import java.util.Random;
public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };
    
    static char computerSymbol = 'O';

    public static void main(String[] args) {
        computerMove();

        printBoard(); 
    }

    static void computerMove() {
        Random random = new Random();
        boolean validMoveFound = false;

        System.out.println("Computer is making a move...");

        while (!validMoveFound) {

            int slot = random.nextInt(9) + 1; 

            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            if (board[row][col] == '-') {

                board[row][col] = computerSymbol;
                validMoveFound = true; 
                System.out.println("Computer successfully chose slot: " + slot);
            }
        }
    }

    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}