package Binary_Trees.Questions;

import java.util.ArrayList;
import java.util.List;

/* Binary Tree Paths. (Leetcode 257)*/

public class BinaryTreePaths {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void helper(Node root, List<String> ans, String s) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            s += root.val;
            ans.add(s);
            return;
        }
        helper(root.left, ans, s + root.val + "->");
        helper(root.right, ans, s + root.val + "->");
    }

    public static List<String> binaryTreePaths(Node root) {
        List<String> ans = new ArrayList<>();
        helper(root, ans, "");
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        root.left.right.left = new Node(6);

        List<String> paths = binaryTreePaths(root);

        System.out.println("Root-to-leaf paths:");
        for (String path : paths) {
            System.out.println(path);
        }
    }
}
