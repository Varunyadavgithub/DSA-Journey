package Strings.StringBuilder;

import java.util.Scanner;

/* Given a string 's' return the number of palindromic substring in it.
 * Input : s="abc"
 * Output : 3
*/
public class palindromicSubstring {
    static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(isPalindrome(s.substring(i,j))==true){
                    System.out.print(s.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("The number of palindromic substring are: "+count);
        sc.close();
    }
}
