package Stack;

import java.util.Stack;

/*Display the stack, how it works internaly. */
public class display {
    // Display recursively
    public static void display(Stack<Integer> st){
        // basecase
        if(st.size()==0) return;
        int val=st.pop();
        display(st);
        System.out.print(val+" ");
        st.push(val);
    }

    // Display the stack in reverse order
    // public static void displayReverse(Stack<Integer> st){
    //     // basecase
    //     if(st.size()==0) return;
    //     int val=st.pop();
    //     System.out.print(val+" ");
    //     displayReverse(st);
    //     st.push(val);
    // }
    public static void main(String[] args) {
    // Method-1 (using extra stack) T.C=(n)  S.C=O(n)
        // Stack<Integer> st=new Stack<>();
        // st.push(1);
        // st.push(2);
        // st.push(3);
        // st.push(4);
        // st.push(5);
        
        // Stack<Integer> helper=new Stack<>();
        // while (!st.isEmpty()) {
        //     helper.push(st.pop());
        // }
        
        // while (!helper.isEmpty()) {
        //     int val=helper.pop();
        //     System.out.print(val+" ");
        //     st.push(val);
        // }
        // System.out.println();
        // System.out.println("Original Stack: "+st);
    
    // Method-2 (using extra array) T.C=(n)  S.C=O(n)
        // Stack<Integer> st=new Stack<>();
        // st.push(1);
        // st.push(2);
        // st.push(3);
        // st.push(4);
        // st.push(5);
        
        // int n=st.size();
        // int[] arr=new int[n];
        // for(int i=n-1;i>=0;i--){
        //     arr[i]=st.pop();
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        //     st.push(arr[i]);
        // }
        // System.out.println();
        // System.out.println("Original Stack: "+st);

    // Method-3 (using recursion) T.C=O(n)  S.c=O(n)
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        display(st);
        // displayReverse(st);
    }
}
