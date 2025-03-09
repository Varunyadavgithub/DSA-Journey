package Dynamic_Programming.HouseRobber;

/* House Robber (Leetcode 198) 
 * Input:- nums=[1,2,3,1]
 * Output:- 4
 * Explanation:- Rob house 1 (money=1) and then rob house 3 (money=3) total = 1+3=4
*/
public class OptimizeTabulation {

    public static int rob(int[] houses) {
        int n = houses.length;
        if (n == 0)
            return 0;
        if (n == 1)
            return houses[0];

        int prev2 = houses[0]; // Stores dp[i-2]
        int prev1 = Math.max(houses[0], houses[1]); // Stores dp[i-1]

        for (int i = 2; i < n; i++) {
            int curr = Math.max(houses[i] + prev2, prev1); // Max of picking or not picking the house
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1; // Max money robbed
    }

    public static void main(String[] args) {
        int[] houses = { 1, 2, 3, 1 };
        System.out.println("Max Robbed Money (Optimized Tabulation): " + rob(houses));
    }
}
