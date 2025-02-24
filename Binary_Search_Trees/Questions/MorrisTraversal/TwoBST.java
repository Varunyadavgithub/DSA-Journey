package Questions.MorrisTraversal;

import java.util.ArrayList;
import java.util.List;

/* All Elements in two Binary Search Tree. (Leetcode 1305) */

public class TwoBST {
    public static class Node {
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;
        }
    }

    // Morris Traversal function to get sorted elements of BST
    public static List<Integer> morrisTraversal(Node root) {
        List<Integer> result = new ArrayList<>();
        Node curr = root;
        while (curr != null) {
            if (curr.left == null) {
                result.add(curr.val);
                curr = curr.right;
            } else {
                Node prev = curr.left;
                while (prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }
                if (prev.right == null) { // Establish a temporary link
                    prev.right = curr;
                    curr = curr.left;
                } else { // Remove the link and visit node
                    prev.right = null;
                    result.add(curr.val);
                    curr = curr.right;
                }
            }
        }
        return result;
    }

    // Merge two sorted lists into one sorted list
    private static List<Integer> mergeSortedLists(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                merged.add(arr1.get(i++));
            } else {
                merged.add(arr2.get(j++));
            }
        }
        while (i < arr1.size()) {
            merged.add(arr1.get(i++));
        }
        while (j < arr2.size()) {
            merged.add(arr2.get(j++));
        }
        return merged;
    }

    // Function to get all elements from both BSTs in sorted order
    public static List<Integer> getAllElements(Node root1, Node root2) {
        List<Integer> arr1 = morrisTraversal(root1);
        List<Integer> arr2 = morrisTraversal(root2);
        return mergeSortedLists(arr1, arr2);
    }

    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(1);
        root2.left = new Node(0);
        root2.right = new Node(3);

        List<Integer> result = getAllElements(root1, root2);
        System.out.println(result); // Expected output: [0, 1, 1, 2, 3, 4]
    }
}
