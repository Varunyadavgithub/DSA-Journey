package Priority_Queues.Questions;

import java.util.ArrayList;
// import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* Kth Largest Element in an Array (Leetcode - 215) */

public class KthLargest {
    public static int findKthLargest(List<Integer> nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(7);
        arr.add(2);
        arr.add(9);
        arr.add(5);
        int k = 3;

        // Brute Force Approach
        // List<Integer> sortArr = new ArrayList<>(arr); // SC - O(N)
        // sortArr.sort(Comparator.reverseOrder()); // TC - O(NlogN)
        // System.out.print(sortArr.get(k - 1)); // Fix: `arr.get(k-1)` →
        // `sortArr.get(k-1)`

        // Better Approach
        System.out.println("The " + k + "th largest element is " + findKthLargest(arr, k));
    }
}
