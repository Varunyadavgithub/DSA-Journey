package Recursion;

/* Find the value of factorial n 
n = 5, ans = 120
*/
import java.util.Scanner;
public class factorial {
    public static int fact(int n){
        // base case
        if(n==0) return 1;
        // recursive work
        int smallAns=fact(n-1);
        // self work
        int ans=smallAns*n;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is "+fact(n));
    }
}
