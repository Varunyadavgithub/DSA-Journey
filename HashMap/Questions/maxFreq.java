package HashMap.Questions;

import java.util.HashMap;
import java.util.Map;

/* Given an array, find the most frequent element in it. If there are muitiple elements
 * that appear a maximum number of times, print any one of them. 
 */
public class maxFreq {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 5, 1, 4, 4, 6, 4, 4, 4 };
        Map<Integer, Integer> freq = new HashMap<>();
        for (int elm : arr) {
            if (!freq.containsKey(elm)) {
                freq.put(elm, 1);
            } else {
                freq.put(elm, freq.get(elm) + 1);
            }
        }
        System.out.println("Frequency Maps:");
        System.out.println(freq.entrySet());

        int maxFreq = 0;
        int ansKey = -1;
        for (var e : freq.entrySet()) {
            if (e.getValue() > maxFreq) {
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        System.out.println(ansKey);
    }
}
