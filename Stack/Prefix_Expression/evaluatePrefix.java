package Stack.Prefix_Expression;
// Evaluate the prefix expression.

import java.util.*;

public class evaluatePrefix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<Integer> val = new Stack<>();
        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            // ASCII value of '0' => 48 and '9' => 57
            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);
            } else {
                int v1 = val.pop();
                int v2 = val.pop();
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
        System.out.println("The Prefix value is : " + val.pop());
    }
}
