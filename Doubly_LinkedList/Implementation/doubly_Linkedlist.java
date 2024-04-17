package Doubly_LinkedList.Implementation;
/* Make your own doubly Linkedlist and implement the functionality
 * like insertion, deletion, etc.
 */
public class doubly_Linkedlist {
    public static class Node {
        int data;
        Node next;
        Node prev;
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
/*----------------Insertion--------------------- */

    //case-1: Insert at Head.
    public static Node insertAtHead(Node head,int idx){
        Node t=new Node(idx);
        t.next=head;
        head.prev=t;
        head=t;
        return head;
    }
    //Case-2: Insert at Tail.
    public static void insertAtTail(Node head,int idx){
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        Node t=new Node(idx);
        temp.next=t;
        t.prev=temp;
    }
    //Case-3: Insert at any index.
    public static void insertAtIdx(Node head,int idx,int x){
        Node s=head;
        for(int i=1;i<=idx-1;i++){
            s=s.next;
        }
        //Now s is at (idx-1)th position.
        Node r=s.next;
        Node t=new Node(x);
        s.next=t;
        t.prev=s;

        t.next=r;
        r.prev=t;
    }

/*----------------Deletion--------------------- */

    // Case-1: Delete the head.
    public static Node deleteAtHead(Node head){
        head=head.next;
        head.prev=null;
        return head;
    }

    // Case-2: Delete th tail.
    // When only head is given.
    public static Node deleteAtTail(Node head){
        Node temp=head;
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    // When only tail is given.
    // public static Node deleteAtTail(Node tail){
    //     if (tail==null) return null;
    //     Node temp=tail.prev;
    //     if(temp.next!=null){
    //         temp.next=null;
    //     }
    //     return temp;
    // }

    // Case-3: delete at any index.
    public static Node deleteAtIdx(Node head,int idx){
        Node temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
        return head;
    }

    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(5);
        Node d=new Node(3);
        Node e=new Node(100);

        a.prev=null;
        a.next=b;
        b.prev=a;

        b.next=c;
        c.prev=b;

        c.next=d;
        d.prev=c;

        d.next=e;
        e.prev=d;
        System.out.println("Original list: ");
        display(a);
        System.out.println();

        System.out.println("After insert at head:");
        display(insertAtHead(a,2));
        System.out.println();

        System.out.println("After insert at tail:");
        insertAtTail(a,101);
        display(a);
        System.out.println();

        System.out.println("After insert at given index:");
        insertAtIdx(a,3,6);
        display(a);
        System.out.println();

        System.out.println("After delete at head:");
        display(deleteAtHead(a));
        System.out.println();

        System.out.println("After delete at tail:");
        deleteAtTail(a);
        display(a);
        System.out.println();

        System.out.println("After delete at given index:");
        deleteAtIdx(a,2);
        display(a);
        System.out.println();
    }
}
