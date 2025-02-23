package Deletion;

import java.util.LinkedList;
import java.util.Queue;

/* Deleting a Node with Two Children in a BST (Leetcode 450) */

public class TwoChild {
    public static class Node {
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;
        }
    }

    // Function to construct BST from an array (level order insertion)
    public static Node constructBST(String[] arr) {
        if (arr.length == 0 || arr[0].equals(""))
            return null;

        Node root = new Node(Integer.parseInt(arr[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;

        while (i < arr.length) {
            Node temp = q.poll();

            // Left child
            if (i < arr.length && !arr[i].equals("")) {
                temp.left = new Node(Integer.parseInt(arr[i]));
                q.add(temp.left);
            }
            i++;

            // Right child
            if (i < arr.length && !arr[i].equals("")) {
                temp.right = new Node(Integer.parseInt(arr[i]));
                q.add(temp.right);
            }
            i++;
        }
        return root;
    }

    // Preorder Traversal
    public static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Function to find the inorder predecessor (rightmost node in the left subtree)
    public static Node findPredecessor(Node root) {
        Node pred = root.left;
        while (pred.right != null) {
            pred = pred.right;
        }
        return pred;
    }

    // Function to delete a node with two children
    public static Node delete(Node root, int target) {
        if (root == null)
            return null;

        if (root.val > target) { // go left
            root.left = delete(root.left, target);
        } else if (root.val < target) { // go right
            root.right = delete(root.right, target);
        } else {
            // Case 1 & 2: Node with 0 or 1 child
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;

            // Case 3: Node with two children
            Node pred = findPredecessor(root); // Find inorder predecessor
            root.val = pred.val; // Replace value with predecessor
            root.left = delete(root.left, pred.val); // Delete the predecessor
        }
        return root;
    }

    public static void main(String[] args) {
        String[] arr = { "50", "20", "60", "17", "34", "55", "89", "10", "", "", "", "", "", "70" };

        // Construct BST
        Node root = constructBST(arr);

        // Print Preorder before deletion
        System.out.print("Preorder before deletion: ");
        preorder(root);
        System.out.println();

        // Delete a node with two children (50)
        root = delete(root, 50);

        // Print Preorder after deletion
        System.out.print("Preorder after deletion: ");
        preorder(root);
    }
}
