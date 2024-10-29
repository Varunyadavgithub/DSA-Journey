package HashSet.Questions;

/* Given an unsorted array of integers nums, return the length of the longest
* consecutive elements sequence. (Leetcode-128).
* 
* Input : n=6, nums={100,4,200,1,3,2}
*         n=10, nums={0,3,7,2,5,8,4,6,0,1}
* output : 4 and 9
*/
import java.util.*;

public class LongestConsecutiveSequence {
    public static int LongestConsecutiveSequence(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for (int num : nums) {
            st.add(num);
        }
        int maxStreak = 0;
        for (int num : st) {
            if (!st.contains(num - 1)) {
                int currNum = num;
                int currStreak = 1;
                while (st.contains(currNum + 1)) {
                    currStreak++;
                    currNum++;
                }
                maxStreak = Math.max(currStreak, maxStreak);
            }
        }
        return maxStreak;
    }

    public static void main(String[] args) {
        int[] arr = { 100, 4, 200, 1, 3, 2 };
        System.out.println(LongestConsecutiveSequence(arr));
    }
}
