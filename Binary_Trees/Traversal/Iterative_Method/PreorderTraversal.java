package Binary_Trees.Traversal.Iterative_Method;

import java.util.Stack;

/* Iterative Method for Preorder Traversal. */

public class PreorderTraversal {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void iterativePreorder(Node root) {
        // Preorder => root -> left -> right
        if (root == null)
            return;
        Stack<Node> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            Node curr = st.pop();
            System.out.print(curr.val + " ");
            // Push right child first so left is processed first
            if (curr.right != null)
                st.push(curr.right);
            if (curr.left != null)
                st.push(curr.left);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(7);
        Node b = new Node(9);

        root.left = a;
        root.right = b;

        Node c = new Node(2);
        Node d = new Node(6);

        a.left = c;
        a.right = d;

        Node e = new Node(8);
        Node f = new Node(7);

        d.left = e;
        d.right = f;

        Node g = new Node(0);

        b.right = g;

        Node h = new Node(13);

        g.left = h;
        iterativePreorder(root);
    }
}
