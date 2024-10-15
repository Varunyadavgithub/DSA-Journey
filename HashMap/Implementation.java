package HashMap;

/* Implement your own HashMap with the following methods
 * 1) put(key,value)
 *    Returns void
 *    Inserts/Updates
 * 2) get(key)
 *    Returns value corresponding to key if it exist.
 *    Return null if key doesn't exist.
 * 3) Size
 *    Returns the number of entries in HashMap.
 * 4) remove(key)
 *    Removes an entry with key 'key' from the HashMap
 *    Returns null or value
 * Both keys and values can be of any type.
 */
import java.util.*;

public class Implementation {
    static class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // No. of enteries in map
        private LinkedList<Node>[] buckets;

        private void initBuckets(int N) {
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int HashFunc(K key) {
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }

        private int searchInBucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        public int capacity() {
            return buckets.length;
        }

        public float load() {
            return (n * 1.0f) / buckets.length;
        }

        // Rehashing function
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length * 2);
            n = 0;
            for (var bucket : oldBuckets) {
                for (var node : bucket) {
                    put(node.key, node.value);
                }
            }
        }

        public int size() {
            return n;
        }

        public void put(K key, V value) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei == -1) { // key doesn't exist we insert new node
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            } else {
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }
            if (n >= buckets.length * DEFAULT_LOAD_FACTOR) {
                rehash();
            }
        }

        public V get(K key){
            int bi=HashFunc(key);
            LinkedList<Node> currBucket=buckets[bi];
            int ei=searchInBucket(currBucket, key);
            if (ei!=-1) {
                Node currNode=currBucket.get(ei);
                return currNode.value;
            }
            return null;
        }

        public V remove(K key){
            int bi=HashFunc(key);
            LinkedList<Node> currBucket=buckets[bi];
            int ei=searchInBucket(currBucket, key);
            if (ei!=-1) {
                Node currNode=currBucket.get(ei);
                V val=currNode.value;
                currBucket.remove();
                n--;
                return val;
            }
            return null;
        }
    }
    public static void main(String[] args) {
        MyHashMap<String,Integer> mp=new MyHashMap<>();
        mp.put("a",1);
        mp.put("b",2);
        System.out.println("Capacity: "+mp.capacity()); //4
        System.out.println("Load: "+mp.load()); //0.5
        mp.put("c",3);
        mp.put("d",61);
        mp.put("e",71);
        System.out.println("Size is: "+mp.size()); //5
        mp.put("c",30);
        System.out.println("Size is: "+mp.size()); //5
        System.out.println(mp.get("a")); //1
        System.out.println(mp.get("b")); //2
        System.out.println(mp.get("c")); //30
        System.out.println(mp.get("college")); //null
        System.out.println(mp.get("d")); //61
        System.out.println(mp.get("e")); //71

        System.out.println(mp.remove("c")); //30
        System.out.println(mp.remove("c")); //null
        System.out.println("Size is: "+mp.size()); //4

        System.out.println("Capacity: "+mp.capacity()); //8
        System.out.println("Load: "+mp.load()); //0.5
    }
}
