package Backtracking.Questions.Sudoku;

/*
 * Sudoku Solver (Leetcode 37).
 */
public class Problem_02 {

    public static boolean isValid(char[][] board, int row, int col, char num) {
        // Check in the row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num)
                return false;
        }

        // Check in the column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num)
                return false;
        }

        // Check in the 3x3 sub-grid
        int sRow = row / 3 * 3; // Starting row of the sub-grid
        int sCol = col / 3 * 3; // Starting column of the sub-grid
        for (int i = sRow; i < sRow + 3; i++) {
            for (int j = sCol; j < sCol + 3; j++) {
                if (board[i][j] == num)
                    return false;
            }
        }
        return true;
    }

    public static boolean solve(char[][] board, int row, int col) {
        // If we reach the last row, the Sudoku is solved
        if (row == 9) {
            return true;
        }

        // Move to the next row if we reach the end of the column
        if (col == 9) {
            return solve(board, row + 1, 0);
        }

        // Skip cells that are already filled
        if (board[row][col] != '.') {
            return solve(board, row, col + 1);
        }

        // Try each digit from '1' to '9'
        for (char num = '1'; num <= '9'; num++) {
            if (isValid(board, row, col, num)) {
                board[row][col] = num;
                // Recursively try to solve the rest of the board
                if (solve(board, row, col + 1)) {
                    return true;
                }
                // If we reach here, the current choice didn't work, so backtrack
                board[row][col] = '.';
            }
        }
        return false;
    }

    public static void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        solveSudoku(board);
        printBoard(board); // Print the solved Sudoku
    }
}