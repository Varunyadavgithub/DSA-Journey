/*Write a program to  sort an ArrayList of Strings in descending order... */

package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original list "+list);
        Collections.reverse(list);
        System.out.println("Reverse list "+list);

        Collections.sort(list);
        System.out.println("Ascending order: "+list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending order: "+list);

        ArrayList<String> s=new ArrayList<>();
        s.add("Welcome");
        s.add("to");
        s.add("physics");
        s.add("Wallah");
        System.out.println("Original list "+s);
        Collections.sort(s);
        System.out.println("Sorted "+s);
        Collections.sort(s,Collections.reverseOrder());
        System.out.println("Reverse: "+s);
    }
}
