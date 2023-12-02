// Count the number of triplets whose sum is equal to the given value x....
// arr = [1,4,5,6,3]
// x = 12
// ans = (1,5,6),(4,5,3)

import java.util.Scanner;
public class tripletsSum {
    static int tripletsSum(int[] arr,int x){
        int n = arr.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter "+n+" elements: ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the Target sum: ");
    int x = sc.nextInt();

    int num = tripletsSum(arr,x);
    System.out.println("There are "+num+" triplets which sum is equal to the Target");
}
}
