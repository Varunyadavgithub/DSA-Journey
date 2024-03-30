package RecursionOnArray;
/*Given an array of 'n' integer and a target value 'x' If the 
target is present in an array then return the index else -1 */
public class findIndexOfTarget {
    public static int findIdx(int[] arr,int target,int idx,int n){
        // Basecase
        if(idx>=n) return -1;
        // self work
        if(arr[idx]==target) return idx;
        // recursive work
        return findIdx(arr, target, idx+1, n);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int x=4;
        int n=arr.length;
        System.out.println(findIdx(arr,x,0,n));

    }
}
