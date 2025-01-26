/*
 * Given an array 'nums' of distinct integers, return all the possible permutations. You can return the answer
 * in any order.
 * Input:- nums[1,2,3]
 * Output:- [[1,2,3],[1,3,2],[2,1,3],[]]
 */

public class UsingRecursion { // T.C = O(n!) and S.C=(n)
    public static void printAllPermutations(String str, String t) {
        if (str.equals("")) {
            System.out.println(t);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            String res = left + right;
            printAllPermutations(res, t + ch);
        }
    }

    public static void main(String[] args) {
        String str = "123";
        printAllPermutations(str, "");
    }
}
