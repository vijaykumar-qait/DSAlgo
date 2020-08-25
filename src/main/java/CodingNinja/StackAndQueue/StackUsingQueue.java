package CodingNinja.StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue <T> {
    /**
     * Stack Using 2 queues
     * Send Feedback
     * You need to implement a Stack class using two queues as its data members.
     * Only 2 data members should be there inside the class - two queues, which should be created dynamically and
     * both should be public. Use the inbuilt queue.
     * Implement the following public functions :
     * 1. Constructor -
     * Initialises both the data members.
     * 2. push :
     * This function should take one argument of type T and has return type void. This function should insert an
     * element in the stack. Time complexity should be O(1).
     * 3. pop :
     * This function takes no input arguments and has return type T. This should removes the last element which
     * is entered and return that element as an answer.
     * 4. top :
     * This function takes no input arguments and has return type T. This should return the last element
     * which is entered and return that element as an answer.
     * 5. getSize :
     * Return the size of stack i.e. count of elements which are present ins stack right now. Time complexity
     * should be O(1).
     */

    Queue<T> queue1;
    Queue<T> queue2;
    private int size;

    public StackUsingQueue(){
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
        size = 0;
    }

    void push(T data){
        size++;
        queue1.add(data);
    }

    T top() {
        if(size==0){
            return null;
        }
        T data = pop();
        push(data);
        return data;
    }

    int getSize(){
        return size;
    }

    T pop(){
        if(size == 0){
            return null;
        }
        for(int i=0; i<size-1; i++){
            queue2.add(queue1.remove());
        }
        Queue<T> queue3 = queue1;
        queue1 =queue2;
        queue2 = queue3;
        size--;
        return queue2.remove();
    }

    public static void main(String args []){
        StackUsingQueue<Integer> stack = new StackUsingQueue<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.getSize());
        System.out.println(stack.top());
        System.out.println(stack.getSize());
        System.out.println(stack.pop());
        System.out.println(stack.getSize());
        System.out.println(stack.top());
        stack.push(5);
        System.out.println(stack.getSize());
        System.out.println(stack.top());



    }

}
