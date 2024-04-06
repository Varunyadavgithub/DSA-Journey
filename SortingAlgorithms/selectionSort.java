package SortingAlgorithms;
/*The selection sort work by repeatedly selecting the smallest elements
 * from the unsorted portion of the list and move it, to the sorted
 * position of the list.
 * 
 * T.C = O(n^2)
 * S.C = O(1)
 */
public class selectionSort {
    public static void selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min_idx=i;  //'i' represent the current index

            // Find the minimum element in unsorted part of an array
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            // Swap the current index 'i' and minimum index 'min_idx'
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={7,4,5,1,2};
        selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
