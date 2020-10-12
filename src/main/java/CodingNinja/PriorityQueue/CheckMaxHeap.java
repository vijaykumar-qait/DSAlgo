package CodingNinja.PriorityQueue;

public class CheckMaxHeap {
    /**
     * Check Max-Heap
     * Send Feedback
     * Given an array of integers, check whether it represents max-heap or not.
     * Return true or false.
     * Input Format :
     * Line 1 : An integer N i.e. size of the array
     * Line 2 : N integers which are elements of the array, separated by spaces
     * Output Format :
     * true if it represents max-heap and false if it is not a max-heap
     * Constraints :
     * 1 <= N <= 10^5
     * 1 <= Ai <= 10^5
     */

    public static boolean checkMaxHeap(int arr[]) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        for (int i = 0; i <= (arr.length - 2) / 2; i++) {
            if (arr[i] < arr[2*i + 1] || (2*i + 2 != arr.length && arr[i] < arr[2*i + 2])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String [] args){
        //int arr[] = {1, 2, 3, 4, 5, 6};
        int arr[] = {9, 2, 5, 1, 0};
        System.out.println(checkMaxHeap(arr));
    }
}
