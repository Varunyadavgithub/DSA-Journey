package Strings;
/* Given a string 's' print all the substring of 's'
 * Input : s="abcd"
 * Output : "a","ab","abc","abcd","b","bc","bcd","c","cd","d"
 */
public class printAllSubstring {
    public static void main(String[] args) {
        String s="abcd";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.print(s.substring(i,j)+" ");
            }
        }
    }
}
