package GFG.DP;

import java.util.Scanner;

public class PadovanSequence {

    /**
     * A Padovan Sequence is a sequence which is represented by the following recurrence
     * P(N) = P(N-2) + P(N-3)
     * P(0) = P(1) = P(2) = 1
     * Now given a number N your task is to find the Nth number in this sequence.
     *
     * Note: Since the output could be very long take mod 1000000007
     *
     * Input:
     * The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each line contains an integer N.
     *
     * Output:
     * For each test case, in a new line, print the nth no of the Padovan sequence.
     *
     * Constraints:
     * 1<=T<=100
     * 1<=N<=100
     *
     * Example:
     * Input:
     * 2
     * 12
     * 4
     * Output:
     * 21
     * 2
     * @param num
     * @return
     */

    static int padovanSequence(int num){
        int dp[] = new int[num+1];
        dp[0]=dp[1]=dp[2]=1;
        for(int i=3; i<=num; i++){
            dp[i] = (dp[i-2] + dp[i-3])%1000000007;
        }
        return dp[num];
    }
    public static void main(String args[]){
//        int num = 4;
//        System.out.print(padovanSequence(num));

        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for(int i=0; i<testCase; i++){
            int num = scanner.nextInt();
            System.out.println(padovanSequence(num));;
        }
    }
}
