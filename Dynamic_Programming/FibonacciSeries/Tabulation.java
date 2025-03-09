package Dynamic_Programming.FibonacciSeries;

public class Tabulation { // T.C = O(n) and S.C = O(n), Total no. of calls = "8"
    public static void main(String[] args) {
        int n = 10;
        int calls = 0; 
        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            calls++; 
        }

        System.out.println("Fibonacci(" + n + ") = " + dp[n]);
        System.out.println("Total no. of function calls (iterations): " + calls);
    }
}
