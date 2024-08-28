
public class usingLinkedlist {
    public static class Node { //user define data type
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class  queueLL {
        static Node head=null;
        static Node tail=null;
        static int size=0;

        // add method
        public static void add(int x){
            Node temp=new Node(x);
            if (size==0) {
                head=tail=temp;
            } else{
                tail.next=temp;
                tail=temp;
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
            while (temp!=null) {
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        // isEmpty method
        public static boolean isEmpty(){
            if (size==0) {
                return true;
            } else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        queueLL q=new queueLL();
        q.display(); // Queue is empty
        System.out.println(q.isEmpty()); //true
        q.add(1);
        q.add(2);
        System.out.println(q.isEmpty()); //false
        q.add(3);
        q.add(4);
        q.display(); //[1,2,3,4]
        System.out.println(q.peek()); //1
        q.remove(); 
        q.display(); //[2,3,4]
        System.out.println(q.size); //3
    }
}
