package LinkedList.Questions;

/* Reverse a Linkedlist and return its new head. */

public class reverse_Linkedlist {
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

    // Approach-1   Using recursion
    // T.C = O(n)   S.C = O(n)

    // public static Node reverse(Node head){
    //     if (head.next==null) {
    //         return head;
    //     }
    //     Node newHead=reverse(head.next);
    //     head.next.next=head;
    //     head.next=null;
    //     return newHead;
    // }
    
    // Approach-2   Iterative solution
    // T.C = O(n)   S.C = O(1)
    
    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node dummy=null;

        while (curr!=null) {
            dummy=curr.next;
            curr.next=prev;
            prev=curr;
            curr=dummy;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(5);
        Node c=new Node(1);
        Node d=new Node(2);
        Node e=new Node(4);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        System.out.println("Original LinkedList:");
        display(a);
        System.out.println();
        System.out.println("Reverse LinkedList:");
        display(reverse(a));
    }    
}
