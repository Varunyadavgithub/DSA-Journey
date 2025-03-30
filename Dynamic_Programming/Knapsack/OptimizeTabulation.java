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

public class OptimizeTabulation {
    public static void main(String[] args) {
        List<Integer> profit = List.of(1, 2, 3);
        List<Integer> weights = List.of(4, 5, 1);
        int wt = 4;
        int n = profit.size();
        int[] prev = new int[wt + 1];
        int[] curr = new int[wt + 1];
        for (int i = 0; i <= wt; i++) {
            curr[i] = 0;
            if (weights.get(0) <= i) {
                prev[i] = profit.get(0);
            } else {
                prev[i] = 0;
            }
        }
        for (int idx = 0; idx < n; idx++) {
            for (int w = 0; w <= wt; w++) {
                int pick = -1000;
                if (w >= weights.get(idx)) {
                    pick = profit.get(idx) + prev[w - weights.get(idx)];
                }
                int notPick = prev[w];
                curr[w] = Math.max(pick, notPick);
            }
            System.arraycopy(curr, 0, prev, 0, wt + 1);
        }
        System.out.println(prev[wt]);
    }
}
