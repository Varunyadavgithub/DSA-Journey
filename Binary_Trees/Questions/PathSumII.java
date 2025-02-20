package Binary_Trees.Questions;

import java.util.ArrayList;
import java.util.List;

/* Path Sum. (Leetcode 113) */

public class PathSumII {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void helper(List<List<Integer>> ans, List<Integer> arr, Node root, int sum) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            arr.add(root.val);
            if (root.val == sum) {
                ans.add(new ArrayList<>(arr));
            }
            arr.remove(arr.size() - 1);
            return;
        }
        arr.add(root.val);
        helper(ans, arr, root.left, sum - root.val);
        helper(ans, arr, root.right, sum - root.val);
        arr.remove(arr.size() - 1); // backtracking
    }

    public static List<List<Integer>> pathSum(Node root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        helper(ans, arr, root, targetSum);
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right.right.left = new Node(5);
        root.right.right.right = new Node(1);

        int targetSum = 22;
        System.out.println("Paths summing to " + targetSum + " are: " + pathSum(root, targetSum));
    }
}