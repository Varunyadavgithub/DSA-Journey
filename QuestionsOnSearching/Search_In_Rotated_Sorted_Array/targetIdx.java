package QuestionsOnSearching.Search_In_Rotated_Sorted_Array;
/* Given the rotated sorted array of integers, which contains distinct elements
 * and an integer target, return the index of target if it is in the array. Otherwise
 * return -1
 * 
 * Input : arr={3,4,5,1,2} and target=4
 * Output : 1
 */
public class targetIdx {
    /*-------------------Approach-1---------------------- */

    /*-------------------Approach-2---------------------- */
    public static int idxOfTarget(int[] arr,int target){
        int n=arr.length;
        int st=0,end=n-1;
        while (st<=end) {
            int mid=st+(end-st)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<arr[end]){  //That means we are in the 2nd sorted part of an array (mid to end sorted)
                if(target>arr[mid] && target<=arr[end]){
                    st=mid+1;
                }else{
                    end=mid-1;
                }
            }
            else{   //In 1st sorted part of an array (st to mid sorted)
                if(target>=arr[st] && target<arr[mid]){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        int target=4;
        System.out.print("The index of target value is: "+idxOfTarget(arr,target));   
    }
}
