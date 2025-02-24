package Questions.MorrisTraversal;

/* Recover Binary Search Tree. (Leetcode 99) */

import java.util.*;

public class RecoverBST {
    public static class Node {
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;
        }
    }

    private static Node first, middle, last, prev;

    // Morris Traversal to recover the BST
    public static void recoverTree(Node root) {
        first = middle = last = prev = null;
        morrisTraversal(root);
        if (first != null && last != null) {
            int temp = first.val;
            first.val = last.val;
            last.val = temp;
        } else if (first != null && middle != null) {
            int temp = first.val;
            first.val = middle.val;
            middle.val = temp;
        }
    }

    private static void morrisTraversal(Node root) {
        Node curr = root;
        while (curr != null) {
            if (curr.left == null) {
                detectSwappedNodes(curr);
                curr = curr.right;
            } else {
                Node prevNode = curr.left;
                while (prevNode.right != null && prevNode.right != curr) {
                    prevNode = prevNode.right;
                }
                if (prevNode.right == null) {
                    prevNode.right = curr;
                    curr = curr.left;
                } else {
                    prevNode.right = null;
                    detectSwappedNodes(curr);
                    curr = curr.right;
                }
            }
        }
    }

    private static void detectSwappedNodes(Node node) {
        if (prev != null && prev.val > node.val) {
            if (first == null) {
                first = prev;
                middle = node;
            } else {
                last = node;
            }
        }
        prev = node;
    }

    public static void levelOrder(Node root) {
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
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(4);
        root.right.left = new Node(2);

        System.out.println("Before recovery (Level Order):");
        levelOrder(root);
        recoverTree(root);
        System.out.println("After recovery (Level Order):");
        levelOrder(root);
    }
}