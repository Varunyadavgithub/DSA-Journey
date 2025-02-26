package Heaps.MaxHeaps;

import java.util.ArrayList;
import java.util.List;

/* Insertion in a max heap. */

public class Insertion {

    // Function to swap two elements in the heap
    public static void swap(List<Integer> heap, int l, int r) {
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
    }

    // Push-up method for maintaining heap property after insertion
    public static void pushupInMaxHeap(List<Integer> heap, int idx) {
        int parentIndex = (idx - 1) / 2;
        // Until root is reached or the correct position is found
        if (idx == 0 || heap.get(parentIndex) >= heap.get(idx)) {
            return; // No need to swap if the parent is larger or we are at the root
        }
        // Swap the current node with its parent
        swap(heap, idx, parentIndex);
        // Recursively move up the heap
        pushupInMaxHeap(heap, parentIndex);
    }

    // Function to insert an element into the max-heap
    public static void insertInMaxHeap(List<Integer> heap, int elem) {
        // Add the new element at the end of the heap
        heap.add(elem);
        // Push up the element to its correct position in the heap
        int index = heap.size() - 1;
        pushupInMaxHeap(heap, index);
    }

    // Function to print the heap
    public static void printHeap(List<Integer> heap) {
        System.out.println("Current Max Heap: " + heap);
    }

    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        // Initial max heap (max-heap property is maintained)
        heap.add(60);
        heap.add(50);
        heap.add(40);
        heap.add(30);
        heap.add(20);
        heap.add(30);
        heap.add(10);

        // Print the initial heap
        System.out.println("Initial Max Heap: " + heap);

        // Insert a new element (60) and maintain the heap property
        insertInMaxHeap(heap, 70);

        // Print the heap after insertion
        printHeap(heap);
    }
}
