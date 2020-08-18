package CodingNinja.StackAndQueue;

/**
 * Code : Queue Using LL
 * Send Feedback
 * You need to implement a Queue class using linked list.
 * All the required data members should be private.
 * Implement the following public functions :
 * 1. Constructor -
 * Initialises the data members.
 * 2. enqueue :
 * This function should take one argument of type T and has return type void. This function should insert an element in the queue. Time complexity should be O(1).
 * 3. dequeue :
 * This function takes no input arguments and has return type T. This should removes the first element which is entered and return that element as an answer. Time complexity should be O(1).
 * 4. front :
 * This function takes no input arguments and has return type T. This should return the first element which is entered and return that element as an answer. Time complexity should be O(1).
 * 5. size :
 * Return the size of stack i.e. count of elements which are present ins stack right now. Time complexity should be O(1).
 * 6. isEmpty :
 * Checks if the queue is empty or not. Return true or false.
 */

public class Queue <T> {

    private Node<T> front;
    private Node<T> rear;
    private int size;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if(front == null){
            front = newNode;
            rear = newNode;
            size++;
            return;
        }
        rear.next = newNode;
        rear = rear.next;
        size++;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T dequeue() throws QueueEmptyException {
        if(size == 0){
            throw new QueueEmptyException();
        }
        if(front == rear){
            Node<T> temp = front;
            size = 0;
            front = null;
            rear = null;
            return temp.data;
        }
        Node<T> temp = front;
        size--;
        front = front.next;
        return temp.data;
    }

    public T front() throws QueueEmptyException {
        if(size == 0){
            throw new QueueEmptyException();
        }
        return front.data;
    }
}
