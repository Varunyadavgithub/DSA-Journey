/* WAP to reverse the given ArrayList 
 * input :- [0,10,3,5,22,10]
 * output:- [10,22,5,3,10,0]
*/
import java.util.ArrayList;
public class reverseArrayList {
    public static void reverse(ArrayList<Integer> list){
        int i=0,j=list.size()-1;
        while(i<j){
            Integer temp=Integer.valueOf(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original list: "+list); //[0 1 2 3 4 5]
        reverse(list);
        System.out.println("Reversed List: "+list); //[5 4 3 2 1 0]
    }
}
