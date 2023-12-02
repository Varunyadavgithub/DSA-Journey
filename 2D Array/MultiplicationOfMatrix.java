// Write a program to display Multiplication of two matrices entered by the users...

// a00 a01 a02 a03         b00 b01 b02         c00 c01 c02
// a10 a11 a12 a13    *    b10 b11 b12     =   c10 c11 c12
//       (r1,c1)           b20 b21 b22                 (r1,c2)
//                         b30 b31 b32 
//                                 (r2,c2)

// No. of columns of matrix 1 is equal to the No. of rows in Matrix 2 (c1 == r2)
// The order of resultent matrix is r1*c2 

// c00 = (a00*b00)+(a01*b10)+(a02*b20)+(a03*b30) 
// c01 = (a00*b01)+(a01*b11)+(a02*b21)+(a03*b31)
// c02 = (a00*b02)+(a01*b12)+(a02*b22)+(a03*b32)

// c10 = (a10*b00)+(a11*b10)+(a12*b20)+(a13*b30)
// c11 = (a10*b01)+(a11*b11)+(a12*b21)+(a13*b31)
// c12 = (a10*b02)+(a11*b12)+(a12*b22)+(a13*b32)

import java.util.*;
public class MultiplicationOfMatrix {

    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void multiply(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if(c1!=r2){
            System.out.println("Multiplication is not possible -> Wrong dimention");
            return;
        }
        int[][] mul=new int[r1][c2];
        for(int i=0;i<r1;i++){  //row number...
            for(int j=0;j<c2;j++){  //column number...
                for(int k=0;k<c1;k++){
                    mul[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Multiplication of two matrix is: ");
        printMatrix(mul);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows & columns of matrix 1: ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int[][] a=new int[r1][c1];
        System.out.println("Enter the value of matrix 1: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the no. of rows & columns of matrix 2: ");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int[][] b=new int [r2][c2];
        System.out.println(("Enter the value of matrix 2: "));
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix 1 is: ");
        printMatrix(a);
        System.out.println("Matrix 2 is: ");
        printMatrix(b);
        multiply(a,r1,c1,b,r2,c2);
    }
}
