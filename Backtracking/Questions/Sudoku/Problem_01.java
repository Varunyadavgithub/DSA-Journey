package Backtracking.Questions.Sudoku;

/*
 * Valid Sudoku (Leetcode 36).
 */
public class Problem_01 {

    // Helper function to check if placing the number is valid
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

    // Function to validate the entire Sudoku board
    public static boolean isValidSudoku(char[][] board) {
        // Iterate through the board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // Skip empty cells
                if (board[i][j] == '.')
                    continue;

                char num = board[i][j];
                board[i][j] = '.'; // Temporarily empty the cell to check validity

                // If the number is not valid in the current position, return false
                if (!isValid(board, i, j, num)) {
                    return false;
                }

                board[i][j] = num; // Restore the cell
            }
        }
        return true;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        // Example Sudoku board
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '6', '.', '.', '.', '.', '3' },
                { '4', '.', '9', '.', '.', '8', '.', '.', '1' },
                { '7', '.', '.', '2', '4', '1', '9', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        // Modifying the board to make it invalid (duplicate '5' in the first row)
        // board[0][4] = '5'; // This causes an invalid board as '5' repeats in the same
        // row.

        // Check if the board is a valid Sudoku
        boolean isValid = isValidSudoku(board);
        System.out.println("Is the Sudoku valid? " + isValid); // Expected: false
    }
}
