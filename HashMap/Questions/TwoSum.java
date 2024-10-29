package HashMap.Questions;


/* Given an array of length 'n' and a target, return a pair (indices) whose sum is equal
* to the target. If there is no pair present, return -1
* 
* Input : n=4 arr={1,5,7,-1} target=6
*         n=10 arr={10,12,10,15,-1,7,6,4,2,1} terget=11
* Output : 0,1 and 0,9
*/
import java.util.*;
public class TwoSum {
    // Approach-1
    // public static int[] twoSum(int[] nums, int target) {
    //     int n = nums.length;
    //     int ans[] = { -1 };
    //     for (int i = 0; i < n; i++) {
    //         for (int j = i + 1; j < n; j++) {
    //             if (nums[j] == target - nums[i]) {
    //                 ans = new int[] { i, j };
    //                 return ans;
    //             }
    //         }
    //     }
    //     return ans;
    // }

    // Approach-2
    public static int[] twoSum(int[] nums,int target){
        int n=nums.length;
        int[] ans={-1};
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int partner=target-nums[i];
            if (mp.containsKey(partner)) {
                ans=new int[]{i,mp.get(partner)};
                return ans;
            }
            mp.put(nums[i], i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 12, 10, 15, -1, 7, 6, 4, 2, 1 };
        int target = 11;
        int[] ans = twoSum(arr, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
