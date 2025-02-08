package Binary_Trees.Questions;

/* Diameter of Binary Tree. (Leetcode 543)
* Given the root of a binary tree, return the length of the diameter of the tree.
* The diameter of a binary tree is the length of the longest path between any two nodes in a tree. 
* This path may or may not pass through the root. 
* The length of a path between two nodes is represented by the number of edges between them.
* 
* Example 1:
*   Input: root = [1,2,3,4,5]
*   Output: 3
*   Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
*
*Example 2:
*   Input: root = [1,2]
*   Output: 1
*
*Constraints:
*       The number of nodes in the tree is in the range [1, 104].
*       -100 <= Node.val <= 100
*/

public class DiameterOfBT {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static int height(Node root) {
        if (root == null || (root.left == null && root.right == null))
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int diameterOfBinaryTree(Node root) {
        if (root == null || (root.left == null && root.right == null))
            return 0;
        int leftAns = diameterOfBinaryTree(root.left);
        int rightAns = diameterOfBinaryTree(root.right);
        int mid = height(root.left) + height(root.right);
        if (root.right != null)
            mid++;
        if (root.left != null)
            mid++;
        int max = Math.max(leftAns, Math.max(rightAns, mid));
        return max;
    }
    public static void main(String[] args) {
        /* 
               1
              / \
             2   3
            / \
           4   5
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Diameter of the Binary Tree: " + diameterOfBinaryTree(root));
    }
}
