package RecursionOnString;
/*Write a program to check given string is palindrome or not */

import java.util.*;

public class palindromeString {
    // Method-1     T.C = O(n^2)
    // static String reverse(String s,int idx){
    //     if(idx==s.length()) return "";
    //     String smallAns=reverse(s, idx+1);
    //     return smallAns+s.charAt(idx);
    // }

    // Method-2 (without using reverse method)  T.C = O(n)
        static boolean isPalindrome(String s,int l,int r){
            if(l>r) return true;
            return (s.charAt(l)==s.charAt(r) && isPalindrome(s, l+1, r-1));
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s=sc.nextLine();
        // String rev=reverse(s,0);
        // if(rev.equals(s)){
        //     System.out.printf("%s is palindrome",s);
        // }
        // else{
        //     System.out.printf("%s is not a palindrome",s);
        // }

        System.out.println(isPalindrome(s,0,s.length()-1));
    }
}
