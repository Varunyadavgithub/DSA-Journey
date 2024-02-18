package Recursion;
import java.util.Scanner;
public class lcmOfTwoNumber {
    public static int gcd(int x,int y){
        if(y==0) return x;
        return gcd(y,x%y);
    }
    public static int lcm(int x,int y){
        return (x*y)/gcd(x,y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Entere the value of x: ");
        int x = sc.nextInt();
        System.out.print("Entere the value of y: ");
        int y = sc.nextInt();
        System.out.print("The GCD of "+x+" and "+y+" is: "+lcm(x, y));
    }
}
