package Deletion;

import java.util.LinkedList;
import java.util.Queue;

/* Deletion of a node with 0 children (leaf node) in a BST */

public class ZeroChild {
    public static class Node {
        int val;
        Node left;
        Node right;

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

    // Function to delete a node with 0 children (leaf node) in BST
    public static Node delete(Node root, int target) {
        if (root == null)
            return null;

        if (root.val > target) {
            root.left = delete(root.left, target);
        } else if (root.val < target) {
            root.right = delete(root.right, target);
        } else {
            // Node to be deleted found, and it is a leaf node
            if (root.left == null && root.right == null) {
                return null; // Remove the leaf node
            }
        }
        return root;
    }

    public static void main(String[] args) {
        String[] arr = { "50", "20", "60", "17", "34", "55", "89", "10", "", "28", "", "", "", "70", "", "", "14" };

        // Construct BST
        Node root = constructBST(arr);

        // Print Preorder before deletion
        System.out.print("Preorder before deletion: ");
        preorder(root);
        System.out.println();

        // Delete the leaf node (28)
        root = delete(root, 28);

        // Print Preorder after deletion
        System.out.print("Preorder after deletion: ");
        preorder(root);
    }
}
