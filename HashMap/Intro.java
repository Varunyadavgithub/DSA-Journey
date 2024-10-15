package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Intro {
    static void HashMapMethods() {
        // Syntax
        Map<String, Integer> mp = new HashMap<>();
        // HashMap<String,Integer> mp=new HashMap<>();

        // Adding element
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);

        // Getting value of a key from the HashMap
        System.out.println(mp.get("Yash")); // 16
        System.out.println(mp.get("Rahul")); // null

        // Changing/uploading value of a key in the hashmap
        mp.put("Akash", 25);
        System.out.println(mp.get("Akash")); // 25

        // Removing a pair from the HashMap
        System.out.println(mp.remove("Akash")); // 25
        System.out.println(mp.remove("riya")); // null

        // Checking if a key is in the Hashmap
        System.out.println(mp.containsKey("Akash")); // false
        System.out.println(mp.containsKey("Yash")); // true

        // Adding a new entry only if the new key does't exist already
        // if (!mp.containsKey("Yash")) {
        // mp.put("Yash", 30);
        // }
        mp.putIfAbsent("Yash", 30); // will not enter
        mp.putIfAbsent("Yashika", 30); // will enter

        // Get all keys in the hashmap
        System.out.println(mp.keySet()); //[Lav, Rishika, Yash, Harry, Yashika]

        // Get all values in the hashmap
        System.out.println(mp.values()); //[17, 19, 16, 18, 30]

        // Get all entries in the hashmap
        System.out.println(mp.entrySet()); //[Lav=17, Rishika=19, Yash=16, Harry=18, Yashika=30]

        // Traversing all entries of hashmap - multiple methods
        // method - 1
        for (String key : mp.keySet()) {
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        // method - 2
        for (Map.Entry<String, Integer> e : mp.entrySet()) {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
        // method - 3
        for (var e : mp.entrySet()) {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapMethods();
    }
}
