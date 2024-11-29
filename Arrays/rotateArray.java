// Rotate the given array 'a' by k steps,where k is non-negative...
// NOTE :- k can be greater than n(Length of array) as well.

// arr = [1,2,3,4,5,6,7]
// n = 7, k = 5
// ans = [3,4,5,6,7,1,2]

// Method-1

// import java.util.Scanner;
// public class rotateArray {
//     static void printArray(int arr[]){
//         int n = arr.length;
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     static int[] rotateTheArray(int [] arr,int k){
//         int n = arr.length;
//         k = k%n;
//         int [] ans = new int[n];
//         int j = 0;
//         for(int i=n-k;i<n;i++){
//             ans[j++]=arr[i];
//         }
//         for(int i=0;i<n-k;i++){
//             ans[j++]=arr[i];
//         }
//         return ans;
//     }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the size of an array: ");
//     int n = sc.nextInt();
//     int[] arr = new int[n];
//     System.out.print("Entr "+n+" elements: ");
//     for(int i=0;i<arr.length;i++){
//         arr[i]=sc.nextInt();
//     }
//     System.out.print("Enter k: ");
//     int k =sc.nextInt();
//     System.out.print("Original Array: ");
//     printArray(arr);
//     int[] ans = rotateTheArray(arr,k);
//     System.out.print("Array after roatation: ");
//     printArray(ans);
//     sc.close();
// }
// }

// Method-2
import java.util.Scanner;

public class rotateArray {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void rotateInPlace(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        System.out.println("OriginalArray: ");
        printArray(arr);
        rotateInPlace(arr, k);
        System.out.println("Array After rotation: ");
        printArray(arr);
        sc.close();
    }
}
