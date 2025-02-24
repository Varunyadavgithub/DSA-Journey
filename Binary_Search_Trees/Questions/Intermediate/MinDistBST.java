package Questions.Intermediate;

/* Minimum Distance between BST Nodes. (Leetcode 783) */

public class MinDistBST {
    static int minDiff = Integer.MAX_VALUE;
    static Node prev = null;

    public static class Node {
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        if (prev != null) {
            int diff = Math.abs(root.val - prev.val);
            minDiff = Math.min(minDiff, diff);
        }
        prev = root;
        inorder(root.right);
    }

    public static int minDiffInBST(Node root) {
        minDiff = Integer.MAX_VALUE;
        prev = null;
        inorder(root);
        return minDiff;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(-1);
        root.right = new Node(48);
        root.right.left = new Node(12);
        root.right.right = new Node(49);
        System.out.println(minDiffInBST(root));
    }
}
