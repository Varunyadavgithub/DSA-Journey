import java.util.LinkedList;
import java.util.Queue;

/* Traversal of Binary Search Tree. (Preorder, Inorder, Postorder, Level Order) */

public class TraversalOfBST {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    // Function to construct BST from an array (level order insertion)
    public static Node constructBST(String[] arr) {
        if (arr.length == 0 || arr[0].equals(""))
            return null;

        Node root = new Node(Integer.parseInt(arr[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;

        while (i < arr.length) {
            Node temp = q.poll();

            // Left child
            if (i < arr.length && !arr[i].equals("")) {
                temp.left = new Node(Integer.parseInt(arr[i]));
                q.add(temp.left);
            }
            i++;

            // Right child
            if (i < arr.length && !arr[i].equals("")) {
                temp.right = new Node(Integer.parseInt(arr[i]));
                q.add(temp.right);
            }
            i++;
        }
        return root;
    }

    // Preorder Traversal (Root -> Left -> Right)
    public static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder Traversal (Left -> Root -> Right)
    public static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // Postorder Traversal (Left -> Right -> Root)
    public static void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    // Level Order Traversal (Breadth-First Search)
    public static void levelOrder(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.val + " ");

            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
        }
    }

    public static void main(String[] args) {
        // Given array representation of BST
        String[] arr = { "10", "5", "15", "2", "8", "12", "17" };

        // Construct BST
        Node root = constructBST(arr);

        // Print Traversals
        System.out.print("Preorder Traversal: ");
        preorder(root);
        System.out.println();

        System.out.print("Inorder Traversal: ");
        inorder(root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        postorder(root);
        System.out.println();

        System.out.print("Level Order Traversal: ");
        levelOrder(root);
        System.out.println();
    }
}
