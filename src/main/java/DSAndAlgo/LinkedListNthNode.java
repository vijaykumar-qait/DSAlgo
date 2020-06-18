package DSAndAlgo;

public class LinkedListNthNode {

    class Node {
        int data;
        Node next;

        public  Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    void addFrontOfLinkedList(int data){
        Node temp = new Node(data);

        if(head == null) {
            head = temp;
            return;
        }
        temp.next = head;
        head = temp;
    }

    void displayNode() {
        if(head == null) {
            System.out.println("List Empty");
            return;
        }

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public static void  main(String [] args) {
        LinkedListNthNode obj = new LinkedListNthNode();
        obj.displayNode();
        obj.addFrontOfLinkedList(1);
        obj.addFrontOfLinkedList(2);
        obj.addFrontOfLinkedList(3);
        obj.displayNode();

    }
 }
