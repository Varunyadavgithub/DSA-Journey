package QuestionsOnSearching;
/*Find the first occurrence of a given element 'x' given that the 
 * given array is sorted. If no occurrence of 'x' is found then
 * return -1;
 * 
 * Input = arr={2,5,5,5,6,6,8,9,9,9} and x = 5
 * Output = 1
 */
public class firstOccurrence {
    // T.C = O(logn)    S.C = O(1)
    public static int firstOccurrence(int[] arr,int x){
        int st=0,end=arr.length-1;
        int fo=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(x==arr[mid]){
                fo=mid;
                end=mid-1;
            }else if (x<arr[mid]) {
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return fo;
    }
    public static void main(String[] args) {
        int[] arr={2,5,5,5,6,6,8,9,9,9};
        int x=5;
        System.out.println("The first occurence of "+x+" is at index: "+firstOccurrence(arr,x));
    }
}
