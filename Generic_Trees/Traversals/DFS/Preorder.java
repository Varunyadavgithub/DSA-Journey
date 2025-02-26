package Generic_Trees.Traversals.DFS;

import java.util.ArrayList;
import java.util.List;

/* Preorder traversal of a Generic Tree. */

public class Preorder {
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

    public static void preorder(Node root) {
        if (root.child.isEmpty()) { // Base case
            System.out.print(root.val + " ");
            return;
        }
        System.out.print(root.val + " "); // Node is printed before calling the children
        int n = root.child.size(); // Number of children
        for (int i = 0; i < n; i++) {
            Node child = root.child.get(i); // ith child
            preorder(child);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(30);
        formGenericTree(root);
        System.out.print("Preorder are: ");
        preorder(root);
    }
}
