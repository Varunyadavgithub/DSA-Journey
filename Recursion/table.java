package Recursion;

/*Given a number n & a value k print k multiple of n
 n = 5 ,k = 4
 ans = 5 10 15 20 
 */
import java.util.Scanner;
public class table {
    public static void printMultiple(int n,int k){
        // base case
        if(k==0) return;
        // recursive work
        printMultiple(n, k-1);
        // self work
        System.out.print(n*k+" ");
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.print("Enter the value of k: ");
        int k=sc.nextInt();
        printMultiple(n,k);
    }
}
