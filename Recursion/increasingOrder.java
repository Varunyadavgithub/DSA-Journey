package Recursion;

/* WAP to print all natural numbers from 1 to N using recursion
N = 5, ans = 1 2 3 4 5
*/
import java.util.Scanner;

public class increasingOrder {
    public static void printInc(int n){
        // base case
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        // recursive work
        printInc(n-1);
        // self work
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the last number: ");
        int n=sc.nextInt();
        printInc(n);
    }
}
