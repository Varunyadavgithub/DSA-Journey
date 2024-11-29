// Given an array 'a' consisting of integers.Return the first value that is repeating in this array.If no value is being repeated,return -1...
// arr = [1,5,3,4,6,3,4]
// ans = 3

import java.util.Scanner;

public class repeatingNumber {
    static int firstRepeatingNumber(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
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
        System.out.println("The first repeating elements is: " + firstRepeatingNumber(arr));
        sc.close();
    }
}
