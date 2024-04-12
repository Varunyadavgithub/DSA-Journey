package QuestionsOnSearching;
/* Find the square root of the given non-negative value 'x'
*  round it off to the nearest floor integer value.

*  Input = x=4
*  Output = 2
 */
public class squareRoot {
    // T.C = O(root(x))     S.C = O(1)

    // public static int sqrt(int x){
    //     int y=0;
    //     while(y*y<=x){
    //         y++;
    //     }
    //     return y-1;
    // }

    // T.C = O(logn)    S.C = O(1)
    public static int sqrt(int x){
        int st=0,end=x;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            long val=mid*mid;
            if(val==x){
                return mid;
            }
            else if(val<x){
                ans=mid;
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x=11;
        System.out.print("The nearest and equal integer value is: "+sqrt(x));
    }
}
