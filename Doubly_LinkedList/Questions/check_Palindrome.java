package Doubly_LinkedList.Questions;

/* Check Palindrome of doubly Linkedlist. */

public class check_Palindrome {
    public static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data){
            this .data=data;
        }
    }    

    // get last node
    public static Node getLastNode(Node head){
        while (head!=null && head.next!=null) {
            head=head.next;
        }
        return head;
    }

    public static boolean isPalindrome(Node head){
        if(head==null) return true;
        Node start=head;
        Node end=getLastNode(head);
        while (start!=null && end!=null) {
            if(start.data!=end.data) return false;
            start=start.next;
            end=end.prev;
        }
        return true;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(4);
        Node f=new Node(3);
        Node g=new Node(2);
        Node h=new Node(1);

        a.prev=null;
        a.next=b;
        b.prev=a;

        b.next=c;
        c.prev=b;

        c.next=d;
        d.prev=c;

        d.next=e;
        e.prev=d;

        e.next=f;
        f.prev=e;

        f.next=g;
        g.prev=f;
        
        g.next=h;
        h.prev=g;

        System.out.println("The given LinkedList is Palindrome: "+isPalindrome(a));
    }
}
