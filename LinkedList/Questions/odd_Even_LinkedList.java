package LinkedList.Questions;
// LeetCode-328
/* Given the head of a singly linked list, group all the nodes with odd indices 
together followed by the nodes with even indices, and return the reordered list.
The first node is considered odd, and the second node is even, and so on.

Note: that the relative order inside both the even and odd groups should remain
 as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity. 
*/
public class odd_Even_LinkedList {
    public static class Node {
        int data;
        Node next;
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

    public static Node oddEvenList(Node head){
        Node odd=new Node(-1);
        Node even=new Node(0);
        Node tempO=odd;
        Node tempE=even;
        Node temp=head;
        while (temp!=null) {
            tempO.next=temp;
            temp=temp.next;
            tempO=tempO.next;

            tempE.next=temp;
            if (temp==null) break;
            temp=temp.next;
            tempE=tempE.next;
        }
        odd=odd.next;
        even=even.next;
        tempO.next=even;
        return odd;
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(11);
        Node c=new Node(1);
        Node d=new Node(4);
        Node e=new Node(6);
        Node f=new Node(5);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        System.out.println("Original List: ");
        display(a);
        System.out.println();
        System.out.println("After rearranging List: ");
        display(oddEvenList(a));
    }
}
