package Priority_Queues.Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* Sum of all elements between k1th and k2th smallest elements.
 * 
 * Input: N=7, arr={20,8,22,4,12,10,14}, k1=3, k2=6
 * Output: 26
 */
public class SumOfElements {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(8);
        arr.add(22);
        arr.add(4);
        arr.add(12);
        arr.add(10);
        arr.add(14);
        int k1 = 3;
        int k2 = 6;

        // Brute Force Approach
        Collections.sort(arr); // T.C - O(NlogN)
        int sum = 0;
        for (int i = k1; i < k2 - 1; i++) { // T.C - O(k2-k1)
            sum += arr.get(i);
        }
        System.out.print("Brute Force Answer: " + sum);
        System.out.println();

        // Optimal Approach => // T.C - O(Nlogk2 + (N-k2)logK2 + (k2-k1)logK2) =~ NlogN
        // //S.C - O(k2)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < arr.size(); i++) { // T.C - O(Nlogk2 + (N-k2)logK2)
            pq.add(arr.get(i));
            if (pq.size() > k2) {
                pq.remove();
            }
        }
        pq.remove();
        sum = 0;
        while (pq.size() != k1) { // T.C - O(k2-k1)logK2
            sum += pq.remove();
        }
        System.out.print("Optimal Answer: " + sum);
    }
}
