package Generic_Trees.Traversals.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/* Reverse Levelorder traversal of a Generic Tree. */

public class ReverseLevelorder {
    public static class Node {
        int val;
        List<Node> child;

        Node(int val) {
            this.val = val;
            child = new ArrayList<>();
        }
    }

    // Forming a sample generic tree
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

    // Reverse level-order traversal function
    public static void revLevelorder(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        Stack<Node> stack = new Stack<>();

        // Start with the root node
        q.add(root);

        // Perform level-order traversal and store nodes in the stack
        while (!q.isEmpty()) {
            Node currNode = q.poll();
            stack.push(currNode); // Push node into stack to reverse the order

            // Add children of current node to the queue
            for (Node child : currNode.child) {
                q.add(child);
            }
        }

        // Now, pop elements from the stack to print them in reverse level-order
        while (!stack.isEmpty()) {
            System.out.print(stack.pop().val + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(30);
        formGenericTree(root);
        System.out.print("Reverse Levelorder is: ");
        revLevelorder(root); // Print reverse level-order traversal
    }
}
