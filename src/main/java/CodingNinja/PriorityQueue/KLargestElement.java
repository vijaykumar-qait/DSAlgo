package CodingNinja.PriorityQueue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLargestElement {
    /**
     *Code : K largest elements
     * Send Feedback
     * You are given with an integer k and an array of integers that contain numbers in random order. Write a program to find k
     * largest numbers from given array. You need to save them in an array and return it.
     * Time complexity should be O(nlogk) and space complexity should be not more than O(k).
     * Order of elements in the output is not important.
     * Input Format :
     * Line 1 : Size of array (n)
     * Line 2 : Array elements (separated by space)
     * Line 3 : Integer k
     * Output Format :
     * k largest elements
     * Sample Input :
     * 13
     * 2 12 9 16 10 5 3 20 25 11 1 8 6
     * 4
     * Sample Output :
     * 12
     * 16
     * 20
     * 25
     */

    public static ArrayList<Integer> kLargest(int input[], int k) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=0;
        for(; i<k; i++){
            pq.add(input[i]);
        }

        for(; i<input.length; i++){
            if(input[i] > pq.peek()){
                pq.remove();
                pq.add(input[i]);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        while(!pq.isEmpty()){
            list.add(pq.remove());
        }
        return list;
    }

    public static void main(String[] args){
        //int arr[] = {2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6};
        //int k = 4;

        //int arr[] = {9, 4, 8, 7, 11, 3};
        //int k = 2;

        int arr[] = {2, 6, 10, 11, 13, 4, 1, 20};
        int k = 4;

        System.out.println(kLargest(arr, k).toString());
    }
}
