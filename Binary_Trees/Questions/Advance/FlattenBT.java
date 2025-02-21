package Binary_Trees.Questions.Advance;

/* Flatten Binary Tree to LinkedList. (Leetcode 114) */

public class FlattenBT {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    // Method - 1: Recursive Approach
    public static void flatten(Node root) {
        if (root == null)
            return;
        Node leftTree = root.left;
        Node rightTree = root.right;

        // Recursively flatten left and right subtrees
        flatten(leftTree);
        flatten(rightTree);

        // Attach flattened left subtree to root's right
        root.left = null;
        root.right = leftTree;

        // Find the end of the new right subtree
        Node temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        // Attach original right subtree
        temp.right = rightTree;
    }

    // Method - 2: Morris Traversal (Iterative Approach)
    public static void flatten2(Node root) {
        Node curr = root;
        while (curr != null) {
            if (curr.left != null) {
                Node pred = curr.left;
                while (pred.right != null) {
                    pred = pred.right;
                }
                pred.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }

    // Print flattened linked list
    public static void printLinkedList(Node root) {
        while (root != null) {
            System.out.print(root.val + " -> ");
            root = root.right;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating the binary tree
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(5);
        root1.left.left = new Node(3);
        root1.left.right = new Node(4);
        root1.right.right = new Node(6);

        System.out.println("Flattening using Recursive Method:");
        flatten(root1);
        printLinkedList(root1);

        // Recreating the binary tree for second method
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(5);
        root2.left.left = new Node(3);
        root2.left.right = new Node(4);
        root2.right.right = new Node(6);

        System.out.println("\nFlattening using Morris Traversal Method:");
        flatten2(root2);
        printLinkedList(root2);
    }
}
