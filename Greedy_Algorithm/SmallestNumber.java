package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.List;

/* Smallest Number.
 * The task is to find the smallest number with given sum of digits as 'S' and number of digits as 'D'
 * Input:- S=9, D=2
 * Output:- 18
 */
public class SmallestNumber {
    public static void main(String[] args) { // T.C = O(d) and S.C = O(d)
        int s = 19;
        int d = 4;
        if (s == 0 || s > d * 9) {
            System.out.println("Humse na ho payegaa...");
            return;
        }
        s -= 1;
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < d; i++)
            number.add(0);
        // Right to left chalo...
        for (int i = d - 1; i >= 1; i--) {
            if (s > 9) {
                number.set(i, 9);
                s -= 9;
            } else {
                number.set(i, s);
                s = 0;
                break;
            }
        }
        // Starting vaala 1 plus remaining sum
        number.set(0, s + 1);
        System.out.println(number);
    }
}
