package Heaps.Questions;

import java.util.PriorityQueue;

/* Kth smallest element in an unsorted array (GFG). */

public class KthSmallest {
    public static int findKthSmallest(int[] arr, int k) {
        // Min Heap (Priority Queue)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Insert all elements into min heap
        for (int num : arr) {
            minHeap.add(num);
        }

        // Extract K times
        int kthSmallest = -1;
        for (int i = 0; i < k; i++) {
            kthSmallest = minHeap.poll();
        }

        return kthSmallest;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 3, 20, 15 };
        int k = 3;

        System.out.println(k + "rd smallest element: " + findKthSmallest(arr, k));
    }
}
