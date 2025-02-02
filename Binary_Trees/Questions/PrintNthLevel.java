package Binary_Trees.Questions;

/* Print the elements of nth level.  */

public class PrintNthLevel {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void nthLevel(Node root, int n) {
        if (root == null)
            return;
        if (n == 1)
            System.out.print(root.val + " ");
        nthLevel(root.left, n - 1);
        nthLevel(root.right, n - 1);
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
        int n=3;
        nthLevel(root,n);
    }
}
