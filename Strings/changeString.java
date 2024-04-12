package Strings;

public class changeString {
    public static void main(String[] args) {
        String s="Hello";   //change it into "Heylo"
        s=s.substring(0,2)+'y'+s.substring(3);
        System.out.print("After changing the stirng: "+s);
    }
}

/* Note : Thie is not good way to do this code, there are many performance issues,
So that's why we are using StringBuilder. */