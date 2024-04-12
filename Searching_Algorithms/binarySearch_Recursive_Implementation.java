package Searching_Algorithms;
/* Recursive implementation of binary search.
 * T.C = O(logn)
 * S.C = O(logn)
 */
public class binarySearch_Recursive_Implementation {
    public static boolean recBinarySearch(int[] arr,int target,int st,int end){
        // Basecase
        if(st>end){
            return false;
        }
        int mid=st+(end-st)/2;
        if(target==arr[mid]){
            return true;
        }
        else if(target<arr[mid]){
            return recBinarySearch(arr, target, st, mid-1);
        }
        else{
            return recBinarySearch(arr, target, mid+1, end);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length-1;
        int target=2;
        System.out.print(recBinarySearch(arr,target,0,n));
    }
}
