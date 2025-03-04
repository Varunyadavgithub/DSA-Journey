package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* Activity Selection Problem.
 * Given N activities with their start and finish day given in array start[] and end[]. Select the maximum number of activities that 
 * can be performed by a single person, assuming that a person can only work on a single activity at a given day.
 * 
 * Note:- Duration of the activity includes both starting and ending day.
 * 
 * Input:- N=4, start[]={1,3,2,5} and end[]={2,4,3,6}
 * Output:- 3
 * 
 * Explanaiton:- A person can perform activities 1,2 and 4
 */

public class ActivitySelection {
    // Activity class to store start time, end time, and activity number
    public static class Activity {
        int startTime;
        int endTime;
        int index;

        public Activity(int startTime, int endTime, int index) {
            this.startTime = startTime;
            this.endTime = endTime;
            this.index = index;
        }
    }

    public static int maxActivities(int[] start, int[] end) {
        int n = start.length;
        List<Activity> activities = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            activities.add(new Activity(start[i], end[i], i + 1));
        }

        // Sorting activities based on finish time
        activities.sort(Comparator.comparingInt(a -> a.endTime));

        // Selecting activities
        List<Integer> selectedActivities = new ArrayList<>();
        selectedActivities.add(activities.get(0).index);
        int lastEndTime = activities.get(0).endTime;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (activities.get(i).startTime > lastEndTime) {
                selectedActivities.add(activities.get(i).index);
                lastEndTime = activities.get(i).endTime;
                count++;
            }
        }

        // Printing selected activities
        System.out.println("Selected activities: " + selectedActivities);
        return count;
    }

    public static void main(String[] args) {
        int[] start = { 1, 3, 2, 5 };
        int[] end = { 2, 4, 3, 6 };
        int maxCount = maxActivities(start, end);
        System.out.println("Maximum number of activities: " + maxCount);
    }
}