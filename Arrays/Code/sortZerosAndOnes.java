// Sort an array without using inbuilt method, consisting of only 0s and 1s...
// arr = [1,0,0,1,0,1,1,0,0]
// ans = [0,0,0,0,0,1,1,1,1] - Sorted in increasing order...


// Method-1

// import java.util.Scanner;
// public class sortArray {
//     static void printArray(int[] arr){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     static void sortZeroesAndOnes(int[] arr){
//         int zeroes=0;
//         int n = arr.length;
//         for(int i=0;i<n;i++){
//             if(arr[i]==0){
//                 zeroes++;
//             }
//         }
//         for(int i=0;i<n;i++){
//             if(i<zeroes){
//                 arr[i]=0;
//             }
//             else{
//                 arr[i]=1;
//             }
//         }
//     }
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the size of an array: ");
//     int n = sc.nextInt();
//     int[] arr = new int[n];
//     System.out.print("Enter "+n+" elements: ");
//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }
//     System.out.println("Original Array: ");
//     printArray(arr);
//     System.out.println("Sorted array: ");
//     sortZeroesAndOnes(arr);
//     printArray(arr);
// }
// }

// Method-2

import java.util.Scanner;
public class sortArray{
    static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swapArray(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sortZeroesAndOnes(int[] arr){
        int n = arr.length;
        int left=0,right=n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swapArray(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter "+n+" elements: ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Original array: ");
    printArray(arr);
    System.out.println("Sorted array: ");
    sortZeroesAndOnes(arr);
    printArray(arr);
}
}