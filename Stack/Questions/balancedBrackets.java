package Stack.Questions;

import java.util.*;
// Balanced brackets --> Check weather a given bracket sequence is balanced or not.
  
public class balancedBrackets {
    static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.size() == 0)
                    return false;
                if (st.peek() == ')') {
                    st.pop();
                }
            }
        }
        if (st.size() > 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Bracket '(' or ')' with space:");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
