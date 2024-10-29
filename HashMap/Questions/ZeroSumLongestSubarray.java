package HashMap.Questions;

/* Given an array arr[] of length 'N' find the length of the largest subarray with sum
 * equal to '0' (GFG Largest subarray with 0 sum).
 * 
 * Input : n=8, arr={15,-2,2,-8,1,7,10,23}
 *         n=3, arr={1,2,3}
 * Output : 5 and 0
  */
import java.util.*;

public class ZeroSumLongestSubarray {
    public static int zeroSumLargestSubarray(int[] arr, int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int maxLen = 0, prefSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            if (mp.containsKey(prefSum)) {
                maxLen = Math.max(maxLen, i - mp.get(prefSum));
            } else {
                mp.put(prefSum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        int n = 8;
        System.out.println(zeroSumLargestSubarray(arr, n));
    }
}
