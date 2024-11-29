// Calculate the number of occurrences of a particular elements x....
// arr[]={1,5,8,4,7,4,3,8,5}
// x=4  => ans = 2

import java.util.Scanner;

public class occurrences {
    static int countOccurrences(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
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
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Count of x: " + countOccurrences(arr, x));
        sc.close();
    }

}
