package Stack.Questions;

import java.util.Stack;

/*Find the next greater element */

public class nextGreaterElement {
    // method-2 using stack                 T.C = O(n)
    public static long[] nextGreater(long[] arr,int n){
        long[] ans=new long[n];
        Stack<Long> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while (st.size()>0 && st.peek()<=arr[i]) {
                st.pop();
            }
            if (st.size()==0) {
                arr[i]=-1;
            }else{
                arr[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        // method-1 using array             T.C = O(n*n)   S.C = O(n)
        // int[] arr={1,3,2,1,8,6,3,4};
        // int[] res=new int[arr.length];
        // for(int i=0;i<arr.length;i++){
        //     res[i]=-1;
        //     for(int j=i+1;j<arr.length;j++){
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
