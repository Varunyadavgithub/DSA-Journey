package Sorting_Algorithms;

public class countSort {

    // Method-1     T.C = O(n), S.C = O(n)

    // static void display(int[] arr){
    //     for(int val:arr){
    //         System.out.print(val+" ");
    //     }
    // }
    // static int findMax(int[] arr){
    //     int mx=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]>mx){
    //             mx=arr[i];
    //         }
    //     }
    //     return mx;
    // }
    // static void countSort(int[] arr){
    //     int max=findMax(arr);
    //     int[] count=new int[max+1];
        // Make frequency array
    //     for(int i=0;i<arr.length;i++){
    //         count[arr[i]]++;
    //     }
    //     int k=0;
    //     for(int i=0;i<count.length;i++){
    //         for(int j=0;j<count[i];j++){
    //             arr[k++]=i;
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     int[] arr={1,4,5,2,2,5};
    //     System.out.print("Array before sorting: ");
    //     display(arr);
    //     System.out.println();
    //     System.out.print("Array after sorting: ");
    //     countSort(arr);
    //     display(arr);
    // }

    // Method-2    T.C = O(n), S.C = O(n)

    static void display(int[] arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    static int findMax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static void countSort(int[] arr){
        int n=arr.length;
        int[] output=new int[n];
        int max=findMax(arr);
        int[] count=new int[max+1];
        // Make frequency array
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        // Make prefix sum array of count array
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        // Find the index of each element in the original array & put it in output array
        for(int i=n-1;i>=0;i--){
            int idx=count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }
        // Copy all elements of the output to arr
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }
    public static void main(String[] args) {
        int[] arr={1,4,5,2,2,5};
        System.out.print("Array before sorting: ");
        display(arr);
        System.out.println();
        System.out.print("Array after sorting: ");
        countSort(arr);
        display(arr);
    }
}
