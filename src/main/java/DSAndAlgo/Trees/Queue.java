package DSAndAlgo.Trees;

public class Queue {
    private int arr[];
    private int front;
    private int rear;
    private int capacity;
    private int count;

    //Constructor
    Queue(int size){
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    //size
    public int size(){
        return count;
    }

    //to check if queue is empty
    public Boolean isEmpty(){
        return (size() == 0);
    }

    //check if queue is full
    public Boolean isFull(){
        return (size()==capacity);
    }

    //utility function to remove front element from queue
    public  void dequeue(){
        //check for underflow
        if(isEmpty()){
            System.out.println("Under flow condition");
            return;
        }
        System.out.println("Removing: " + arr[front]);
        front = (front+1)%capacity;
        count--;
    }

    //utility to add element in the queue
    public void enqueue(int item){
        //check if queue is full
        if(isFull()){
            System.out.println("Overflow");
            return;
        }
        rear = (rear+1)%capacity;
        arr[rear] = item;
        count++;
    }

    //utility fucntion to return front element
    public int peek(){
        if(isEmpty()){
            System.out.println("Under flow condition");
            System.exit(1);
        }
        return arr[front];
    }

    public static void main(String args[]){

    }
}
