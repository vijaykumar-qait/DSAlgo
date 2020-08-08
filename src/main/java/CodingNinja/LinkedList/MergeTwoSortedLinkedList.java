package CodingNinja.LinkedList;

public class MergeTwoSortedLinkedList {
    /**
     * Code : Merge two sorted LL
     * Send Feedback
     * Given two linked lists sorted in increasing order. Merge them in such a way that the result list is also sorted (in increasing order).
     * Try solving with O(1) auxiliary space (in-place). You just need to return the head of new linked list, don't print the elements.
     * Input format :
     * Line 1 : Linked list 1 elements of length n (separated by space and terminated by -1)
     * Line 2 : Linked list 2 elements of length m (separated by space and terminated by -1)
     * Output format :
     * Merged list elements (separated by space)
     * Constraints :
     * 1 <= n, m <= 10^4
     * Sample Input :
     *  2 5 8 12 -1
     *  3 6 9 -1
     * Sample Output :
     *  2 3 5 6 8 9 12
     */

    public static Node<Integer> mergeTwoList(Node<Integer> head1, Node<Integer> head2) {

        if(head1 == null && head2 == null){
            return head1;
        }

        if(head1 == null && head2 != null){
            return head2;
        }

        if(head2 == null && head1 != null){
            return head1;
        }

        Node<Integer> ptr1 = head1,
                      ptr2 = head2,
                      head3 = null,
                      tail3 = null;

        if(ptr1.data < ptr2.data){
            head3 = head1;
            tail3 = head3;
            ptr1 = ptr1.next;
        }
        else {
            head3 = head2;
            tail3 = head3;
            ptr2 = ptr2.next;
        }

        while(ptr1 != null && ptr2 != null){
            if(ptr1.data < ptr2.data){
                tail3.next = ptr1;
                ptr1 = ptr1.next;
                tail3 = tail3.next;
            }
            else {
                tail3.next = ptr2;
                ptr2 = ptr2.next;
                tail3 = tail3.next;
            }
        }

        if(ptr2 == null) {
            tail3.next = ptr1;
        }
        else {
            tail3.next = ptr2;
        }

        return head3;
    }

    public static void main(String [] args){
        Node<Integer> root = null;
        Node<Integer> root2 = null;
        root = LinkedListUsage.createList();
        LinkedListUsage.print(root);
        root2 = LinkedListUsage.createList();
        LinkedListUsage.print(root2);

        Node<Integer> root3 = mergeTwoList(root, root2);
        LinkedListUsage.print(root3);
    }
}
