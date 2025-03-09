package Dynamic_Programming.WaysToDecode;

/* Ways to Decode (Leetcode 91)
 * Input:- s="12"
 * Output:- 2
 * Explanation:- "12" could be decoded as "AB"(1 2) or "L" (12)
 */
public class Recursive {
    public static int no_of_ways(String num, int idx) {
        // Base case: If we've processed the entire string successfully
        if (idx <= 0)
            return 1;

        // If the current digit is '0', it's not a valid encoding
        if (num.charAt(idx) == '0')
            return 0;

        // Option 1: Consider the single-digit decoding
        int not_combine = no_of_ways(num, idx - 1);

        // Option 2: Consider the two-digit decoding if it's valid (10 to 26)
        int combine = 0;
        if (num.charAt(idx - 1) == '1' || (num.charAt(idx - 1) == '2' && num.charAt(idx) <= '6')) {
            combine = no_of_ways(num, idx - 2);
        }

        // Return the sum of both possibilities
        return not_combine + combine;
    }

    public static void main(String[] args) {
        String num = "11126";
        int n = num.length();
        System.out.println("Total number of ways are (Recursive): " + no_of_ways(num, n - 1));
    }
}
