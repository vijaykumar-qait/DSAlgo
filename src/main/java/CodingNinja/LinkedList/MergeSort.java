package CodingNinja.LinkedList;

public class MergeSort {
    /**
     * Code : Merge Sort
     * Send Feedback
     * Sort a given linked list using Merge Sort.
     * You don't need to print the elements, just sort the elements and return the head of updated LL.
     * Input format :
     * Linked list elements (separated by space and terminated by -1)
     * Output format :
     * Updated LL elements (separated by space)
     * Constraints :
     * 1 <= Length of LL <= 1000
     * Sample Input 1 :
     * 1 4 5 2 -1
     * Sample Output 1 :
     * 1 2 4 5
     */

    private static Node<Integer> linkedListMerge(Node<Integer> head1, Node<Integer> head2){
        if(head1 == null && head2 == null){
            return head1;
        }
        if(head1 != null && head2 == null){
            return head1;
        }
        if(head2 != null && head1 == null){
            return head2;
        }

        Node<Integer> ptr1 = head1,
                      ptr2 = head2,
                      head3 = null,
                      tail3 = null;

        if(ptr1.data <= ptr2.data){
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
            if(ptr1.data <= ptr2.data){
                tail3.next = ptr1;
                tail3 = tail3.next;
                ptr1 = ptr1.next;
            }
            else {
                tail3.next = ptr2;
                tail3 = tail3.next;
                ptr2 = ptr2.next;
            }
        }

        if(ptr2 == null){
            tail3.next = ptr1;
        }
        else {
            tail3.next = ptr2;
        }
        return head3;
    }

    private static Node<Integer> middle(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> slowPtr = head,
                      fastPtr = head;
        while(fastPtr.next != null && fastPtr.next.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        return  slowPtr;
    }

    public static Node<Integer> mergeSort(Node<Integer> head) {
        // write your code here
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> middle = middle(head);
        Node<Integer> head2 = middle.next;
        middle.next = null;

        head = mergeSort(head);
        head2 = mergeSort(head2);
        head = linkedListMerge(head, head2);
        return head;
    }

    public static void main(String [] args){
        Node<Integer> root = null;

        root = LinkedListUsage.createList();
        root = mergeSort(root);
        LinkedListUsage.print(root);
    }
}
