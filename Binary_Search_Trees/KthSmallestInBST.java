/* Find the kth smallest element in a Binary Search Tree (leetcode 230) */

public class KthSmallestInBST {
    public static class Node {
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;
        }
    }

    // Helper variable to store the count of elements visited during the inorder
    // traversal
    static int count = 0;
    static int result = -1;

    // Inorder traversal function to find the kth smallest element
    public static void inorder(Node root, int k) {
        if (root == null) {
            return;
        }

        // Traverse the left subtree
        inorder(root.left, k);

        // Visit the current node
        count++;
        if (count == k) {
            result = root.val;
            return; // Early return when we find the kth smallest element
        }

        // Traverse the right subtree
        inorder(root.right, k);
    }

    // Function to find the kth smallest element in the BST
    public static int kthSmallest(Node root, int k) {
        count = 0; // Reset count before starting the traversal
        result = -1; // Reset result before starting the traversal
        inorder(root, k);
        return result;
    }

    // Main function to test the solution
    public static void main(String[] args) {
        // Example test case
        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(4);
        root.left.right = new Node(2);

        int k = 1; // Find the 1st smallest element
        System.out.println("The " + k + "th smallest element in the BST is: " + kthSmallest(root, k)); // Expected
                                                                                                       // output: 1

        k = 3; // Find the 3rd smallest element
        System.out.println("The " + k + "th smallest element in the BST is: " + kthSmallest(root, k)); // Expected
                                                                                                       // output: 3
    }
}
