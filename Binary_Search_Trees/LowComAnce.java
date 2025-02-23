import java.util.LinkedList;
import java.util.Queue;

/* Lowest Common Ancestor of a Binary Search Tree. (Leetcode 235) */

public class LowComAnce {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null)
            return null;
        if (root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);
        if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);
        return root;
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

    // Function to find a node by its value
    public static Node findNode(Node root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (val < root.val) {
            return findNode(root.left, val);
        }
        return findNode(root.right, val);
    }

    public static void main(String[] args) {
        // Given level order BST input
        String[] values = { "10", "6", "20", "3", "8", "15", "25", "1", "4", "7", "9", "12", "17", "22", "30" };

        // Construct BST
        Node root = constructBST(values);

        // Define the nodes to find LCA for
        Node p = findNode(root, 7); // Change this value as needed
        Node q = findNode(root, 9); // Change this value as needed

        // Find LCA
        Node lca = lowestCommonAncestor(root, p, q);
        if (lca != null) {
            System.out.println("Lowest Common Ancestor of " + p.val + " and " + q.val + " is: " + lca.val);
        } else {
            System.out.println("No Common Ancestor found.");
        }
    }
}
