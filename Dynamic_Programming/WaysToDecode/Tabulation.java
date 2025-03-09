package Dynamic_Programming.WaysToDecode;

/* Ways to Decode (Leetcode 91)
 * Input:- s="12"
 * Output:- 2
 * Explanation:- "12" could be decoded as "AB"(1 2) or "L" (12)
 */
public class Tabulation {
    public static int numDecodings(String num) {
        int n = num.length();
        if (n == 0 || num.charAt(0) == '0')
            return 0; // If empty or starts with '0', no decoding possible

        int[] dp = new int[n + 1]; // dp[i] represents ways to decode up to index i-1
        dp[0] = 1; // Base case: an empty string has one way to decode
        dp[1] = num.charAt(0) != '0' ? 1 : 0; // If first character is '0', no decoding possible

        for (int i = 2; i <= n; i++) {
            // Single-digit decoding (valid if num[i-1] != '0')
            if (num.charAt(i - 1) != '0') {
                dp[i] += dp[i - 1];
            }

            // Two-digit decoding (valid if num[i-2] and num[i-1] form a number between 10
            // and 26)
            int twoDigit = Integer.parseInt(num.substring(i - 2, i));
            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n]; // Total number of ways to decode the full string
    }

    public static void main(String[] args) {
        String num = "11126";
        System.out.println("Total number of ways (Tabulation): " + numDecodings(num));
    }
}
