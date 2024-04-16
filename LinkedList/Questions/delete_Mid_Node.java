package LinkedList.Questions;
// LeetCode-2095
/* Deleting the middle element of the linkedlist */

public class delete_Mid_Node {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static void display(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    // T.C = O(n)   S.C = O(1)
    public static Node deleteMiddle(Node head){
        // Basecase
        if(head.next==null){
            return null;
        }

        Node slow=head;
        Node fast=head;

        while (fast.next.next!=null && fast.next.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }

     /* Note: For even no. of nodes it will delete right middle */
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(5);
        head.next.next=new Node(10);
        head.next.next.next=new Node(13);
        head.next.next.next.next=new Node(12);

        System.out.print("Before delete middle node: ");
        display(head);

        System.out.println();

        deleteMiddle(head);
        System.out.print("After delete the middle node: ");
        display(head);
    }
}
