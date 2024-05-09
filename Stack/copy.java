package Stack;
/* Copy/move content of one stack to another in same order. */

import java.util.Stack;

public class copy {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st); //[1, 2, 3, 4, 5]

        //reverse order...
        Stack<Integer> gt=new Stack<>();
        while (st.size()>0) {
            gt.push(st.pop());
        }
        System.out.println(gt); //[5, 4, 3, 2, 1]

        // same order...
        Stack<Integer> rt=new Stack<>();
        while (gt.size()>0) {
            rt.push(gt.pop());
        }
        System.out.println(rt); //[1, 2, 3, 4, 5]
    }
}
