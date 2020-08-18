package CodingNinja.LinkedList;

public class MoveToLast {
    /**
     * Move To Last
     * Send Feedback
     * Given a linked list and a key in it, the task is to move all occurrences of given key to end of linked list,
     * keeping order of all other elements same.
     * Return the updated head of LL.
     * Input Format :
     * Line 1 : Elements of the linked list ending with -1 (-1 not included)
     * Line 2 : Key n, Element which has to shifted
     * Output Format :
     * Updated linked list
     * Constraints :
     * 1 <= size of list <= 100
     * Sample Input 1:
     * 1 2 2 3 4 5 -1
     * 2
     * Sample Output 1:
     * 1 3 4 5 2 2
     * Sample Input 2:
     * 1 1 2 3 4 -1
     * 1
     * Sample Output 2:
     * 2 3 4 1 1
     */

    public static Node<Integer> func(Node<Integer> head,int n) {
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> lastPtr = head;

        while(lastPtr.next != null && lastPtr.next.next != null){
            lastPtr = lastPtr.next.next;
        }

        if(lastPtr.next != null){
            lastPtr = lastPtr.next;
        }

        Node<Integer> ptr = head,
                      endPtr = lastPtr,
                      prevPtr = null;

        while(ptr != endPtr){
            if(ptr.data == n){
                Node<Integer> temp = ptr;
                if(ptr == head){
                    head = ptr.next;
                }
                ptr = ptr.next;
                temp.next = lastPtr.next;
                lastPtr.next = temp;
                lastPtr = lastPtr.next;
                if(prevPtr != null){
                    prevPtr.next = ptr;
                }
            }
            else {
                prevPtr = ptr;
                ptr = ptr.next;
            }
        }
        return head;
    }

    public static void main(String [] args){
        Node<Integer> root = null;

        root = LinkedListUsage.createList();
        int n = 1;
        root = func(root, n);
        LinkedListUsage.print(root);
    }

}
