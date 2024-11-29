package ArraayList;

import java.util.ArrayList;

public class intro {
    public static void main(String[] args) {
        // Wrapper class
        Integer num = Integer.valueOf(4);
        System.out.println(num); // 4

        // Syntax of ArrayList
        ArrayList<Integer> l1 = new ArrayList<>();

        // add new elements in ArrayList
        l1.add(5);
        l1.add(4);
        l1.add(3);
        l1.add(2);
        l1.add(1);

        // get an elements at index i
        System.out.println(l1.get(2)); // 3

        // print elements of ArrayList using loop
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " "); // 5 4 3 2 1
        }
        System.out.println();

        // print elements of ArrayList without using loop
        System.out.println(l1); // this will return in square braket [5 4 3 2 1]

        // adding elements at some index 'i'
        l1.add(1, 100);
        System.out.println(l1); // [5 100 4 3 2 1]

        // modifing elements at index 'i'
        l1.set(0, 50);
        System.out.println(l1); // [50 100 4 3 2 1]

        // remove elements at index 'i'
        l1.remove(0); // remove 0th index value
        System.out.println(l1); // [100 4 3 2 1]

        // remove elements 'e' without knowing index
        l1.remove(Integer.valueOf(100));
        System.out.println(l1); // [4 3 2 1]

        // Check if element is exists or not
        boolean ans = l1.contains((Integer.valueOf(4)));
        System.out.println(ans); // true

        /*
         * Note :- ArrayList can hold both homogeneous & hetrogeneous data
         * elements means if we don't specify the class then we can put
         * any type of value(char,int,etc) inside the ArrayList.
         */

        ArrayList l = new ArrayList<>();
        l.add("varun yadav");
        l.add(1);
        l.add(true);
        System.out.println(l); // [varun yadav, 1, true]
    }
}
