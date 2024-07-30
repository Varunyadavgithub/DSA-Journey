package Stack.Questions;

import java.util.Stack;

public class previousGreater {
    public static long[] prevGreater(long[] arr,int n){
        long[] ans=new long[n];
        Stack<Long> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while (st.size()==0 || st.peek()<=arr[i]) {
                st.pop();
            }
            if (st.size()==0) {
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        // method-1 using array
        // int[] arr={100,80,60,70,60,75,85};
        // int[] res=new int[arr.length];
        // for(int i=0;i<arr.length;i++){
        //     res[i]=-1;
        //     for(int j=i-1;j>=0;j--){
        //         if (arr[j]>arr[i]) {
        //             res[i]=arr[j];
        //             break;
        //         }
        //     }
        // }
        // for(int i=0;i<res.length;i++){
        //     System.out.print(res[i]+" ");
        // }
    }
}
