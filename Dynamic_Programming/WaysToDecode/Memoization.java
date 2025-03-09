package Dynamic_Programming.WaysToDecode;

import java.util.Arrays;

/* Ways to Decode (Leetcode 91)
 * Input:- s="12"
 * Output:- 2
 * Explanation:- "12" could be decoded as "AB"(1 2) or "L" (12)
 */
public class Memoization {
    public static int no_of_ways(String num, int idx, int[] dp) {
        if (idx <= 0)
            return 1;
        if (dp[idx] != -1)
            return dp[idx];

        int not_combine = 0;
        if (num.charAt(idx) != '0') {
            not_combine = no_of_ways(num, idx - 1, dp);
        }
        int combine = 0;
        if (num.charAt(idx - 1) == '1' || (num.charAt(idx - 1) == '2' && num.charAt(idx) <= '6')) {
            combine = no_of_ways(num, idx - 2, dp);
        }
        return dp[idx] = not_combine + combine;
    }

    public static void main(String[] args) {
        String num = "11126";
        int n = num.length();
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        System.out.println("Total number of ways are (Memoization): " + no_of_ways(num, n - 1, dp));
    }
}
