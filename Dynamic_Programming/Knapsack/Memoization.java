package Dynamic_Programming.Knapsack;

import java.util.List;

/* Knapsack Problem (GFG) 
 * Input:- N=3, W=4, profit[]={1,2,3}, weight[]={4,5,1}
 * Output:- 3
 * Explanation:- There are two items which have weight less than or equal to 4. If we select the item with weight 4, 
 *               the possible profits 1. And if we select the item with weight 1, the possible profit is 3. So the maximum
 *               possible profit is 3.
 *               Note that we can not put both the items with weight 4 and 1 together as the capacity of the bage is 4.
*/

public class Memoization {
    public static int memo(int idx, int w, List<Integer> profit, List<Integer> weights, int[][] dp) {
        if (idx == 0) {
            if (weights.get(0) <= w) {
                return profit.get(0);
            } else
                return 0;
        }
        if (dp[idx][w] != -1) {
            return dp[idx][w];
        }
        int pick = 0;
        if (w >= weights.get(idx)) {
            pick = profit.get(idx) + memo(idx - 1, w - weights.get(idx), profit, weights,dp);
        }

        int notPick = memo(idx - 1, w, profit, weights,dp);
        return Math.max(pick, notPick);
    }

    public static void main(String[] args) {
        List<Integer> profit = List.of(1, 2, 3);
        List<Integer> weights = List.of(4, 5, 1);
        int w = 4;
        int n = profit.size();
        int[][] dp = new int[n + 1][w + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(memo(n - 1, w, profit, weights, dp));
    }
}
