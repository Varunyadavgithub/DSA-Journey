package Queues.Circular_Queue.Implementations;

public class usingArray {
    public static class Cqa {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];

        // add method
        public void add(int val) {
            if (size == arr.length) {
                System.out.println("Queue is full");
            } else if (size == 0) {
                front = rear = 0;
                arr[0] = val;
            } else if (rear < arr.length - 1) { // normal case
                arr[++rear] = val;
            } else if (rear == arr.length - 1) {
                rear = 0;
                arr[0] = val;
            }
            size++;
        }

        // remove method
        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
            } else {
                int val = arr[front];
                if (front == arr.length - 1) {
                    front = 0;
                } else {
                    front++;
                }
                size--;
                return val;
            }
            return front;
        }

        // peek method
        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
            }
            return arr[front];
        }

        // isEmpty method
        public boolean isEmpty() {
            if (size == 0) {
                return true;
            } else {
                return false;
            }
        }
        
        // display method
        public void display(){
            if (size==0) {
                System.out.println("Queue is empty");
            }
            else if (front<=rear) {
                for(int i=front;i<=rear;i++){
                    System.out.print(arr[i]);
                }
            }else{ //rear < front
                for(int i=front;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Cqa q=new Cqa();
        q.isEmpty(); //true
        q.display(); //Queue is empty
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display(); //1 2 3 4 5
        q.remove();
        q.display(); //1 2 3 4
        q.isEmpty(); //false
    }
}
