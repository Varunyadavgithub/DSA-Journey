package Doubly_LinkedList;
/* Print the list with the help of any random node. */
public class print_with_random_node {
    public static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }
    public static void display(Node random){
        Node temp=random;
        while (temp.prev!=null) {
            temp=temp.prev;
        }
        //Now temp is at head, print the list.
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
        display(c);
    }
}
