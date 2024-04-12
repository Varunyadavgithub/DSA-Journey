package QuestionsOnSearching.Search_In_Rotated_Sorted_Array;
/* Search element in rotated sorted array with duplicate elements.
 * Return true if the element is found else return false.
 * 
 * Input : arr={0,0,0,1,1,1,2,0,0,0} and target=2
 * Output : true
 */
public class findElement {
    public static boolean searchTarget(int[] arr,int target){
        int st=0,end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target){
                return true;
            }else if(arr[st]==arr[mid] && arr[mid]==arr[end]){
                st++;
                end--;
            }else if(arr[mid]<=arr[end]){ //That means we are in the 2nd part of an rotated sorted array (mid to end sorted)
                if(target>arr[mid] && target<=arr[end]){
                    st=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(target>=arr[st] && target<arr[mid]){ //That means we are in the 1st part of an rotated sorted array (st to mid sorted)
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={0,0,0,1,1,1,2,0,0,0};
        int target=2;
        System.out.print("The target value is present in the array: "+searchTarget(arr,target));
    }
}
