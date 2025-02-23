/* Inorder, Preorder and Successor for a given key in Binart Search Tree.
 * Input:- key=60, values={50, 30, 70, 20, 40, 60, 80}
 * Output:- Inorder Traversal: 20 30 40 50 60 70 80
 *         Preorder Traversal: 50 30 20 40 70 60 80
 *        Inorder Successor of 60 is: 70
 */
public class BSTOperations {
    public static class Node {
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;
        }
    }

    // Function to insert nodes into BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Inorder Traversal (Left, Root, Right)
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    // Preorder Traversal (Root, Left, Right)
    public static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Function to find the inorder successor of a node
    public static Node inorderSuccessor(Node root, int key) {
        Node successor = null;
        Node current = root;

        while (current != null) {
            if (key < current.val) {
                successor = current; // Potential successor
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return successor;
    }

    public static void main(String[] args) {
        int[] values = { 50, 30, 70, 20, 40, 60, 80 }; // BST Input
        Node root = null;

        // Construct BST
        for (int val : values) {
            root = insert(root, val);
        }

        System.out.println("Inorder Traversal:");
        inorder(root);
        System.out.println("\nPreorder Traversal:");
        preorder(root);

        // Find Inorder Successor of key = 60
        int key = 60;
        Node successor = inorderSuccessor(root, key);
        if (successor != null) {
            System.out.println("\nInorder Successor of " + key + " is: " + successor.val);
        } else {
            System.out.println("\nNo Inorder Successor found for " + key);
        }
    }
}
