/*Given Q queries, check if the given number is present in the array or not.
 * Note : value of all the element in the array is less than 10^5
 */

import java.util.*;

public class PresentQuery {
    public static int[] markfrequencyArray(int[] arr){
        int[] freq=new int[100005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] freq=markfrequencyArray(arr);
        System.out.println("Enter number of queries: ");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("Enter number to be search: ");
            int x=sc.nextInt();
            if(freq[x]>0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            q--;
        }
    }
}
