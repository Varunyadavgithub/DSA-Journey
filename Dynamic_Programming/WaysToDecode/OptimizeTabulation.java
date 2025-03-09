package Dynamic_Programming.WaysToDecode;

/* Ways to Decode (Leetcode 91)
 * Input:- s="12"
 * Output:- 2
 * Explanation:- "12" could be decoded as "AB"(1 2) or "L" (12)
 */
public class OptimizeTabulation {
    public static int numDecodingsOptimized(String num) {
        int n = num.length();
        if (n == 0 || num.charAt(0) == '0')
            return 0;

        int prev2 = 1; // dp[i-2] (initially for empty string)
        int prev1 = num.charAt(0) != '0' ? 1 : 0; // dp[i-1]

        for (int i = 2; i <= n; i++) {
            int current = 0;
            if (num.charAt(i - 1) != '0') {
                current += prev1;
            }
            int twoDigit = Integer.parseInt(num.substring(i - 2, i));
            if (twoDigit >= 10 && twoDigit <= 26) {
                current += prev2;
            }
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {
        String num = "11126";
        System.out.println("Total number of ways : " + numDecodingsOptimized(num));
    }
}
