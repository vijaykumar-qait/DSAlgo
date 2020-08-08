package CodingNinja.LinkedList;

import java.util.HashMap;

public class UnionOfLinkedList {
    /**
     * Union of LL
     * Send Feedback
     * Given a two Linked Lists, find out union of both given input lists and return the new Linked List.
     * Order of elements are not important.
     * Note : You don't need to print the linked list, just return the head. It will be printed internally.
     * Input format :
     *
     * Line 1 : Linked list 1 elements (separated by space and terminated by -1)
     *
     * Line 2 : Linked list 2 elements (separated by space and terminated by -1)
     *
     * Sample Input 1 :
     * 1 2 3 4 -1
     * 8 7 5 3 -1
     * Sample Output 1 :
     * 1
     * 2
     * 3
     * 4
     * 8
     * 7
     * 5
     * Sample Input 2 :
     * 1 2 1 1 -1
     * 8 -1
     * Sample Output 2 :
     * 1
     * 2
     * 1
     * 1
     * 8
     */

    public static Node<Integer> Union(Node<Integer> head1, Node<Integer> head2) {
        // Write your code here
        if(head1 == null && head2 == null){
            return head1;
        }

        if(head1 == null && head2 != null){
            return head2;
        }

        if(head2 == null && head1 != null){
            return head1;
        }

        Node<Integer> ptr = head1;
        HashMap<Integer, Integer> map = new HashMap();

        while(ptr.next != null){
            map.put(ptr.data, map.getOrDefault(ptr.data, 0)+1);
            ptr = ptr.next;
        }

        map.put(ptr.data, map.getOrDefault(ptr.data, 0)+1);

        Node<Integer> ptr2 = head2;

        while(ptr2 != null){
            if(map.containsKey(ptr2.data) && map.get(ptr2.data)>0){
                map.put(ptr2.data, map.get(ptr2.data)-1);
                ptr2 = ptr2.next;
            }else {
                ptr.next = ptr2;
                ptr2 = ptr2.next;
                ptr = ptr.next;
            }
        }
        ptr.next = null;
        return head1;
    }

    public static void main(String [] args){
        Node<Integer> head = null;
        head = PalindromeLinkedList.createList();
        PalindromeLinkedList.print(head);

        Node<Integer> head2 = null;
        head2 = PalindromeLinkedList.createList();
        PalindromeLinkedList.print(head2);

        Node<Integer> head3 = Union(head, head2);
        PalindromeLinkedList.print(head3);

    }
}
