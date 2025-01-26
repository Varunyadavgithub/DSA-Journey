package Backtracking.Questions.Knights;

/*
 * Tell the maximum number of Knight that can be placed in a given n*n chessboard.
 */
public class Problem_03 {

    public static int maxKnights(int n) {
        // Max knights that can be placed without attacking each other
        // Using the formula (n * n + 1) / 2
        return (n * n + 1) / 2;
    }

    public static void main(String[] args) {
        int n = 5; // Size of the chessboard

        // Calculate the maximum number of knights
        int result = maxKnights(n);

        // Output the result
        System.out.println(
                "Maximum number of knights that can be placed on a " + n + "x" + n + " chessboard is: " + result);
    }
}

/*
 * Note:- The formula `(n * n + 1) / 2` calculates the maximum number of knights
 * that can be placed on an `n x n` chessboard without attacking each other.
 * 
 * - **`n * n`**: Total number of squares on the chessboard.
 * - **`+1`**: Handles the case when the number of squares is odd (rounds up).
 * - **`/2`**: Places knights on half the squares, because knights can only be
 * placed on alternate squares.
 * 
 * So, the formula gives roughly half of the total squares, and when the total
 * number is odd, it adds one more knight.
 * 
 * Example:
 * - For a 6x6 board: `(6 * 6 + 1) / 2 = 18 knights`.
 * - For a 5x5 board: `(5 * 5 + 1) / 2 = 13 knights`.
 */