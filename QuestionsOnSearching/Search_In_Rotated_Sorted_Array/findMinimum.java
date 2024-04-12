package QuestionsOnSearching.Search_In_Rotated_Sorted_Array;
/* A rotated sorted array is a sorted array on which rotation operation has been
 * performed some number of times.Given a rotated sorted array, find the index of 
 * the minimum element in the array. Follow (0-base) indexing.
 * It is guranted that all the elements in the array are unique.
 * 
 * Input : arr={3,4,5,1,2}
 * Output : 3
 */
public class findMinimum {
    /*--------------Approach-1----------------*/

    // T.C = O(n)      S.C = O(1)
    // public static int minElementIdx(int[] arr){
    //     int n=arr.length;
    //     int ans=-1;
    //     int min=Integer.MAX_VALUE;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]<min){
    //             min=arr[i];
    //             ans=i;
    //         }
    //     }
    //     return ans;
    // }
    
    /*--------------Approach-2----------------*/

    // T.C = O(n)      S.C = O(1)
    // public static int minElementIdx(int[] arr){
    //     int ans=-1;
    //     for(int i=1;i<arr.length;i++){
    //         if(arr[i]<arr[i-1]){
    //             ans=i;
    //         }
    //     }
    //     return ans;
    // }

    /*--------------Approach-3----------------*/

    // T.C = O(logn)   S.C = O(1)
    public static int minElementIdx(int[] arr){
        int n=arr.length;
        int st=0,end=n-1;
        int ans=-1;
        while (st<=end) {
            int mid=st+(end-st)/2;
            if(arr[mid]<=arr[n-1]){  //That means we are in the 2nd sorted array
                ans=mid;
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        System.out.print("The index of minimum element in an array is: "+minElementIdx(arr));
    }
}
