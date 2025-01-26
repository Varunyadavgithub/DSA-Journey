/*
 * Given an array 'nums' of distinct integers, return all the possible permutations. You can return the answer
 * in any order.
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */

import java.util.ArrayList;
import java.util.List;

public class Approach_02 { // T.C=O(n!) and S.C=O(n)
    public static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void helper(int[] nums, int idx, List<List<Integer>> ans) {
        int n = nums.length;
        if (idx == n - 1) {
            List<Integer> currentPermutation = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                currentPermutation.add(nums[i]);
            }
            ans.add(currentPermutation);
            return;
        }

        for (int i = idx; i < n; i++) {
            swap(i, idx, nums); // Swap to fix one element
            helper(nums, idx + 1, ans); // Recurse for the remaining elements
            swap(i, idx, nums); // Backtrack to restore the original state
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> permutations = permute(nums);

        // Print all permutations
        System.out.println("All permutations:");
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}