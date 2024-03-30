package RecursionOnString;
/*Remove all the occurence of 'a' from string s="abcax" */

import java.util.*;

public class removeA {

    // Method-1
    // static String removeA(String s,int idx){
    //     // Basecase
    //     if(idx==s.length()) return " ";

    //     // recursive work
    //     String smallAns=removeA(s, idx+1);
    //     char currChar=s.charAt(idx);

    //     // self work
    //     if(currChar!='a'){
    //         return currChar+smallAns;
    //     }else{
    //         return smallAns;
    //     }
    // }

    // Method-2 (without passing the index)
    static String removeA(String s){
        // Basecase
        if(s.length()==0) return " ";

        // recursive work
        String smallAns=removeA(s.substring(1));
        char currChar=s.charAt(0);

        // selfwork
        if(currChar!='a'){
            return currChar+smallAns;
        }else{
            return smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=sc.nextLine();
        // System.out.println(removeA(s,0));
        
        System.out.println(removeA(s));
    }
}
