package CodingNinja.LinkedList;

import java.util.Scanner;

public class Dequeue {
    /**
     * Dequeue
     * Send Feedback
     * You need to implement a class for Dequeue i.e. for double ended queue. In this queue, elements can be inserted and deleted from both the ends.
     * You don't need to double the capacity.
     * You need to implement the following functions -
     * 1. constructor
     * You need to create the appropriate constructor. Size for the queue passed is 10.
     * 2. insertFront -
     * This function takes an element as input and insert the element at the front of queue. Insert the element only if queue is not full. And if queue is full, print -1 and return.
     * 3. insertRear -
     * This function takes an element as input and insert the element at the end of queue. Insert the element only if queue is not full. And if queue is full, print -1 and return.
     * 4. deleteFront -
     * This function removes an element from the front of queue. Print -1 if queue is empty.
     * 5. deleteRear -
     * This function removes an element from the end of queue. Print -1 if queue is empty.
     * 6. getFront -
     * Returns the element which is at front of the queue. Return -1 if queue is empty.
     * 7. getRear -
     * Returns the element which is at end of the queue. Return -1 if queue is empty.
     */
    private int arr[];
    private int front, rear, size;

    public Dequeue(int queueSize){
        arr = new int [queueSize];
        front = rear = -1;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isFull(){
        return size == arr.length;
    }

    public boolean isEmpty(){
        return front==-1;
    }

    public void insertFront(int data){
        if(isFull()){
            return;
        }
        if(isEmpty()){
            front = rear = 0;
        }
        else if(front == 0){
            front = arr.length-1;
        }
        else {
            front--;
        }
        arr[front] = data;
        size++;
    }

    public void insertRear(int data){
        if(isFull()){
            return;
        }
        if(isEmpty()){
            front = rear = 0;
        }
        else if(rear == arr.length-1){
            rear = 0;
        }
        else {
            rear++;
        }
        arr[rear] = data;
        size++;
    }

    public int deleteFront(){
        if(isEmpty()){
            System.out.println(-1);
            return -1;
        }
        int data = arr[front];
        if(size() == 1){
            front= rear = -1;
        }
        else if(front == arr.length-1){
            front = 0;
        }
        else {
            front++;
        }
        size--;
        return data;
    }

    public int deleteRear(){
        if(isEmpty()){
            System.out.println(-1);
            return -1;
        }
        int data = arr[rear];
        if(size() == 1){
            front = rear = -1;
        }
        else if(rear == 0){
            rear = arr.length-1;
        }
        else {
            rear--;
        }
        size--;
        return data;
    }

    public int getFront(){
        if(isEmpty())
            return -1;
        return arr[front];
    }

    public int getRear(){
        if(isEmpty())
            return -1;
        return arr[rear];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Dequeue dq = new Dequeue(10);

        while(true){
            int choice = s.nextInt(),input;
            switch (choice) {
                case 1:
                    input = s.nextInt();
                    dq.insertFront(input);
                    break;
                case 2:
                    input = s.nextInt();
                    dq.insertRear(input);
                    break;
                case 3:
                    dq.deleteFront();
                    break;
                case 4:
                    dq.deleteRear();
                    break;
                case 5:
                    System.out.println(dq.getFront());
                    break;
                case 6:
                    System.out.println(dq.getRear());
                    break;
                default:
                    return ;
            }
        }
    }

}
