/*Given an integer array 'a', return the prefix sum/runing sum in the same array without creating a new  array*/

// Method-1

// import java.util.*;
// public class prefixSum {
//     static void printArray(int[] arr){
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     static int[] makePrefixSumArray(int[] arr){
//         int n=arr.length;
//         int[] pref=new int[n];
//         pref[0]=arr[0];
//         for(int i=1;i<n;i++){
//             pref[i]=pref[i-1]+arr[i];
//         }
//         return pref;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of an array: ");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         System.out.print("Enter "+n+" elements: ");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Input array: ");
//         printArray(arr);
//         int[] pref=makePrefixSumArray(arr);
//         System.out.println("Prefix Sum array: ");
//         printArray(pref);
//         sc.close();
//     }
// }

// Method-2

import java.util.*;

public class prefixSum {
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] makePrefixSumArray(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
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
        System.out.println("Input array: ");
        printArray(arr);
        int[] pref = makePrefixSumArray(arr);
        System.out.println("Prefix Sum array: ");
        printArray(pref);
        sc.close();
    }
}
