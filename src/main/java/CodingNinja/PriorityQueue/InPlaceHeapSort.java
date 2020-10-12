package CodingNinja.PriorityQueue;

public class InPlaceHeapSort {

    /**
     * Code : In-place heap sort
     * Send Feedback
     * Given an integer array of size n. Sort this array (in decreasing order) using heap sort.
     * Space complexity should be O(1).
     * Input Format :
     * Line 1 : Integer n, Array size
     * Line 2 : Array elements, separated by space
     * Output Format :
     * Array elements after sorting
     * Constraints :
     * 1 <= n <= 10^6
     * Sample Input:
     * 6
     * 2 6 8 5 4 3
     * Sample Output:
     * 8 6 5 4 3 2
     */


    public void sort(int input[])
    {
        int n = input.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(input, n, i);

        // One by one extract an element from heap
        for (int i=n-1; i>0; i--)
        {
            // Move current root to end
            int temp = input[0];
            input[0] = input[i];
            input[i] = temp;

            // call max heapify on the reduced heap
            heapify(input, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2*i + 1; // left = 2*i + 1
        int r = 2*i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] < arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] < arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        InPlaceHeapSort ob = new InPlaceHeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }
}
