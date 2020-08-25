package CodingNinja.StackAndQueue;

import java.util.Stack;

public class SortAStack {
    /**
     * Sort a Stack
     * Send Feedback
     * Given a stack, sort the elements inside that stack in ascending order using only push and pop operation. You can use one additional stack only.
     * For eg.
     *
     * Input Stack :  5 (top)
     *                4
     *                3
     *                2
     *                1
     * Output Stack : 1 (top)
     *                2
     *                3
     *                4
     *                5
     * Input format :
     *
     * Line 1 : No. of elements in stack
     *
     * Line 2 : Stack elements (separated by space)
     *
     * Sample Input
     * 5
     * 1 2 3 4 5
     * Sample Output
     * 1 2 3 4 5
     */

    private static Stack<Integer> helperSortStack(Stack<Integer> stack){
        if(stack.size() == 0 || stack.size() == 1){
            return stack;
        }
        int top = stack.pop();
        stack = helperSortStack(stack);
        Stack<Integer> tempStack = new Stack<>();
        while(true){
            if(stack.size()>0 && top > stack.peek()){
                tempStack.push(stack.pop());
            }
            else {
                stack.push(top);
                while(tempStack.size()>0){
                    stack.push(tempStack.pop());
                }
                break;
            }
        }
        return stack;
    }

    private static Stack<Integer> iterativeSortStack(Stack<Integer> stack){
        if(stack.size() == 0 || stack.size() == 1){
            return stack;
        }
        Stack<Integer> tempStack = new Stack<>();
        while(stack.size()>0){
            int temp = stack.pop();
            while(tempStack.size()>0 && temp > tempStack.peek()){
                stack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        return tempStack;
    }

    public static void sortStack(Stack<Integer> stack){
        stack = iterativeSortStack(stack);
        while(stack.size()>0){
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String [] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        sortStack(stack);
    }
}
