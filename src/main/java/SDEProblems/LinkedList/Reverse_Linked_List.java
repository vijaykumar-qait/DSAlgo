package SDEProblems.LinkedList;

import CodingNinja.LinkedList.LinkedListUsage;
import CodingNinja.LinkedList.Node;

public class Reverse_Linked_List {
    /**
     * 206. Reverse Linked List
     * Easy
     *
     * 4832
     *
     * 92
     *
     * Add to List
     *
     * Share
     * Reverse a singly linked list.
     *
     * Example:
     *
     * Input: 1->2->3->4->5->NULL
     * Output: 5->4->3->2->1->NULL
     * Follow up:
     *
     * A linked list can be reversed either iteratively or recursively. Could you implement both?
     */

    public Node reverseList(Node head) {
        if(head == null || head.next == null){
            return head;
        }

        Node nextPtr = head.next;
        Node finalhead = reverseList(head.next);
        nextPtr.next = head;
        return finalhead;
    }

    public static void main(String [] args){
        Node<Integer> root = null;

        root = LinkedListUsage.createList();
    }
}
