package Strings;

/* Strings are immutable that means we can not change the vale of given string...
String s="Hello";
s.charAt(0)='D'; //Not possible b/c string are immutable...

but
s="Dello" 
 */

//Use your brain and change the given String...

public class immutability {
    public static void main(String[] args) {
        String s="Hello";   //change in -> "Heylo"
        s=s.substring(0, 2)+'y'+s.substring(3);
        System.out.println(s);
    }
}
