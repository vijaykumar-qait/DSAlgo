package CodingNinja.BacktrackingDynamicProgramming;

public class MinCostPath {

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

    public static int minCostPath(int input[][], int i, int j) {
        int row = input.length;
        int col = input[0].length;

        if(i==row-1 && j==col-1){
            return input[i][j];
        }

        if(i>row-1 || j>col-1){
            return Integer.MAX_VALUE;
        }

        int opt1 = minCostPath(input, i, j+1);
        int opt2 = minCostPath(input, i+1, j+1);
        int opt3 = minCostPath(input, i+1, j);

        return input[i][j] + Math.min(opt1, Math.min(opt2, opt3));
    }

    public static int minCostPath(int input[][]) {
        return minCostPath(input, 0, 0);
    }

    public static void main(String [] args){
        int input[][] = {{3,4,1,2},
                {2,1,8,9},
                {4,7,8,1}};

        System.out.println(minCostPath(input));
    }
}
