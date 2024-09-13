package Queues.Circular_Queue.Implementations;

public class usingLinkedList {
    public static class Node {
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class Cqll {
        static Node head=null;
        static Node tail=null;
        static int size=0;

        // add method
        public static void add(int x){
            Node temp=new Node(x);
            if(size==0){
                head=tail=temp;
                tail.next=head;
            }else{
                tail.next=temp;
                tail=temp;
                tail.next=head;
            }
            size++;
        }
        
        // peek method
        public static int peek(){
            if (size==0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }

        // remove method
        public static int remove(){
            if (size==0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            tail.next=head;
            size--;
            return x;
        }

        // display method
        public static void display(){
            if (size==0) {
                System.out.println("Queue is empty");
                return;
            }
            Node temp=head;
            do{
                System.out.print(temp.val+" ");
                temp=temp.next;
            }while(temp!=head);
            System.out.println();
        }

        // isEmpty method
        public static boolean isEmpty(){
            if (size==0) {
                return true;
            }
            return false;
        }
        public static void main(String[] args) {
            Cqll q=new Cqll();
            q.display(); // Queue is empty
            System.out.println(q.isEmpty()); //true
            q.add(1);
            q.add(2);
            System.out.println(q.isEmpty()); //false
            q.add(3);
            q.add(7);
            q.display(); //1 2 3 7
            System.out.println(q.peek()); //1
            q.remove();
            q.display(); //2 3 7
            System.out.println(q.size); //3
        }
    }
}
