package Recursion;

/*WAP to find nth fibonacci number...
 0 1 1 2 3 5 8 13...
 */
import java.util.Scanner;
public class fibonacci {
    public static int fibo(int n){
        // base case
        if(n==0 || n==1) return n;
        // recursive work
        int prev=fibo(n-1);
        int prevPrev=fibo(n-2);
        // self work
        int ans=prev+prevPrev;
        return ans;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the nth term: ");
        int n=sc.nextInt();
        System.out.println(fibo(n));
    }
}
