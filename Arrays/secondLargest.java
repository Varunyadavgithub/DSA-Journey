// Find the second largest element in the given array...
// Find maximun.
// Mark all maximuns as -infinite.
// Find maximun again.

import java.util.Scanner;

// Method - 1
// public class secondLargest {

//     static int findMax(int[] arr) {
//         int max = Integer.MIN_VALUE;
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }

//     static int findSecondMax(int[] arr) {
//         int mx = findMax(arr);
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == mx) {
//                 arr[i] = Integer.MIN_VALUE;
//             }
//         }
//         int secondMax = findMax(arr);
//         return secondMax;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.print("Enter " + n + " elements: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("The first largest element is: " + findMax(arr));
//         System.out.print("The second largest element is: " + findSecondMax(arr));
//         sc.close();
//     }
// }

// Method - 2
public class secondLargest {

    static int findSecondMax(int[] arr) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num < firstMax) {
                secondMax = num;
            }
        }
        return secondMax == Integer.MIN_VALUE ? Integer.MIN_VALUE : secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The second largest element is: " + findSecondMax(arr));
        sc.close();
    }
}