package LinkedList.Implementation;

/* Implement a method to return the element at any given index of the Linkedlist.
 */

public class getAt {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) { // empty list
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;

            if (idx == size()) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtHead(val);
                return;
            } else if (idx < 0 || idx > size()) {
                System.out.println("Your are provide a wrong index");
                return;
            }

            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        int getAt(int idx){
            if(idx<0 || idx>size()){
                System.out.println("You are provide wrong index");
                return-1;
            }

            Node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertAtHead(1);
        ll.insertAtEnd(3);
        ll.insertAtEnd(5);
        ll.insertAtEnd(4);
        ll.insertAt(1, 7);

        System.out.println("The value at given index is: "+ll.getAt(1));
    }
}
