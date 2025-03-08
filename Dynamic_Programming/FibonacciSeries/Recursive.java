package Dynamic_Programming.FibonacciSeries;

public class Recursive { // T.C = O(2^n) and S.C = O(n), Total no. of calls = "15"
    static int calls = 0;

    public static int fibbo(int n) {
        calls++;
        if (n == 1 || n == 0)
            return 1;
        return fibbo(n - 1) + fibbo(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibbo(n));
        System.out.println("Total no. of function calls: " + calls);
    }
}
