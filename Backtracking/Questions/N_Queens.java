package Backtracking.Questions;

/*
 * Consider an n*n chessboard. N Queen problem is to accommodate N Queens on the n*n chessboard
 * such that no 2 queens can attack each other.
 * Input:- n=4
 * Output:- {0,1,0,0}
 *          {0,0,0,1}
 *          {1,0,0,0}
 *          {0,0,1,0}
 * ___ ___ ___ ___       ___ ___ ___ ___
 *|___|_Q_|___|___|     |___|___|_Q_|___|
 *|___|___|___|_Q_| OR  |_Q_|___|___|___|
 *|_Q_|___|___|___|     |___|___|___|_Q_|
 *|___|___|_Q_|___|     |___|_Q_|___|___|
 */
public class N_Queens {
    public static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        // Check in column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void nqueue(char[][] board, int row) {
        int n = board.length;
        if (row == n) { // Base case: All queens are placed
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int col = 0; col < n; col++) { // Try placing a queen in each column of the current row
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q'; // Place the queen
                nqueue(board, row + 1); // Recur for the next row
                board[row][col] = 'X'; // Backtrack: Remove the queen
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nqueue(board, 0);
    }
}
