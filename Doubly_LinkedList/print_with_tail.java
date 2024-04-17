package Doubly_LinkedList;

/* Print the list with the help of tail. */
public class print_with_tail {
    public static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }

    public static void display(Node tail){
        Node temp=tail;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(6);
        Node c=new Node(2);
        Node d=new Node(8);
        Node e=new Node(3);

        a.prev=null;
        a.next=b;
        b.prev=a;

        b.next=c;
        c.prev=b;

        c.next=d;
        d.prev=c;

        d.next=e;
        e.prev=d;
        display(e);
    }
}
