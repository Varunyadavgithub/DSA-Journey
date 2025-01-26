package Backtracking.Questions.Knights;

/*
 * Place k-knights such that they do not attack each other.
 */
public class Problem_02 {

    // Directions of knight's moves: (row, col) pairs
    private static final int[] rowMoves = { -2, -1, 1, 2, 2, 1, -1, -2 };
    private static final int[] colMoves = { 1, 2, 2, 1, -1, -2, -2, -1 };

    // Function to check if a knight at position (r, c) can attack another knight
    private static boolean isSafe(int[][] board, int r, int c, int n) {
        for (int i = 0; i < 8; i++) {
            int newRow = r + rowMoves[i];
            int newCol = c + colMoves[i];

            if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && board[newRow][newCol] == 1) {
                return false; // There is another knight in attack range
            }
        }
        return true;
    }

    // Function to place knights on the board using backtracking
    private static boolean placeKnights(int[][] board, int n, int k, int knightCount, int startRow, int startCol) {
        if (knightCount == k) {
            return true; // Successfully placed all k knights
        }

        for (int i = startRow; i < n; i++) {
            for (int j = (i == startRow ? startCol : 0); j < n; j++) {
                if (board[i][j] == 0 && isSafe(board, i, j, n)) {
                    // Place the knight
                    board[i][j] = 1;

                    // Recur to place the next knight
                    if (placeKnights(board, n, k, knightCount + 1, i, j + 1)) {
                        return true;
                    }

                    // Backtrack (remove the knight)
                    board[i][j] = 0;
                }
            }
        }

        return false; // No solution found
    }

    public static void main(String[] args) {
        int n = 5; // Size of the board
        int k = 5; // Number of knights to place

        int[][] board = new int[n][n]; // Initialize an n x n board with 0s

        if (placeKnights(board, n, k, 0, 0, 0)) {
            System.out.println("Successfully placed all " + k + " knights on the board!");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No valid configuration found.");
        }
    }
}
