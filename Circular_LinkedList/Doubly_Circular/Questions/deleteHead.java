package Circular_LinkedList.Doubly_Circular.Questions;

public class deleteHead {
    public static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }

    public static void display(Node head){
        if(head==null){
            System.out.println("Linked list is empty.");
            return;
        }
        Node temp=head;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=head);
    }
    public static Node deleteHead(Node head){
        if(head==null) return null;
        Node temp=head.prev;
        Node newHead=head.next;

        temp.next=newHead;
        newHead.prev=temp;
        // Now free the memory of the deleted node.
        head.next=null;
        head.prev=null;
        return newHead;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);

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

        g.next=a;
        a.prev=g;

        display(deleteHead(a));
    }
}
