package Dynamic_Programming.CoinChange;

import java.util.List;

/* Coin Change (Leetcode 322) 
 * Input:- sum=4, coins=[1,2,3]
 * Output:- 4
 * Explanation:- There are four solutions {1,1,1,1}, {1,1,2}, {2,2}, and {1,3}
 */
public class Tabulation {

    public static void main(String[] args) {
        List<Integer> coins = List.of(1, 2, 3);
        int n = coins.size();
        int totalSum = 4;

        int[][] dp = new int[n][totalSum + 1];

        // Base case: If the sum is 0, there is 1 way (by choosing nothing)
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }

        // Fill first row (only using the first coin)
        for (int i = 1; i <= totalSum; i++) {
            if (i % coins.get(0) == 0) {
                dp[0][i] = 1;
            }
        }

        // Fill the dp table
        for (int idx = 1; idx < n; idx++) {
            for (int sum = 0; sum <= totalSum; sum++) {
                int pick = 0;
                if (sum >= coins.get(idx)) {
                    pick = dp[idx][sum - coins.get(idx)];
                }

                int notPick = dp[idx - 1][sum]; // Fix: Use `idx - 1` instead of `idx + 1`
                dp[idx][sum] = pick + notPick;
            }
        }

        System.out.println("Total ways to make sum " + totalSum + " : " + dp[n - 1][totalSum]);
    }
}
