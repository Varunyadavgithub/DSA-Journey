package Stack;

import java.util.Stack;

/* Write a program to insert at bottom/any index */
public class insert_At_Bottom {
    // Method-2 (using recursion)
    public static void insertAtBottom(Stack<Integer> st,int elem){
        if(st.isEmpty()){
            st.push(elem);
            return;
        }
        int currElem=st.pop();
        insertAtBottom(st, elem);
        st.push(currElem);
    }
public static void main(String[] args) {
    Stack<Integer> st=new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    System.out.println(st);
    // insertAtBottom(st, 12);
    // System.out.println(st);

    // // Insert at bottom...
    // int idx=0;
    // int val=5;
    // Stack<Integer> temp=new Stack<>();
    // while (st.size()>idx) {
    //     temp.push(st.pop());
    // }
    // st.push(val);
    // while (temp.size()>0) {
    //     st.push(temp.pop());
    // }
    // System.out.println(st);

    // Insert at any random index...
    int idx=2;
    int val=5;
    Stack<Integer> temp=new Stack<>();
    while (st.size()>idx) {
        temp.push(st.pop());
    }
    st.push(val);
    while (temp.size()>0) {
        st.push(temp.pop());
    }
    System.out.println(st);
}
}
