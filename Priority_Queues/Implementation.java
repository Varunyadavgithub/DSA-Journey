package Priority_Queues;

import java.util.PriorityQueue;

/* Java’s default PriorityQueue is a Min-Heap.*/

public class Implementation {
    public static void main(String[] args) {
        // Creating a Min Heap (Default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Inserting elements
        pq.add(3);
        pq.add(1);
        pq.add(2);

        // Removing the smallest element
        System.out.println("Removed Element: " + pq.remove()); // 1

        // Displaying the remaining elements
        System.out.print("Priority Queue Elements: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " "); // 2 3
        }
    }
}
