package CodingNinja.LinkedList;

class DoubleNodenew<T>{
    Node<T> head;
    Node<T> tail;
}

public class KReverse {
    /**
     * kReverse
     * Send Feedback
     * Implement kReverse( int k ) in a linked list i.e. you need to reverse first K elements then reverse next k elements and join the linked list and so on.
     * Indexing starts from 0. If less than k elements left in the last, you need to reverse them as well. If k is greater than length of LL, reverse the complete LL.
     * You don't need to print the elements, just return the head of updated LL.
     * Input format :
     *
     * Line 1 : Linked list elements (separated by space and terminated by -1)
     *
     * Line 2 : k
     *
     * Sample Input 1 :
     * 1 2 3 4 5 6 7 8 9 10 -1
     * 4
     * Sample Output 1 :
     * 4 3 2 1 8 7 6 5 10 9
     * Sample Input 2 :
     * 1 2 3 4 5 -1
     * 2
     * Sample Output 2 :
     * 2 1 4 3 5
     * Sample Input 3 :
     * 1 2 3 4 5 6 7 -1
     * 3
     * Sample Output 3 :
     * 3 2 1 6 5 4 7
     */

    private static DoubleNodenew revere(Node<Integer> head){
        if(head == null){
            DoubleNodenew<Integer> ptr = new DoubleNodenew<>();
            ptr.head = head;
            ptr.tail = head;
            return ptr;
        }

        DoubleNodenew<Integer> node = new DoubleNodenew<>();
        Node<Integer> nextPtr = head,
                      ptr = head,
                      prevPtr = null;

        node.tail = head;

        while(nextPtr != null){
            nextPtr = nextPtr.next;
            ptr.next = prevPtr;
            prevPtr = ptr;
            ptr = nextPtr;
        }

        head = prevPtr;
        node.head = prevPtr;
        return node;
    }

    public static Node<Integer> kReverse(Node<Integer> head, int k) {
        if(head == null){
            return head;
        }

        int count = 1;
        Node<Integer> head1 = head,
                      tail1 = head;
        for(int i=count; i<k && tail1.next!= null; i++){
            tail1 = tail1.next;
        }

        Node<Integer> head2 = tail1.next;
        tail1.next = null;

        DoubleNodenew<Integer> ptr = revere(head1);

        head1 = ptr.head;
        tail1 = ptr.tail;

        Node<Integer> finalHead = kReverse(head2, k);

        tail1.next = finalHead;
        return head1;
    }

    public static void main(String [] args){
        Node<Integer> root = null;

        root = LinkedListUsage.createList();
        int k = 2;
        root = kReverse(root, k);
        LinkedListUsage.print(root);
    }
}
