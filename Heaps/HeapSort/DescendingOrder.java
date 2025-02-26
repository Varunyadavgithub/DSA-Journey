package Heaps.HeapSort;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/* Sort in descending order using Heap Sort (Min Heap) */

public class DescendingOrder {

    // Function to swap two elements in the heap
    public static void swap(List<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    // Function to push down (heapify) in Min Heap
    public static void pushdownInMinHeap(List<Integer> arr, int idx, int n) {
        int left = (2 * idx) + 1;
        int right = (2 * idx) + 2;
        int smallest = idx;

        // Check if left child is smaller
        if (left <= n && arr.get(left) < arr.get(smallest)) {
            smallest = left;
        }

        // Check if right child is smaller
        if (right <= n && arr.get(right) < arr.get(smallest)) {
            smallest = right;
        }

        // Swap and heapify if necessary
        if (smallest != idx) {
            swap(arr, idx, smallest);
            pushdownInMinHeap(arr, smallest, n);
        }
    }

    // Function to convert array into Min Heap
    public static void heapify(List<Integer> arr) {
        int n = arr.size();
        // Start heapifying from the last non-leaf node
        for (int i = (n / 2) - 1; i >= 0; i--) {
            pushdownInMinHeap(arr, i, n - 1);
        }
    }

    // Heap Sort function (Descending Order)
    public static void heapSort(List<Integer> arr) {
        // Convert array into Min Heap
        heapify(arr);
        int n = arr.size() - 1;

        // Extract elements from heap one by one
        for (int i = n; i > 0; i--) {
            swap(arr, 0, i); // Swap min element (root) with the last element
            pushdownInMinHeap(arr, 0, i - 1); // Restore heap property
        }
    }

    // Function to print the sorted array
    public static void printList(List<Integer> arr) {
        System.out.println("Sorted Array (Descending Order): " + arr);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(30, 10, 50, 20, 40));

        System.out.println("Original Array: " + arr);
        heapSort(arr);
        printList(arr);
    }
}
