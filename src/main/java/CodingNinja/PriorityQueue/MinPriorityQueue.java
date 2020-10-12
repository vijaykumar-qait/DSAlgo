package CodingNinja.PriorityQueue;

import java.util.ArrayList;

public class MinPriorityQueue {
    private ArrayList<Integer> heap;

    public MinPriorityQueue(){
        this.heap = new ArrayList<>();
    }

    boolean isEmpty(){
        return heap.size() == 0;
    }

    int size(){
        return heap.size();
    }

    int getMin() throws HeapEmptyException {
        if(isEmpty()) throw new HeapEmptyException();

        return heap.get(0);
    }

    void insert(int element){
        heap.add(element);

        //to ensure heap property we will heapify in upwared dir

        int childrenIndex = heap.size()-1;
        int parentIndex = (childrenIndex-1)/2;

        while(childrenIndex>0){
            if(heap.get(childrenIndex) < heap.get(parentIndex)){
                int temp = heap.get(childrenIndex);
                heap.set(childrenIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);

                childrenIndex = parentIndex;
                parentIndex = (childrenIndex-1)/2;
            }
            else
            {
                return;
            }
        }
    }

    int remove() throws HeapEmptyException {
        if(isEmpty())
            throw new HeapEmptyException();

        int temp = heap.get(0);

        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        //now work on heapify -> downward heapify

        int index = 0;
        int minIndex = index;
        int leftChildIndex = 1;
        int rightChildIndex = 2;

        while(leftChildIndex < heap.size()){
            if(heap.get(leftChildIndex) < heap.get(minIndex)){
                minIndex = leftChildIndex;
            }
            //also to check if right child exist
            if(rightChildIndex<heap.size() && heap.get(rightChildIndex) < heap.get(minIndex)){
                minIndex = rightChildIndex;
            }

            if(minIndex == index){
                break;
            }
            else {
                int temp1 = heap.get(index);
                heap.set(index, heap.get(minIndex));
                heap.set(minIndex, temp1);
                index = minIndex;
                leftChildIndex = 2*index + 1;
                rightChildIndex = 2*index +2;
            }
        }
        return temp;
    }
}
