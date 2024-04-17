package LinkedList.Questions;

/* Remove duplicates from a sorted Linkedlist.(remove adjesent value) */

public class remove_Duplicates {
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

    public static Node removeDuplicate(Node head){
        Node temp=head;
        while (temp!=null && temp.next!=null) {
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }

            if(temp.next==null) return head;

            if (temp.data!=temp.next.data) {
                temp=temp.next;    
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(1);
        Node c=new Node(2);
        Node d=new Node(2);
        Node e=new Node(3);
        Node f=new Node(3);
        Node g=new Node(4);
        Node h=new Node(4);
        Node i=new Node(5);
        Node j=new Node(5);
        Node k=new Node(6);
        Node l=new Node(6);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        i.next=j;
        j.next=k;
        k.next=l;

        System.out.println("Befor remove duplicates.");
        display(a);

        System.out.println();

        System.out.println("After remove duplicates.");
        display(removeDuplicate(a));
    }
}
