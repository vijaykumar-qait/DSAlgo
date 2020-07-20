package CodingNinja.BacktrackingDynamicProgramming;

import java.util.Arrays;
import java.util.Collections;

public class LongestIncreasingSubsequence {

    /**
     * Code : LIS
     * Send Feedback
     * Given an array with N elements, you need to find the length of the longest subsequence of a given sequence such that all elements of the subsequence are sorted in strictly increasing order.
     * Input Format
     * Line 1 : An integer N
     * Line 2 : Elements of arrays separated by spaces
     * Output Format
     * Line 1 : Length of longest subsequence
     * Input Constraints
     * 1 <= n <= 10^3
     * Sample Input :
     * 6
     * 5 4 11 1 16 8
     * Sample Output 1 :
     * 3
     * Sample Output Explanation
     * Length of longest subsequence is 3 i.e. (5,11,16) or (4,11,16).
     * Sample Input 2:
     * 3
     * 1 2 2
     * Sample Output 2 :
     * 2
     */

    public static int lis(int arr[]) {

        /*Your class should be named Solution.
         *Don't write main().
         *Don't take input, it is passed as function argument.
         *Don't print output.
         *Taking input and printing output is handled automatically.
         */
        int dp [] = new int[arr.length+1];

        dp[0] = 1;
        int longestIncreasingSequenceCount = 0;

        for(int i=1; i<arr.length; i++){
            int max = 0;
            for(int j=i-1; j>=0; j--){
                if(arr[i]>arr[j]){
                    if(max<dp[j]){
                        max = dp[j];
                    }
                }
            }
            dp[i] = max+1;
            if(dp[i]>longestIncreasingSequenceCount){
                longestIncreasingSequenceCount = dp[i];
            }
        }
        return longestIncreasingSequenceCount;
    }

    public static void main(String [] args){
        //int arr[] = {5, 4, 11, 1, 16, 8};
        int arr[] = {1,2,2};
        System.out.println(lis(arr));
    }
}
