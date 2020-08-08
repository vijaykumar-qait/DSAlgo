package CodingNinja.LinkedList;

public class MiddleOfLinkedList {
    /**
     * Finding middle element in a linked list
     * Given a singly linked list of N nodes. The task is to find the middle of the linked list. For example, if given linked list is 1->2->3->4->5 then the output should be 3.
     * If there are even nodes, then there would be two middle nodes, we need to print the second middle element. For example, if given linked list is 1->2->3->4->5->6 then the output should be 4.
     *
     * Input:
     * The first line of input contains the number of test cases T. For each test case, the first line of input contains the length of the linked list and the next line contains data of nodes of the linked list.
     *
     * Output:
     * For each test case, there will be a single line of output containing data of the middle element of the linked list.
     *
     * User Task:
     * The task is to complete the function getMiddle() which takes a head reference as the only argument and should return the data at the middle node of the linked list.
     *
     * Expected Time Complexity: O(N).
     * Expected Auxiliary Space: O(1).
     *
     * Constraints:
     * 1 <= T <= 500
     * 1 <= N <= 5000
     *
     * Example:
     * Input:
     * 2
     * 5
     * 1 2 3 4 5
     * 6
     * 2 4 6 7 5 1
     *
     * Output:
     * 3
     * 7
     *
     * Explanation:
     * Testcase 1: Since there are 5 elements, therefore 3 is the middle element at index 2 (0-based indexing).
     */

    public static int getMiddle(Node head) {
        if(head == null){
            return -1;
        }

        if(head.next == null){
            return (Integer)head.data;
        }

        Node ptr = head;
        Node fastPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            ptr = ptr.next;
        }
        return (Integer)ptr.data;
    }

    public static void main(String [] args){
        Node<Integer> root = null;

        root = LinkedListUsage.createList();
        LinkedListUsage.print(root);

        System.out.println(getMiddle(root));
    }
}
