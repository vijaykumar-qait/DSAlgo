package CodingNinja.PriorityQueue;

import java.lang.reflect.Array;
import java.util.ArrayList;

class MinHeapNode
{
    int element; // The element to be stored

    // index of the array from
    // which the element is taken
    int i;

    // index of the next element
    // to be picked from array
    int j;

    public MinHeapNode(int element, int i, int j)
    {
        this.element = element;
        this.i = i;
        this.j = j;
    }
};

/*class MinHeap
{
    MinHeapNode[] harr; // Array of elements in heap
    int heap_size; // Current number of elements in min heap

    // Constructor: Builds a heap from
    // a given array a[] of given size
    public MinHeap(MinHeapNode a[], int size)
    {
        heap_size = size;
        harr = a;
        int i = (heap_size - 1)/2;
        while (i >= 0)
        {
            MinHeapify(i);
            i--;
        }
    }

    // A recursive method to heapify a subtree
    // with the root at given index This method
    // assumes that the subtrees are already heapified
    void MinHeapify(int i)
    {
        int l = left(i);
        int r = right(i);
        int smallest = i;
        if (l < heap_size && harr[l].element < harr[i].element)
            smallest = l;
        if (r < heap_size && harr[r].element < harr[smallest].element)
            smallest = r;
        if (smallest != i)
        {
            swap(harr, i, smallest);
            MinHeapify(smallest);
        }
    }

    // to get index of left child of node at index i
    int left(int i) { return (2*i + 1); }

    // to get index of right child of node at index i
    int right(int i) { return (2*i + 2); }

    // to get the root
    MinHeapNode getMin()
    {
        if(heap_size <= 0)
        {
            System.out.println("Heap underflow");
            return null;
        }
        return harr[0];
    }

    // to replace root with new node
    // "root" and heapify() new root
    void replaceMin(MinHeapNode root) {
        harr[0] = root;
        MinHeapify(0);
    }

    // A utility function to swap two min heap nodes
    void swap(MinHeapNode[] arr, int i, int j) {
        MinHeapNode temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // A utility function to print array elements
    static void printArray(int[] arr) {
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    // This function takes an array of
    // arrays as an argument and All
    // arrays are assumed to be sorted.
    // It merges them together and
    // prints the final sorted output.
    static void mergeKSortedArrays(int[][] arr, int k)
    {
        MinHeapNode[] hArr = new MinHeapNode[k];
        int resultSize = 0;
        for(int i = 0; i < arr.length; i++)
        {
            MinHeapNode node = new MinHeapNode(arr[i][0],i,1);
            hArr[i] = node;
            resultSize += arr[i].length;
        }

        // Create a min heap with k heap nodes. Every heap node
        // has first element of an array
        MinHeap mh = new MinHeap(hArr, k);

        int[] result = new int[resultSize];     // To store output array

        // Now one by one get the minimum element from min
        // heap and replace it with next element of its array
        for(int i = 0; i < resultSize; i++)
        {

            // Get the minimum element and store it in result
            MinHeapNode root = mh.getMin();
            result[i] = root.element;

            // Find the next element that will replace current
            // root of heap. The next element belongs to same
            // array as the current root.
            if(root.j < arr[root.i].length)
                root.element = arr[root.i][root.j++];
                // If root was the last element of its array
            else
                root.element = Integer.MAX_VALUE;

            // Replace root with next element of array
            mh.replaceMin(root);
        }

        printArray(result);

    }

    // Driver code
    public static void main(String args[]){
        int[][] arr= {{2, 6, 12, 34},
                {1, 9, 20, 1000},
                {23, 34, 90, 2000}};

        System.out.println("Merged array is :");

        mergeKSortedArrays(arr,arr.length);
    }
}*/

public class MergeKSortedArrays {
    /**
     * Merge K sorted arrays
     * Send Feedback
     * Given k different arrays, which are sorted individually (in ascending order).
     * You need to merge all the given arrays such that output array should be sorted (in ascending order).
     * Hint : Use Heaps.
     * Input Format :
     * Line 1 : Integer K
     * Line 2 : Arrays 1 size (n1)
     * Line 3 : Array 1 elements (separated by space)
     * Line 4 : Array 2 size (n2)
     * and so on for next arrays
     * Sample Input 1 :
     * 4
     * 3
     * 1 5 9
     * 2
     * 45 90
     * 5
     * 2 6 78 100 234
     * 1
     * 0
     * Sample Output 1 :
     * 0 1 2 5 6 9 45 78 90 100 234
     */

    MinHeapNode[] harr; // Array of elements in heap
    int heap_size; // Current number of elements in min heap

