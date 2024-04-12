package QuestionsOnSearching;
/*Find the last occurrence of a given element 'x' given that the 
 * given array is sorted. If no occurrence of 'x' is found then
 * return -1;
 * 
 * Input = arr={2,5,5,5,6,6,8,9,9,9} and x = 5
 * Output = 3
 */
public class lastOccurrence {
    public static int lastOccurrence(int[] arr,int x){
        int st=0,end=arr.length-1;
        int lo=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(x==arr[mid]){
                lo=mid;
                st=mid+1;
            }
            else if(x<arr[mid]){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return lo;
    }
    public static void main(String[] args) {
        int[] arr={2,5,5,5,6,6,8,9,9,9};
        int x=5;
        System.out.print("The last occurrence of "+x+" is at index: "+lastOccurrence(arr,x));
    }
}
