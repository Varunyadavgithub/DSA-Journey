/*Given an array of integer of size n. Answer q queries where you need 
to print the Sum of values in a given range of indices from l to r(both include).*/

import java.util.*;
public class RangeQueries {
    static int[] makePrefixSumArray(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter "+n+" elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] prefSum=makePrefixSumArray(arr);
        System.out.println("Enter the number of queries: ");
        int q=sc.nextInt();
        while(q-->0){
            System.out.println("Enter range: ");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans = prefSum[r]-prefSum[l-1];
            System.out.println("Sum: "+ans);
        }



    }
}
