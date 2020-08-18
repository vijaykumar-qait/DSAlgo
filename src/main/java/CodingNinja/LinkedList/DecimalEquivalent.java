package CodingNinja.LinkedList;

public class DecimalEquivalent {
    /**
     * Decimal Equivalent
     * Send Feedback
     * Given a singly linked list of 0s and 1s, find and return its decimal equivalent.
     * Input Format :
     * Elements of the linked list ending with -1 (-1 not included)
     * Output Format:
     * Decimal equivalent of input LL
     * Constraints :
     * 1 <= size of list <= 100
     * Sample Input 1:
     * 1 0 -1
     * Sample Output 1:
     * 2
     * Sample Input 2:
     * 1 0 1 -1
     * Sample Output 2:
     * 5
     */

    private static Node<Integer> reverseLinkedList(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> nextPtr = head.next;
        Node<Integer> finalList = reverseLinkedList(head.next);
        nextPtr.next = head;
        head.next = null;
        return finalList;
    }

    public static int decimal(Node<Integer> head) {
        if(head.next == null){
            return head.data;
        }

        head = reverseLinkedList(head);
        Node<Integer> ptr = head;
        int sum = 0, i=0, val = 2/*for binary equivalent*/;

        while(ptr != null){
            int mul = (int)Math.pow(2, i++);
            sum += ptr.data * mul;
            ptr = ptr.next;
        }
        return sum;
    }

    public static void main(String [] args){
        Node<Integer> root = null;

        root = LinkedListUsage.createList();
        System.out.println(decimal(root));
    }
}
