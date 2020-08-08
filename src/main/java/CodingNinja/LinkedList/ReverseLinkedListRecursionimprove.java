package CodingNinja.LinkedList;

public class ReverseLinkedListRecursionimprove {
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

    public static DoubleNode reverse_R(Node<Integer> head) {
        if(head == null || head.next == null){
            DoubleNode ans = new DoubleNode();
            ans.head = head;
            ans.tail = head;
            return ans;
        }

        DoubleNode finalList = reverse_R(head.next);
        finalList.tail.next = head;
        head.next = null;

        DoubleNode ans = new DoubleNode();
        ans.head = finalList.head;
        ans.tail = head;

        return ans;
    }

    public static void main(String [] args){
        Node<Integer> root = LinkedListUsage.createList();
        DoubleNode ans = reverse_R(root);
        LinkedListUsage.print(ans.head);

    }
}
