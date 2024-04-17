package Doubly_LinkedList;
/* Create simple Doubly LinkedList. */
public class simple_Doubly_LinkedList {
    public static class Node {
        int data;
        Node next;
        Node prev;
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
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);

        a.prev=null;
        a.next=b;
        b.prev=a;

        b.next=c;
        c.prev=b;

        c.next=d;
        d.prev=c;

        d.next=e;
        e.prev=d;
        display(a);
    }
}
