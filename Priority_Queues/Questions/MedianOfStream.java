package Priority_Queues.Questions;

import java.util.Comparator;
import java.util.PriorityQueue;

/* Given a stream of integers, find the median of the stream using two Priority Queues. (leetcode 295) 
 * 
 * Input: 
 *      stream1 = [2,5,7,9,10,13,15,20,...]
 *      stream1 = [2,5,7,9,10,13,15,20,...]
 * 
 * Approach: 
 *        - Left Priority Queue -> maxHeap
 *        - Right Priority Queue -> minHeap
 *        - Difference of RPQ - LPQ <= 1, else shift
 *        - Calculate the median
*/

public class MedianOfStream {
    public static void add(PriorityQueue<Integer> leftPq, PriorityQueue<Integer> rightPq, int elem) {
        if (leftPq.isEmpty()) {
            leftPq.add(elem);
            return;
        }

        // Agar left mai jaana hai
        if (elem < leftPq.peek()) {
            if (rightPq.size() == leftPq.size()) {
                leftPq.add(elem);
            } else {
                rightPq.add(leftPq.remove());
                leftPq.add(elem);
            }
        }
        // Agar right mai jaana hai
        else {
            if (rightPq.size() == leftPq.size()) {
                leftPq.add(rightPq.remove());
                rightPq.add(elem);
            } else {
                rightPq.add(elem);
            }
        }
    }

    public static int findMedian(PriorityQueue<Integer> leftPq, PriorityQueue<Integer> rightPq) {
        if (leftPq.isEmpty())
            return -1;
        else if (leftPq.size() - rightPq.size() == 1)
            return leftPq.peek();
        else
            return ((leftPq.peek() + rightPq.peek())) / 2;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> leftPq = new PriorityQueue<>(Comparator.reverseOrder()); // maxHeap
        PriorityQueue<Integer> rightPq = new PriorityQueue<>(); // minHeap

        add(leftPq, rightPq, 15);
        System.out.println(findMedian(leftPq, rightPq));

        add(leftPq, rightPq, 10);
        System.out.println(findMedian(leftPq, rightPq));

        add(leftPq, rightPq, 5);
        add(leftPq, rightPq, 20);
        System.out.println(findMedian(leftPq, rightPq));

        add(leftPq, rightPq, 25);
        System.out.println(findMedian(leftPq, rightPq));
    }
}
