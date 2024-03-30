package RecursionOnArray;
/*Given an array of size 'n' and an integer 'x' the task is to 
find the all indices  of the integer 'x' in the array. */
public class find_All_IndexOfTarget {
    static void allIndices(int[] arr,int target,int idx,int n){
        // Basecase
        if(idx>=n) return;
        //self work
        if(arr[idx]==target){
            System.out.print(idx+" ");
        }
        // recursive work
        allIndices(arr, target, idx+1, n);

    }
    public static void main(String[] args) {
        int[] arr={1,2,4,4,4,5,6};
        int x=4;
        int n=arr.length;
        allIndices(arr,x,0,n);
    }
}
