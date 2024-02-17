package Recursion;

/*Given an integer, find out the sum of its digits using recursion 
 N = 1234, ans =10
 Hint : 
 last digit = n%10
 first(n-1) digit = n/10
*/
import java.util.Scanner;
public class sumOfDigits {
    public static int sum(int n){
        // base case
        if(n>=0 && n<=9) return n;
        // recursive work
        int smallAns=sum(n/10);
        // self work
        int ans=smallAns+n%10;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
}
