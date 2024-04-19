package Circular_LinkedList.Singly_Circular;

//Print the Singly Circular Linked list.

public class demo {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    //If the head is given.
    // public static void display(Node head) {
    //     if (head == null) {
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
    //     Node temp=tail.next;
    //     do{
    //         System.out.print(temp.data+" ");
    //         temp=temp.next;
    //     } while(temp!=tail.next);
    // }

    // If any random node is given. 
    public static void display(Node random){
        if (random==null) {
            System.out.println("Linked list is empty.");
            return;
        }
        Node temp=random;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        } while(temp!=random);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = a;

        // If the head is given
        // display(a);

        // If only tail is given
        // display(g);

        // If any random node is given
        display(d);
    }
}
