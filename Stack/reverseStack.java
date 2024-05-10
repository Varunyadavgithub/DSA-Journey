package Stack;
import java.util.*;
/*Reverse the given stack */
public class reverseStack {
    // Method-1 (Using extra array)  T.C=O(n) S.C=O(n)
    // public static void reverse(Stack<Integer> st){
    //     Stack<Integer> rt=new Stack<>();
    //     while (st.size()>0) {
    //         rt.push(st.pop());
    //     }
    //     // System.out.println(rt);
    //     Stack<Integer> qt=new Stack<>();
    //     while (rt.size()>0) {
    //         qt.push(rt.pop());
    //     }
    //     // System.out.println(qt);
    //     while (qt.size()>0) {
    //         st.push(qt.pop());
    //     }
    //     System.out.println(st);
    // }

    // Method-2 Using recursion  T.C=O(n) S.C=O(n)
    public static void reverse(Stack<Integer> st){
        if (st.size()==1) return;          
        int topVal=st.pop();
        reverse(st);
        pushAtBottom(st,topVal);
    }

    public static void pushAtBottom(Stack<Integer> st,int elm){
        if(st.isEmpty()){
            st.push(elm);
            return;
        } else{   
            int temp=st.pop();
            pushAtBottom(st, elm);
            st.push(temp);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original stack: "+st);
        reverse(st);
        System.out.println("Reversed stack: "+st);
    }
}
