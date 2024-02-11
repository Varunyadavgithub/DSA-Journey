/* WAP to sort an ArrayList of Strings in descending order */
import java.util.ArrayList;
import java.util.Collections;
public class sortArrayList {
    public static void main(String[] args) {
        ArrayList<String> s1=new ArrayList<>();
        s1.add("Hello");
        s1.add("my");
        s1.add("name");
        s1.add("is");
        s1.add("varun");
        s1.add("yadav");
        System.out.println("Original list: "+s1); //[Hello, my, name, is, varun, yadav]
        Collections.sort(s1);
        System.out.println("Sorted list: "+s1); //[Hello, is, my, name, varun, yadav]
    }
}
