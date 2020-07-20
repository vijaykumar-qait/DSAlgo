package CodingNinja.BacktrackingDynamicProgramming;

public class MaxSumSubArray {
    /**
     * Code : Max sum sub-array
     * Send Feedback
     * Given an integer array containing both negative and positive integers. Find and return the sum of contiguous sub-array with maximum sum.
     * Input Format :
     * Line 1: Integer N, size of input array
     * Line 2: N integers, elements of input array (separated by space)
     * Output Format :
     * Maximum Sum of the contiguous sub-array
     * Contraints :
     * 1 = N = 1000
     * -100 = A[i] <= 100
     * Sample Input 1:
     * 3
     * 1 2 3
     * Sample Output 1:
     * 6
     * Sample Input 2:
     * 4
     * -1 -2 -3 -4
     * Sample Output 2:
     * -1
     */

    public static int findSum(int arr[],int n){
        int dp[] = new int[n];
        if(arr[0]<0){
            dp[0] = 0;
        }
        else {
            dp[0] = arr[0];
        }

        int maxValue = Integer.MIN_VALUE;
        int maxSoFar = 0;

        for(int i=1; i<n; i++){
            maxSoFar = dp[i-1] + arr[i];
            if(maxSoFar<0){
                dp[i] = 0;
            }
            else {
                dp[i] = maxSoFar;
            }

            if(maxSoFar>maxValue){
                maxValue = maxSoFar;
            }
        }
        if(maxValue<arr[0]){
            maxValue=arr[0];
        }
        return maxValue;
    }

    public static void main(String [] args){
        int arr[] = {1,2,3};
        int n = arr.length;
        System.out.print(findSum(arr,n));
    }
}
