// Reverse the each rows of matrix...
// 1 2 3        1 4 7 
// 4 5 6    =   2 5 8 
// 7 8 9        3 6 9

// Method -> 1

import java.util.*;
public class TransposeOfMatrix {
    static void printMatrix(int[][] matrix,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] findTranspose(int[][] matrix,int r,int c){
        int[][] ans=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and column of matrix: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix=new int[r][c];
        int totalElements=r*c;
        System.out.println("Enter the "+totalElements+" elements of matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input Matrix: ");
        printMatrix(matrix,r,c);
        System.out.println("Transpose Matrix: ");
        int[][] ans=findTranspose(matrix,r,c);
        printMatrix(ans,r,c);
    }
}

// Method -> 2

// import java.util.*;
// public class TransposeOfMatrix {
//     static void printMatrix(int[][] matrix,int r,int c){
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     static void findTranspose(int[][] matrix,int r,int c){
//       for(int i=0;i<c;i++){
//         for(int j=i;j<r;j++){
//             int temp=matrix[i][j];
//             matrix[i][j]=matrix[j][i];
//             matrix[j][i]=temp;
//         }
//       }
//       printMatrix(matrix, r, c);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the rows and column of matrix: ");
//         int r=sc.nextInt();
//         int c=sc.nextInt();
//         int[][] matrix=new int[r][c];
//         int totalElements=r*c;
//         System.out.println("Enter the "+totalElements+" elements of matrix: ");
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         System.out.println("Input Matrix: ");
//         printMatrix(matrix,r,c);
//         System.out.println("Transpose Matrix: ");
//         findTranspose(matrix, r, c);
//     }
// }

