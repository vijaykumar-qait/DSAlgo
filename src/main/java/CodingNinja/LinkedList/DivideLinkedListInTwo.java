package CodingNinja.LinkedList;

public class DivideLinkedListInTwo {
    /**
     * Divide linked list in two
     * Send Feedback
     * Write a function that takes one list and divides up its nodes to create two smaller lists A and B. The sub lists should be made from alternating elements in the original list.
     * Nodes should be in the reverse order of which they occurred in the source list.
     * Print both linked lists in different lines.
     * Input format :
     * Line 1 : Linked list elements of length n (separated by space and terminated by -1)
     * Output format :
     * Line 1 : Output Linked List 1 elements (separated by space)
     * Line 2 : Output Linked List 2 elements (separated by space)
     * Constraints :
     * 1 <= n <= 10^4
     * Sample Input :
     *  8 2 5 9 1 4 3 7 -1
     * Note : -1 at the end of input is just a terminator representing the end of linked list. This -1 is not part of the linked list. Size of given linked list is 8.
     * Sample Output :
     *  3 1 5 8
     *  7 4 9 2
     */

    public static void print(Node<Integer> root){
        if(root==null){
            System.out.println("Linked list is empty");
            return;
        }

        Node<Integer> temp = root;

        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private static Node<Integer> reverse(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> nextPtr = head, ptr = head, prevPtr = null;

        while(nextPtr != null){
            nextPtr = nextPtr.next;
            ptr.next = prevPtr;
            prevPtr = ptr;
            ptr = nextPtr;
        }

        head  = prevPtr;
        return head;
    }

    public static void make2List(Node<Integer> head) {
        // Write your code here
        if(head == null){
            return;
        }

        if(head.next == null){
            System.out.println(head.data);
            return;
        }

        head = reverse(head);

        Node<Integer> ptr = head,
                head1 = head,
                temp1 = ptr,
                head2 = head.next,
                temp2 = head.next,
                ptr2 = head.next;

        while((ptr!=null && ptr.next != null) && (ptr2 != null && ptr2.next!= null)){
            ptr = ptr.next.next;
            ptr2 = ptr2.next.next;

            temp1.next = ptr;
            temp1 = temp1.next;
            temp2.next = ptr2;
            temp2 = temp2.next;
        }

        if(temp1.next != null){
            temp1.next = null;
        }

        print(head1);
        print(head2);
    }

    public static void main(String [] args){
        Node<Integer> root = null;

        root = LinkedListUsage.createList();
        //LinkedListUsage.print(root);

        make2List(root);
    }
}
