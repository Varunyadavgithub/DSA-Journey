package RecursionOnArray;
/*Given an array of n integers and a target value 'x' print whether 'x' exists in the array or not.
 * arr={4,12,54,14,3,8,6}
 * n=8, x=14 ans=yes
 */
public class findTarget {
    public static boolean findTarget(int[] arr,int target,int idx){
        // Basecase
        if(idx>=arr.length) return false;
        // self work
        if(arr[idx]==target){
            return true;
        }
        // recursive work
        if(findTarget(arr, target, idx+1)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr={4,12,54,14,3,8,6};
        int x=14;
        if(findTarget(arr,x,0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
