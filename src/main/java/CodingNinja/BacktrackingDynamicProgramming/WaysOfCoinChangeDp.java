package CodingNinja.BacktrackingDynamicProgramming;

public class WaysOfCoinChangeDp {

    /**
     * Ways To Make Coin Change
     * Send Feedback
     * You are given an infinite supply of coins of each of denominations D = {D0, D1, D2, D3, ...... Dn-1}. You need to figure out the total number of ways W, in which you can make change for Value V using coins of denominations D.
     * Note : Return 0, if change isn't possible.
     * Input Format
     * Line 1 : Integer n i.e. total number of denominations
     * Line 2 : N integers i.e. n denomination values
     * Line 3 : Value V
     * Output Format
     * Line 1 :  Number of ways i.e. W
     * Constraints :
     * 1<=n<=10
     * 1<=V<=1000
     * Sample Input 1 :
     * 3
     * 1 2 3
     * 4
     * Sample Output
     * 4
     * Sample Output Explanation :
     * Number of ways are - 4 total i.e. (1,1,1,1), (1,1, 2), (1, 3) and (2, 2).
     */

    public static int countWaysToMakeChange(int denominations[], int value){
        int m = denominations.length;
        int n = value;

        int dp[][]= new int[m][n+1];

        for(int i=0;i<m; i++){
            dp[i][0] = 1;
        }

        for(int j=1; j<=n; j++){
            dp[0][j] = j%denominations[0] == 0 ? 1 : 0;
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<=n; j++){
                if(denominations[i]>j){
                    dp[i][j] = dp[i-1][j];
                }
                else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-denominations[i]];
                }
            }
        }
        return dp[m-1][n];
    }

    public static void main(String [] args){
        int arr[] = {1,2,3};
        int value = 4;
        System.out.println(countWaysToMakeChange(arr, value));
    }
}
