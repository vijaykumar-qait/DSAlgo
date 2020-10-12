package CodingNinja.PriorityQueue;

import java.util.ArrayList;

/**
 * Code : Max Priority Queue
 * Send Feedback
 * Implement the class for Max Priority Queue which includes following functions -
 * 1. getSize -
 * Return the size of priority queue i.e. number of elements present in the priority queue.
 * 2. isEmpty -
 * Check if priority queue is empty or not. Return true or false accordingly.
 * 3. insert -
 * Given an element, insert that element in the priority queue at the correct position.
 * 4. getMax -
 * Return the maximum element present in the priority queue without deleting. Return -Infinity if priority queue is empty.
 * 5. removeMax -
 * Delete and return the maximum element present in the priority queue. Return -Infinity if priority queue is empty.
 * Note : main function is given for your reference which we are using internally to test the class.
 */

public class MaxPriorityQueue {
    private ArrayList<Integer> heap;

    public MaxPriorityQueue(){
        heap = new ArrayList<>();
    }

    int getSize(){
        return heap.size();
    }

    boolean isEmpty(){
        return heap.size() == 0;
    }

    int getMax() /*throws HeapEmptyException*/{
//        if(isEmpty()){
//            throw  new HeapEmptyException();
//        }
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        return heap.get(0);
    }

    void insert(int element){
        heap.add(element);
        //now to ensure heapify property
        int childreIndex = heap.size()-1;
        int parentIndex = (childreIndex-1)/2;
        while ((childreIndex>0)){
            if(heap.get(childreIndex)>heap.get(parentIndex)){
                //swap the variable at index
                int temp = heap.get(childreIndex);
                heap.set(childreIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childreIndex = parentIndex;
                parentIndex = (childreIndex-1)/2;
            }
            else {
                return;
            }
        }
    }

    int removeMax() throws HeapEmptyException {
        if(isEmpty()){
            throw  new HeapEmptyException();
        }
        int temp = heap.get(0);
        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        //now to ensure downward heapify property
        int index = 0;
        int maxIndex = index;
        int leftChildIndex = 1;
        int rightChildIndex = 2;

        while (leftChildIndex < heap.size()){
            if(heap.get(leftChildIndex)>heap.get(maxIndex)){
                maxIndex = leftChildIndex;
            }

            if(rightChildIndex < heap.size() && heap.get(rightChildIndex)>heap.get(maxIndex)){
                maxIndex = rightChildIndex;
            }

            if(maxIndex == index){
                break;
            }
            else {
                //do swapping
                int temp1 = heap.get(index);
                heap.set(index, heap.get(maxIndex));
                heap.set(maxIndex, temp1);

                index = maxIndex;
                leftChildIndex = 2*index + 1;
                rightChildIndex = 2*index + 2;
            }
        }
        return temp;
    }

    @Override
    public String toString() {
        return heap.toString();
    }
}
