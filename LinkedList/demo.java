package LinkedList;

public class demo {

    public static class Node {
        int data;
        Node next;
        Node (int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        // System.out.println(a);  //$Node@2f92e0f4
        // System.out.println(a.next); //null

        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        Node e=new Node(16);
        
        // Link the node 5->3->9->8->16
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
    }
}
