package Binary_Trees;

/* Find the node with min value.
*  Formula :- min(root) = min[root.val, min(root.left), min(root.right)]
*/

public class MinValue {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }

    }

    public static int minVal(Node root) {
        if (root == null)
            return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(minVal(root.left), minVal(root.right)));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(7);
        Node b = new Node(9);

        root.left = a;
        root.right = b;

        Node c = new Node(-10);
        Node d = new Node(6);

        a.left = c;
        a.right = d;

        Node e = new Node(8);
        Node f = new Node(7);

        d.left = e;
        d.right = f;

        Node g = new Node(-1);

        b.left = null;
        b.right = g;

        Node h = new Node(13);

        g.left = h;
        g.right = null;
        System.out.println("The node with minimum value is: " + minVal(root));
    }
}
