package CodingNinja.BacktrackingDynamicProgramming;

public class MinimumCostPathDP {
    /**
     * Code : Minimum Cost Path
     * Send Feedback
     * Given an integer matrix of size m*n, you need to find out the value of minimum cost to reach from the cell (0, 0) to (m-1, n-1).
     * From a cell (i, j), you can move in three directions : (i+1, j), (i, j+1) and (i+1, j+1).
     * Cost of a path is defined as the sum of values of each cell through which path passes.
     * Input Format :
     * Line 1 : Two integers, m and n
     * Next m lines : n integers of each row (separated by space)
     * Output Format :
     * Minimum cost
     * Constraints :
     * 1 <= m, n <= 20
     * Sample Input 1 :
     * 3 4
     * 3 4 1 2
     * 2 1 8 9
     * 4 7 8 1
     * Sample Output 1 :
     * 13
     *
     */

    public static int minCostPath(int input[][]) {
        int row = input.length;
        int col = input[0].length;

        int dp[][] = new int[row][col];

        dp[row-1][col-1] = input[row-1][col-1];

        for(int i=col-2; i>=0; i--){
            dp[row-1][i] = input[row-1][i] + dp[row-1][i+1];
        }

        for(int i=row-2; i>=0; i--){
            dp[i][col-1] = input[i][col-1] + dp[i+1][col-1];
        }

        for(int i=row-2; i>=0; i--){
            for(int j=col-2; j>=0; j--){
                dp[i][j] = input[i][j] + Math.min(dp[i][j+1], Math.min(dp[i+1][j+1], dp[i+1][j]));
            }
        }
        return dp[0][0];
    }

    public static void main(String [] args){
        int input[][] = {{3,4,1,2},
                {2,1,8,9},
                {4,7,8,1}};

        System.out.println(minCostPath(input));
    }

}
