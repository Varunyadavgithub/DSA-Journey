package Binary_Trees.Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* Binary Tree Right Side View. (Leetcode 199) 
 * 
 * Method - 1: Level Order Traversal
 *      Step-1: Perform Level Order Traversal using a queue.
 *      Step-2: Store the last node of each level in the result list.
 *      
 *      Example:
 *      Tree:  
 *            1
 *           / \
 *          2   3
 *         / \   \
 *        4   5   7
 *       /
 *      8
 *      
 *      Level Order: {{1}, {2,3}, {4,5,7}, {8}}
 *      Right Side View: {1,3,7,8}
 * 
 * Method - 2: Preorder Traversal with Level Tracking
 *      Step-1: Perform Preorder Traversal (Root -> Right -> Left).
 *      Step-2: Track the level and update the rightmost node at each level.
 *      
 *      Example:
 *      Tree:  
 *            1
 *           / \
 *          2   3
 *         / \   \
 *        4   5   7
 *       /
 *      8
 *      
 *      Preorder Traversal: {1,3,7,2,5,4,8}
 *      Levels:  {1,2,3,4}  (Calculated using Level Order Traversal)
 *      Right Side View Update: 
 *      Initial: {}  
 *      After Traversal: {1,3,7,8}  
 */

public class BT_RightSideView {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    // Method 1: Level Order Traversal
    public static List<Integer> rightSideView_LevelOrder(Node root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int lastValue = 0; // Store the last node value at this level

            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();
                lastValue = curr.val;

                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }

            ans.add(lastValue);
        }

        return ans;
    }

    // Method 2: Preorder Traversal with Level Tracking
    public static void preOrder(Node root, List<Integer> ans, int level) {
        if (root == null) return;

        // If it's the first node encountered at this level, add it
        if (level == ans.size()) {
            ans.add(root.val);
        }

        // Right subtree first to ensure the rightmost node is stored
        preOrder(root.right, ans, level + 1);
        preOrder(root.left, ans, level + 1);
    }

    public static List<Integer> rightSideView_PreOrder(Node root) {
        List<Integer> ans = new ArrayList<>();
        preOrder(root, ans, 0);
        return ans;
    }

    // Main function to test the implementation
    public static void main(String[] args) {
        // Creating a sample binary tree
        /*
                  1
                 / \
                2   3
               / \   \
              4   5   7
             /
            8
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);

        // Testing Level Order Method
        System.out.println("Right Side View (Level Order): " + rightSideView_LevelOrder(root));

        // Testing Preorder Method
        System.out.println("Right Side View (Preorder): " + rightSideView_PreOrder(root));
    }
}
