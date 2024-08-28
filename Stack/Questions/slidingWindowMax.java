package Stack.Questions;
// Sliding Window maximum (leetcode 239 - Hard)

import java.util.Stack;

public class slidingWindowMax {
    // Approach-1 T.C = O(k*(n-k+1)) => O(n)

    // public static int[] maxSlidingWindow(int[] nums,int k){
    // int n=nums.length;
    // // n-(k-1) = n-k+1
    // int[] ans=new int[n-k+1];
    // int idx=0;
    // for(int i=0;i<n-k+1;i++){
    // int max=Integer.MIN_VALUE;
    // for(int j=0;j<i+k;j++){
    // max=Math.max(max, nums[j]);
    // }
    // ans[idx++]=max;
    // }
    // return ans;
    // }

    // Approach-2 Use next greater elements
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int idx = 0;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        st.push(n - 1);
        nge[n - 1] = n;
        for (int i = n - 2; i >= 0; i--) { // Next greater element
            while (st.size() > 0 && nums[i] > nums[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                nge[i] = n;
            } else {
                nge[i] = st.peek();
            }
            st.push(i);
        }
        int j = 0;
        for (int i = 0; i < n - k + 1; i++) {
            if (j >= i + k) {
                j = i;
            }
            int max = nums[j];
            while (j < i + k) { // Traverse in window range and find max.
                max = nums[j];
                j = nge[j];
            }
            ans[idx++] = max;
        }
        return ans;
    }
}
