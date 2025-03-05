package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.List;

/* Largest Palindromic Number by permuting digits. (GFG) 
 * Input:- 313551
 * Output:- 531135
*/

public class LargestPalindromicNumber {
    public static boolean validate(List<Integer> freq) {
        boolean isOdd = false;
        for (int i = 0; i < freq.size(); i++) {
            if (freq.get(i) % 2 != 0) {
                if (isOdd == true) {
                    return false;
                }
                isOdd = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String num = "313551";
        List<Integer> freq = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            freq.add(0);
        int n = num.length();
        for (int i = 0; i < n; i++) {
            int digit = num.charAt(i) - '0';
            freq.set(digit, freq.get(digit) + 1);
        }
        if (!validate(freq)) {
            System.out.println("Palindrome Not Possible.");
            return;
        }
        String firstHalf = "";
        for (int i = 9; i >= 0; i--) {
            while (freq.get(i) > 1) {
                firstHalf += i;
                freq.set(i, freq.get(i) - 2);
            }
        }
        StringBuilder sb = new StringBuilder(firstHalf);
        sb.reverse();
        String secondHalf = sb.toString();
        for (int i = 9; i >= 0; i--) {
            if (freq.get(i) == 1) {
                firstHalf += i;
            }
        }
        String res = firstHalf + secondHalf;
        System.out.println(res);
    }
}
