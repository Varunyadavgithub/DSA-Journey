// Find the second largest element in the given array...
// Find maximun.
// Mark all maximuns as -infinite.
// Find maximun again.

import java.util.Scanner;
public class secondLargest {

    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int findSecondMax(int[] arr){
        int mx=findMax(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                mx=Integer.MIN_VALUE;
            }
        }
        int secondMax=findMax(arr);
        return secondMax;
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter "+n+" elements: ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("The first largest element is: "+findMax(arr));
    System.out.print("The second largest element is: "+findSecondMax(arr));
}
}

