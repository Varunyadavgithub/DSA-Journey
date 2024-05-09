package Stack;
/* Implementation of Stack using STL (Standard Template Library). */

import java.util.Stack;

public class basic {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(7);
        System.out.println(st); //[1, 2, 3, 4, 7]
        System.out.println(st.peek()); //7
        st.pop();
        System.out.println(st); //[1, 2, 3, 4]
        System.out.println("Size of stack is: "+st.size()); //4

        // Print the first element of stack
        while (st.size()>1) {
            st.pop();
        }
        System.out.println(st.peek()); //1

        System.out.println(st); //[1]
        System.out.println(st.isEmpty()); //false
        st.pop();
        System.out.println(st.isEmpty()); //true
    }
}
