package LinkedList.Questions;

import java.util.*;

/*(LeetCode - 2058) Find the Minimum and Maximum Number of Nodes Between Critical Points.
 * 
 * Input: head = [5,3,1,2,5,1,2]
   Output: [1,3]
Explanation: There are three critical points:
- [5,3,1,2,5,1,2]: The third node is a local minima because 1 is less than 3 and 2.
- [5,3,1,2,5,1,2]: The fifth node is a local maxima because 5 is greater than 2 and 1.
- [5,3,1,2,5,1,2]: The sixth node is a local minima because 1 is less than 5 and 2.
The minimum distance is between the fifth and the sixth node. minDistance = 6 - 5 = 1.
The maximum distance is between the third and the sixth node. maxDistance = 6 - 3 = 3.
 */
public class critical_Minima_And_Maxima {
    public static class  Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static int[] nodesBetweenCriticalPoints(Node head){
        ArrayList<Integer> criticalPoints=new ArrayList<>();
        int prev=head.data;
        int idx=1;
        head=head.next;
        // find the index of cirtical points
        while(head!=null){
            int curr=head.data;
            if (head.next!=null) {
                int next=head.next.data;
                if((curr>prev &&curr>next) || (curr<prev && curr<next)){
                    criticalPoints.add(idx);
                }
            }
            head=head.next;
            idx++;
            prev=curr;
        }
        // find min and max distance b/w critical points
        int n=criticalPoints.size();
        // basecase
        if(n<2) return new int[] {-1,-1};

        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            min=Math.min(min, criticalPoints.get(i+1)-criticalPoints.get(i));
        }
        int max=criticalPoints.get(n-1)-criticalPoints.get(0);
        return new int[] {min,max};
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(1);
        Node d=new Node(2);
        Node e=new Node(5);
        Node f=new Node(1);
        Node g=new Node(2);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=null;

        int[] ans=nodesBetweenCriticalPoints(a);
        System.out.println("Minimum distance between critical points: " + ans[0]);
        System.out.println("Maximum distance between critical points: " + ans[1]);
    }
}
