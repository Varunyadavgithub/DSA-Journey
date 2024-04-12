package QuestionsOnSearching.BS_On_2dArray;
/* Search the 'target' value in a 2D integer matrix of dimension 'n*m' and
 * return true if found else return false.This matrix has the following properties :-
 * 
 * 1.) Integer in each row are sorted from left to right.
 * 2.) The first intger of each row is greater than the last integer
 * of the previous row.
 * 
 * Input : matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}} and target=3
 * Output : true
  */
public class searchInMatrix {
    /*-------------------Approach-1-------------------- */
    //Travers all elements of 2D matrix & find target
    // T.C = O(n*m) and S.C = O(1)

    /*-------------------Approach-2-------------------- */
    // Apply binary search on each row of 2D matrix
    // T.C = O(nlogm) and S.C = O(1)

    /*-------------------Approach-3-------------------- */
    // Make a extra linear array & then search the target on it
    // T.C = O(log(nm)) and S.C = O(n*m)


    /*-------------------Approach-4-------------------- */
    /*Logic => 
        n = no. of rows
        m = no. of column
        
        i/m = row no.
        i%m = column no. 
    */

    // T.C = O(logn) and S.C = O(1)
    public static boolean searchInMatrix(int[][] arr,int target){
        int n=arr.length,m=arr[0].length;
        int st=0,end=n*m-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int midEle=arr[mid/m][mid%m];

            if(midEle==target){
                return true;
            }
            else if(target<midEle){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        System.out.print("The target is present in matrix: "+searchInMatrix(arr,target));
    }
}
