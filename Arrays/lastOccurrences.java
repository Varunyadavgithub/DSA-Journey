// Find the last Occurrence of element x in a given array...
// arr[] = {5,6,5,3,5,4}
// x = 5  => ans=4

import java.util.Scanner;

public class lastOccurrences {
    static int lastOccurrence(int[] arr, int x) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Last Occurrence of x: " + lastOccurrence(arr, x));
        sc.close();
    }
}
