
/*Given an integer n, return the first N rows of Pascal's triangle. In pascal's triangle, each number is
the sum of the two numbers directly above it.

for n=5
                1
               1 1
              1 2 1
             1 3 3 1
            1 4 6 4 1

*/
import java.util.*;

public class PascalTriangle {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] pascal(int n) {
        int[][] ans=new int[n][];
        for(int i=0;i<n;i++){
            ans[i]=new int[i+1];
            ans[i][0]=1;
            ans[i][i]=1;
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int n = sc.nextInt();
        int[][] ans = pascal(n);
        printMatrix(ans);
        sc.close();
    }
}
