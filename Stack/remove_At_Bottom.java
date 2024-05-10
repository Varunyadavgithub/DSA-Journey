package Stack;
import java.util.*;
/*Write a programm to remove from bottom/any index  */
public class remove_At_Bottom {
    public static void remove(Stack<Integer> st){
        Stack<Integer> temp=new Stack<>();
        while (st.size()>1) {
            temp.push(st.pop());
        }
        st.pop();
        while (temp.size()>0) {
            st.push(temp.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        remove(st);
        System.out.println(st);
    }
}
