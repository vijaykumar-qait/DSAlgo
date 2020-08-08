package CodingNinja.LinkedList;

public class MiddleOfLinkedList2 {
    /**
     * Code : Midpoint of Linked list
     * Send Feedback
     * Given a linked list, find and return the midpoint.
     * If the length of linked list is even, return the first mid point.
     * Input format : Linked list elements (separated by space and terminated by -1)`
     *
     * Sample Input 1 :
     * 1 2 3 4 5 -1
     * Sample Output 1 :
     * 3
     * Sample Input 2 :
     * 1 2 3 4 -1
     * Sample Output 2 :
     * 2
     */

    public static int printMiddel(Node<Integer> head) {
        if(head == null || head.next == null){
            return -1;
        }

        Node<Integer> fastPtr = head,
                      slowPtr = head;

        while(fastPtr.next != null && fastPtr.next.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        return slowPtr.data;
    }

    public static void main(String [] args){
        Node<Integer> root = null;

        root = LinkedListUsage.createList();
        System.out.println(printMiddel(root));
    }
}
