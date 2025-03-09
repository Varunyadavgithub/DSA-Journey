package Dynamic_Programming.HouseRobber;

/* House Robber (Leetcode 198) 
 * Input:- nums=[1,2,3,1]
 * Output:- 4
 * Explanation:- Rob house 1 (money=1) and then rob house 3 (money=3) total = 1+3=4
*/
public class Tabulation {
    public static int rob(int[] houses) {
        int n = houses.length;
        if (n == 0)
            return 0;
        if (n == 1)
            return houses[0];

        int[] dp = new int[n];

        // Base Cases
        dp[0] = houses[0];
        dp[1] = Math.max(houses[0], houses[1]);

        // Fill dp array
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(houses[i] + dp[i - 2], dp[i - 1]);
        }

        return dp[n - 1]; // Max money robbed
    }

    public static void main(String[] args) {
        int[] houses = { 1, 2, 3, 1 };
        System.out.println("Max Robbed Money (Tabulation): " + rob(houses));
    }
}
