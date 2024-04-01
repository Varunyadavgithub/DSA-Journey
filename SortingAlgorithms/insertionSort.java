package SortingAlgorithms;
/*In insertion sort array is virtually split into two parts soted-part and unsorted-part
 * values from the unsorted part are picked and placed at the correct position in the 
 * sorted part.
 * 
 * T.C = O(n^2)
 */
public class insertionSort {
    public static void insertionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                // swap the element
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={8,3,6,5,4,2};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
