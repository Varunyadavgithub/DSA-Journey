package QuestionsOnSearching.BS_On_Answer_Value;
/* A new racing track for kids is being built in New York with 'n' starting spots.The sports are located 
 * along a straight line at positions x1,x2,...,xn (xi<=10^9) for each 'i' (xi+1 > xi). 
 * At a time only 'm' children are allowed to enter the race. Since the race track is for kids, they may 
 * run into each other while runing .To prevent this, we want to chose the starting sports such that the 
 * minimum distance b/w any two of them is as large as possible. What is the minimum distance ?
 * 
 * The first line of input will contains the value of 'n' the number of starting sports.
 * The second line of input will contain the 'n' number denoting the location of each sports.
 * The third line of input will contain the value of 'm' number of children.
 * 
 * Input : 5            //number of starting sports.
 *         {1,2,4,8,9}  //location of each sports.
 *         3            //number of childrens.
 * Output : 3
 */
public class raceTrack {
    //T.C = O(nlogn)    S.C = O(1)
    //In this question we are finding Maximal Minima.

    static int raceTrack(int[] arr,int k){
        if(k>arr.length) return -1;
        int st=0,end=(int)1e9;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isPossible(arr,k,mid)){ //Can 'k' kids be placed such that no 2 kids have distance lesser than mid.
                ans=mid;
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }

    static boolean isPossible(int[] arr,int k,int dist){
        int kidsPlaced=1;
        int lastKid=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-lastKid >= dist){
                kidsPlaced++;
                lastKid=arr[i];
            }
        }
        return kidsPlaced>=k;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,8,9};
        int k=3;
        System.out.println("The minimum distance b/w two students is: "+raceTrack(arr,k));
    }
}
