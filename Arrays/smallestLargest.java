// Return the smallest and Largest value of an array as a array format...
// arr = [5,8,1,3,6,2]
// smallest = 1
// largest = 8
// ans = [1,8]

import java.util.Scanner;
import java.util.Arrays;
public class smallestLargest {
    static int[] smallestAndLargest(int[] arr){
    Arrays.sort(arr);
    int[] ans = {arr[0],arr[arr.length-1]};
    return ans;
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int n = sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter "+n+" elements: ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int[] ans = smallestAndLargest(arr);
    System.out.println("Smallest: "+ans[0]);
    System.out.println("Largest: "+ans[1]);
}
}
