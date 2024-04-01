package SortingAlgorithms;
/*In Bubble sort we do a certen number of passes in every pass, we
 * compare adjecent elemnts and swap them if they are not in correct order
 */

/* -------------------------Wast Case T.C = O(n^2)---------------------------*/

public class bubbleSort {
    static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={7,4,6,5,3};
        bubbleSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

/* -----------------------Best Case T.C = O(n)--------------------- */

// public class bubbleSort {
//     static void bubbleSort(int[] arr){
//         int n=arr.length;
//         for(int i=0;i<n-1;i++){
//             boolean flag=false;
//             for(int j=0;j<n-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                     flag=true;
//                 }
//             }
//             if(!flag){
//                 return;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr={2,1,3,4,5};
//         bubbleSort(arr);
//         for(int i:arr){
//             System.out.print(i+" ");
//         }
//     }
// }
