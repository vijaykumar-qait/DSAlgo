package CodingNinja.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Running median
 * Send Feedback
 * You are given a stream of N integers. For every i-th integer added to the running list of integers, print the resulting median.
 * Print only the integer part of the median.
 * Input Format :
 * The first line of input contains an integer N, denoting the number of integers in the stream.
 *
 * The second line of input contains 'N' integers separated by a single space.
 * Output Format :
 * Print the running median for every integer added to the running list on a new line.
 * Input Constraints
 * 1 <= N <= 10^5
 * 1 <= Ai <= 10^5
 *
 * Time Limit: 1sec
 * Sample Input 1 :
 * 6
 * 6 2 1 3 7 5
 * Sample Output 1 :
 * 6
 * 4
 * 2
 * 2
 * 3
 * 4
 * Explanation of Sample Output 1 :
 * S = {6}, median = 6
 * S = {6, 2} -> {2, 6}, median = 4
 * S = {6, 2, 1} -> {1, 2, 6}, median = 2
 * S = {6, 2, 1, 3} -> {1, 2, 3, 6}, median = 2
 * S = {6, 2, 1, 3, 7} -> {1, 2, 3, 6, 7}, median = 3
 * S = {6, 2, 1, 3, 7, 5} -> {1, 2, 3, 5, 6, 7}, median = 4
 * Sample Input 2 :
 * 5
 * 5 4 3 2 1
 * Sample Output 2 :
 * 5
 * 4
 * 4
 * 3
 * 3
 */
public class RunningMedium {
    public static void findMedian(int arr[])  {
        //Your code goes here
    }

    // method to calculate med of stream
    public static void printMedian(int[] arr)
    {

        int med = arr[0];

        // max heap to store the smaller half elements
        PriorityQueue<Integer> smaller = new PriorityQueue<>(Collections.reverseOrder());

        // min-heap to store the greater half elements
        PriorityQueue<Integer> greater = new PriorityQueue<>();

        smaller.add(arr[0]);
        System.out.println(med);

        // reading elements of stream one by one
        /* At any time we try to make heaps balanced and
            their sizes differ by at-most 1. If heaps are
            balanced,then we declare median as average of
            min_heap_right.top() and max_heap_left.top()
            If heaps are unbalanced,then median is defined
            as the top element of heap of larger size */
        for(int i = 1; i < arr.length; i++)
        {

            int x = arr[i];

            // case1(left side heap has more elements)
            if(smaller.size() > greater.size())
            {
                if(x < med)
                {
                    greater.add(smaller.remove());
                    smaller.add(x);
                }
                else
                    greater.add(x);
                med = (smaller.peek() + greater.peek())/2;
            }

            // case2(both heaps are balanced)
            else if(smaller.size() == greater.size())
            {
                if(x < med)
                {
                    smaller.add(x);
                    med = smaller.peek();
                }
                else
                {
                    greater.add(x);
                    med = greater.peek();
                }
            }

            // case3(right side heap has more elements)
            else
            {
                if(x > med)
                {
                    smaller.add(greater.remove());
                    greater.add(x);
                }
                else
                    smaller.add(x);
                med = (smaller.peek() + greater.peek())/2;

            }
            System.out.println(med);
        }
    }

    // Driver code
    public static void main(String []args)
    {

        // stream of integers
        //int[] arr = new int[]{5, 15, 10, 20, 3};
        int[] arr = new int[]{5, 4, 3, 2, 1};
        printMedian(arr);
    }
}
