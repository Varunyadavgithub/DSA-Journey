package Dynamic_Programming.CoinChange;

import java.util.List;

/* Coin Change (Leetcode 322) 
 * Input:- sum=4, coins=[1,2,3]
 * Output:- 4
 * Explanation:- There are four solution {1,1,1,1}, {1,1,2}, {2,2} and {1,3}
*/
public class Recursive {
    public static int rec(List<Integer> coins, int sum, int idx) {
        if (idx == 0) {
            if (sum % coins.get(idx) == 0)
                return 1;
            else
                return 0;
        }

        int pick = 0;
        if (sum >= coins.get(idx)) {
            pick = rec(coins, sum - coins.get(idx), idx);
        }

        int notPick = rec(coins, sum, idx - 1);
        return pick + notPick;
    }

    public static void main(String[] args) {
        List<Integer> coins = List.of(1, 2, 3);
        int n = coins.size();
        int sum = 4;
        System.out.println(rec(coins, sum, n - 1));
    }
}
