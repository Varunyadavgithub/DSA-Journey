package Questions.MorrisTraversal;

/* Trim Binary Search Tree. (Leetcode 669) 
 * Trim the tree so that all its elements lie in between low to heigh. 
*/

public class TrimBST {
    public static class Node {
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public static void levelOrder(Node root) {
        if (root == null)
            return;
        java.util.LinkedList<Node> que = new java.util.LinkedList<>();
        que.addLast(root);
        while (que.size() != 0) {
            Node rnode = que.removeFirst();
            System.out.print(rnode.val + " ");
            if (rnode.left != null)
                que.addLast(rnode.left);
            if (rnode.right != null)
                que.addLast(rnode.right);
        }
    }

    public static void helper(Node root, int low, int high) {
        if (root == null)
            return;
        while (root.left != null) { // trim karo
            if (root.left.val < low)
                root.left = root.left.right;
            else if (root.left.val > high)
                root.left = root.left.left;
            else
                break;
        }
        while (root.right != null) { // trim karo
            if (root.right.val < low)
                root.right = root.right.right;
            else if (root.right.val > high)
                root.right = root.right.left;
            else
                break;
        }
        helper(root.left, low, high);
        helper(root.right, low, high);
    }

    public static Node trimBST(Node root, int low, int high) {
        Node parent = new Node(Integer.MAX_VALUE);
        parent.left = root;
        helper(parent, low, high);
        return parent.left;
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(13);
        root.right.right = new Node(40);
        root.left.left.left = new Node(2);
        root.left.left.right = new Node(7);
        root.left.right.left = new Node(12);
        root.left.right.right = new Node(18);
        root.right.right.left = new Node(60);
        root.left.right.right.right = new Node(14);
        root.right.right.left.left = new Node(50);
        root.right.right.left.right = new Node(70);

        root = trimBST(root, 15, 30);
        System.out.println("Root value: " + root.val);
        System.out.print("Level Order Traversal: ");
        levelOrder(root);
        System.out.println();
        System.out.print("Inorder Traversal: ");
        inOrder(root);
    }
}
