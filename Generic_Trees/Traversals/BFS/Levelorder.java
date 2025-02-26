package Generic_Trees.Traversals.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* Levelorder traversal of a Generic Tree. */

public class Levelorder {
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

    public static void levelorder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node currNode = q.peek();
            System.out.print(currNode.val + " ");
            q.remove();
            int noOfChildren = currNode.child.size();
            for (int i = 0; i < noOfChildren; i++) {
                q.add(currNode.child.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(30);
        formGenericTree(root);
        System.out.print("Levelorder are: ");
        levelorder(root);
    }
}
