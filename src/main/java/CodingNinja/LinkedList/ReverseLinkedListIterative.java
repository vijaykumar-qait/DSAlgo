package CodingNinja.LinkedList;

public class ReverseLinkedListIterative {
    /**
     * Reverse LL (Iterative)
     * Send Feedback
     * Given a linked list, reverse it iteratively.
     * You don't need to print the elements, just reverse the LL duplicates and return the head of updated LL.
     * Input format : Linked list elements (separated by space and terminated by -1)`
     *
     * Sample Input 1 :
     * 1 2 3 4 5 -1
     * Sample Output 1 :
     * 5 4 3 2 1
     */

    public static Node<Integer> reverse_I(Node<Integer> head) {
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

    public static void main(String [] args){
        Node<Integer> root = null;

        root = LinkedListUsage.createList();
        root = reverse_I(root);
        LinkedListUsage.print(root);
    }
}
