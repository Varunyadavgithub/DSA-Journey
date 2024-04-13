package LinkedList.Implementation;

public class insertAt_head_and_End {
    // Class for Node
    public static class  Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    // Class for LinkedList
    public static class  Linkedlist {
        Node head=null;
        Node tail=null;
        
        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){ //empty list
                head=tail=temp;
            } 
            else{
                temp.next=head;
                head=temp;
            }
        }

        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            } else{
                tail.next=temp;
            }
            tail=temp;
        }

        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }

        void display(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.insertAtHead(10);
        ll.display();
        System.out.println();

        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.display();
        System.out.println();

        ll.insertAtEnd(7);
        ll.insertAtEnd(13);

        System.out.println("The Size of LinkedList is: "+ll.size());
    }
}
