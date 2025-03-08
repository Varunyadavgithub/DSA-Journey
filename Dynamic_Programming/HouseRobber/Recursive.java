package Dynamic_Programming.HouseRobber;

/* House Robber (Leetcode 198) 
 * Input:- nums=[1,2,3,1]
 * Output:- 4
 * Explanation:- Rob house 1 (money=1) and then rob house 3 (money=3) total = 1+3=4
*/
public class Recursive {
    public static int rob(int[] houses, int idx) {
        if (idx == houses.length - 1)
            return houses[idx];
        if (idx >= houses.length)
            return 0;

        int pick = houses[idx] + rob(houses, idx + 2);
        int notPick = rob(houses, idx + 1);
        return Math.max(pick, notPick);
    }

    public static void main(String[] args) {
        int[] houses = { 1, 2, 3, 1 };
        System.out.println("Max Robbed Money: " + rob(houses, 0));
    }
}
