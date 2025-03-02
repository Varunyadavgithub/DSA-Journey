package Priority_Queues;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapPriorityQueue {
    public static void main(String[] args) {
        // Creating a Max Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Inserting elements
        maxHeap.add(3);
        maxHeap.add(1);
        maxHeap.add(2);

        // Removing the largest element
        System.out.println("Removed Element: " + maxHeap.poll()); // 3

        // Displaying remaining elements
        System.out.print("Priority Queue Elements: ");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " "); // 2 1
        }
    }
}
