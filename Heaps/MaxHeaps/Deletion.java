package Heaps.MaxHeaps;

import java.util.ArrayList;
import java.util.List;

/* Deletion in a max heap. */

public class Deletion {

    // Function to swap two elements in the heap
    public static void swap(List<Integer> heap, int l, int r) {
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
    }

    // Push down method to maintain heap property after deletion
    public static void pushdownInMaxHeap(List<Integer> heap, int idx) {
        int n = heap.size();
        int left = (2 * idx) + 1; // Left child index
        int right = (2 * idx) + 2; // Right child index
        int largest = idx;

        // Check if left child is greater than parent
        if (left < n && heap.get(left) > heap.get(largest)) {
            largest = left;
        }

        // Check if right child is greater than parent
        if (right < n && heap.get(right) > heap.get(largest)) {
            largest = right;
        }

        // If largest is not the parent node, swap and recursively heapify
        if (largest != idx) {
            swap(heap, idx, largest);
            pushdownInMaxHeap(heap, largest);
        }
    }

    // Function to delete root node from Max Heap
    public static void deleteFromMaxHeap(List<Integer> heap) {
        if (heap.isEmpty()) {
            System.out.println("Heap is Empty!");
            return;
        }

        // Swap root with the last element
        swap(heap, 0, heap.size() - 1);

        // Remove the last element (root)
        heap.remove(heap.size() - 1);

        // Restore the heap property
        pushdownInMaxHeap(heap, 0);
    }

    // Function to print heap
    public static void printHeap(List<Integer> heap) {
        System.out.println("Current Max Heap: " + heap);
    }

    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();

        // Initial Max Heap
        heap.add(50);
        heap.add(40);
        heap.add(30);
        heap.add(20);
        heap.add(10);

        System.out.println("Initial Max Heap: " + heap);

        // Delete the root node
        deleteFromMaxHeap(heap);

        // Print the heap after deletion
        printHeap(heap);
    }
}
