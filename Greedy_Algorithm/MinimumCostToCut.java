package Greedy_Algorithm;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

/* Minimum cost to cut a board into squares (GFG)
 * M=6, N=4
 * X[]={2,1,3,1,4}
 * Y[]={4,1,2}
 * Output=42
 */
public class MinimumCostToCut {
    public static void main(String[] args) {
        int M = 6;
        int N = 4;
        List<Integer> X = new ArrayList<>();
        List<Integer> Y = new ArrayList<>();
        X.add(2);
        X.add(1);
        X.add(3);
        X.add(1);
        X.add(4);
        Y.add(4);
        Y.add(1);
        Y.add(2);
        X.sort(Comparator.reverseOrder());
        Y.sort(Comparator.reverseOrder());
        int no_Of_Vertical_Piece = 1;
        int no_Of_Horizontal_Piece = 1;
        int totalCost = 0;
        int i = 0, j = 0;
        while (i < M - 1 && j < N - 1) {
            if (X.get(i) > Y.get(j)) {
                totalCost += X.get(i) * no_Of_Horizontal_Piece;
                no_Of_Vertical_Piece++;
                i++;
            } else {
                totalCost += Y.get(j) * no_Of_Vertical_Piece;
                no_Of_Horizontal_Piece++;
                j++;
            }
        }
        while (i < M - 1) {
            totalCost += X.get(i) * no_Of_Horizontal_Piece;
            i++;
        }
        while (j < N - 1) {
            totalCost = Y.get(j) * no_Of_Vertical_Piece;
            j++;
        }
        System.out.println(totalCost);
    }
}
