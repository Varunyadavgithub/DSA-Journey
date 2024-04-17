package LinkedList.Questions;
/* Find the maximum twin sum of a linkedlist of even length.

 * Twin of any node at (i)th index is the node at (n-i-1)th 
 * index. Twin sum is the sum of value of a node & its twin.
 */
public class twin_Sum {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static Node reverseList(Node head){
        Node curr=head;
        Node prev=null;
        Node after=null;
        while (curr!=null) {
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }

    public static int twinSum(Node head){
        Node slow=head;
        Node fast=head;
        while (fast.next!=null && fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp=reverseList(slow.next);
        slow.next=temp;
        Node p1=head;
        Node p2=slow.next;
        int max=Integer.MIN_VALUE;
        while (p2!=null) {
            int sum=p1.data+p2.data;
            if (max<sum) {
                max=sum;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return max;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(10);
        Node c=new Node(13);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(2);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;

        System.out.print("The maximum twin sum of LinkedList is: "+twinSum(a));
    }
}
