package Strings.StringBuilder;

import java.util.Scanner;

/* Java program to reverse each word in string.
 * Input : "I am an educator"
 * Output : "I ma na rotacude"
 */
public class reverseWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s=sc.nextLine();
        String ans="";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }else{
                sb.reverse();
                ans+=sb;
                ans+=" ";
                sb=new StringBuilder("");
            }
        }
        sb.reverse();
        ans+=sb;
        System.out.print("After reversing each word of string: "+ans);
        sc.close();
    }
}
