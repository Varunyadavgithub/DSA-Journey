package QuestionsOnSearching.BS_On_2dArray;
/* Write a efficent algorithm that search for a value target in an m*n integer matrix.
 * This matrix has the following properties :-
 * 
 * 1.) Integers in each row are sorted in ascending from left to right.
 * 2.) Integers in each column are sorted in ascending from top to bottom.
 * 
 * Input : matrix={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}}
 *      and target = 5
 * Output : true
*/
public class searchInMatrixII {
    // T.C = O(n+m) and S.C = O(1)

    public static boolean searchInMatrixII(int[][] arr,int target){
        int n=arr.length,m=arr[0].length;
        int i=0,j=m-1;
        while(i<n && j>=0){
            if(arr[i][j]==target){
                return true;
            }
            else if(target<arr[i][j]){
                j--; //move left
            }
            else{
                i++; //move down
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=5;
        System.out.println("The target value is present in matrix: "+searchInMatrixII(arr,target));
    }
}
