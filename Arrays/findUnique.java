// Find the unique number in a given Array where all the elements are being repeated twice with one value being unique...
// arr = [1,2,3,4,2,1,3]

// Traverse all pairs.
// Equal pairs -> mark as -1.
// Traverse array again,value > 0 is our ans.

import java.util.Scanner;

public class findUnique {
    static int findUniqueElement(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Unique element: " + findUniqueElement(arr));
        sc.close();
    }
}
