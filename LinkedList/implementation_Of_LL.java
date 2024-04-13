package LinkedList;

import java.util.LinkedList;

/* For proper implementation of LinkedList we are using inbuild class in java.
 *
 * NOTE :- If you want to Know how the inbuild functions are working then See in Implementation
 *         folder, where you see the code of all LinkedList inbuild functions like (add, insert, remove, size, etc).
 */
public class implementation_Of_LL {

    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("Apple");
        ll.add("Banana");
        ll.add("Orange");

        // Displaying the LinkedList
        System.out.println("LinkedList: " + ll);

        // Adding an element at a specific index
        ll.add(1, "Grapes");
        System.out.println("After adding Grapes at index 1: " + ll);

        // Removing an element
        ll.remove("Banana");
        System.out.println("After removing Banana: " + ll);

        // Getting the size of the LinkedList
        System.out.println("Size of the LinkedList: " + ll.size());

        // Checking if an element is present
        System.out.println("Is Apple present? " + ll.contains("Apple"));

        // Getting an element at a specific index
        System.out.println("Element at index 2: " + ll.get(2));

        // Removing all elements from the LinkedList
        ll.clear();
        System.out.println("After clearing the LinkedList: " + ll);
    }
}