    // Constructor: Builds a heap from
    // a given array a[] of given size
    public MergeKSortedArrays(MinHeapNode a[], int size)
    {
        heap_size = size;
        harr = a;
        int i = (heap_size - 1)/2;
        while (i >= 0)
        {
            MinHeapify(i);
            i--;
        }
    }

    // A recursive method to heapify a subtree
    // with the root at given index This method
    // assumes that the subtrees are already heapified
    void MinHeapify(int i)
    {
        int l = left(i);
        int r = right(i);
        int smallest = i;
        if (l < heap_size && harr[l].element < harr[i].element)
            smallest = l;
        if (r < heap_size && harr[r].element < harr[smallest].element)
            smallest = r;
        if (smallest != i)
        {
            swap(harr, i, smallest);
            MinHeapify(smallest);
        }
    }

    // to get index of left child of node at index i
    int left(int i) { return (2*i + 1); }

    // to get index of right child of node at index i
    int right(int i) { return (2*i + 2); }

    // to get the root
    MinHeapNode getMin()
    {
        if(heap_size <= 0)
        {
            System.out.println("Heap underflow");
            return null;
        }
        return harr[0];
    }

    // to replace root with new node
    // "root" and heapify() new root
    void replaceMin(MinHeapNode root) {
        harr[0] = root;
        MinHeapify(0);
    }

    // A utility function to swap two min heap nodes
    void swap(MinHeapNode[] arr, int i, int j) {
        MinHeapNode temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // A utility function to print array elements
    static void printArray(int[] arr) {
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    // This function takes an array of
    // arrays as an argument and All
    // arrays are assumed to be sorted.
    // It merges them together and
    // prints the final sorted output.
    static void mergeKSortedArrays(int[][] arr, int k)
    {
        MinHeapNode[] hArr = new MinHeapNode[k];
        int resultSize = 0;
        for(int i = 0; i < arr.length; i++)
        {
            MinHeapNode node = new MinHeapNode(arr[i][0],i,1);
            hArr[i] = node;
            resultSize += arr[i].length;
        }

        // Create a min heap with k heap nodes. Every heap node
        // has first element of an array
        MergeKSortedArrays mh = new MergeKSortedArrays(hArr, k);

        int[] result = new int[resultSize];     // To store output array

        // Now one by one get the minimum element from min
        // heap and replace it with next element of its array
        for(int i = 0; i < resultSize; i++)
        {

            // Get the minimum element and store it in result
            MinHeapNode root = mh.getMin();
            result[i] = root.element;

            // Find the next element that will replace current
            // root of heap. The next element belongs to same
            // array as the current root.
            if(root.j < arr[root.i].length)
                root.element = arr[root.i][root.j++];
                // If root was the last element of its array
            else
                root.element = Integer.MAX_VALUE;

            // Replace root with next element of array
            mh.replaceMin(root);
        }

        printArray(result);

    }

    // Driver code
    public static void main(String args[]){
        Integer[][] arr= {{2, 6, 12, 34},
                {1, 9, 20, 1000},
                {23, 34, 90, 2000}};

        System.out.println("Merged array is :");

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(2);
        a1.add(6);
        a1.add(12);
        a1.add(34);

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(1);
        a2.add(9);
        a2.add(20);
        a2.add(1000);
        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(23);
        a3.add(34);
        a3.add(90);
        a3.add(2000);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        System.out.println(mergeKSortedArrays(list).toString());
        //mergeKSortedArrays(arr,arr.length);
    }

    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        MinHeapNode[] hArr = new MinHeapNode[input.size()];
        int resultSize = 0;
        for(int i = 0; i < input.size(); i++)
        {
            //MinHeapNode node = new MinHeapNode(arr[i][0],i,1);
            MinHeapNode node = new MinHeapNode(input.get(i).get(0),i,1);
            hArr[i] = node;
            resultSize += input.get(i).size();
        }

        // Create a min heap with k heap nodes. Every heap node
        // has first element of an array
        MergeKSortedArrays mh = new MergeKSortedArrays(hArr, input.size());

        int[] result = new int[resultSize];     // To store output array

        // Now one by one get the minimum element from min
        // heap and replace it with next element of its array
        for(int i = 0; i < resultSize; i++)
        {

            // Get the minimum element and store it in result
            MinHeapNode root = mh.getMin();
            result[i] = root.element;

            // Find the next element that will replace current
            // root of heap. The next element belongs to same
            // array as the current root.
            if(root.j < input.get(root.i).size())
                root.element = input.get(root.i).get(root.j++);
                // If root was the last element of its array
            else
                root.element = Integer.MAX_VALUE;

            // Replace root with next element of array
            mh.replaceMin(root);
        }

        printArray(result);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : result){
            list.add(i);
        }

        return list;
    }


}
