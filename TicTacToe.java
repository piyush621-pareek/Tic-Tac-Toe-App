public class TicTacToe {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {
        System.out.println("Game Started!\n");

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human Player's turn...");

            } else {
                System.out.println("Computer's turn...");

            }

            checkWinOrDraw(); 

            isHumanTurn = !isHumanTurn;
            
            System.out.println("-------------------------");
        }

        System.out.println("Game Over!");
    }
    
    static int turnsTaken = 0;
	
    public static void checkWinOrDraw() {
        turnsTaken++;
		
        if (turnsTaken >= 5) {
            System.out.println("Win or Draw detected!");
            gameOver = true; 
        } else {
            System.out.println("Game continues...");
        }
    }
}