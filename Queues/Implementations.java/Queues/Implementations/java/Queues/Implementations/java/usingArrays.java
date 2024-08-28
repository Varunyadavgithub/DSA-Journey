
public class usingArrays {
    public static class queueA {
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];

        // add method
        public void add(int val) {
            if (r == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            }
            if (f == -1) { // queue is currently empty
                f = r = 0;
                arr[0] = val;
            } else {
                arr[++r] = val;
            }
            size++;
        }

        // remove method
        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            f++;
            size--;
            return arr[f - 1];
        }

        // peek method
        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f];
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
        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            } else {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queueA q = new queueA();
        q.display(); //
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display(); // [1,2,3,4]
        q.remove();
        q.display(); // [2,3,4]
        System.out.println(q.size); // 3
        System.out.println(q.peek()); // 2
    }
}
