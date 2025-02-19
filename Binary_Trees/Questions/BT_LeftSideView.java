package Binary_Trees.Questions;

import java.util.ArrayList;
import java.util.List;

/* Binary Tree Left Side View 
 * 
 * Method - 1 (Level Order Traversal)
 *      Step-1: Perform Level Order Traversal.
 *      Step-2: Pick the first element from each level.
 *      
 *      EX: {{1}, {2,3}, {4,5,6,7}, {8}}
 *          ans => {1,2,4,8} 
 * 
 * Method - 2 (Preorder Traversal)
 *      Step-1: Perform Preorder Traversal.
 *      Step-2: Keep track of levels and pick the first element encountered at each level.
 *      
 *      EX: {1,2,3,4,5,6,7}
 *          {1,2,4,8,5,3,6,7} (Preorder Traversal)
 *          No. of levels = 4 (calculated by Level Order Traversal)
 *          ans = {1,2,4,8}  
 */

public class BT_LeftSideView {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void preOrder(Node root, List<Integer> ans, int level) {
        if (root == null)
            return;

        // If this is the first node at this level, add it to the answer list
        if (ans.size() < level) {
            ans.add(root.val);
        }

        preOrder(root.left, ans, level + 1);
        preOrder(root.right, ans, level + 1);
    }

    public static List<Integer> leftSideView(Node root) {
        List<Integer> ans = new ArrayList<>();
        preOrder(root, ans, 1);
        return ans;
    }

    public static void main(String[] args) {
        // Construct the Binary Tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.right = new Node(8); // 8 is the right child of 4

        // Print Left Side View
        List<Integer> leftView = leftSideView(root);
        System.out.println("Left Side View: " + leftView);
    }
}
