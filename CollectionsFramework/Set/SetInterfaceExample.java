package CollectionsFramework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterfaceExample {

    // HashSet
    static void HashSetExample() {
        HashSet<Integer> st = new HashSet<>();
        st.add(10);
        st.add(20);
        st.add(30);
        System.out.println("HashSet: " + st); // Unordered output, example: [20, 10, 30]
        st.add(10);
        st.add(30);
        System.out.println("HashSet after adding duplicates: " + st); // No duplicates, unordered: [20, 10, 30]
        st.remove(20);
        System.out.println("HashSet contains 20: " + st.contains(20)); // false
        System.out.println("HashSet size: " + st.size()); // 2
    }

    // LinkedHashSet
    static void LinkedHashSetExample() {
        LinkedHashSet<String> lt = new LinkedHashSet<>();
        lt.add("Ford");
        lt.add("Tesla");
        lt.add("BMW");
        System.out.println("LinkedHashSet: " + lt); // Maintains insertion order: [Ford, Tesla, BMW]
        lt.add("Ford");
        lt.add("BMW");
        System.out.println("LinkedHashSet after adding duplicates: " + lt); // No duplicates, same insertion order:
                                                                            // [Ford, Tesla, BMW]
        lt.remove("Tesla");
        System.out.println("LinkedHashSet contains 'Tesla': " + lt.contains("Tesla")); // false
        System.out.println("LinkedHashSet size: " + lt.size()); // 2
    }

    // TreeSet
    static void TreeSetExample() {
        TreeSet<Double> tt = new TreeSet<>();
        tt.add(9.5);
        tt.add(7.3);
        tt.add(12.4);
        System.out.println("TreeSet: " + tt); // Sorted output: [7.3, 9.5, 12.4]
        tt.add(9.5);
        tt.add(12.4);
        System.out.println("TreeSet after adding duplicates: " + tt); // No duplicates, sorted: [7.3, 9.5, 12.4]
        tt.remove(7.3);
        System.out.println("TreeSet contains 7.3: " + tt.contains(7.3)); // false
        System.out.println("TreeSet size: " + tt.size()); // 2
    }

    public static void main(String[] args) {
        HashSetExample();
        LinkedHashSetExample();
        TreeSetExample();
    }
}
