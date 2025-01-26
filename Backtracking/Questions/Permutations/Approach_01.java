/*
 * Given an array 'nums' of distinct integers, return all the possible permutations. You can return the answer
 * in any order.
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */

import java.util.ArrayList;
import java.util.List;

public class Approach_01 { // T.C=O(n!*n) and S.C=O(n)
    public static void generatePermutations(int[] num, List<Integer> currentPermutation, boolean[] isValid,
            List<List<Integer>> allPermutations) {
        int totalnum = num.length;
        if (currentPermutation.size() == totalnum) {
            // Add a copy of the current permutation to the result list
            allPermutations.add(new ArrayList<>(currentPermutation));
            return;
        }

        for (int i = 0; i < num.length; i++) {
            if (!isValid[i]) {
                // Include the number in the current permutation
                currentPermutation.add(num[i]);
                isValid[i] = true;

                // Recurse to generate further permutations
                generatePermutations(num, currentPermutation, isValid, allPermutations);

                // Backtrack: remove the number and mark it as unused
                isValid[i] = false;
                currentPermutation.remove(currentPermutation.size() - 1);
            }
        }
    }

    public static List<List<Integer>> findAllPermutations(int[] num) {
        List<List<Integer>> allPermutations = new ArrayList<>();
        List<Integer> currentPermutation = new ArrayList<>();
        boolean[] isValid = new boolean[num.length];

        // Helper method to generate permutations
        generatePermutations(num, currentPermutation, isValid, allPermutations);

        return allPermutations;
    }

    public static void main(String[] args) {
        int[] num = { 1, 2, 3 };
        List<List<Integer>> permutations = findAllPermutations(num);

        // Print all permutations
        System.out.println("All permutations:");
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
