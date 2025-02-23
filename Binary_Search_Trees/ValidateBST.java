/* Validate Binary Search Tree. (Leetcode 98) */

public class ValidateBST {

    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    // Flag to keep track of whether the tree is a valid BST
    static boolean flag;
    static Node prev;

    // Inorder Traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left); // Traverse left subtree
        if (prev == null)
            prev = root;
        else if (root.val <= prev.val) { // If the current node's value is not greater than the previous one
            flag = false; // Not a valid BST
            return;
        } else {
            prev = root; // Update the previous node to the current node
        }
        inorder(root.right); // Traverse right subtree
    }

    // Function to check if a tree is a valid BST
    public static boolean isValidBST(Node root) {
        flag = true;
        prev = null;
        inorder(root); // Perform inorder traversal
        return flag;
    }

    public static void main(String[] args) {
        // Test Case 1: Valid BST
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(3);

        System.out.println("Is the tree a valid BST? " + isValidBST(root1)); // Expected: true

        // Test Case 2: Invalid BST (3 is in the wrong place)
        Node root2 = new Node(5);
        root2.left = new Node(1);
        root2.right = new Node(4);
        root2.right.left = new Node(3);
        root2.right.right = new Node(6);

        System.out.println("Is the tree a valid BST? " + isValidBST(root2)); // Expected: false
    }
}
