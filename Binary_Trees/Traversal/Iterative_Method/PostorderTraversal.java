package Binary_Trees.Traversal.Iterative_Method;

import java.util.Stack;

/* Iterative Method for Postorder Traversal. */

public class PostorderTraversal {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void iterativePostorder(Node root) {
        // Postorder => left -> right -> root
        if (root == null)
            return;
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        st1.push(root);

        // Process node in reverse order using two stacks.
        while (!st1.isEmpty()) {
            Node curr = st1.pop();
            st2.push(curr);
            if (curr.left != null) {
                st1.push(curr.left);
            }
            if (curr.right != null) {
                st1.push(curr.right);
            }
        }
        // Print nodes in postorder by popping from st2
        while (!st2.isEmpty()) {
            Node curr = st2.pop();
            System.out.print(curr.val + " ");
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
        iterativePostorder(root);
    }
}
