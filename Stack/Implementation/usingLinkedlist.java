package Stack.Implementation;

public class usingLinkedlist {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class LLStack {
        private Node head = null;
        private int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is Empty !");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is Empty !");
                return -1;
            }
            return head.val;
        }

        // void display(){
        //     Node temp=head;
        //     while (temp!=null) {
        //         System.out.print(temp.val+" ");
        //         temp=temp.next;
        //     }
        //     System.out.println();
        // }

        // Display in correct order...
        void displayrec(Node head) {
            if (head == null) return;
            displayrec(head.next);
            System.out.print(head.val + " ");
        }

        void display() {
            displayrec(head);
            System.out.println();
        }

        int size() {
            return size;
        }

        boolean isEmpty() {
            if (size == 0) return true;
            return false;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4);
        st.display(); // 4
        st.push(5);
        st.display(); // 4 5
        st.push(1);
        st.display(); // 4 5 1
        System.out.println(st.size()); // 3
        st.pop();
        st.display(); // 4 5
        System.out.println(st.size()); // 2
        st.push(7);
        st.push(0);
        st.push(9);
        System.out.println(st.isEmpty()); // false
    }
}
