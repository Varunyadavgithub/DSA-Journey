package Strings.StringBuilder;

public class demo {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Hello");
        System.out.println(str);    //Hello
        
        str.setCharAt(0, 'M'); 
        System.out.println(str);    //Mello

        str.append(10);
        System.out.println(str);    //Mello10

        str.replace(1,3,"Java");
        System.out.println(str);    //MJavalo10

        str.insert(2, 'y');
        System.out.println(str);    //MJyavalo10

        str.deleteCharAt(0);
        System.out.println(str);    //Jyavalo10

        str.reverse();
        System.out.println(str);    //01olavayJ

        str.delete(2, 4);
        System.out.println(str);    //01avayJ
    }
}
