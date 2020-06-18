package DSAndAlgo;

public class MaxStack {

    class Node {
        int data;
        Node next;
        Node oldMax;
    }

    Node stack;
    Node max;

    void push(int data) {
        Node temp = new Node();
        temp.data = data;
        if(stack == null) {
            stack = temp;
            max = temp;
            return;
        }

        temp.next = stack;
        stack = temp;

        if(max.data < temp.data) {
            temp.oldMax = max;
            max = temp;
        }
    }

    void pop() {
        if(stack == null) {
            System.out.println("Stack is empty. Nothing to pop");
            return;
        }

        Node temp = stack;

        stack = temp.next;

        if(temp.oldMax != null) {
            max = temp.oldMax;
        }
    }

    int maxStack() {
        return max.data;
    }

    public static void main(String [] args) {

        MaxStack obj = new MaxStack();
        obj.push(1);
        obj.push(2);
        System.out.println(obj.maxStack());
        obj.pop();
        System.out.println(obj.maxStack());
        obj.pop();
        obj.push(3);
        obj.pop();
        System.out.println(obj.maxStack());

        // Need to handle case when all node are poped and max value is displayed

    }
}
