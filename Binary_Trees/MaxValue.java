package Binary_Trees;

/* Find the node with max value. 
 * Formula :- max(root) = max[root.val, max(root.left), max(root.right)]
*/

public class MaxValue {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }

    }

    public static int maxVal(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(maxVal(root.left), maxVal(root.right)));
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

        b.left = null;
        b.right = g;

        Node h = new Node(13);

        g.left = h;
        g.right = null;
        System.out.println("The node with maximum value is: " + maxVal(root));
    }
}
