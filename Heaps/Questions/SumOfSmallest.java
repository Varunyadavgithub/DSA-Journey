package Heaps.Questions;

import java.util.PriorityQueue;

/* Sum of all elements between k1-th and k2-th smallest elements (GFG). */

public class SumOfSmallest {

    // Function to find the k-th smallest element using Min Heap
    public static int findKthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Insert all elements into Min Heap
        for (int num : arr) {
            minHeap.add(num);
        }

        // Extract min (k-1) times to reach k-th smallest
        for (int i = 1; i < k; i++) {
            minHeap.poll();
        }

        return minHeap.peek();
    }

    // Function to find sum of elements between k1-th and k2-th smallest
    public static int sumBetweenK1K2(int[] arr, int k1, int k2) {
        int k1Smallest = findKthSmallest(arr, k1);
        int k2Smallest = findKthSmallest(arr, k2);

        int sum = 0;

        // Sum elements strictly between k1Smallest and k2Smallest
        for (int num : arr) {
            if (num > k1Smallest && num < k2Smallest) {
                sum += num;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 20, 8, 22, 4, 12, 10, 14 };
        int k1 = 3, k2 = 6;

        int result = sumBetweenK1K2(arr, k1, k2);
        System.out.println("Sum between " + k1 + "-th and " + k2 + "-th smallest elements: " + result);
    }
}
