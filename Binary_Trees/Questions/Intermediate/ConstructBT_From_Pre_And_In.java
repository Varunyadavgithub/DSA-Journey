package Binary_Trees.Questions.Intermediate;

/* Construct Binary Tree from Preorder and Inorder Traversal. (Leetcode 105) */

import java.util.*;

public class ConstructBT_From_Pre_And_In {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static Node helper(int[] preorder, int prelow, int prehigh, int[] inorder, int inlow, int inhigh) {
        if (prelow > prehigh)
            return null;

        Node root = new Node(preorder[prelow]);
        int i = inlow;
        while (inorder[i] != preorder[prelow])
            i++;

        int leftSize = i - inlow;
        root.left = helper(preorder, prelow + 1, prelow + leftSize, inorder, inlow, i - 1);
        root.right = helper(preorder, prelow + leftSize + 1, prehigh, inorder, i + 1, inhigh);

        return root;
    }

    public static Node buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(preorder, 0, n - 1, inorder, 0, n - 1);
    }

    public static void printInorder(Node root) {
        if (root == null)
            return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    public static void printLevelOrder(Node root) {
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.print(temp.val + " ");
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
    }

    public static void main(String[] args) {
        int[] preorder = { 1, 2, 4, 5, 3, 6 };
        int[] inorder = { 4, 2, 5, 1, 6, 3 };

        Node root = buildTree(preorder, inorder);

        System.out.println("Inorder traversal of constructed tree:");
        printInorder(root);

        System.out.println("\nLevel Order Traversal:");
        printLevelOrder(root);
    }
}
