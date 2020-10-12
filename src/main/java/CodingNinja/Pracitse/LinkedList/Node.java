package CodingNinja.Pracitse.LinkedList;

// 1) data 2) address 2nd node

public class Node <T> {
    T data;
    Node next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }
}
