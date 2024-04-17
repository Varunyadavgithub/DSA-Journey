package LinkedList.Questions;
// LeetCode-138. Copy List with Random Pointer

/*
Construct a deep copy of a linkedlist where each node contains an additional
random pointer, which could point to any node in the list or null.

Steps to solve:
 * 1.) Make a deep copy of original Linkedlist.
 * 2.) Make alternate connection b/w original and deep copyed Linkedlist.
 * 3.) Assigning random pointers.
 * 4.) Seperating the original list by deep copyed list.
 */
public class random_Pointer {
    public static class Node {
        int data;
        Node next;
        Node random;
        Node(int data){
            this.data=data;
        }
    }

    // T.C = O(n)   S.C = O(n)
    public static Node copyRandomList(Node head){
        Node head2=new Node(0);
        Node temp2=head2;
        Node temp1=head;

        // Creating deep copy
        while (temp1!=null) {
            Node t=new Node(temp1.data);
            temp2.next=t;
            temp1=temp1.next;
        }
        head2=head2.next;
        temp2=head2;
        temp1=head;

        //Make alternate connections 
        Node temp=new Node(-1);
        while (temp1!=null) {
            temp.next=temp1;
            temp1=temp1.next;
            temp=temp.next;

            temp.next=temp2;
            temp2=temp2.next;
            temp=temp.next;
        }
        temp2=head2;
        temp1=head;

        //Assigning random pointers
        while (temp!=null) {
            if(temp1.random==null) temp2.random=null;
            else temp2.random=temp1.random.next;

            temp1=temp2.next;
            if(temp1!=null) temp2=temp1.next;
        }
        temp2=head2;
        temp1=head;

        //Separating the list
        while (temp1!=null) {
            temp1.next=temp2.next;
            temp1=temp1.next;
            if (temp1==null) break;

            temp2.next=temp1.next;
            if (temp2.next==null) break;
            temp2=temp2.next;           
        }
        return head2;
    }
    public static void main(String[] args) {
        // Example usage:
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        
        // Setting random pointers for demonstration purpose
        head.random = head.next.next; // 1's random points to 3
        head.next.random = head; // 2's random points to 1
        
        Node deepCopy = copyRandomList(head);

    }
}
