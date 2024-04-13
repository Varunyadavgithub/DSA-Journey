package LinkedList;
/* Implement a method to find the length of a LinkedList (Itrative & Recursive).  */
public class length_Of_LL {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    // Finding the length of LinkedList using function
    // public static int findLength(Node head){
    //     int count=0;
    //     while (head!=null) {
    //         count++;
    //         head=head.next;
    //     }
    //     return count;
    // }

    // Finding the length of LinkedList using recursion
    public static int findLength(Node head){
        if(head==null) return 0;
        return 1+findLength(head.next);
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(6);
        Node d=new Node(10);
        Node e=new Node(16);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        System.out.println("The length of a LinkedList is: "+findLength(a));
    }
}
