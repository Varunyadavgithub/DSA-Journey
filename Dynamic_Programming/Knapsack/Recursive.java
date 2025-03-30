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

public class Recursive {
    public static int rec(int idx, int w, List<Integer> profit, List<Integer> weights) {
        if (idx == 0) {
            if (weights.get(0) <= w) {
                return profit.get(0);
            } else
                return 0;
        }
        int pick = 0;
        if (w >= weights.get(idx)) {
            pick = profit.get(idx) + rec(idx - 1, w - weights.get(idx), profit, weights);
        }

        int notPick = rec(idx - 1, w, profit, weights);
        return Math.max(pick, notPick);
    }

    public static void main(String[] args) {
        List<Integer> profit = List.of(1, 2, 3);
        List<Integer> weights = List.of(4, 5, 1);
        int w = 4;
        int n = profit.size();
        System.out.println(rec(n - 1, w, profit, weights));
    }
}