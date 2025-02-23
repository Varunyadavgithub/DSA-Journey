/* Convert Sorted Array to Balanced Binary Search Tree (Leetcode 108) */

public class ArrayToBST {
    public static class Node {
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;
        }
    }

    // Helper function to recursively construct the BST
    public static Node helper(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        Node root = new Node(nums[mid]);
        root.left = helper(nums, start, mid - 1);
        root.right = helper(nums, mid + 1, end);
        return root;
    }

    // Main function to convert the sorted array to a balanced BST
    public static Node sortedArrayToBST(int[] nums) {
        int n = nums.length - 1;
        return helper(nums, 0, n);
    }

    // Helper function to print the tree in inorder traversal for verification
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] nums = { -10, -3, 0, 5, 9 };

        // Convert sorted array to balanced BST
        Node root = sortedArrayToBST(nums);

        // Print the tree in inorder (should print the sorted array)
        System.out.print("Inorder traversal of the BST: ");
        inorder(root); // Expected Output: -10 -3 0 5 9
    }
}
