package CodingNinja.BacktrackingDynamicProgramming;

import java.util.Scanner;

public class MaxSumRectangle {
    /**
     * Max Sum Rectangle
     * Send Feedback
     * Given a 2D array, find the maximum sum rectangle in it. In other words find maximum sum over all rectangles in the matrix.
     * Input
     * First line contains 2 numbers n and m denoting number of rows and number of columns. Next n lines contain m space separated integers denoting elements of matrix nxm.
     * Output
     * Output a single integer, maximum sum rectangle.
     * Constraints
     * 1<=n,m<=100
     * Sample Input
     * 4 5
     * 1 2 -1 -4 -20
     * -8 -3 4 2 1
     * 3 8 10 1 3
     * -4 -1 1 7 -6
     * Sample Output
     * 29
     */

    private static int maxSumRectangle(int [][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int preSum[][] = new int[m+1][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                preSum[i+1][j] = preSum[i][j] + mat[i][j];
            }
        }

        int maxSum = -1;
        int minSum = Integer.MIN_VALUE;
        int negRow = 0, negCol = 0;
        int rStart = 0, rEnd = 0, cStart = 0, cEnd = 0;
        for(int rowStart = 0; rowStart < m; rowStart++) {
            for(int row = rowStart; row < m; row++){
                int sum = 0;
                int curColStart = 0;
                for(int col = 0; col < n; col++) {
                    sum += preSum[row+1][col] - preSum[rowStart][col];
                    if(sum < 0) {
                        if(minSum < sum) {
                            minSum = sum;
                            negRow = row;
                            negCol = col;
                        }
                        sum = 0;
                        curColStart = col+1;
                    }
                    else if(maxSum < sum) {
                        maxSum = sum;
                        rStart = rowStart;
                        rEnd = row;
                        cStart = curColStart;
                        cEnd = col;
                    }
                }
            }
        }
        return maxSum == -1 ? minSum : maxSum;
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int testcases = scanner.nextInt();

        for(int k = 0; k<testcases; k++){

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            int matrix[][] = new int[row][col];

            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    matrix[i][j] = scanner.nextInt();
                }
            }



        }

        int row = scanner.nextInt();
        int col = scanner.nextInt();

        int matrix[][] = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

//        System.out.println(maxSumRectangle(matrix));
    }
}
