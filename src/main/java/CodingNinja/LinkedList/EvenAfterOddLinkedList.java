package CodingNinja.LinkedList;

public class EvenAfterOddLinkedList {
    /**
     * Even after Odd LinkedList
     * Send Feedback
     * Arrange elements in a given Linked List such that, all even numbers are placed after odd numbers.
     * Respective order of elements should remain same.
     * Note: Input and Output has already managed for you. You don't need to print the elements,
     * instead return the head of updated LL.
     * Input format:
     * Linked list elements (separated by space and terminated by -1)
     * Output format:
     * Print the elements of updated Linked list.
     * Sample Input 1 :
     * 1 4 5 2 -1
     * Sample Output 1 :
     * 1 5 4 2
     * Sample Input 2 :
     * 1 11 3 6 8 0 9 -1
     * Sample Output 2 :
     * 1 11 3 9 6 8 0
     */

    public static Node<Integer> sortEvenOdd(Node<Integer> head) {
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> headEven = null,
                      headodd = null,
                      evenPtr = null,
                      oddPtr = null,
                      ptr = head;

        while(ptr != null){
            if((ptr.data & 1) == 0){
                if(headEven == null){
                    headEven = ptr;
                    evenPtr = headEven;
                }
                else {
                    evenPtr.next = ptr;
                    evenPtr = evenPtr.next;
                }
            }
            else {
                if(headodd == null){
                    headodd = ptr;
                    oddPtr = headodd;
                }
                else {
                    oddPtr.next = ptr;
                    oddPtr = oddPtr.next;
                }
            }
            ptr = ptr.next;
        }

        if(oddPtr != null){
            oddPtr.next = headEven;
        }
        if(evenPtr != null){
            evenPtr.next = null;
        }
        if(headodd != null){
            head = headodd;

        }
        return head;
    }

    public static void main(String [] args){
        Node<Integer> root = null;

        root = LinkedListUsage.createList();
        LinkedListUsage.print(root);
        root = sortEvenOdd(root);
        LinkedListUsage.print(root);
    }
}
