package Recursion;

/*WAP to print all natural numbers from n to 1
N = 5, ans = 5 4 3 2 1
*/
import java.util.Scanner;
public class decreasingOrder {
    public static void printDec(int n){
        // base case
        if(n==1){
            System.out.print(1);
            return;
        }
        // self work
        System.out.print(n+" ");
        // recursive work
        printDec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the last number: ");
        int n=sc.nextInt();
        printDec(n);
    }
}
