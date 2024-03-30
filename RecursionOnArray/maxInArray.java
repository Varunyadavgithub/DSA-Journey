package RecursionOnArray;
/* Print the maximum velue  of an array */
public class maxInArray {
    public static int maxValue(int[] arr,int idx){
        // Base case
        if(idx==arr.length-1) return arr[idx];
        // small problem
        int samllAns=maxValue(arr, idx+1);
        // self work
        return Math.max(arr[idx], samllAns);
    }
    public static void main(String[] args) {
        int[] arr={5,64,7,8,9};
        System.out.print(maxValue(arr,0));
    }
}
