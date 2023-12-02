// Write a program to print the suffix Sum of an array...
/*arr=[2,1,3,4,5,6]
pref=[2,3,6,10,15,21] -> (Aage se Sum kro)
suff=[21,19,18,15,11,6] -> (Pichhe se Sum kro)
*/
import java.util.*;
public class SuffixSum {

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] suffixSum(int[] arr,int n){
        for(int i=n-2;i>=0;i--){
            arr[n-1]=arr[n-1];
            arr[i]=arr[i]+arr[i+1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements in an array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        suffixSum(arr,n);
        printArray(arr);
    }
}

