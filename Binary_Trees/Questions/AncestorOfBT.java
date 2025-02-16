package Binary_Trees.Questions;

/* Lowest Common Ancestor of a Binary Tree. (Leetcode 236) */

public class AncestorOfBT {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static boolean contains(Node root, Node node) {
        if (root == null)
            return false;
        if (root == node)
            return true;
        return contains(root.left, node) || contains(root.right, node);
    }

    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null || root == p || root == q)
            return root;

        Node left = lowestCommonAncestor(root.left, p, q);
        Node right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null)
            return root; // If p and q are found in different subtrees, root is LCA

        return (left != null) ? left : right; // Otherwise, return the non-null side
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        /*
                3
               / \
              5   1
             / \  / \
            6   2 0  8
               / \
              7   4
        */
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);

        Node p = root.left; // Node 5
        Node q = root.left.right.right; // Node 4

        // Finding LCA
        Node lca = lowestCommonAncestor(root, p, q);

        // Printing result
        System.out.println("Lowest Common Ancestor of " + p.val + " and " + q.val + " is: " + (lca != null ? lca.val : "null"));
    }
}
