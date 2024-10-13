package CollectionsFramework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfaceExample {
    // Queue
    static void QueueExample() {
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek()); // 1
        System.out.println(q.poll()); // 1
        System.out.println(q.peek()); // 2
        System.out.println(q.isEmpty()); // false
        System.out.println(q.size()); // 2
        System.out.println(q); // 2 3
    }

    // Priority Queue
    static void PriorityQueueExample() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek()); // 5 (smallest element highest priority)
        System.out.println(pq); // Top most priority element will be processed first
        System.out.println(pq.poll()); // 5
        System.out.println(pq); // 7 10
        System.out.println(pq.peek()); // 7
    }

    // Deque
    static void DequeExample() {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq); // 2 1 3 4
        System.out.println(dq.pollFirst()); // 2
        System.out.println(dq.pollLast()); // 4
        System.out.println(dq); // 1 3
    }

    public static void main(String[] args) {
        QueueExample();
        PriorityQueueExample();
        DequeExample();
    }
}
