package Heaps.HeapSort;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/* Sort in ascending order using Heap Sort (Max Heap) */

public class AscendingOrder {

    // Function to swap two elements in the heap
    public static void swap(List<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    // Function to push down (heapify) in Max Heap
    public static void pushdownInMaxHeap(List<Integer> arr, int idx, int n) {
        int left = (2 * idx) + 1;
        int right = (2 * idx) + 2;
        int largest = idx;

        // Check if left child is larger
        if (left <= n && arr.get(left) > arr.get(largest)) {
            largest = left;
        }

        // Check if right child is larger
        if (right <= n && arr.get(right) > arr.get(largest)) {
            largest = right;
        }

        // Swap and heapify if necessary
        if (largest != idx) {
            swap(arr, idx, largest);
            pushdownInMaxHeap(arr, largest, n);
        }
    }

    // Function to convert array into Max Heap
    public static void heapify(List<Integer> arr) {
        int n = arr.size();
        // Start heapifying from the last non-leaf node
        for (int i = (n / 2) - 1; i >= 0; i--) {
            pushdownInMaxHeap(arr, i, n - 1);
        }
    }

    // Heap Sort function (Ascending Order)
    public static void heapSort(List<Integer> arr) {
        // Convert array into Max Heap
        heapify(arr);
        int n = arr.size() - 1;

        // Extract elements from heap one by one
        for (int i = n; i > 0; i--) {
            swap(arr, 0, i); // Swap max element (root) with the last element
            pushdownInMaxHeap(arr, 0, i - 1); // Restore heap property
        }
    }

    // Function to print the sorted array
    public static void printList(List<Integer> arr) {
        System.out.println("Sorted Array (Ascending Order): " + arr);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(30, 10, 50, 20, 40));

        System.out.println("Original Array: " + arr);
        heapSort(arr);
        printList(arr);
    }
}
