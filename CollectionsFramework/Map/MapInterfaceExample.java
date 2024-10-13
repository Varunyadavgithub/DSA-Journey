package CollectionsFramework.Map;

import java.util.*;

public class MapInterfaceExample {
    // HashMap
    static void HashMapExample() {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(10, "apple");
        mp.put(5, "banana");
        mp.put(15, "cherry");
        System.out.println("HashMap: " + mp); // Unordered, example: {5=banana, 10=apple, 15=cherry}
        System.out.println(mp.get(5)); // banana
        System.out.println(mp.containsKey(20)); // false
        System.out.println(mp.containsValue("apple")); // true
        System.out.println(mp.isEmpty()); // false
        System.out.println(mp.keySet()); // [5, 10, 15]
        System.out.println(mp.values()); // [banana, apple, cherry]
    }

    // LinkedHashMap
    static void LinkedHashMapExample() {
        Map<Integer, String> linkedMp = new LinkedHashMap<>();
        linkedMp.put(30, "dog");
        linkedMp.put(20, "cat");
        linkedMp.put(40, "elephant");
        System.out.println("LinkedHashMap: " + linkedMp); // {30=dog, 20=cat, 40=elephant}
        System.out.println(linkedMp.get(20)); // cat
        System.out.println(linkedMp.containsKey(50)); // false
        System.out.println(linkedMp.containsValue("elephant")); // true
        System.out.println(linkedMp.isEmpty()); // false
        System.out.println(linkedMp.keySet()); // [30, 20, 40]
        System.out.println(linkedMp.values()); // [dog, cat, elephant]
    }

    // TreeMap
    static void TreeMapExample() {
        Map<Integer, String> treeMp = new TreeMap<>();
        treeMp.put(100, "Paris");
        treeMp.put(50, "London");
        treeMp.put(150, "New York");
        System.out.println("TreeMap: " + treeMp); // {50=London, 100=Paris, 150=New York} - Sorted by key
        System.out.println(treeMp.get(100)); // Paris
        System.out.println(treeMp.containsKey(200)); // false
        System.out.println(treeMp.containsValue("London")); // true
        System.out.println(treeMp.isEmpty()); // false
        System.out.println(treeMp.keySet()); // [50, 100, 150]
        System.out.println(treeMp.values()); // [London, Paris, New York]
    }

    public static void main(String[] args) {
        HashMapExample();
        LinkedHashMapExample();
        TreeMapExample();
    }
}
