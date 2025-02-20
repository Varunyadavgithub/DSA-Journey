package Binary_Trees.Questions;

public class PathSumIII {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static int noOfPaths(Node root, long targetSum) {
        if (root == null)
            return 0;
        int count = 0;
        if ((long) (root.val) == targetSum)
            count++;
        return count + noOfPaths(root.left, targetSum - (long) (root.val))
                + noOfPaths(root.right, targetSum - (long) (root.val));
    }

    public static int pathSum(Node root, int targetSum) {
        if (root == null)
            return 0;
        int count = noOfPaths(root, (long) (targetSum));
        count += (pathSum(root.left, targetSum) + pathSum(root.right, targetSum));
        return count;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(-3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        root.right.right = new Node(11);
        root.left.left.left = new Node(3);
        root.left.left.right = new Node(-2);
        root.left.right.right = new Node(1);

        int targetSum = 8;
        System.out.println("Number of paths summing to " + targetSum + " are: " + pathSum(root, targetSum));
    }
}
