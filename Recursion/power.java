package Recursion;

import java.util.Scanner;

/*Given two numbers p & q find the value of p^q using recursion
 p^q = p*p*p*p*p*p....*p --> q times

 p=5 & q=4
 5^4 = 5*5*5*5 => 625

//  Method - 1              T.C = O(q) and S.C = O(q)
p^q = p^q-1 * p         
let, assume...
a^b * a^c = a^b+c   =>  p^q * p^1 = p^q-1+1 = p^q

// Method - 2               T.C = O(log q) 
p^q = p^q/2 * p^q/2 ;q = Even-power
p^q = p^q/2 * p^q/2 * p ;q = Odd-power
1 ;q = 0 
 */
public class power {
    //Method-1
    // public static int pow(int p, int q){
    //     // base case
    //     if(q==0) return 1;
    //     // recursive work
    //     int smallAns=pow(p, q-1);
    //     // self work
    //     int ans=smallAns*p;
    //     return ans;
    // }

    //Method-2
    public static int pow(int p, int q){
        // base case
        if(q==0) return 1;
        // recursive work
        int smallPow=pow(p,q/2);
        // self work
        if(q%2==0){     // even power
            return smallPow*smallPow;
        }
        return smallPow*smallPow*p;     //odd power
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of p: ");
        int p=sc.nextInt();
        System.out.print("Enter the value of q: ");
        int q=sc.nextInt();
        System.out.println(pow(p,q));
    }
}
