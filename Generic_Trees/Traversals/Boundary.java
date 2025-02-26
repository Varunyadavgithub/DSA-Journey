package Generic_Trees.Traversals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Boundary traversal of a Generic Tree. */

public class Boundary {
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

    // Print left boundary excluding leaf nodes
    public static void getLeftBoundary(Node root, List<Integer> boundary) {
        if (root == null || root.child.isEmpty())
            return;

        boundary.add(root.val);
        getLeftBoundary(root.child.get(0), boundary);
    }

    // Print leaf nodes (DFS)
    public static void getLeafNodes(Node root, List<Integer> boundary) {
        if (root == null)
            return;

        if (root.child.isEmpty()) { // Leaf node
            boundary.add(root.val);
            return;
        }

        for (Node child : root.child) {
            getLeafNodes(child, boundary);
        }
    }

    // Print right boundary in reverse order, excluding leaf nodes
    public static void getRightBoundary(Node root, List<Integer> boundary) {
        if (root == null || root.child.isEmpty())
            return;

        getRightBoundary(root.child.get(root.child.size() - 1), boundary);
        boundary.add(root.val);
    }

    public static void boundary(Node root) {
        if (root == null)
            return;

        List<Integer> boundaryNodes = new ArrayList<>();
        boundaryNodes.add(root.val);

        // Left boundary
        if (!root.child.isEmpty())
            getLeftBoundary(root.child.get(0), boundaryNodes);

        // Leaf nodes
        getLeafNodes(root, boundaryNodes);

        // Right boundary (reverse order)
        if (!root.child.isEmpty()) {
            List<Integer> rightBoundary = new ArrayList<>();
            getRightBoundary(root.child.get(root.child.size() - 1), rightBoundary);
            Collections.reverse(rightBoundary); // Reverse before adding
            boundaryNodes.addAll(rightBoundary);
        }

        // Print the boundary traversal
        for (int val : boundaryNodes) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(30);
        formGenericTree(root);
        System.out.print("Boundary Traversal is: ");
        boundary(root);
    }
}
