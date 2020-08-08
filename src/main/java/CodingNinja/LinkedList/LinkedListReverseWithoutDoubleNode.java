package CodingNinja.LinkedList;

public class LinkedListReverseWithoutDoubleNode {
    /**
     * Reverse LL (Recursive)
     * Send Feedback
     * Given a linked list, reverse it using recursion.
     * You don't need to print the elements, just reverse the LL duplicates and return the head of updated LL.
     * Input format : Linked list elements (separated by space and terminated by -1)`
     *
     * Sample Input 1 :
     * 1 2 3 4 5 -1
     * Sample Output 1 :
     * 5 4 3 2 1
     */

    //time complexity is O(n)

    public static Node<Integer> reverse_R(Node<Integer> head) {
        if(head == null || head.next == null){
            return head;
        }

        Node <Integer> nextPtr = head.next;
        Node<Integer> finalList = reverse_R(head.next);
        nextPtr.next = head;
        head.next = null;
        return finalList;
    }

    public static void main(String [] args){
        Node<Integer> root = LinkedListUsage.createList();
        root = reverse_R(root);
        LinkedListUsage.print(root);

    }
}
