package CodingNinja.Pracitse.LinkedList;

public class LinkeLlistUsage {
    //insert

    /**
     * 1. input data
     * 2.  insert at start
     */

    // 1->2->3->4->null        // null // data : 1 // head -> 1 -> null // input 2 == head -> 2 -> 1 -> null

    // main()

    //o(1)
    public static Node<Integer> insertAtStart(Node<Integer> head, Integer data){
        Node<Integer> temp = new Node<>(data);
//        if(head == null){
//            head = temp;
//            return head;
//        }
        temp.next = head;
        head = temp;
        return head;
    }


    /**
     *
      *1. insert at end
     * 2. insert at position
     * 3. delete from end
     * 4. delete from position
     * 5. delete data
     * 6. update data
     * 7. delete first occurence and last occurence of data
     * 8. print linked list reverse
     */


    //search
    // null // 1->2->3->4-> null
    //O(n)
    public static boolean search(Node<Integer> head, Integer data){
        if(head == null){
            return false;
        }

        Node<Integer> ptr = head;

        while(ptr != null){
            if(ptr.data == data){
                return true;
            }
            ptr = ptr.next;
        }
        return false;
    }


    //delete front

    //1->2->3->4->null
    public static Node<Integer> deleteAtFront(Node<Integer> head){
        if(head == null){
            return null;
        }
        head = head.next;
        return head;
    }

    //update

    //print
    public static void print(Node<Integer> head){
        if(head == null){
            return;
        }

        Node<Integer> ptr = head;

        while(ptr != null){
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.println();
    }

    static public void main(String [] args){
        Node<Integer> head = null;
        head = insertAtStart(head, 1);
        head = insertAtStart(head, 2);
        head = insertAtStart(head, 3);
        head = insertAtStart(head, null);
        head = insertAtStart(head, 5);

        // output - 5->4->3->2->1

        print(head);
        head = deleteAtFront(head);
        print(head);

        System.out.println(search(head, null));


    }
}
