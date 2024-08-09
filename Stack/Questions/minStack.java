package Stack.Questions;

/* Min Stack (Leetcode - 155) Design a stack that support push, pop, top and retrieving the minimum element 
 * in constant time.
 * Note:- Minimun element for every time
 */
import java.util.*;

public class minStack {
    // Method - 1
    // Stack<Integer> st = new Stack<>();
    // Stack<Integer> min = new Stack<>();

    // public void push(int val) {
    // if (st.size() == 0) {
    // st.push(val);
    // min.push(val);
    // } else {
    // st.push(val);
    // if (min.peek() <= val) {
    // min.push(min.peek());
    // } else {
    // min.push(val);
    // }
    // }
    // }

    // public void pop() {
    // st.pop();
    // min.pop();
    // }

    // public int top() {
    // return st.peek();
    // }

    // public int getMin() {
    // return min.peek();
    // }

    // Method - 2
    Stack<Long> st = new Stack<>();
    long min = -1;

    public void push(int val) {
        long x = (long) val;
        if (st.isEmpty()) {
            st.push(x);
            min = x;
        } else if (x >= min) {
            st.push(x);
        } else if (x < min) {
            st.push(2 * x - min);
            min = x;
        }
    }

    public void pop() {
        if (st.isEmpty()) {
            return;
        } else if (st.peek() >= min) {
            st.pop();
        } else if (st.peek() < min) {
            long old = 2 * min - st.peek();
            min = old;
            st.pop();
        }
    }

    public int top() {
        if (st.isEmpty()) {
            return -1;
        }
        long q = st.peek();
        if (q >= min) {
            return (int) q;
        }
        if (q < min) {
            return (int) min;
        }
        return 0;
    }

    public int getMin() {
        if (st.isEmpty()) {
            return -1;
        }
        return (int) min;
    }
}
