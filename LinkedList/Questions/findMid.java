package LinkedList.Questions;
// LeetCode-876
/* Finding middle element of a linkeedlist in one traversal */

public class findMid {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    // T.C = O(n)   S.c = O(1)
    public static Node middleNode(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    /* Note: (fast.next) give us right middle
             (fast.next.next) give us left middle */

    public static void main(String[] args) {
        Node head=new Node(100);
        head.next=new Node(13);
        head.next.next=new Node(4);
        head.next.next.next=new Node(5);
        head.next.next.next.next=new Node(12);
        head.next.next.next.next.next=new Node(10);

        Node midNode=middleNode(head);
        System.out.println("Middle node value: " + midNode.data);
    }
}
