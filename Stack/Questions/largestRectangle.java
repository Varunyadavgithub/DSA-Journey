package Stack.Questions;

import java.util.Stack;

/*Largest rectangle in Histogram - Given an array of integer height representing the
 * histogram's bar height where the width of each bar is 1, return the area of the largest
 * rectangle in the histogram (leetcode-84)
  */
public class largestRectangle {
  public static int largestRectangle(int[] height) {
    int n = height.length;
    Stack<Integer> st = new Stack();
    int[] nse = new int[n]; // Next smaller element array
    int[] pse = new int[n]; // Previous smaller element array
    // Calculate next smaller elements
    st.push(n - 1);
    nse[n - 1] = n;
    for (int i = n - 2; i >= 0; i--) {
      while (st.size() > 0 && height[st.peek()] >= height[i]) {
        st.pop();
      }
      if (st.size() == 0) {
        nse[i] = n;
      } else {
        nse[i] = st.peek();
      }
      st.push(i);
    }
    // Emptying stack
    while (st.isEmpty()) {
      st.pop();
    }
    // Calculate previous smaller element
    st.push(0);
    pse[0] = -1;
    for (int i = 0; i < n; i++) {
      while (st.size() > 0 && height[st.peek()] >= height[i]) {
        st.pop();
      }
      if (st.size() == 0) {
        pse[i] = -1;
      } else {
        pse[i] = st.peek();
      }
      st.push(null);
    }
    // Maximum area of rectangle
    int max = -1;
    for (int i = 0; i < n; i++) {
      int area = height[i] * (nse[i] - pse[i] - 1);
      max = Math.max(max, area);
    }
    return max;
  }
}
