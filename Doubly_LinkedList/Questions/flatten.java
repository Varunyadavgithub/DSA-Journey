package Doubly_LinkedList.Questions;
/*Flatten a multilevel Doubly Linkedlist (LeetCode - 430)
 * 
 * Input: head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
 * Output: [1,2,3,7,8,11,12,9,10,4,5,6]
*/

public class flatten {
    public static class Node {
        int data;
        Node next;
        Node prev;
        Node child;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node flatte(Node head) {
        Node temp = head;
        while (temp != null) {
            Node t = temp.next;
            if (t.child != null) {
                Node c = flatte(temp.child);
                temp.next = c;
                c.prev = temp;
                // ab 'c' ko aage leke jao...
                while (c.next != null) {
                    c = c.next;
                }
                c.next = t;
                if (t != null) {
                    t.prev = c;
                }
            }
            temp.child = null;
            temp = t;
        }
        return head;
    }

    public static void main(String[] args) {
        // Creating a sample multilevel doubly linked list
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        Node j = new Node(10);
        Node k = new Node(11);
        Node l = new Node(12);

        a.next=b;
        a.prev=null;
        a.child=null;

        b.next=c;
        b.prev=a;
        b.child=null;

        c.next=d;
        c.prev=b;
        c.child=g; //turning point

        d.next=e;
        d.prev=c;
        d.child=null;

        e.next=f;
        e.prev=d;
        e.child=null;

        f.next=null;
        f.prev=e;
        f.child=null;

        g.next=h;
        g.prev=null;
        g.child=null;

        h.next=i;
        h.prev=g;
        h.child=k; //turning point

        i.next=j;
        i.prev=h;
        i.child=null;

        j.next=null;
        j.prev=i;
        j.child=null;

        k.next=l;
        k.prev=null;
        k.child=null;

        l.next=null;
        l.prev=k;
        l.child=null;

        // Flatten the multilevel doubly linked list
        // flatten flattenInstance = new flatten();
        Node ans=flatte(a);

        // Print the flattened list
        System.out.println("Flattened list:");
        while (ans != null) {
            System.out.print(ans.data + " ");
            ans = ans.next;
        }
    }

}
