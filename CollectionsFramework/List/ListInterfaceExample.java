package CollectionsFramework.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ListInterfaceExample {
    // ArrayList
    static void ArrayListExample() {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l); // 1 2 3
        System.out.println(l.get(1)); // 2
        l.set(1, 10); // modify the value at index 'i'
        System.out.println(l); // 1 10 3
        System.out.println(l.contains(10)); // true
    }

    // LinkedList
    static void LinkedListExample() {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l); // 1 2 3
        System.out.println(l.get(1)); // 2
        l.set(1, 10); // modify the value at index 'i'
        System.out.println(l); // 1 10 3
        System.out.println(l.contains(10)); // true
    }

    // Stack
    static void StackExample() {
        Stack<String> st = new Stack<>();
        st.push("pw");
        st.push("skills");
        System.out.println(st.peek()); // skills
        System.out.println(st.pop()); // skills
        System.out.println(st.peek()); // pw
        System.out.println(st.size()); // 1
        System.out.println(st.isEmpty()); // false
    }

    public static void main(String[] args) {
        ArrayListExample();
        LinkedListExample();
        StackExample();
    }
}
