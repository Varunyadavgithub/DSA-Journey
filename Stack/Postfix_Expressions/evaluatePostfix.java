package Stack.Postfix_Expressions;
// Evaluate the postfix expression.

import java.util.*;
public class evaluatePostfix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<Integer> val = new Stack<>();
        for (int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            // ASCII value of '0' => 48 and '9' => 57
            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);
            } else {
                int v2 = val.pop();
                int v1 = val.pop();
                if (ch == '+')
                    val.push(v1 + v2);
                if (ch == '-')
                    val.push(v1 - v2);
                if (ch == '*')
                    val.push(v1 * v2);
                if (ch == '/')
                    val.push(v1 / v2);
            }
        }
        System.out.println("The Postfix value is : " + val.pop());
    }
}
