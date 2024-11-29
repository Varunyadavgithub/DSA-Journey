/*Check if we can partition the array into two subarray with equal sum. Moreformilly, check that the 
 Prefix sum of a part of the array is equal to the suffix sum of rest of the array.
 arr = [5,3,2,6,3,1]
 pref = 5+3+2 = 10
 suff = 1+3+6 = 10

 */

import java.util.*;

public class equalSumPartition {
    static int findArraySum(int[] arr) {
        int totalSum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean checkEqualSumPartition(int[] arr) {
        int totalSum = findArraySum(arr);
        int prefixSum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if (prefixSum == suffixSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Equal partition possible: " + checkEqualSumPartition(arr));
        sc.close();
    }
}
