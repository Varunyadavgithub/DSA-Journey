// Reverse an array consisting of integer value...

// Method-1

// public class reverseArray {
//     static int[] reverseTheArray(int[] arr){
//         int n = arr.length;
//         int[] ans = new int [n];
//         int j=0;
//         for(int i=n-1;i>=0;i--){
//             // ans[j]=arr[i];
//             // j++;
//             ans[j++]=arr[i];
//         }
//         return ans;
//     }
// public static void main(String[] args){
//     int[] arr = {1,2,3,4,5};
//     int[] ans = reverseTheArray(arr);
//     for(int i=0;i<ans.length;i++){
//         System.out.print(ans[i]+" ");
//     }
// }
// }

// Method-2

public class reverseArray {
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseTheArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swapInArray(arr, i, j);
        }
        i++;
        j--;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 1, 3 };
        reverseTheArray(arr);
        printArray(arr);
    }
}