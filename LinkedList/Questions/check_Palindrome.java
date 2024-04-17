package LinkedList.Questions;

/* Check whether a Linkedlist is palindrome or not */

public class check_Palindrome {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    // Approach-1   Using extra space
    // T.C = O(n)   S.C = O(n)
    /*Steps to Solve :-
     1.) Create a duplicate deep copy of given list.
     2.) Reverse the duplicate list.
     3.) Compare the each node of both original & duplicate list
         and if they same return true or false.
    */

    // public static boolean checkPalindrome(Node head){
    //     Node duplicate=deepCopy(head);
    //     duplicate=reverseList(duplicate);
    //     return compareList(head,duplicate);
    // }

    // public static Node deepCopy(Node head){
    //     if (head==null) return null;
    //     Node dummy=new Node(-1);
    //     Node prev=dummy;
    //     Node curr=head;
    //     while (curr!=null) {
    //         prev.next=new Node(curr.data);
    //         prev=prev.next;
    //         curr=curr.next;
    //     }
    //     return dummy.next;
    // }

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

    // public static boolean compareList(Node headA, Node headB){
    //     while (headA!=null && headB!=null) {
    //         if(headA.data!=headB.data){
    //             return false;
    //         }
    //         headA=headA.next;
    //         headB=headB.next;
    //     }
    //     return headA==null && headB==null;
    // }

    // Approach-2   Without using extra space
    // T.C = O(n)  S.C = O(1)
    /*Steps to Solve :-
     1.) Find the left most middle node.
     2.) Reverse all node after middle node.
     3.) Make two pointer 'p1' at head of list and 'p2' at middle.next.
     4.) Compare the p1 & p2 to check palindrome.
    */

    public static boolean checkPalindrome(Node head){
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
        while (p2!=null) {
            if(p1.data!=p2.data) return false;
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(3);
        Node e=new Node(2);
        Node f=new Node(1);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        System.out.println("Is this LinkedList is Palindrome: "+checkPalindrome(a));

    }
}
