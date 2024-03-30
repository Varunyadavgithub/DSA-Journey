package RecursionOnArray;
/*Find the sum of the element of an array */
public class sumOfArray {
    public static int sum(int[] arr,int idx){
        // Base case
        if(idx==arr.length) return 0;
        // recursive work
        int smallAns=sum(arr,idx+1);
        // self work
        return smallAns+arr[idx];
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(sum(arr,0));
    }
}
