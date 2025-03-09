package Dynamic_Programming.CoinChange;

import java.util.List;

/* Coin Change (Leetcode 322) 
 * Input:- sum=4, coins=[1,2,3]
 * Output:- 4
 * Explanation:- There are four solution {1,1,1,1}, {1,1,2}, {2,2} and {1,3}
*/
public class OptimizeTabulation {
    public static int coinChangeWays(List<Integer> coins, int totalSum) {
        int[] dp = new int[totalSum + 1];

        dp[0] = 1; // Base case: 1 way to make sum = 0

        for (int coin : coins) {
            for (int sum = coin; sum <= totalSum; sum++) {
                dp[sum] += dp[sum - coin];
            }
        }

        return dp[totalSum];
    }

    public static void main(String[] args) {
        List<Integer> coins = List.of(1, 2, 3);
        int totalSum = 4;
        System.out.println("Total ways to make sum " + totalSum + " : " + coinChangeWays(coins, totalSum));
    }

}
