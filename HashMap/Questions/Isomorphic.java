package HashMap.Questions;

/* Given two strings 's' and 't' determine if they are isomorphic. Two strings 's' and 't'
 * are isomorphic if the characters in 's' can be replaces to get 't'. All occurencess of a 
 * character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 * 
 * Input :
 *      aab -> xxy
 *      abcdec -> viouog
 * Output :
 *      true
 *      false
 * 
 *  Some properties of isomorphic :-
 *  1) Length of both string are same.
 *  2) Consistant maping of each character.
 *  3) No two character may map a single character/same character.
 */
import java.util.*;

public class Isomorphic {
    // Approach-1
    // public static boolean isIsomorphic(String s, String t) {
    //     if (s.length() != t.length()) {
    //         return false;
    //     }
    //     HashMap<Character, Character> mp = new HashMap<>();
    //     for (int i = 0; i < s.length(); i++) {
    //         Character sch = s.charAt(i);
    //         Character tch = t.charAt(i);
    //         if (mp.containsKey(sch)) {
    //             if (mp.get(sch) != tch) {
    //                 return false;
    //             }
    //         } else if (mp.containsKey(tch)) {
    //             return false;
    //         } else {
    //             mp.put(sch, tch);
    //         }
    //     }
    //     return true;
    // }

    // Approach-2
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mp = new HashMap<>();
        HashSet<Character> st = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            Character sch = s.charAt(i);
            Character tch = t.charAt(i);
            if (mp.containsKey(sch)) {
                if (mp.get(sch) != tch) {
                    return false;
                }
            } else if (st.add(tch)) {
                return false;
            } else {
                mp.put(sch, tch);
                st.add(tch);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aab";
        String t = "xxy";
        System.out.println(isIsomorphic(s, t));
    }
}
