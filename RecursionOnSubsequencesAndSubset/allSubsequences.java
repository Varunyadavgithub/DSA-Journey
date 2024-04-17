package RecursionOnSubsequencesAndSubset;

import java.util.ArrayList;

/*Given a string write a method to return all its subsequences in an arrayList. 

 * A String is a subsequence of a given string that is generated by deleting 
 * some character of a given string without changing its order
 * 
 * Input : "abc"
 * Output : 'a','b','c','ab','bc','ac','abc'
 */
public class allSubsequences {
    static ArrayList<String> getSubsequences(String str){
        ArrayList<String> ans=new ArrayList<>();
        // Basecase
        if(str.length()==0){
            ans.add("");
            return ans;
        }

        char curr=str.charAt(0);

        // recursive work
        ArrayList<String> smallAns=getSubsequences(str.substring(1));

        // selfwork
        for(String s:smallAns){
            ans.add(s);
            ans.add(curr+s);
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> ans=getSubsequences("abc");
        for(String s:ans){
            System.out.print(s+" ");
        }
    }
}