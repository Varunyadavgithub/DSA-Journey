package Stack.Questions;
// GFG - Stock span problem

/* Given a series of 'N' daily price quotes for a stock, we need to calculate the span of the
 * stock's price for all 'N' days. The span of the stock's price in one day is the maximum number
 * of consecutive days (starting from that day & going backward) for which the stack price was less 
 * than or equal to the price of that day.
 */
import java.util.*;

public class stockSpamProblem {
    public static int[] calculateSpan(int price[], int n) {
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();
        span[0] = 1;
        st.push(0);
        for (int i = 0; i < n; i++) {
            while (st.size() != 0 && price[i] >= price[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }
            st.push(null);
        }
        return span;
    }

}
