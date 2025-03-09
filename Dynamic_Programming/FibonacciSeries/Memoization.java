package Dynamic_Programming.FibonacciSeries;

public class Memoization { // T.C = O(n) and S.C = O(2n), Total no. of calls = "17"
    static int calls = 0;

    public static int fibbo(int n, int dp[]) {
        calls++;
        if (n == 1 || n == 2)
            return 1;
        if (dp[n] != -1)
            return dp[n];

        return dp[n] = fibbo(n - 1, dp) + fibbo(n - 2, dp);
    }

    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++)
            dp[i] = -1;
        System.out.println("Fibonacci(" + n + ") = " + fibbo(n, dp));
        System.out.println("Total no. of function calls (iterations): " + calls);
    }
}
