package Heaps.Questions;

import java.util.Arrays;

/* Given two binary max heaps as arrays, the task is to merge the given heaps. */

public class MergeHeap {

    // Function to heapify a subtree rooted at index `i`
    public static void maxHeapify(int[] heap, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check if left child is greater
        if (left < n && heap[left] > heap[largest])
            largest = left;

        // Check if right child is greater
        if (right < n && heap[right] > heap[largest])
            largest = right;

        // If the largest is not root, swap and continue heapifying
        if (largest != i) {
            swap(heap, i, largest);
            maxHeapify(heap, n, largest);
        }
    }

    // Function to merge two max heaps
    public static int[] mergeHeaps(int[] heap1, int[] heap2) {
        int n1 = heap1.length, n2 = heap2.length;
        int[] mergedHeap = new int[n1 + n2];

        // Copy elements of both heaps into mergedHeap
        System.arraycopy(heap1, 0, mergedHeap, 0, n1);
        System.arraycopy(heap2, 0, mergedHeap, n1, n2);

        // Heapify the merged heap
        for (int i = (mergedHeap.length / 2) - 1; i >= 0; i--) {
            maxHeapify(mergedHeap, mergedHeap.length, i);
        }

        return mergedHeap;
    }

    // Swap function
    public static void swap(int[] heap, int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public static void main(String[] args) {
        int[] heap1 = { 10, 5, 6, 2 };
        int[] heap2 = { 8, 4, 7, 1 };

        int[] mergedHeap = mergeHeaps(heap1, heap2);

        System.out.println("Merged Max Heap: " + Arrays.toString(mergedHeap));
    }
}
