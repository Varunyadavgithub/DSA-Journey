package RecursionOnString;
// Input a string and print it using recursion

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Taking input of string 
        System.out.print("Enter any string: ");
        String s=sc.nextLine();
        System.out.println("The string is: "+s);

        // Print first character of Input string
        char ch=s.charAt(0);
        System.out.println("The first character of string is: "+ch);

        // Print the whole string
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
        // Print the subString of the string from index 2 to end of string
        System.out.println(s.substring(2));

        // Print the subString of the string from index 2 to 4
        System.out.println(s.substring(2,4));
    }
}
