/* Given an array of integers 'a' move all the even integers at the beginning of the array followed
 by all the odd integer. The relative order of odd or even integer does not matter. 
 Return any array that satisfy the condition....

 arr = [1,2,3,4,5,6,7]
 ans = [2,4,6,1,3,5,7]

 */

import java.util.Scanner;
public class evenOddSort {
    static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
        static void swapArray(int[] arr,int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
    static void sortArrayByParity(int[] arr){
        int n = arr.length;
        int left=0,right=n-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swapArray(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("Enter "+n+" elements: ");
    for(int i=0 ;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Original Array: ");
    printArray(arr);
    System.out.println();
    sortArrayByParity(arr);
    System.out.println("Sorted array: ");
    printArray(arr);
}    
}
