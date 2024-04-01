package RecursionOnSubsequencesAndSubset;
/*Given an array of integer, print sums of all subsets in it output
 * sums can be printed in any order.
 * 
 * Input : {2,3}
 * Output : 0,2,3,5
 * 
 * Input : {2,4,5}
 * Output : 0,2,4,5,6,11,9,7
 */
public class subsetSum {
    static void subsetSum(int[] arr,int n,int idx,int sum){
        // Basecase
        if(idx>=n){
            System.out.print(sum+" ");
            return;
        }
        subsetSum(arr, n, idx+1, sum+arr[idx]);
        subsetSum(arr, n, idx+1, sum);
    }
    public static void main(String[] args) {
        int[] arr={2,4,5};
        int n=arr.length;
        subsetSum(arr,n,0,0);
    }
}
