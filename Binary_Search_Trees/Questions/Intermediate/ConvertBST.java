package Questions.Intermediate;

/* Convert BST to Greater Tree. (Leetcode 538) */

public class ConvertBST {
    static int sum = 0;

    public static class Node {
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void printInOrder(Node root) {
        if (root == null)
            return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }

    public static void helper(Node root) {
        if (root == null)
            return;
        helper(root.right);
        root.val = root.val + sum;
        sum = root.val;
        helper(root.left);
    }

    public static Node convertBST(Node root) {
        sum = 0;
        helper(root);
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(1);
        root.right = new Node(6);
        root.left.left = new Node(0);
        root.left.right = new Node(2);
        root.left.right.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);
        root.right.right.right = new Node(8);
        root = convertBST(root);
        printInOrder(root);
    }
}
