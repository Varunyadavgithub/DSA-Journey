package LinkedList.Questions;

/* Finding the nth Node from the end of Linkedlist (Only head is given) and return that node. */

public class nth_Node {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Approach-1 T.C = O(n) S.C = O(1)

    // public static Node findNthNode(Node head,int n){
    // int size=0;
    // Node temp=head;

    // while (temp!=null) {
    // size++;
    // temp=temp.next;
    // }
    // int m=size-n+1;
    // //mth node from start
    // temp=head;
    // for(int i=1;i<=m-1;i++){
    // temp=temp.next;
    // }
    // return temp;
    // }

    // Approach-2 T.C = O(n) S.C = O(1)

    public static Node findNthNode(Node head, int n) {
        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node q = findNthNode(a, 3);
        System.out.println(q.data);
    }
}
