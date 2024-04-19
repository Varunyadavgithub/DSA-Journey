package Circular_LinkedList.Doubly_Circular;

// Print the Doubly Circular Linked list.
public class demo {
    public static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }

    // If the head is given
    // public static void display(Node head){
    //     if (head==null) {
    //         System.out.println("Linked list is empty.");
    //         return;
    //     }
    //     Node temp=head;
    //     do{
    //         System.out.print(temp.data+" ");
    //         temp=temp.next;
    //     } while(temp!=head);
    // }

    // If only tail is given.
    // public static void display(Node tail){
    //     if (tail==null) {
    //         System.out.println("Linked list is empty.");
    //         return;
    //     }

    //     // Print in forward direction
    //     Node temp=tail.next;
    //     System.out.print("Print in Forward direction: ");
    //     do{
    //         System.out.print(temp.data+" ");
    //         temp=temp.next;
    //     } while(temp!=tail.next);
    //     System.out.println();

    //     // Print in backward direction
    //     Node back=tail;
    //     System.out.print("Print in Backward direction: ");
    //     do{
    //         System.out.print(back.data+" ");
    //         back=back.prev;
    //     } while (back!=tail);
    // }

    // If any random node is given.
    public static void display(Node random){
        if (random==null) {
            System.out.println("Linked list is  empty.");
            return;
        }

        // Print in forward direction
        Node temp=random;
        System.out.print("Print in Forward direction: ");
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        } while(temp!=random);

        System.out.println();

        // Print in backward direction
        Node back=random;
        System.out.print("Print in Backward direction: ");
        do{
            System.out.print(back.data+" ");
            back=back.prev;
        } while(back!=random);
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

        // If the head is given
        // display(a);

        // If only tail is given
        // display(g);

        // If any random node is given
        display(d);
    }
}
