public class TicTacToe {
	
    public static int[] convertSlotToIndex(int slot) {

        if (slot < 1 || slot > 9) {
            throw new IllegalArgumentException("Invalid slot! Please enter a number between 1 and 9.");
        }
        int zeroBasedIndex = slot - 1;
        int row = zeroBasedIndex / 3;
        int col = zeroBasedIndex % 3;
        return new int[]{row, col};
    }

    public static void main(String[] args) {
        System.out.println("Testing Slot to Index Conversion:");
        System.out.println("---------------------------------");

        for (int slot = 1; slot <= 9; slot++) {
            int[] indices = convertSlotToIndex(slot);
            System.out.printf("Slot %d -> Row: %d, Col: %d%n", slot, indices[0], indices[1]);
        }
    }
}