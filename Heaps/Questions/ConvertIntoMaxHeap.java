package Heaps.Questions;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/* Given an array representing min heap, Convert it into max heap. */

public class ConvertIntoMaxHeap {
    public static void swap(List<Integer> heap, int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public static void pushdownInMaxHeap(List<Integer> heap, int idx, int n) {
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;
        int largest = idx;

        if (left <= n && heap.get(left) > heap.get(largest)) {
            largest = left;
        }
        if (right <= n && heap.get(right) > heap.get(largest)) {
            largest = right;
        }

        if (largest != idx) {
            swap(heap, idx, largest);
            pushdownInMaxHeap(heap, largest, n);
        }
    }

    public static void convertMinToMaxHeap(List<Integer> heap) {
        int n = heap.size() - 1;

        // Start from the last non-leaf node and push down
        for (int i = n / 2; i >= 0; i--) {
            pushdownInMaxHeap(heap, i, n);
        }
    }

    public static void main(String[] args) {
        List<Integer> minHeap = new ArrayList<>();
        Collections.addAll(minHeap, 1, 3, 5, 7, 9, 11, 13, 15, 17, 19);

        System.out.println("Min Heap: " + minHeap);
        convertMinToMaxHeap(minHeap);
        System.out.println("Converted Max Heap: " + minHeap);
    }
}
