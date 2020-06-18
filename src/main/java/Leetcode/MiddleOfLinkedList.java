package Leetcode;

public class MiddleOfLinkedList {

    ListNode head;

    ListNode Insert(ListNode head, int data){
        ListNode temp = new ListNode(data);
        if(head == null){
            head = temp;
            return head;
        }
        ListNode ptr = head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next = temp;
        return head;
    }

    ListNode addDataToList(ListNode head, int arr[]){
        for(int i=0; i<arr.length; i++){
            head = Insert(head, arr[i]);
        }
        return  head;
    }

    void displayList(ListNode head){
        ListNode ptr = head;
        while(ptr!=null){
            System.out.print(ptr.val + " > ");
            ptr = ptr.next;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while(fastPtr != null && fastPtr.next!=null){
            slowPtr  = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public static void main(String [] args){
        int arr[] = {1,2,3,4,5,6};
        MiddleOfLinkedList list = new MiddleOfLinkedList();

        list.head = list.addDataToList(list.head, arr);
        list.displayList(list.head);
        System.out.println("middle: " + list.middleNode(list.head).val);
    }
}
