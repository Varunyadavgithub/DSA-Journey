package Binary_Trees;

/* Find the product of the tree. */

public class ProdOfTree {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static int findProduct(Node root) {
        if (root == null)
            return 1;
        return root.val * findProduct(root.left) * findProduct(root.right);
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

        Node g = new Node(8);

        b.left = null;
        b.right = g;

        Node h = new Node(13);

        g.left = h;
        g.right = null;
        System.out.println("The product of tree node is: " + findProduct(root));
    }
}
