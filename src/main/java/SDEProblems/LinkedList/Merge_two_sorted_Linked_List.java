package SDEProblems.LinkedList;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Merge_two_sorted_Linked_List {
    /**
     * Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.
     *
     * Example:
     *
     * Input: 1->2->4, 1->3->4
     * Output: 1->1->2->3->4->4
     */

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return l1;
        }
        if(l1!=null && l2==null){
            return l1;
        }
        if(l2!=null && l1 == null){
            return l2;
        }

        ListNode ptr1 = l1,
                 ptr2 = l2,
                 head3 = null,
                 tail3 = null;

        if(ptr1.val <= ptr2.val){
            head3 = l1;
            tail3 = l1;
            ptr1 = ptr1.next;
        }
        else {
            head3 = l2;
            tail3 = l2;
            ptr2 = ptr2.next;
        }

        while(ptr1 != null && ptr2 !=null){
            if(ptr1.val <= ptr2.val){
                tail3.next = ptr1;
                ptr1 = ptr1.next;
                tail3 = tail3.next;
            }
            else{
                tail3.next = ptr2;
                ptr2 = ptr2.next;
                tail3 = tail3.next;
            }
        }
        if(ptr1 == null) {
          tail3.next = ptr2;
        }
        else {
            tail3.next = ptr1;
        }
        return head3;
    }

    public static void main(String [] args){

    }
}
