package CodingNinja.LinkedList;

public class NextNumber {
    /**
     * Next Number
     * Send Feedback
     * Given a large number represented in the form of a linked list. Write code to increment the number by
     * 1 in-place(i.e. without using extra space).
     * Note: You don't need to print the elements, just update the elements and return the head of updated LL.
     * Input Constraints:
     * 1 <= Length of Linked List <=10^6.
     * Input format :
     * Line 1 : Linked list elements (separated by space and terminated by -1)
     * Output Format :
     * Line 1: Updated linked list elements
     * Sample Input 1 :
     * 3 9 2 5 -1
     * Sample Output 1 :
     * 3 9 2 6
     * Sample Input 2 :
     * 9 9 9 -1
     * Sample Output 1 :
     * 1 0 0 0
     */

    private static Node<Integer> reverse(Node<Integer> head) {
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> prevPtr = null,
                nextPtr = head,
                ptr = head;

        while(nextPtr != null){
            nextPtr = nextPtr.next;
            ptr.next = prevPtr;
            prevPtr = ptr;
            ptr = nextPtr;
        }

        head = prevPtr;
        return head;
    }

    public static Node<Integer> nextLargeNumber(Node<Integer> head) {
        if(head == null){
            return head;
        }

        if(head.next == null){
            head.data++;
            return head;
        }

        head = reverse(head);
        Node<Integer> ptr = head;
        ptr.data++;
        int rem = 0;
        if(ptr.data > 9){
            ptr.data = 0;
            rem = 1;
        }
        ptr = ptr.next;
        while(ptr.next != null){
            ptr.data = ptr.data + rem;
            rem = 0;
            if(ptr.data > 9){
                ptr.data = 0;
                rem = 1;
            }
            else {
                break;
            }
            ptr = ptr.next;
        }

        if(rem == 1){
            ptr.data++;
            if(ptr.data > 9){
                Node<Integer> newNode = new Node<>(rem);
                ptr.data = 0;
                ptr.next = newNode;
            }
        }

        head = reverse(head);
        return head;
    }

    public static void main(String [] args){
        Node<Integer> root = null;

        root = LinkedListUsage.createList();
        root = nextLargeNumber(root);
        LinkedListUsage.print(root);
    }
}
