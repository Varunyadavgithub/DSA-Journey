package Greedy_Algorithm;

import java.util.Arrays;
import java.util.TreeMap;

/* Maximum Profit in Job Scheduling. (Leetcode 1235) */

public class MaxProfit {

    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] jobs = new int[n][3];

        // Step 1: Store jobs as {startTime, endTime, profit}
        for (int i = 0; i < n; i++) {
            jobs[i] = new int[] { startTime[i], endTime[i], profit[i] };
        }

        // Step 2: Sort jobs based on endTime
        Arrays.sort(jobs, (a, b) -> Integer.compare(a[1], b[1]));

        // Step 3: Use TreeMap to store DP results (endTime -> maxProfit)
        TreeMap<Integer, Integer> dp = new TreeMap<>();
        dp.put(0, 0); // Base case: No jobs, profit = 0

        // Step 4: Process jobs one by one
        for (int[] job : jobs) {
            int s = job[0], e = job[1], p = job[2];

            // Step 5: Find the last non-overlapping job using binary search
            Integer prevEndTime = dp.floorKey(s); // Latest job before current start time
            int currProfit = dp.get(prevEndTime) + p;

            // Step 6: Update the DP map if this job increases profit
            if (currProfit > dp.lastEntry().getValue()) {
                dp.put(e, currProfit);
            }
        }

        // Step 7: Return the max profit
        return dp.lastEntry().getValue();
    }

    // Main function to run and test the solution
    public static void main(String[] args) {
        int[] startTime1 = { 1, 2, 3, 3 };
        int[] endTime1 = { 3, 4, 5, 6 };
        int[] profit1 = { 50, 10, 40, 70 };
        System.out.println("Output: " + jobScheduling(startTime1, endTime1, profit1)); // Expected Output: 120

        int[] startTime2 = { 1, 2, 3, 4, 6 };
        int[] endTime2 = { 3, 5, 10, 6, 9 };
        int[] profit2 = { 20, 20, 100, 70, 60 };
        System.out.println("Output: " + jobScheduling(startTime2, endTime2, profit2)); // Expected Output: 150

        int[] startTime3 = { 1, 1, 1 };
        int[] endTime3 = { 2, 3, 4 };
        int[] profit3 = { 5, 6, 4 };
        System.out.println("Output: " + jobScheduling(startTime3, endTime3, profit3)); // Expected Output: 6
    }
}
