package Binary_Trees.Questions;

/* Balanced Binary Tree. (Leetcode 110)*/

public class BalancedBT {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static int height(Node root) {
        if (root == null || (root.left == null && root.right == null))
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static boolean isBalanced(Node root) {
        if (root == null)
            return true;
        int lh = height(root.left);
        if (root.left != null)
            lh++;
        int rh = height(root.right);
        if (root.right != null)
            rh++;
        int diff = lh - rh;
        if (diff < 0)
            diff *= -1;
        if (diff > 1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.left.left.left = new Node(5);

        System.out.println(isBalanced(root));
    }
}
