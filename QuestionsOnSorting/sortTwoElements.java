package QuestionsOnSorting;
/*Given an array where all its elements are sorted in increasing order
 * except two swapped elements, sort it in linear time assume there are
 * no duplicates in the array.
 * Input : arr={3,8,6,7,5,9,10}
 * Output : arr={3,5,6,7,8,9,10}
 * 
 * T.C = O(n)
 * S.C = O(1)
 */
public class sortTwoElements {
    static void sortArray(int[] arr){
        int n=arr.length;
        int x=-1,y=-1;
        // Basecase
        if(n<=1) return;

        // Process all adjecent elements
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                if(x==-1){  //1st conflict
                    x=i-1;
                    y=i;
                }else{ //2nd conflict
                    y=i;
                }
            }
        }
        // swap 'x' and 'y'
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args) {
       int[] arr={10,5,6,7,8,9,3};
       sortArray(arr);
       for(int val:arr){
        System.out.print(val+" ");
       } 
    }
}
