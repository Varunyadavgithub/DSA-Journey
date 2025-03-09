package Dynamic_Programming.CoinChange;

/* Coin Change (Leetcode 322) 
 * Input:- sum=4, coins=[1,2,3]
 * Output:- 4
 * Explanation:- There are four solution {1,1,1,1}, {1,1,2}, {2,2} and {1,3}
*/
import java.util.List;

public class Memoization {
    public static int memo(List<Integer> coins, int sum, int idx, int[][] dp) {
        if (idx == 0) {
            if (sum % coins.get(idx) == 0)
                return 1;
            else
                return 0;
        }

        if (dp[idx][sum] != -1)
            return dp[idx][sum];
            
        int pick = 0;
        if (sum >= coins.get(idx)) {
            pick = memo(coins, sum - coins.get(idx), idx, dp);
        }

        int notPick = memo(coins, sum, idx - 1, dp);
        return dp[idx][sum] = pick + notPick;
    }

    public static void main(String[] args) {
        List<Integer> coins = List.of(1, 2, 3);
        int n = coins.size();
        int sum = 4;
        int[][] dp = new int[n + 1][sum + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= sum; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(memo(coins, sum, n - 1, dp));
    }
}
