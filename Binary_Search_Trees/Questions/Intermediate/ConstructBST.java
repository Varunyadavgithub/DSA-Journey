package Questions.Intermediate;

/* Construct BST from Preorder Traversal. (Leetcode 1008) */

public class ConstructBST {
    public static class Node {
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void printInOrder(Node root) {
        if (root == null)
            return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }

    public static Node insertIntoBST(Node root, int val) {
        if (root == null)
            return new Node(val);
        if (root.val > val) { // go left
            if (root.left == null)
                root.left = new Node(val);
            else
                insertIntoBST(root.left, val);
        } else { // go right
            if (root.right == null)
                root.right = new Node(val);
            else
                insertIntoBST(root.right, val);
        }
        return root;
    }

    public static Node bstFromPreorder(int[] preorder) {
        Node root = new Node(preorder[0]);
        for (int i = 1; i < preorder.length; i++)
            root = insertIntoBST(root, preorder[i]);
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = { 8, 5, 1, 7, 10, 12 };
        Node root = bstFromPreorder(preorder);
        printInOrder(root);
    }
}
