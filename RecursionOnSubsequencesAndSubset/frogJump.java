package RecursionOnSubsequencesAndSubset;
/*There are N stones, numbered 0,1,2,...,N-1 for each 'i' (0<=i<N)
 * the height of stone 'i' is 'hi' there is a frog who is initially 
 * on stone 0 he will repeat the following action some numbers of times 
 * to reach stone N-1 :- 
 * 
 * @ If the frog is currently on stone 'i' then jump to stone 'i+1' or 'i+2'
 * @ Here, a cost of | hi-hj | is incurred, where 'j' is the stone to land on
 * 
 * Find the minimum possible total cost incurred before the frog reach stone N.
 * 
 * Input : n=4, arr{10,30,40,20}
 * Output : 30
 */
public class frogJump {
    static int minimumCost(int[] h,int n,int idx){
        // Basecase
        if(idx==n-1) return 0;
        // selfwork + recursivework
        int option1=Math.abs(h[idx]-h[idx+1]+minimumCost(h, n, idx+1));
        // Basecase
        if(idx==n-2) return option1;

        // selfwork + recursivework
        int option2=Math.abs(h[idx]-h[idx+2]+minimumCost(h, n, idx+2));
        return Math.min(option1, option2);
    }
    public static void main(String[] args) {
        int[] height={10,30,40,20};
        int n=height.length;
        System.out.print(minimumCost(height,n,0));
    }
}
