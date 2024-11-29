import java.util.*;

public class ReverseMatrix {

    // Method to print a matrix
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    // Method to reverse the rows of the matrix
    static void reverseMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            int start = 0, end = cols - 1;
            while (start < end) {
                // Swap elements in the row
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;

                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int totalElement=r*c;
        int[][] matrix = new int[r][c];
        System.out.println("Enter the "+totalElement+" elements of the matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix: ");
        printMatrix(matrix);

        reverseMatrix(matrix);

        System.out.println("Reversed Matrix: ");
        printMatrix(matrix);

        sc.close();
    }
}
