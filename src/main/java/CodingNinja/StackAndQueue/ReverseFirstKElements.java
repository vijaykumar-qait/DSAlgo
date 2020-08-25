package CodingNinja.StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElements {
    /**
     * Reverse first K elements
     * Send Feedback
     * Given a queue and an integer k, reverse first k elements. Return the updated queue.
     * Do the problem in O(n) complexity.
     * Input Format :
     * Line 1 : Integer N, Size of Queue
     * Line 2 : Queue Elements (separated by space)
     * Line 3 : Integer k
     * Output Format:
     * Updated Queue elements
     * Contraints :
     * 1<= N <=10000
     * Sample Input 1:
     * 5
     * 1 2 3 4 5
     * 3
     * Sample Output 1:
     * 3 2 1 4 5
     * Sample Input 2:
     * 7
     * 3 4 2 5 6 7 8
     * 7
     * Sample Output 2:
     * 8 7 6 5 2 4 3
     */

    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k){
       if(k==0 || k > input.size()){
           return input;
       }
       int n = input.size();
       Stack<Integer> stack = new Stack<>();
        for(int i= 0; i<k; i++){
            stack.push(input.remove());
        }

        System.out.println(input.toString());

        while(stack.size()>0){
            input.add(stack.pop());
        }

        System.out.println(input.toString());

        for(int i=0; i<n-k; i++){
            input.add(input.remove());
        }
        return input;
    }

    public static void main(String [] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        int k = 3;

        System.out.println(reverseKElements(queue, k).toString());

    }
}
