package Recursion;

/* Return the count of digits in a given number
 N = 5683, ans = 4
 */
import java.util.Scanner;
public class countOfDigits {
    public static int count(int n){
        // base case
        if(n>=0 && n<=9) return 1;
        // recursive work
        int smallAns=count(n/10);
        // self work
        int ans=smallAns+1;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.println(count(n));
    }
}
