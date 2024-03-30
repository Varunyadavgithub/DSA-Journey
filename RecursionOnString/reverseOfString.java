package RecursionOnString;
/*Write a program to print reverse of a string using recursion */

import java.util.Scanner;

public class reverseOfString {
    static String reverse(String s,int idx){
        // Basecase
        if(idx==s.length()) return "";
        // recursive work
        String smallAns=reverse(s, idx+1);
        // selfwork
        return smallAns+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s=sc.nextLine();
        System.out.print(reverse(s,0));
    }
}
