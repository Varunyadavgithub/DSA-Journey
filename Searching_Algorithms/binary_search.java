package Searching_Algorithms;
/*It is searching algorithm which helps us to find the existence of 
 * a given target element in a sorted array.
 * 
 * It always works on sorted array.
 * 
 * T.C = O(logn)    S.C = O(1)
 */
public class binary_search {
    public static boolean binarySearch(int[] arr,int target){
        int n=arr.length;
        int st=0,end=n-1;
        while (st<=end) {
            int mid=st+(end-st)/2;
            if(target==arr[mid]){
                return true;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int target=4;
        System.out.print(binarySearch(arr,target));
    }
}
