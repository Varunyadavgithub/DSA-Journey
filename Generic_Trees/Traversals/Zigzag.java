package Generic_Trees.Traversals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* ZigZag order traversal of a Generic Tree. */

public class Zigzag {
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

    public static void reverse(List<Node> nodeList) {
        int left = 0, right = nodeList.size() - 1;
        while (left < right) {
            Node temp = nodeList.get(left);
            nodeList.set(left, nodeList.get(right));
            nodeList.set(right, temp);
            left++;
            right--;
        }
    }

    public static void printNodeList(List<Node> nodeList) {
        for (int i = 0; i < nodeList.size(); i++) {
            System.out.print(nodeList.get(i).val + " ");
        }
    }

    public static void zigzagorder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean flag = false;
        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Node> currLevel = new ArrayList<>();
            while (levelSize-- > 0) {
                Node currNode = q.peek();
                currLevel.add(currNode);
                q.remove();
                int noOfChildren = currNode.child.size();
                for (int i = 0; i < noOfChildren; i++) {
                    q.add(currNode.child.get(i));
                }
            }
            if (flag == false) {
                printNodeList(currLevel);
            } else {
                reverse(currLevel);
                printNodeList(currLevel);
            }
            flag = !flag;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(30);
        formGenericTree(root);
        System.out.print("Zigzagorder are: ");
        zigzagorder(root);
    }
}
