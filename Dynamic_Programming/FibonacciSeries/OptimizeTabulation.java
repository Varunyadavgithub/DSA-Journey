package Dynamic_Programming.FibonacciSeries;

public class OptimizeTabulation { // T.C = O(n) and S.C = O(1), Total no. of calls = "8"
    public static void main(String[] args) {
        int n = 10;
        int calls = 0;

        int prev1 = 1;
        int prev2 = 1;
        int curr = 0;

        for (int i = 3; i <= n; i++) {
            curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
            calls++;
        }

        System.out.println("Fibonacci(" + n + ") = " + curr);
        System.out.println("Total no. of function calls (iterations): " + calls);
    }
}
