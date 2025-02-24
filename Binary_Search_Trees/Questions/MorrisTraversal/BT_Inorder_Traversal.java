package Questions.MorrisTraversal;

import java.util.ArrayList;
import java.util.List;

/* Binary Tree Inorder Traversal. (Leetcode 94) */

public class BT_Inorder_Traversal {
    public static class Node {
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static List<Integer> inorderTraversal(Node root) {
        Node curr = root;
        List<Integer> arr = new ArrayList<>();
        while (curr != null) {
            if (curr.left != null) { // find Predecessor
                Node prev = curr.left;
                while (prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }
                if (prev.right == null) { // Connect Predecessor to current
                    prev.right = curr;
                    curr = curr.left;
                }
                if (prev.right == curr) { // Unlink Predecessor
                    prev.right = null;
                    arr.add(curr.val);
                    curr = curr.right;

                }
            } else { // curr.left = null, no Predecessor
                arr.add(curr.val);
                curr = curr.right;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);
        System.out.println(inorderTraversal(root));
    }
}
