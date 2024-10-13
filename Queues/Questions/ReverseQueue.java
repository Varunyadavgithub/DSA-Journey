package Queues.Questions;
// Reverse the Queue

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q); //1 2 3 4
        Stack<Integer> st=new Stack<>();
        while (q.size()>0) {
            st.push(q.remove());
        }
        while (st.size()>0) {
            q.add(st.pop());
        }
        System.out.println(q); //4 3 2 1
    }
}
