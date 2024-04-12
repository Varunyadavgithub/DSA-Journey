package Sorting_Algorithms;

/*Merge sort is a recursive algorithm that continuously splite the array in 
 * half until it cannot be further divided.
 * 
 * @ Divide the array into two equal parts;
 * @ Sort the two subarrays separately using recursion.
 * @ Merge the two sorted subarray to create an overall sorted array.
 * 
 * T.C = O(nlogn)
 * S.C = O(n) 
 */
public class mergeSort {
    public static void mergeSort(int[] arr, int l, int r) {
        // BaseCase
        if (l >= r)
            return;

        int mid = (l + r) / 2;
        // recursive work
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);        // selfwork
        merge(arr,l,mid,r);
    }

    public static void merge(int[] arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;

        int[] left=new int[n1];
        int[] right=new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=l;

        // Case-1 : If size of left & right array are same
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
            }
        }

        // Case-2 : If size of left array is greater than right array
        while(i<n1){
            arr[k++]=left[i++];
        }

        // Case-3 : If size of left array is less than right array 
        while (j<n2) {
            arr[k++]=right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 3, 5, 2 };
        int n = arr.length;
        System.out.print("Array Before sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();

        mergeSort(arr, 0, n - 1);
        System.out.print("Array after sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
