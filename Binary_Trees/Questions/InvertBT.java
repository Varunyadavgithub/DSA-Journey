package Binary_Trees.Questions;

/* Invert Binary Tree. (Leetcode 226) */

public class InvertBT { // T.C = O(n), S.C = O(h)
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static Node invertTree(Node root) {
        if (root == null)
            return root;
        Node l = root.left;
        Node r = root.right;
        root.left = invertTree(r);
        root.right = invertTree(l);
        return root;
    }

    // Function to print tree in pre-order traversal
    public static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        /*
                4
               / \
              2   7
             / \  / \
            1   3 6  9
        */
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(9);

        System.out.println("Original Tree (Pre-order): ");
        preOrder(root);
        System.out.println();

        // Inverting the binary tree
        root = invertTree(root);

        System.out.println("Inverted Tree (Pre-order): ");
        preOrder(root);
        System.out.println();
    }
}
