package Binary_Search_Trees.Questions;

/*
 * Search in BST. (Leetcode 700)
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Search_In_BST {
    public static TreeNode searchInBST(TreeNode root, int val) {
        if (root == null)
            return null;
        if (root.val == val)
            return root;
        if (root.val > val)
            return searchInBST(root.left, val);
        if (root.val < val)
            return searchInBST(root.right, val);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int searchValue1 = 2;
        TreeNode result1 = searchInBST(root, searchValue1);
        if (result1 != null) {
            System.out.println("Search result for value " + searchValue1 + ": " + result1.val);
        } else {
            System.out.println("Search result for value " + searchValue1 + ": Not found");
        }

        int searchValue2 = 5;
        TreeNode result2 = searchInBST(root, searchValue2);
        if (result2 != null) {
            System.out.println("Search result for value " + searchValue2 + ": " + result2.val);
        } else {
            System.out.println("Search result for value " + searchValue2 + ": Not found");
        }
    }
}
