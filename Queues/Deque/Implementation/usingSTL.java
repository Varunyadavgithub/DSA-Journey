package Queues.Deque.Implementation;

// import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class usingSTL {
    public static void main(String[] args) {
        // Deque<Integer> dq=new ArrayDeque<>();
        Deque<Integer> dq = new LinkedList<>();
        dq.add(1);
        dq.add(2);
        dq.add(3);
        dq.add(4);
        System.out.println(dq); // [1 2 3 4]
        dq.addFirst(5);
        System.out.println(dq); // [5 1 2 3 4]
        dq.removeLast();
        System.out.println(dq); // [5 1 2 3]
        dq.removeFirst();
        System.out.println(dq); // [1 2 3]
        System.out.println(dq.getFirst()); //1
        System.out.println(dq.getLast()); //3
        dq.add(6);
        System.out.println(dq); // [1 2 3 6]
        dq.remove();
        System.out.println(dq); // [2 3 6]
    }
}
