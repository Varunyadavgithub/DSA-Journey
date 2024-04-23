package Doubly_LinkedList.Questions;

/* Two sum problem in doubly Linkkedlist(list is sorted in non-decreasing order).
 *
 * Write a method to find two nodes in the doubly linked list whose values sum up
 *  to a given target value 'x'.
 */
public class twoSum {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node getLastNode(Node head) {
        while (head != null && head.next != null) {
            head = head.next;
        }
        return head;
    }

    public static Node[] getNodesWithTwoSum(Node head, int x) {
        if (head == null)
            return null;
        Node start = head;
        Node end = getLastNode(head);
        while (start != null && end != null && start != end) {
            int sum = start.data + end.data;
            if (sum == x) {
                Node[] ans = { start, end };
                return ans;
            } else if (sum < x) {
                start = start.next;
            } else {
                end = end.prev;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);

        a.prev = null;
        a.next = b;
        b.prev = a;

        b.next = c;
        c.prev = b;

        c.next = d;
        d.prev = c;

        d.next = e;
        e.prev = d;

        e.next = f;
        f.prev = e;

        f.next = g;
        g.prev = f;

        g.next = h;
        h.prev = g;

        int x = 7;
        Node[] ans = getNodesWithTwoSum(a, x);
        if (ans != null) {
            System.out.println("Nodes with sum " + x + " : " + ans[0].data + " and " + ans[1].data);
        } else {
            System.out.println("No two nodes found with sum " + x);
        }
    }
}
