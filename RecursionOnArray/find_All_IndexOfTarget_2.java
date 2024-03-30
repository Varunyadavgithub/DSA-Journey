package RecursionOnArray;

import java.util.ArrayList;

public class find_All_IndexOfTarget_2 {
    static ArrayList<Integer> allIndices(int[] arr,int target,int idx,int n){
        // Basecase
        if(idx>=n) return new ArrayList<>();

        ArrayList<Integer> ans=new ArrayList<>();
        // self work
        if(arr[idx]==target){
            ans.add(idx);
        }
        // recursive work
        ArrayList<Integer> smallAns=allIndices(arr, target, idx+1, n);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,4,6,5,4};
        int x=4;
        int n=arr.length;
        ArrayList<Integer> ans=allIndices(arr,x,0,n);
        for(Integer elm:ans){
            System.out.print(elm+" ");
        }
    }
}
