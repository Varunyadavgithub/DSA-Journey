package LinkedList.Questions;
//LeetCode-160
/* Finding intersection of two linked list (Two pointers to the rescue) */

public class intersection {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    // T.C = O(m+n)     S.C = O(1)
    public static Node getIntersectionNode(Node headA, Node headB) {
        Node tempA = headA;
        Node tempB = headB;
        int lenA = 0;
        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }
        int lenB = 0;
        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;

        if (lenA > lenB) {
            int steps = lenA - lenB;
            for (int i = 1; i <= steps; i++) {
                tempA = tempA.next;
            }
        } else {
            int steps=lenB-lenA;
            for(int i=1;i<=steps;i++){
                tempB=tempB.next;
            }
        }

        while (tempA!=tempB) {
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
    }

    public static void main(String[] args) {
        Node headA = new Node(100);
        headA.next = new Node(87);
        headA.next.next = new Node(13);
        headA.next.next.next = new Node(4);
        headA.next.next.next.next = new Node(5);
        headA.next.next.next.next.next = new Node(12);
        headA.next.next.next.next.next.next = new Node(10);

        Node headB = new Node(90);
        headB.next = new Node(9);

        // Linking intersecting node
        headB.next.next = headA.next.next.next.next;

        Node intersectionNode = getIntersectionNode(headA, headB);

        if (intersectionNode != null) {
            System.out.print("Intersection node value: " + intersectionNode.data);
        } else {
            System.out.print("No intersection node found.");
        }
    }
}
