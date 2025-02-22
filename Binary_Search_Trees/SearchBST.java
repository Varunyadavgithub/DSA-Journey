package Binary_Search_Trees;

/* Search in a Binary Search Tree. (Leetcode 700) */

public class SearchBST {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static Node searchBST(Node root, int val) {
        if (root == null)
            return null;
        if (root.val == val)
            return root;
        if (root.val > val)
            return searchBST(root.left, val);
        return searchBST(root.right, val);
    }

    // Helper function to insert nodes into the BST
    public static Node insert(Node root, int val) {
        if (root == null)
            return new Node(val);
        if (val < root.val)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);
        return root;
    }

    public static void main(String[] args) {
        // Given values: 50, 20, 60, 17, 34, 55, 89, 10, 28, 70, 14
        int[] values = { 50, 20, 60, 17, 34, 55, 89, 10, 28, 70, 14 };
        Node root = null;
        for (int val : values) {
            root = insert(root, val);
        }

        int searchValue = 34; // Example search
        Node result = searchBST(root, searchValue);

        if (result != null) {
            System.out.println("Node found with value: " + result.val);
        } else {
            System.out.println("Node not found!");
        }
    }
}
