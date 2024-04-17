package LinkedList.Questions;

public class split_odd_even {
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

    //Approach-1    Using extra space
    // T.C = O(n)   S.C = O(n)
    public static Node oddEven(Node head){
        Node temp=head;

        Node odd=new Node(-1);  //dummy node for odd list
        Node tempO=odd;

        Node even=new Node(0);  //dummy node for even list
        Node tempE=even;

        while (temp!=null) {
            if(temp.data%2==1){
                Node a=new Node(temp.data);
                tempO.next=a;
                tempO=a;
                temp=temp.next;
            }else{
                Node a=new Node(temp.data);
                tempE.next=a;
                tempE=a;
                temp=temp.next;
            }
        }
        odd=odd.next;
        even=even.next;
        tempO.next=even;
        return odd;
    }

    // Approach-2   Without using extra space
    
    
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(5);
        Node c=new Node(4);
        Node d=new Node(1);
        Node e=new Node(2);
        Node f=new Node(8);
        Node g=new Node(10);
        Node h=new Node(13);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;

        System.out.println("Original List: ");
        display(a);

        System.out.println();

        System.out.println("After arrenging: ");
        display(oddEven(a));

    }
}
