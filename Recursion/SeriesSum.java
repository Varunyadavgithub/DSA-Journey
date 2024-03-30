package Recursion;
/*Given a number n. Find the sum of natural numbers till 'n' but with alternate sign.
 * That means if n=5 then 1-2+3-4+5 = 3
 */
import java.util.*;
public class SeriesSum {
    public static int seriesSum(int n){
        if(n==0) return 0;
        if(n%2==0){
            return seriesSum(n-1)-n;
        }else{
            return seriesSum(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println(seriesSum(n));
    }
}
