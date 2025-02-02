package Binary_Trees;

/* Find the height of Binary Tree.
* Note:- In a binary tree, the height of a node is the longest path from that node to a leaf. 
*/
public class HeightOfTree {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }

    }

    public static int heightInEdges(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null) // leaf node case
            return 0;
        return 1 + Math.max(heightInEdges(root.left), heightInEdges(root.right));
    }

    public static int heightInNodes(Node root) {
        if (root == null)
            return 0; // Height of an empty tree is 0
        return 1 + Math.max(heightInNodes(root.left), heightInNodes(root.right));
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
        System.out.println("The height of Tree is (in terms of Edges): " + heightInEdges(root));
        System.out.println("The height of Tree is (in terms of Nodes): " + heightInNodes(root));
    }
}
