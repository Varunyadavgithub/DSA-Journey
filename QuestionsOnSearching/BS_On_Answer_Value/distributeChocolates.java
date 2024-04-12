package QuestionsOnSearching.BS_On_Answer_Value;
/* You have 'n' (n<=10^5) boxes of  chocolate each box contains a[i] (a[j]<=10,000) chocolates.
 * You need to distribute these boxes among 'm' students such that the maximum number of chocolates
 * allocated to a students is minimum.
 * 
 * a.) One box will be allocated to exactly one student.
 * b.) All the boxes should be allocated.
 * c.) Each student has to be allocated at least one box.
 * d.) allotment should be in contiguous order, for instance, a student cannot be
 * allocated box '1' and box '3', skipping box '2'.
 * 
 * Calculate and return the minimum possible number assume that it is always possible to distribute
 * the chocolates. 
 * The first line of input will contain the value of 'n' number of boxes.
 * The second line of input will contain the 'n' numbers denoting the numbers of chocolates in each box.
 * The third line of input will contain the 'm' numbers of students.
 * 
 * Input : 4                //the number of 'n' boxes
 *        {12,34,67,90}     //the number of chocolate in each box
 *         2                 //the number of 'm' students
 * Output : 113
 */
public class distributeChocolates {
    //T.C = O(nlogn)    S.C = O(1)
    //In this question we are finding Minimal Maximas.

    static int distributeChocolates(int[] arr,int m){
        if(arr.length<m) return-1;
        int ans=-1,st=1,end=(int)1e9;
        while (st<=end) {
            int mid=st+(end-st)/2;
            if(isDivisionPossible(arr,m,mid)){
                ans=mid;
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return ans;
    }

    static boolean isDivisionPossible(int[] arr,int m,int maxChocAllowed){
        int numOfStudent=1;
        int choc=0; //number of chocolate current student has.
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxChocAllowed){
                return false;
            }

            if(choc+arr[i]<=maxChocAllowed){
                choc+=arr[i];
            }else{
                numOfStudent++;
                choc=arr[i];
            }
        }

        // if(numOfStudent>m) return false;
        // return true;

        return numOfStudent<=m;
    }
    public static void main(String[] args) {
        int [] arr={5,3,1,4,2};
        int m=3;
        System.out.print("The maximum number of chocolates allocated to a students is minimum which is: "+distributeChocolates(arr,m));
    }
}
