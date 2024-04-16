package LinkedList.Questions;


/*Can we delete a node given the node itself as a parameter ?
 * Is there any efficient way, provided that the given node is not the last node.
 */

 //LeetCode #237 (delete node in a LinkedList).

public class deleteNode {
    public static class Node {
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    
    public void delNode(Node node){
        node.val=node.next.val;
        node.next=node.next.next;
    }
    public static void main(String[] args) {
      
    }
}
