package LinkedList;

public class displayLinkedList {

    public static class Node {
        int data;
        Node next;
        Node (int data){
            this.data=data;
        }
    }

    // Display function
    public static void display(Node head){
        while (head!=null) {
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    // Display recursively
    public static void displayRec(Node head){
        // Basecase
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        displayRec(head.next);
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        Node e=new Node(16);

        // Link the node 5->3->9->8->16
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

/*-------------------Method-1 to display a Linkedlist-------------------*/

        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);

/*-------------------Method-2 to display a Linkedlist (Using for-loop)-------------------*/
        // Node temp=a;
        // for(int i=1;i<=5;i++){
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }

/*-------------------Method-3 to display a Linkedlist if only head is given (Using while loop)-------------------*/
            // Node temp=a;
            // while (temp!=null) {
            //     System.out.print(temp.data+" ");
            //     temp=temp.next;
            // }
/*-------------------Method-4 to display a Linkedlist (Using function)-------------------*/
            // display(a);

/*-------------------Method-5 to display a Linkedlist (Using recursion)-------------------*/
            displayRec(a);
    }
}
