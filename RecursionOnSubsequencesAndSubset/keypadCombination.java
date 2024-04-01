package RecursionOnSubsequencesAndSubset;
/*Given a string containing digits from 2 to 9 inclusive, return all
 * possible letter combination that the number could represent,
 *  Return the answer in any order.
 * 
 * Input : digit="23"
 * Output : ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 */

public class keypadCombination {
    static void combination(String dig,String[] kp,String res){
        // BaseCase
        if(dig.length()==0){
            System.out.print(res+" ");
            return;
        }

        // selfwork
        int currNum=dig.charAt(0)-'0';
        String currChoices=kp[currNum];

        //recursivework
        for(int i=0;i<currChoices.length();i++){
            combination(dig.substring(1), kp, res+currChoices.charAt(i));
        } 
    }
    public static void main(String[] args) {
        String dig="236";
        String[] kp={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(dig,kp," ");
    }
}
