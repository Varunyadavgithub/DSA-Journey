package Binary_Search_Trees;

/* Insert in a Binary Search Tree. (Leetcode 701) */

public class InsertBST {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static Node insertBST(Node root, int val) {
        if (root == null)
            return new Node(val); // Insert new node at correct position
        if (val < root.val)
            root.left = insertBST(root.left, val);
        else
            root.right = insertBST(root.right, val);
        return root;
    }

    // Inorder traversal to print BST
    public static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        // Given values: 50, 20, 60, 17, 34, 55, 89, 10, 28, 70, 14
        int[] values = { 50, 20, 60, 17, 34, 55, 89, 10, 28, 70, 14 };
        Node root = null;
        for (int val : values) {
            root = insertBST(root, val);
        }

        System.out.print("BST before insertion: ");
        inorder(root);
        System.out.println();

        int newValue = 25; // Insert new value into BST
        root = insertBST(root, newValue);

        System.out.print("BST after inserting " + newValue + ": ");
        inorder(root);
        System.out.println();
    }
}
