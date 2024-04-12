package QuestionsOnSearching.BS_to_find_Peak_Element;
/* Given a mountain array 'a' of length greater than 3 return the index 'i' such
 * that arr[0]<arr[1]...<arr[i-1]<arr[i]>arr[i+1]...>arr[arr.length] this index is 
 * known as the peak index.
 * 
 * Input : arr={0,4,1,0}
 * Output : 1
 */
public class peakIndexInMountainArray {
    /*-----------------Approach-1---------------- */
    // Ckeck arr[i]<arr[i+1] if this condition becom false then we get our peak element's index.
    // T.C = O(n)  S.C = O(1)

    
    
    /*-----------------Approach-2---------------- */
    // T.C = O(logn) S.C = O(1)

    public static int peakIdx(int[] arr){
        int st=0,end=arr.length-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]<arr[mid+1]){ //uphill (We are in the left part of mountain array)
                ans=mid+1;
                st=mid+1;
            }else{  //downhill (We are in the right part of mountain array)
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={0,4,1,0};
        System.out.print("The peak index of mountain array is: "+peakIdx(arr));    
    }
}
