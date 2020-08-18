package CodingNinja.LinkedList;

public class SwapEveryPairGetterSetter {
    /**
     * Swap every pair
     * Send Feedback
     * Given a Linked list, swap every pair of nodes to form a new linked list. That is, swap first two nodes,
     * then 2nd two nodes and so on. If the size of linked list is odd, then leave the last node as it is.
     * You should not create new memory, instead change the references of already created nodes. And swap the
     * entire node, not just their data.
     * Return the head of updated linked list.
     * -1 is the terminating number. That is, it just defines that your linked list has no more elements and it
     * is not the part of LL.
     * Input format :
     * Linked list elements (separated by space and terminated by -1)`
     * Sample Input 1 :
     * 1 2 3 4 5 6 -1
     * Sample Output 1 :
     * 2 1 4 3 6 5
     * Sample Input 2 :
     * 1 2 3 -1
     * Sample Output 2 :
     * 2 1 3
     */

    public static Node<Integer> swapEveryPair(Node<Integer> head) {
        if(head == null || head.next == null){
            return head;
        }
        Node<Integer> ptr = head;

        while(ptr != null && ptr.next != null){
            int temp = ptr.getData();
            ptr.setData(ptr.next.getData());
            ptr.next.setData(temp);
            ptr = ptr.next.next;
        }
        return head;
    }

    public static void main(String [] args){
        Node<Integer> root = null;

        root = LinkedListUsage.createList();
        root = swapEveryPair(root);
        LinkedListUsage.print(root);
    }
}
