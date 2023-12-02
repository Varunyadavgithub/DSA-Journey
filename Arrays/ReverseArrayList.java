/*Write a program to reverse the given ArrayList */
// [0,10,3,5,22,10] = [10,22,5,3,10,0]

package ArrayList;
import java.util.ArrayList;
public class ReverseArrayList {
    static void reverseList(ArrayList<Integer>list){
        int i=0,j=list.size()-1;
        while(i<j){
            Integer temp=Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original list "+list);
        reverseList(list);
        System.out.println("Reverse list "+list);
    }
}
