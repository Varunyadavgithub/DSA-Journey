package Stack.Questions;
// The celebrity problem (GFG).

import java.util.*;
public class celebrityProblem {

    public static int celebrity(int M[][],int n){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            st.push(i); //sb ko push kr do
        }
        while (st.size()>1) {
            int v1=st.pop();
            int v2=st.pop();
            if (M[v1][v2]==0) { //shayad v1 celebrity ho, v2 to celebrity nahi hai 
                st.push(v1);
            }else if(M[v2][v1]==0){ //shayad v2 celebrity ho, v1 to celebrity nahi hai
                st.push(v2);
            }
        }
        if (st.size()==0) {
            return -1;
        }
        int potential=st.pop();
        // check in row kya potential kese ko jaan ta hai
        for(int j=0;j<n;j++){
            if(M[potential][j]==1) return -1;
        }
        // check in column kya potential ko koi jaan ta hai
        for(int i=0;i<n;i++){
            if (i==potential) {
                continue;
            }
            if (M[i][potential]==0) {
                return -1;
            }
        }
        return potential;
    }
    public static void main(String[] args) {
        
    }
}
