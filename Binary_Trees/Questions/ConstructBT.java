package Binary_Trees.Questions;

import java.util.LinkedList;
import java.util.Queue;

/* Construct tree from Level Order Traversal. */

public class ConstructBT {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void nthLevel(Node root, int n) {
        if (root == null)
            return;
        if (n == 1) {
            System.out.print(root.val + " ");
            return;
        }
        nthLevel(root.left, n - 1);
        nthLevel(root.right, n - 1);
    }

    public static int height(Node root) {
        if (root == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static Node constructBfs(String[] arr) {
        if (arr.length == 0 || arr[0].equals(""))
            return null;

        Node root = new Node(Integer.parseInt(arr[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;

        while (i < arr.length) {
            Node temp = q.poll();
            if (temp == null)
                continue;

            // Left Child
            if (i < arr.length && !arr[i].equals("")) {
                temp.left = new Node(Integer.parseInt(arr[i]));
                q.add(temp.left);
            }
            i++;

            // Right Child
            if (i < arr.length && !arr[i].equals("")) {
                temp.right = new Node(Integer.parseInt(arr[i]));
                q.add(temp.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        String[] arr = { "1", "2", "3", "4", "5", "", "6", "", "7", "", "", "8", "", "", "", "9", "" };

        Node root = constructBfs(arr);
        int level = height(root);
        for (int i = 1; i <= level; i++) { // Start from 1 (level 1 is root)
            nthLevel(root, i);
            System.out.println();
        }
    }
}
