import java.util.*;

public class ReverseMatrix {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void reverseMatrix(int[][] matrix)
            int i=0;int j=matrix.length;
            while(i<j){
                int temprix[i][i];
                matrix[i][i]=matrix[i][j];
                matrix[i][j]=temp;
                i++;
                j--;
            }
        printMatrix(matrix);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns of a matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int total = r * c;
        int[][] matrix = new int[r][c];
        System.out.println("Enter the " + total + " elements of a matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix: ");
        printMatrix(matrix);
        System.out.println("Reverse Matrix is: ");
        reverseMatrix(matrix, r, c);
    }
}
