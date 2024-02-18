package Recursion;


/*Given Two numbers x & y find the greatest comman divisor (GCD/HCF) of x & y
x = 4, y = 9
ans = 1

x = 24, y = 15
ans = 3
*/
import java.util.Scanner;
public class gcd {
    // Method - 1
    // public static int gcd(int x,int y){
    //     int min=Math.min(x, y);
    //     int ans=0;
    //     for(int i=min;i>=1;i--){
    //         if(x%i==0 && y%i==0){
    //             ans=i;
    //             break;
    //         }
    //     }
    //     return ans;
    // }

    // Method - 2 (long division method)
    // public static int gcd(int x,int y){
    //     while(x%y!=0){
    //         int rem=x%y;
    //         x=y;
    //         y=rem;
    //     }
    //     return y;
    // }

    // Method - 3 (Euclid's division method)
    public static int gcd(int x,int y){
        // base case
        if(y==0) return x;
        // recursive work
        return gcd(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Entere the value of x: ");
        int x = sc.nextInt();
        System.out.print("Entere the value of y: ");
        int y = sc.nextInt();
        System.out.print("The GCD of "+x+" and "+y+" is: "+gcd(x, y));
    }
}
