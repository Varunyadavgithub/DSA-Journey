package Strings.StringBuilder;

import java.util.Scanner;

/*Given a string, the task is to toggle all the characters of the string i.e to 
 * convert upper case to lower case.
 * Input : PhysICS
 * Output : pHYSics
  */
public class toggleString {
    public static void main(String[] args) {
        // Method-1 using StringBuilder (good approach)
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        StringBuilder str=new StringBuilder(sc.nextLine());
        //toggle
        //PHysiCs -> phYSIcS
        for(int i=0;i<str.length();i++){
            boolean flag=true; // that means character is in Capital case
            char ch=str.charAt(i);
            int asci=(int) ch;
            if(asci>=97) flag=false;    //that means character is in Lower case

            if(flag==true){ //toggle into Capital case
                asci+=32;
                char dh=(char)asci;
                str.setCharAt(i, dh);
            }else{  //toggle into Lower case
                asci-=32;
                char dh=(char)asci;
                str.setCharAt(i, dh);
            }
        }
        System.out.println("After toggle a string: "+str);
        sc.close();

        // Method-2 using substring (not a good approach)

    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("Enter the String: ");
    //     String str=sc.nextLine();
    //     //toggle
    //     //PHysiCs -> phYSIcS
    //     for(int i=0;i<str.length();i++){
    //         boolean flag=true; // that means character is in Capital case
    //         char ch=str.charAt(i);
    //         if(ch==' ') continue;
    //         int asci=(int) ch;
    //         if(asci>=97) flag=false;    //that means character is in Lower case

    //         if(flag==true){ //toggle into Capital case
    //             asci+=32;
    //             char dh=(char)asci;
    //             str=str.substring(0,i)+dh+str.substring(i+1);
    //         }else{  //toggle into Lower case
    //             asci-=32;
    //             char dh=(char)asci;
    //             str=str.substring(0,i)+dh+str.substring(i+1);
    //         }
    //     }
    //     System.out.println("After toggle a string: "+str);
    }
}
