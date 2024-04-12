package QuestionsOnSearching.BS_to_find_Peak_Element;
/* A peak element is an element that is strictly greater than its neighbors.
 * Given 0-indexed integer array nums, find a peak element, and return its index.
 * If the array contains multiple peak return the index to any of the peaks.
 * You may imagine that nums[-1]=nums[n]=-infinit. In other words, an elemnt
 * is always that is outside the array.
 * You must write an algorithm that run's in O(logn) time.
 * 
 * Input : nums={1,2,3,1}
 * Output : 2
 */
public class peakElementInMoountainArray {
    // T.C = O(logn)
    public static int findPeak(int[] arr){
        int n=arr.length;
        int st=0,end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if((mid==0 || arr[mid]>arr[mid-1]) && (mid==n-1 || arr[mid]>arr[mid+1])){
                return mid;
            }
            if(arr[mid]<arr[mid+1]){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        System.out.println("The index of peak element is: "+findPeak(arr));
    }
}
