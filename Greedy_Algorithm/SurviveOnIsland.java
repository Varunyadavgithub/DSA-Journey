package Greedy_Algorithm;

/* Check if it is possible to survive on the island (GFG). */

public class SurviveOnIsland { // T.C = O(1) and S.C = O(1)
    public static void main(String[] args) {
        int S = 10; // Number of days
        int N = 16; // Food available Monday to Saturday
        int M = 2; // Food consumption per day (No food on Sunday)

        int totalFoodRequired = S * M; // Total food required for the number of days
        int result = -1; // Default to -1 if it's not possible

        // If consumption is greater than the supply, survival is not possible
        if (M > N || (7 * M) > (6 * N)) {
            result = -1; // Not enough food
        } else {
            // Calculate how many full weeks of food are required
            result = (int) Math.ceil((double) totalFoodRequired / N);
        }

        // Print the result
        System.out.println(result);
    }
}
