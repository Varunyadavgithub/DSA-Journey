package Generic_Trees.Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* Given a tree where every node contains variable number of children, convert the tree to its mirror */

public class MirrorTree {
    public static class Node {
        int val;
        List<Node> child;

        Node(int val) {
            this.val = val;
            child = new ArrayList<>();
        }
    }

    public static void formGenericTree(Node root) {
        root.child.add(new Node(5));
        root.child.add(new Node(11));
        root.child.add(new Node(63));

        root.child.get(0).child.add(new Node(1));
        root.child.get(0).child.add(new Node(4));
        root.child.get(0).child.add(new Node(8));

        root.child.get(1).child.add(new Node(6));
        root.child.get(1).child.add(new Node(7));
        root.child.get(1).child.add(new Node(15));

        root.child.get(2).child.add(new Node(31));
        root.child.get(2).child.add(new Node(55));
        root.child.get(2).child.add(new Node(65));
    }

    // Reverse the order of children
    public static void reverse(List<Node> childList) {
        int left = 0, right = childList.size() - 1;
        while (left < right) {
            Node temp = childList.get(left);
            childList.set(left, childList.get(right));
            childList.set(right, temp);
            left++;
            right--;
        }
    }

    // Convert the tree into its mirror
    public static void mirrorImage(Node root) {
        if (root == null || root.child.isEmpty()) {
            return;
        }

        // Recur for all children first
        for (Node node : root.child) {
            mirrorImage(node);
        }

        // Reverse the children list
        reverse(root.child);
    }

    // Print tree level-wise (Breadth-First Search)
    public static void printTree(Node root) {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                Node curr = queue.poll();
                System.out.print(curr.val + " ");

                for (Node child : curr.child) {
                    queue.add(child);
                }
            }
            System.out.println(); // New line for each level
        }
    }

    public static void main(String[] args) {
        Node root = new Node(30);
        formGenericTree(root);

        System.out.println("Original Tree:");
        printTree(root);

        mirrorImage(root);

        System.out.println("Mirror Image of the Tree:");
        printTree(root);
    }
}
