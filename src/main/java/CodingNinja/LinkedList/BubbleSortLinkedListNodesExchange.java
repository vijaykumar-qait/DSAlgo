package CodingNinja.LinkedList;

public class BubbleSortLinkedListNodesExchange {
    /**
     * Bubble Sort (Iterative) LinkedList
     * Send Feedback
     * Sort a given linked list using Bubble Sort (iteratively). While sorting, you need to swap the entire nodes, not just the data.
     * You don't need to print the elements, just sort the elements and return the head of updated LL.
     * Input format : Linked list elements (separated by space and terminated by -1)`
     *
     * Sample Input 1 :
     * 1 4 5 2 -1
     * Sample Output 1 :
     * 1 2 4 5
     */

    private static int getListLength(Node<Integer> head){
        if(head == null){
            return 0;
        }
        Node<Integer> ptr = head;
        int count = 0;
        while(ptr != null){
            count++;
            ptr = ptr.next;
        }
        return count;
    }

    public static Node<Integer> bubbleSort(Node<Integer> head )
    {
        if(head == null || head.next == null){
            return head;
        }

        int n = getListLength(head);

        for(int i=0; i<n-1; i++){
            Node<Integer> current = head,
                          prev = null,
                          next = null;

            for(int j=0; j<n-i-1; j++){
                if(current.data > current.next.data && current == head){
                    next = current.next;
                    current.next = next.next;
                    next.next = current;
                    head = next;
                    prev = next;
                }
                else if(current.data > current.next.data){
                    next = current.next;
                    prev.next = next;
                    current.next = next.next;
                    next.next = current;
                    prev = next;
                }
                else {
                    prev = current;
                    current = current.next;
                }
            }
        }
        return head;
    }

    public static void main(String [] args){
        Node<Integer> root = null;

        root = LinkedListUsage.createList();
        root = bubbleSort(root);
        LinkedListUsage.print(root);
    }
}
