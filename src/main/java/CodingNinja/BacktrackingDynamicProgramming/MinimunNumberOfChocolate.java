package CodingNinja.BacktrackingDynamicProgramming;

import java.util.Arrays;

public class MinimunNumberOfChocolate {
    /**
     * Minimum Number of Chocolates
     * Send Feedback
     * Noor is a teacher. She wants to give some chocolates to the students in her class. All the students sit in a line and each of them has a score according to performance. Noor wants to give at least 1 chocolate to each student. She distributes chocolates to them such that If two students sit next to each other then the one with the higher score must get more chocolates. Noor wants to save money, so she wants to minimise the total number of chocolates.
     * Note that when two students have equal score they are allowed to have different number of chocolates.
     * Input Format:
     * First Line: Integer N, the number of students in Noor’s class.
     * Second Line: Each of the student's score separated by spaces.
     * Output Format:
     * Output a single line containing the minimum number of chocolates Noor must give.
     * Input Constraints
     *  1 <= N <= 100000
     *  1 <= score <= 100000
     * Sample Input:
     * 4
     * 1 4 4 6
     * sample Output:
     * 6
     * Sample Input:
     * 3
     * 8 7 5
     * sample Output:
     * 6
     */

    public static int getMin(int arr[], int N){
        int dp[] = new int[N];
        dp[0] = 1;
        for(int i=1; i<N; i++){
            if(arr[i]>arr[i-1]){
                dp[i] = dp[i-1]+1;
            }
            else {
                dp[i] = 1;
            }
        }

        for(int i=N-2; i>=0; i--){
            if(arr[i]>arr[i+1] && dp[i]<=dp[i+1]){
                dp[i] = dp[i+1]+1;
            }
        }

        int sum = 0;

        //System.out.println(Arrays.toString(dp));

        for(int i=0; i<N; i++){
            sum+=dp[i];
        }

        return sum;
    }

    public static void main(String [] args){
        int arr[]  = {8,7,6};
        int N =3;
        System.out.println(getMin(arr, N));
    }
}
