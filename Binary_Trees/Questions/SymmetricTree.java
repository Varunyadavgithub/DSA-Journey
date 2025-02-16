package Binary_Trees.Questions;

/* Symmetric Tree. (Leetcode 101) */
/*
Hint:-
    step-1: Invert the left or right subtree.
    step-2: Check if left & right subtree are same or not.
*/

public class SymmetricTree {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static boolean isSameTree(Node p, Node q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static Node invertTree(Node root) {
        if (root == null)
            return root;
        Node l = invertTree(root.left);
        Node r = invertTree(root.right);
        root.left = r;
        root.right = l;
        return root;
    }

    public static boolean isSymmetric(Node root) {
        if (root == null)
            return true;
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(Node t1, Node t2) {
        if (t1 == null && t2 == null)
            return true;
        if (t1 == null || t2 == null)
            return false;
        return (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }

    public static void main(String[] args) {
        // Creating a symmetric binary tree
        /*
                1
               / \
              2   2
             / \ / \
            3  4 4  3
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);

        System.out.println("Is the tree symmetric? " + isSymmetric(root)); // Expected Output: true

        // Creating a non-symmetric binary tree
        /*
                1
               / \
              2   2
               \    \
                3    3
        */
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(2);
        root2.left.right = new Node(3);
        root2.right.right = new Node(3);

        System.out.println("Is the tree symmetric? " + isSymmetric(root2)); // Expected Output: false
    }
}
