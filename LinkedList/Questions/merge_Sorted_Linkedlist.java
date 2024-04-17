package LinkedList.Questions;

/* Merge the two sorted Linkedlists */

public class merge_Sorted_Linkedlist {
    public static class Node {
        int data;
        Node next;

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

    // Approach-1 Using extra space
    public static Node merge(Node headA, Node headB) {
        Node temp1 = headA;
        Node temp2 = headB;

        Node dummy = new Node(-1);
        Node temp = dummy;

        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                Node a = new Node(temp1.data);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            } else {
                Node a = new Node(temp2.data);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            }
        }

        if (temp1 == null) {
            temp.next = temp2;
        } else {
            temp.next = temp1;
        }
        return dummy.next;
    }

    // Approach-2 Without using extra space
    // public static Node merge(Node headA,Node headB){

    // }
    public static void main(String[] args) {
        Node headA = new Node(1);
        headA.next = new Node(3);
        headA.next.next = new Node(5);
        headA.next.next.next = new Node(8);

        Node headB = new Node(2);
        headB.next = new Node(4);
        headB.next.next = new Node(6);
        headB.next.next.next = new Node(7);

        System.out.println("Before merge the both Linkedlist:");
        System.out.print("first Linkedlist is: ");
        display(headA);

        System.out.println();

        System.out.print("Second Linkedlist is: ");
        display(headB);

        System.out.println();

        System.out.println("After merge the both Linkedlist: ");
        display(merge(headA, headB));
    }
}
