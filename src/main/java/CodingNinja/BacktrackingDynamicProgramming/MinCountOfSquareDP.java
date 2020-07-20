package CodingNinja.BacktrackingDynamicProgramming;

public class MinCountOfSquareDP {
    /**
     * Code: Minimum Count of Squares
     * Send Feedback
     * Given an integer N, find and return the count of minimum numbers, sum of whose squares is equal to N.
     * That is, if N is 4, then we can represent it as : {1^2 + 1^2 + 1^2 + 1^2} and {2^2}. Output will be 1, as 1 is the minimum count of numbers required.
     * Note : x^y represents x raise to the power y.
     * Input Format :
     * Integer N
     * Output Format :
     * Required minimum count
     * Constraints :
     * 1 <= N <= 1000
     * Sample Input 1 :
     * 12
     * @param n
     * @return
     */

    public static int minCount(int n) {
        int dp[] = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for(int i=4; i<=n; i++){
            int res = i;

            for(int j=1; j*j<=i; j++){
                int temp = j*j;
                res = Math.min(res, dp[i-temp]);
            }
            dp[i] = res+1;
        }
        return dp[n];
    }
    public static void main(String [] args){
        int n = 10;
        System.out.println(minCount(n));
    }
}
