package Generic_Trees.Questions;

import java.util.ArrayList;
import java.util.List;

/* Find the node with the minimum value in the given tree. */

public class MinValue {
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

    public static int findMin(Node root) {
        if (root.child.isEmpty())
            return root.val;

        int maxTillNow = root.val;
        int n = root.child.size();
        for (int i = 0; i < n; i++) {
            int childMax = findMin(root.child.get(i));
            if (childMax < maxTillNow)
                maxTillNow = childMax;
        }
        return maxTillNow;
    }

    public static void main(String[] args) {
        Node root = new Node(30);
        formGenericTree(root);
        System.out.print("The minimum value in Tree is: " + findMin(root));
    }
}
