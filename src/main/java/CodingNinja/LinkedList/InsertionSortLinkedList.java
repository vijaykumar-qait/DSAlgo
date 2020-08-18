package CodingNinja.LinkedList;

public class InsertionSortLinkedList {
    /**
     * Insertion Sort(Iteratively) LinkedList
     * Send Feedback
     * Sort a given linked list using Insertion Sort (iteratively).
     * You don't need to print the elements, just sort the elements and return the head of updated LL.
     * Input format : Linked list elements (separated by space and terminated by -1)`
     *
     * Sample Input 1 :
     * 1 4 5 2 -1
     * Sample Output 1 :
     * 1 2 4 5
     */

    static Node<Integer> sorted;

    private static void sortedInsert(Node<Integer> head){
        if(sorted == null || sorted.data >= head.data){
            head.next = sorted;
            sorted = head;
        }
        else {
            Node<Integer> ptr = sorted;
            while(ptr.next != null && ptr.next.data < head.data){
                ptr = ptr.next;
            }
            head.next = ptr.next;
            ptr.next = head;
        }
    }

    public static Node<Integer> insertionSort(Node<Integer> head) {
        sorted = null;
        Node<Integer> ptr = head;

        while(ptr != null){
            Node<Integer> next = ptr.next;
            sortedInsert(ptr);
            ptr = next;
        }
        head = sorted;
        return head;
    }

    public static void main(String [] args){
        Node<Integer> root = null;

        root = LinkedListUsage.createList();
        root = insertionSort(root);
        LinkedListUsage.print(root);
    }
}
