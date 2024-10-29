package HashMap.Questions;

/* Check whether two string is anagram of each other. Return true if they are else false.
 * An anagram of a string is another string that contains the same character, only the 
 * order of character can be different. For example "abcd" and "dabc" are an anagram of 
 * each other.
 * 
 * Input : 
 *      listen -> silent
 *      anagram -> gram
 * Output :
 *      true
 *      false
 * 
 * Some properties of anagram :-
 *  1) Length of both string is equal.
 *  2) Frequency of each character must be same.
 *  3) No character should be extra or different.
 */
import java.util.*;

public class Anagram {
    static HashMap<Character, Integer> makeFreqMap(String str) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (!mp.containsKey(ch)) {
                mp.put(ch, 1);
            } else {
                int currFreq = mp.get(ch);
                mp.put(ch, currFreq + 1);
            }
        }
        return mp;
    }

    // Approach-1
    // public static boolean isAnagram(String s, String t) {
    // if (s.length() != t.length()) {
    // return false;
    // }
    // HashMap<Character, Integer> mp1 = makeFreqMap(s);
    // HashMap<Character, Integer> mp2 = makeFreqMap(t);
    // return mp1.equals(mp2);
    // }

    // Approach-2
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> mp = makeFreqMap(s);
        for (int i = 0; i < t.length(); i++) {
            Character ch = t.charAt(i);
            if (!mp.containsKey(ch)) {
                return false;
            }
            int currFreq = mp.get(ch);
            mp.put(ch, currFreq - 1);
        }
        for (Integer i : mp.values()) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        System.out.println(isAnagram(s, t));
    }
}
