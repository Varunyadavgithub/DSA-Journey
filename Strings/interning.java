package Strings;

/* It is method of storing only one copy of each distinct string value, which must be immutable...
String str="Hello"; x700(memory address)
String gtr="Hello"; x700(memory address)
String s=new String("Hello"); z500(memory address)

String x="Mello" x600(memory address)
 */
public class interning {
    public static void main(String[] args) {
        String s="Hello";
        String x="Hello";
        x="Mello";
        System.out.println(s);  //Hello
        System.out.println(x);  //Mello
    }
}
