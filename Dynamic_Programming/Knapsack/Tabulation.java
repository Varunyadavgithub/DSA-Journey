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

public class Tabulation {
    public static void main(String[] args) {
        List<Integer> profit = List.of(1, 2, 3);
        List<Integer> weights = List.of(4, 5, 1);
        int wt = 4;
        int n = profit.size();
        int[][] dp = new int[n + 1][wt + 1];
        for (int i = 0; i <= wt; i++) {
            if (weights.get(0) <= i) {
                dp[0][i] = profit.get(0);
            } else {
                dp[0][i] = 0;
            }
        }
        for (int idx = 1; idx < n; idx++) {
            for (int w = 0; w <= wt; w++) {
                int pick = -1000;
                if (w >= weights.get(idx)) {
                    pick = profit.get(idx) + dp[idx - 1][w - weights.get(idx)];
                }
                int notPick = dp[idx - 1][w];
                dp[idx][w] = Math.max(pick, notPick);
            }
        }
        System.out.println(dp[n - 1][wt]);
    }
}
