// Count the number of elements strictly greater than value x...
// arr[]={1,3,2,4,5}
// x = 2   => ans=3

import java.util.Scanner;

public class strictlyGreater {
    static int strictlyGreaterElement(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        return count;
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
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Number strictly greater than " + x + " is: " + strictlyGreaterElement(arr, x));
        sc.close();
    }

}
