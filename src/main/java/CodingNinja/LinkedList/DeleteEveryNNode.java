package CodingNinja.LinkedList;

public class DeleteEveryNNode {
    /**
     * Delete every N nodes
     * Send Feedback
     * Given a linked list and two integers M and N. Traverse the linked list such that you
     * retain M nodes then delete next N nodes, continue the same until end of the linked list.
     * That is, in the given linked list you need to delete N nodes after every M nodes.
     * Input format :
     *
     * Line 1 : Linked list elements (separated by space and terminated by -1)
     *
     * Line 2 : M
     *
     * Line 3 : N
     *
     * Sample Input 1 :
     * 1 2 3 4 5 6 7 8 -1
     * 2
     * 2
     * Sample Output 1 :
     * 1 2 5 6
     * Sample Input 2 :
     * 1 2 3 4 5 6 7 8 -1
     * 2
     * 3
     * Sample Output 2 :
     * 1 2 6 7
     */

    private static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
        if(head == null){
            return head;
        }

        if(M == 0){
            return null;
        }

        if(N == 0){
            return head;
        }

        Node<Integer> temp1 = head,
                      temp2 = head;

        int i = 1;
        int j = 1;

        while(temp1 != null && temp2 != null){

            for( ; i < M && temp1 != null; i++){
                temp1 = temp1.next;
            }

            if(temp1 != null){
                temp2 = temp1.next;
            }
            else {
                temp2 = null;
            }

            for( ; j < N && temp2 != null; j++){
                temp2 = temp2.next;
            }

            if(temp2 != null){
                temp2 = temp2.next;
            }

            if(temp1 != null){
                temp1.next = temp2;
                temp1 = temp1.next;
                i = 1;
                j = 1;
            }
        }

        return head;
    }

    public static void main(String [] args){
        Node<Integer> root = null;

        root = LinkedListUsage.createList();

        int m = 2;
        int n = 3;

        root = skipMdeleteN(root, m, n);
        LinkedListUsage.print(root);
    }

}
