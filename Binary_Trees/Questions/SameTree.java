package Binary_Trees.Questions;

/* Same Tree. (Leetcode 100)*/

public class SameTree {
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

    public static void main(String[] args) {
        Node p = new Node(1);
        p.left = new Node(2);
        p.right = new Node(3);

        Node q = new Node(1);
        q.left = new Node(2);
        q.right = new Node(3);

        boolean result = isSameTree(p, q);
        System.out.println("Are both trees the same? " + result);

        // Creating another tree with different structure
        Node r = new Node(1);
        r.left = new Node(2);

        boolean result2 = isSameTree(p, r);
        System.out.println("Are p and r the same? " + result2);
    }
}
