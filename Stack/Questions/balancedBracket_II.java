package Stack.Questions;

import java.util.*;

/* Find the minium number of brackets that we need to remove to make the given bracket
 * sequence balanced.
 */
public class balancedBracket_II {
    public static int minRemovevals(String str){
        Stack <Character> st=new Stack<>();
        int removal=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch=='(') {
                st.push(ch);
            } else if(ch==')'){
                if (st.size()==0) {
                    removal++;
                }
                else{
                    st.pop();
                }
            }
        }
        removal+=st.size();
        return removal;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Bracket '(' or ')' with space:");
        String str = sc.nextLine();
        System.out.println(minRemovevals(str));
    }
}
