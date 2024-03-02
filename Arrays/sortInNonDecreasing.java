/* Given an integer array 'a'  sorted in non-decreasing order, 
return an array of the squares of each number sorted in non-decreasing order... LeetCode(977. Squares of a Sorted Array)

arr = [2,4,6,7,10]    
arr = [4,16,36,49,100]  -> sorted in non-decreasing order

arr = [-10,-3,-2,1,4,5]
arr = [100,9,4,1,16,25] 
are = [1,4,9,16,25,100]  -> sorted in non-decreasing order
*/

import java.util.*;
public class sortInNonDecreasing {
    static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // static void reverse(int[] arr){
    //     int i=0,j=arr.length-1;
    //     while(i<j){
    //         swap(arr,i,j);
    //         i++;
    //         j--;
    //     }
    // }
    // static void swap(int[] arr,int i,int j){
    //     int temp=arr[i];
    //     arr[i]=arr[j];
    //     arr[j]=temp;
    // } 
    static int[] sortSquare(int[] arr){
        int n=arr.length;
        int left=0,right=n-1;
        int[] ans = new int[n];
        int k=n-1;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k--]=arr[left]*arr[left];
                left++;
            }else{
                ans[k--]=arr[right]*arr[right];
                right--;
            }        
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter  "+n+" elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array: ");
        printArray(arr);
        int[] ans=sortSquare(arr);
        System.out.println("Sorted array: ");
        printArray(ans);
    }
    
}
