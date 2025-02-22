package Binary_Trees.Questions.Advance;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* Amount of Time for Binary Tree to be Infected. (Leetcode 2385) */

public class AmountOfTime {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    // Get the node where infection starts
    public static Node getNode(Node root, int start) {
        if (root == null) return null;
        if (root.val == start) return root;
        Node left = getNode(root.left, start);
        Node right = getNode(root.right, start);
        return left != null ? left : right;
    }

    // Store parent pointers using DFS (preOrder)
    public static void preOrder(Node root, Map<Node, Node> parent) {
        if (root == null) return;
        if (root.left != null) parent.put(root.left, root);
        if (root.right != null) parent.put(root.right, root);
        preOrder(root.left, parent);
        preOrder(root.right, parent);
    }

    // Function to calculate the time required for infection
    public static int amountOfTime(Node root, int start) {
        if (root == null) return 0;

        Node node = getNode(root, start);
        Map<Node, Node> parent = new HashMap<>();
        preOrder(root, parent);

        // BFS to calculate infection spread time
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        Map<Node, Integer> visited = new HashMap<>();
        visited.put(node, 0);

        int maxTime = 0;
        while (!q.isEmpty()) {
            Node temp = q.remove();
            int level = visited.get(temp);
            maxTime = Math.max(maxTime, level);

            // Left Child
            if (temp.left != null && !visited.containsKey(temp.left)) {
                q.add(temp.left);
                visited.put(temp.left, level + 1);
            }
            // Right Child
            if (temp.right != null && !visited.containsKey(temp.right)) {
                q.add(temp.right);
                visited.put(temp.right, level + 1);
            }
            // Parent Node
            if (parent.containsKey(temp) && !visited.containsKey(parent.get(temp))) {
                q.add(parent.get(temp));
                visited.put(parent.get(temp), level + 1);
            }
        }
        return maxTime;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(5);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(10);
        root.right.right = new Node(6);
        root.left.left.left = new Node(9);
        root.left.left.right = new Node(2);

        int start = 3;
        int time = amountOfTime(root, start);
        System.out.println("Time required for the tree to be fully infected: " + time + " minutes");
    }
}
