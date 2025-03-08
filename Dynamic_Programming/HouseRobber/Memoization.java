package Dynamic_Programming.HouseRobber;

import java.util.Arrays;

/* House Robber (Leetcode 198) 
 * Input:- nums=[1,2,3,1]
 * Output:- 4
 * Explanation:- Rob house 1 (money=1) and then rob house 3 (money=3) total = 1+3=4
*/
public class Memoization {
    public static int rob(int[] houses, int idx, int[] dp) {
        if (idx == houses.length - 1)
            return houses[idx];
        if (idx >= houses.length)
            return 0;
        if (dp[idx] != -1)
            return dp[idx];

        int pick = houses[idx] + rob(houses, idx + 2, dp);
        int notPick = rob(houses, idx + 1, dp);
        return dp[idx] = Math.max(pick, notPick);
    }

    public static void main(String[] args) {
        int[] houses = { 1, 2, 3, 1 };

        int[] dp = new int[houses.length];
        Arrays.fill(dp, -1);

        System.out.println("Max Robbed Money (Memoization): " + rob(houses, 0, dp));
    }
}
