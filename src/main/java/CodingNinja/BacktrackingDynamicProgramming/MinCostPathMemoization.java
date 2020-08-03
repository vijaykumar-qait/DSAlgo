package CodingNinja.BacktrackingDynamicProgramming;

public class MinCostPathMemoization {
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
    public static int minCostPath(int input[][], int i, int j, int storage[][]){
        int row = input.length;
        int col = input[0].length;

        if(i==row-1 && j==col-1){
            storage[i][j] = input[i][j];
            return input[i][j];
        }

        if(i>row-1 || j>col-1){
            return Integer.MAX_VALUE;
        }

        if(storage[i][j]!=-1){
            return storage[i][j];
        }

        int opt1 = minCostPath(input, i, j+1, storage);
        int opt2 = minCostPath(input, i+1, j+1, storage);
        int opt3 = minCostPath(input, i+1, j, storage);

        storage[i][j] = input[i][j] + Math.min(opt1, Math.min(opt2, opt3));
        return storage[i][j];
    }

    public static int minCostPath(int input[][]) {
        int row = input.length;
        int col = input[0].length;
        int storage[][] = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                storage[i][j] = -1;
            }
        }
        return minCostPath(input,0,0,storage);
    }

    public static void main(String [] args ){
        int input[][] = {{3,4,1,2},
                {2,1,8,9},
                {4,7,8,1}};

        System.out.println(minCostPath(input));
    }
}
