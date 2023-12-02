// Find the total number of pairs in the array whose sum is equal to the given value x...
// arr=[4,6,3,5,8,2]
// target = 7
// ans = (4,3),(5,2)

import java.util.Scanner;
public class pairSum {
    static int pairSum(int[] arr,int target){
        int n = arr.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int n = sc.nextInt();
    int[]arr = new int[n];
    System.out.println("Enter "+n+" elements: ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the target: ");
    int target = sc.nextInt();
    int num = pairSum(arr,target);
    System.out.println("There are "+num+" pair which sum is equal to Target");
}
    
}
