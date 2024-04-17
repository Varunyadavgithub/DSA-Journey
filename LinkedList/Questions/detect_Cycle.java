package LinkedList.Questions;
/* Find out the node where the cycle begins, i.e the node at which the tail
 * node points.
 */
public class detect_Cycle {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static Node detectCycle(Node head){
        if(head==null) return null;
        Node slow=head;
        Node fast=head;
        Node temp=head;

        while (fast!=null && fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                while (temp!=slow) {
                    temp=temp.next;
                    slow=slow.next;
                }
                return temp;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);

        head.next.next.next.next.next=head.next.next;
        
        Node ans=detectCycle(head);
        System.out.print("The node where cycle begins: "+ans.data);
    }
}
