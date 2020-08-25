package CodingNinja.LinkedList;

public class SortLinkedList {
    /**
     * Sort Linked List
     * Send Feedback
     * Given a Linked List, which has nodes in alternating ascending and descending orders. Sort the list efficiently and space complexity should be O(1).
     * You just need to return the head of sorted linked list, don't print the elements.
     * Input format :
     * Line 1 : Linked list elements of length L (separated by space and terminated by -1)
     * Line 2 : Integer n
     * Output format :
     * Updated list elements (separated by space)
     * Sample Input 1 :
     * 10 40 53 30 67 12 89 -1
     * Sample Output 1 :
     * 10 12 30 40 53 67 89
     */

    static Node<Integer> reverse(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> nextPtr = head,
                      ptr = head,
                      prevPtr = null;

        while(nextPtr != null){
            nextPtr = nextPtr.next;
            ptr.next = prevPtr;
            prevPtr = ptr;
            ptr = nextPtr;
        }
        head = prevPtr;

        return head;
    }

    static Node<Integer> mergeSortedList(Node<Integer> head1, Node<Integer> head2){
        if(head1 == null && head2 == null){
            return head1;
        }

        if(head1 == null && head2 != null){
            return head2;
        }

        if(head2 == null && head1 != null){
            return head1;
        }

        Node<Integer> head3 = null,
                      tail3 = null,
                      ptr1 = head1,
                      ptr2 = head2;

        if(ptr1.data < ptr2.data){
            head3 = head1;
            tail3 = head1;
            ptr1 = ptr1.next;
        }
        else {
            head3 = head2;
            tail3 = head2;
            ptr2 = ptr2.next;
        }

        while(ptr1 != null && ptr2 != null){
            if(ptr1.data < ptr2.data){
                tail3.next = ptr1;
                tail3 = tail3.next;
                ptr1 = ptr1.next;
            }
            else {
                tail3.next = ptr2;
                ptr2 = ptr2.next;
                tail3 = tail3.next;
            }
        }
        if(ptr1 == null){
            tail3.next = ptr2;
        }
        else {
            tail3.next = ptr1;
        }
        return head3;
    }

    public static Node<Integer> sort(Node<Integer> head) {
        //Your code goes here
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> ptr1 = head,
                      head1 = head,
                      ptr2 = head.next,
                      head2 = head.next,
                     ptr = head.next.next;

        int i = 0;

        while (ptr != null){
            if(i % 2 == 0){
                ptr1.next = ptr;
                ptr = ptr.next;
                ptr1 = ptr1.next;
                i++;
            }
            else{
                ptr2.next = ptr;
                ptr2 = ptr2.next;
                ptr = ptr.next;
                i++;
            }
        }

        if(ptr1.next == null){
            ptr2.next = null;
        }
        else {
            ptr1.next = null;
        }

        LinkedListUsage.print(head1);
        LinkedListUsage.print(head2);

        head2 = reverse(head2);

        LinkedListUsage.print(head1);
        LinkedListUsage.print(head2);

        head = mergeSortedList(head1, head2);
        return head;
    }

    public static void main(String [] args){
        Node<Integer> head = LinkedListUsage.createList();
        head = sort(head);
        LinkedListUsage.print(head);
    }
}
