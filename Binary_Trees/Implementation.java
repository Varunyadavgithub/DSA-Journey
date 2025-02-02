package Binary_Trees;

/* Implementation of Binary Trees */

public class Implementation {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        System.out.println(root.val);
    }
}
