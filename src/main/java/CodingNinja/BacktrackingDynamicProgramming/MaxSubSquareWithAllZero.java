package CodingNinja.BacktrackingDynamicProgramming;

public class MaxSubSquareWithAllZero {
    /**
     * Code : Max sub-square with all 0s
     * Send Feedback
     * Given a n*m matrix which contains only 0s and 1s, find out the size of maximum square sub-matrix with all 0s. You need to return the size of square with all 0s.
     * Input format :
     * Line 1 : n and m (space separated positive integers)
     * Next n lines : m elements of each row (separated by space).
     * Output Format:
     * Line 1 : Size of maximum square sub-matrix
     * Sample Input :
     * 3 3
     * 1 1 0
     * 1 1 1
     * 1 1 1
     * Sample Output :
     * 1
     */

    public static int findMaxSquareWithAllZeros(int[][] input){
         int m = input.length;
         int n = input[0].length;

         int dp[][] = new int[m][n];

         for(int j=0; j<n; j++){
             dp[0][j] = input[0][j]==0 ? 1 : 0;
         }

         for(int i=0; i<m; i++){
             dp[i][0] = input[i][0] == 0 ? 1 : 0;
         }

         for(int i=1; i<m; i++){
             for(int j=1; j<n ;j++){
                 dp[i][j] = input[i][j] == 1 ? 0 : 1 + Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
             }
         }

         int maxSquareWithAllZero = 0;

         for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(dp[i][j]>maxSquareWithAllZero){
                    maxSquareWithAllZero = dp[i][j];
                }
            }
         }
        return maxSquareWithAllZero;
    }

    public static void main(String [] args){

        int input[][] = {{1, 0, 0, 1, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1}};

        System.out.println(findMaxSquareWithAllZeros(input));
    }
}
