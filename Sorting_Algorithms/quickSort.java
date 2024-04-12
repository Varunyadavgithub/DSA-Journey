package Sorting_Algorithms;
/* T.C = O(nlogn)   Best case
 * T.C = O(n^2)     worst case
 * S.C = O(logn)
 */
public class quickSort {
    static void display(int[] arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }

    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    static int partition(int[] arr,int st,int end){
        int pivot=arr[st];
        int count=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivotIdx=st+count;
        swap(arr, st, pivotIdx);
        int i=st,j=end;
        while(i<pivotIdx && j>pivotIdx){
            while (arr[i]<=pivot) {
                i++;
            }
            while (arr[i]>pivot) {
                j--;
            }
            if(i<pivotIdx && j>pivotIdx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }

    static void quickSort(int[] arr,int st,int end){
        // Basecase
        if(st>=end) return;

        int pi=partition(arr,st,end);
        quickSort(arr, st, pi-1);
        quickSort(arr, pi+1, end);
    }
    public static void main(String[] args) {
        int[] arr={6,3,1,5,4};
        System.out.print("Array before sorting: ");
        display(arr);

        System.out.println();

        quickSort(arr,0,arr.length-1);
        System.out.print("Array after sorting: ");
        display(arr);
    }
}
