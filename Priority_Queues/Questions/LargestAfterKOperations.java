package Priority_Queues.Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/* Given an array of integer, You are supposed to perform k operations on it. At each operation
 * the smallest 2 elements of the array are removed from the array, multiplied by each other,
 * and the product is added back to the array.
 * Return the largest element of the array after the k operations.
 * It is guranted that at least one element will remain after the k operations.
 * 
 * Input: n=5, k=3, arr={2,4,3,1,5} 
 * Output: 20
 * 
 * Explaination: {2,4,3,1,5} => {4,3,5,2} => {4,5,6} => {6,20}
 */
public class LargestAfterKOperations {
    public static void main(String[] args) { // Total T.C - O(N+NlogN)
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(3);
        arr.add(1);
        arr.add(5);
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>(arr); // T.C - O(N)
        for (int i = 0; i < k; i++) { // T.C - O(K*logN)
            int firstNum = pq.remove();
            int secondNum = pq.remove();
            pq.add(firstNum * secondNum);
        }
        while (pq.size() != 1) { // T.C - O(N-k)*logN
            pq.remove();
        }
        System.out.print(pq.peek());
    }
}
