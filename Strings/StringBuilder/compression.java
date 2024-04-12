package Strings.StringBuilder;

import java.util.Scanner;

/* The string should be compressed such that consecutive duplicates of 
 * character are replaced with the character and followed by the number
 * of consecutive duplicates.
 * 
 * Input : aaabbbbccddde
 * Output : a3b4c2d3e
 */
public class compression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s=sc.nextLine();
        String ans=" "+s.charAt(0);
        int count=1;
        for(int i=1;i<s.length();i++){
            char curr=s.charAt(i);
            char prev=s.charAt(i-1);
            if(curr==prev){
                count++;
            }else{
                // ans+=count;  //a3b4c2d3e1
                if(count>1) ans+=count; //we don't need to print 1  (a3b4c2d3e)
                count=1;
                ans+=curr;
            }
        }
        // ans+=count;
        if(count>1) ans+=count;
        System.out.print("After compress the string: "+ans);
    }
}
