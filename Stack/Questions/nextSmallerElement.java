package Stack.Questions;

import java.util.Stack;

public class nextSmallerElement {
    public static int[] nextSmaller(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                arr[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
}
