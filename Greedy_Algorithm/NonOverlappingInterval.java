package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* Non-overlapping Intervals (Leetcode 435)
 * Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
 * Output: 1
*/

public class NonOverlappingInterval {
    public static class Interval {
        int startTime;
        int endTime;

        public Interval(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public String toString() {
            return startTime + "-" + endTime;
        }
    }

    public static void main(String[] args) {
        List<Interval> intervalsList = new ArrayList<>();
        intervalsList.add(new Interval(1, 2));
        intervalsList.add(new Interval(2, 3));
        intervalsList.add(new Interval(3, 4));
        intervalsList.add(new Interval(1, 3));

        // Sort by end time (Greedy Approach)
        intervalsList.sort(Comparator.comparingInt(i -> i.endTime));

        int res = 0;
        int previousEndTime = Integer.MIN_VALUE; // Start with the lowest possible value

        for (Interval curr : intervalsList) {
            if (curr.startTime >= previousEndTime) {
                // No overlap, update the end time
                previousEndTime = curr.endTime;
            } else {
                // Overlap occurs, remove the current interval
                res++;
            }
        }

        System.out.println(res); // Expected output: 1
    }
}
