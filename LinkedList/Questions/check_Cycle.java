package LinkedList.Questions;
// LeetCode-141
/* Check is there cycle in a linkedlist */

public class check_Cycle {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // T.C = O(n)  S.C = O(1)
    public static boolean hasCycle(Node head) {
        // Basecase
        if (head == null || head.next == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null) {
            if (slow == null)return false;
            slow = slow.next;
            if (fast.next == null)return false;
            fast = fast.next.next;
            if (fast == slow)return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(-4);

        head.next.next.next.next = head.next.next; // creating a cycle

        System.out.print("Has Linkedlist cycle: " + hasCycle(head));
    }
}
