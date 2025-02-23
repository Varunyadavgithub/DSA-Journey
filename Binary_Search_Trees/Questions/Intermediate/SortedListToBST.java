package Questions.Intermediate;
/* Convert Sorted List to Binary Search Tree. (Leetcode 109) */

public class SortedListToBST {
    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Definition for the binary tree node
    public static class Node {
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;
        }
    }

    // Helper function to construct the BST from the sorted array
    public static Node helper(int[] nums, int left, int right) {
        if (left > right)
            return null;
        int mid = left + (right - left) / 2;
        Node root = new Node(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }

    // Function to convert a sorted linked list to a balanced BST
    public static Node sortedListToBST(ListNode head) {
        // Calculate the length of LinkedList
        ListNode temp = head;
        int n = 0;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        // Convert LinkedList to Array
        int[] nums = new int[n];
        int i = 0;
        temp = head;
        while (temp != null) {
            nums[i++] = temp.val;
            temp = temp.next;
        }

        // Build the BST from the array
        return helper(nums, 0, n - 1);
    }

    // Function to print the tree in-order (for testing)
    public static void printInOrder(Node root) {
        if (root == null) {
            return;
        }
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }

    public static void main(String[] args) {
        // Create a sorted linked list: -10 -> -3 -> 0 -> 5 -> 9
        ListNode head = new ListNode(-10);
        head.next = new ListNode(-3);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(9);

        // Convert the sorted linked list to a balanced BST
        Node root = sortedListToBST(head);

        // Print the in-order traversal of the BST (should be -10 -3 0 5 9)
        printInOrder(root);
    }
}
