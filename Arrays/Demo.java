package ArrayList;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        // Wrapper Class
        Integer x = Integer.valueOf(4);
        System.out.println(x);

        // Syntax of ArrayList
        ArrayList<Integer> l1 = new ArrayList<>();

        // add new elements
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // get an element at index i
        System.out.println(l1.get(0));

        // print with for loop
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        //printing the arrayList directly(without using loop)
        System.out.println(l1);

        //adding elements at some index i
        l1.add(1,100);
        System.out.println(l1);
        
        //modifying element at index i
        l1.set(1,10);

        //removing an element at index i
        l1.remove(1);

        //remove the element e (we don't know its index)
        l1.remove(Integer.valueOf(7));

        //checking if an element exists or not
        boolean ans=l1.contains(Integer.valueOf(60));
        System.out.println(ans);
        
        //if you don't specify class, you can put anything inside l
        ArrayList l=new ArrayList(); 
        l.add("pqrs");
        l.add(1);
        l.add(true);
        System.out.println(l);
    }
}
