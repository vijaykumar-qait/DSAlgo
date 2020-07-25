package CodingNinja.BacktrackingDynamicProgramming;

public class NumberOfAPs {
    /**
     * Number of APs
     * Send Feedback
     * Given an array of n positive integers. The task is to count the number of Arithmetic Progression subsequences in the array. As the answer could be very large, output it modulo 100001.
     * Note: Empty sequence or single element sequence is Arithmetic Progression.
     * Input Format:
     * First Line: N (the size of the array)
     * Second Line: Elements of the array separated by spaces.
     * Output:
     *  Print total number of subsequences
     * Input Constraints:
     * 1 <= arr[i] <= 1000
     * 1 <= sizeof(arr) <= 1000
     * Sample Input 1 :
     * 3
     * 1 2 3
     * Sample output:
     * 8
     * Sample Output Explanation:
     * Total subsequence are: {}, { 1 }, { 2 }, { 3 }, { 1, 2 }, { 2, 3 }, { 1, 3 }, { 1, 2, 3 }
     * Sample Input 2:
     * 7
     * 1 2 3 4 5 9 10
     * Sample Output:
     * 37
     */

    public static int numOfAP(int arr[], int N){
        int minElement = Integer.MAX_VALUE, maxElement=Integer.MIN_VALUE;

        for(int i=0; i<N; i++){
            minElement = Math.min(minElement, arr[i]);
            maxElement = Math.max(maxElement, arr[i]);
        }

        int dp[] = new int[N+1];
        int totalAPs = N+1;

        for(int d = (minElement-maxElement); d<=(maxElement-minElement); d++){
            int sum [] = new int[1001];
            for(int i=0; i<1001; i++){
                sum[i] = 0;
            }

            for(int i=0; i<N; i++){
                dp[i] = 1;
                if(arr[i]-d >= 1 && arr[i]-d <= 1000){
                    dp[i] +=sum[arr[i]-d];
                }
                totalAPs += (dp[i]-1)%100001;
                sum[arr[i]] += dp[i];
            }
        }
        return totalAPs%100001;
    }

    public static void main(String [] args){
        int arr[] = {1,2,3};
        int N = 3;

        System.out.println(numOfAP(arr, N));
    }
}
