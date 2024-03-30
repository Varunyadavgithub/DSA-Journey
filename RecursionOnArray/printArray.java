package RecursionOnArray;
/*Given an array print all the values/elements recursively */
public class printArray {
    public static void printArray(int[] arr,int idx){
        // Base Case
        if(idx==arr.length){
            return;
        }
        // self work
        System.out.print(arr[idx]+" ");
        // recursive work (sub-problem)
        printArray(arr, idx+1);
    }
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9};
        printArray(arr,0);
    }
}
