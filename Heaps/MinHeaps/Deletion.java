package Heaps.MinHeaps;

import java.util.ArrayList;
import java.util.List;

/* Deletion in a min heap. */

public class Deletion {

    // Function to swap two elements in the heap
    public static void swap(List<Integer> heap, int l, int r) {
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
    }

    // Push-down (heapify) method to maintain min-heap property after deletion
    public static void pushdownInMinHeap(List<Integer> heap, int idx) {
        int n = heap.size();
        int left = (2 * idx) + 1;
        int right = (2 * idx) + 2;
        int smallest = idx;

        if (left < n && heap.get(left) < heap.get(smallest)) {
            smallest = left;
        }
        if (right < n && heap.get(right) < heap.get(smallest)) {
            smallest = right;
        }

        // If the smallest element is not the parent, swap and recurse
        if (smallest != idx) {
            swap(heap, idx, smallest);
            pushdownInMinHeap(heap, smallest);
        }
    }

    // Function to delete the root element from the min heap
    public static void deleteFromMinHeap(List<Integer> heap) {
        if (heap.isEmpty()) {
            System.out.println("Heap is empty!");
            return;
        }

        // Swap the root with the last element
        swap(heap, 0, heap.size() - 1);

        // Remove the last element (which was the root)
        heap.remove(heap.size() - 1);

        // Restore heap property by pushing down the new root
        pushdownInMinHeap(heap, 0);
    }

    // Function to print the heap
    public static void printHeap(List<Integer> heap) {
        System.out.println("Current Min Heap: " + heap);
    }

    public static void main(String[] args) {
        // Create a min heap
        List<Integer> heap = new ArrayList<>();
        heap.add(5);
        heap.add(10);
        heap.add(15);
        heap.add(20);
        heap.add(25);
        heap.add(30);
        heap.add(35);

        // Print initial heap
        System.out.println("Initial Min Heap: " + heap);

        // Delete the root (minimum element)
        deleteFromMinHeap(heap);

        // Print the heap after deletion
        printHeap(heap);
    }
}
