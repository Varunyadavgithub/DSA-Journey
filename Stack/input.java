package Stack;

import java.util.Scanner;
import java.util.Stack;

/* Write a program to take a input in a stack.  */
public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Stack<Integer> st=new Stack<>();
        System.out.println("Enter the size of a stack: ");
        int n=sc.nextInt();
        System.out.println("Enter elements in a stack: ");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);

    }
}
