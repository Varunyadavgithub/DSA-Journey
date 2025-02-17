package Binary_Trees.Questions;

import java.util.LinkedList;
import java.util.Queue;

/* Boundary Traversal 
 * 
 * Given a Binary tree, print boundary nodes of the binary tree Anti-clockwise
 * starting from the root.
 * 
 * Step-1: Construct the tree.
 * Step-2: Create function for boundary traversal.
*/

public class BoundaryTraversal {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    // Construct tree using level order traversal
    public static Node constructBfs(String[] arr) {
        if (arr.length == 0 || arr[0].equals(""))
            return null;

        Node root = new Node(Integer.parseInt(arr[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;

        while (i < arr.length) {
            Node temp = q.poll();
            if (temp == null)
                continue;

            // Left Child
            if (i < arr.length && !arr[i].equals("")) {
                temp.left = new Node(Integer.parseInt(arr[i]));
                q.add(temp.left);
            }
            i++;

            // Right Child
            if (i < arr.length && !arr[i].equals("")) {
                temp.right = new Node(Integer.parseInt(arr[i]));
                q.add(temp.right);
            }
            i++;
        }
        return root;
    }

    public static void leftBoundary(Node root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) // Skip leaf nodes
            return;
        System.out.print(root.val + " ");
        if (root.left != null)
            leftBoundary(root.left);
        else
            leftBoundary(root.right);
    }

    public static void bottomBoundary(Node root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) { // Print only leaf nodes
            System.out.print(root.val + " ");
            return;
        }
        bottomBoundary(root.left);
        bottomBoundary(root.right);
    }

    public static void rightBoundary(Node root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) // Skip leaf nodes
            return;

        if (root.right != null)
            rightBoundary(root.right);
        else
            rightBoundary(root.left);

        System.out.print(root.val + " "); // Print in reverse order
    }

    public static void boundaryDisplay(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " "); // Print root first
        leftBoundary(root.left); // Print left boundary (excluding root)
        bottomBoundary(root.left); // Print leaf nodes from left subtree
        bottomBoundary(root.right); // Print leaf nodes from right subtree
        rightBoundary(root.right); // Print right boundary in reverse order
    }

    public static void main(String[] args) {
        String[] arr = { "1", "2", "3", "4", "5", "", "6", "7", "", "8", "", "9", "10", "", "11", "", "12", "", "13",
                "", "14", "15", "16", "", "17", "", "", "18", "", "19", "", "", "", "20", "21", "22", "23", "", "24",
                "25", "26", "27", "", "", "28", "", "" };
        Node root = constructBfs(arr);
        System.out.print("Boundary Traversal: ");
        boundaryDisplay(root);
    }
}
