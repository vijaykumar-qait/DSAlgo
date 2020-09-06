package test;

import java.util.Scanner;

public class CountTheTurtlesThatCommunicate {

    public int countTurtles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int communication=0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){

                if(!(grid[i][j] == 0)){
                    boolean flag = false;
                    if(j>0){
                        if(grid[i][j] == grid[i][j-1]){
                            flag = true;
                        }
                    }

                    if(!flag){
                        if(i>0){
                            if(grid[i][j] == grid[i-1][j]){
                                flag = true;
                            }
                        }
                    }

                    if(!flag){
                        if(j<n-1){
                            if(grid[i][j] == grid[i][j+1]){
                                flag = true;
                            }
                        }
                    }

                    if(!flag){
                        if(i<m-1){
                            if(grid[i][j] == grid[i+1][j]){
                                flag = true;
                            }
                        }
                    }

                    if(flag){
                        communication++;
                    }
                }

            }
        }
        return communication;
    }

    public int countTurtles2(int[][] grid) {
        if (grid.length < 1) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;

        int communication = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!(grid[i][j] == 0)) {

                    boolean flag = false;

                    int count = 0;

                    for (int k = 0; k < m; k++) {
                        if (grid[k][j] == 1) {
                            count++;
                        }
                    }

                    if (count > 1) {
                        flag = true;
                    }

                    if (!flag) {
                        count = 0;

                        for (int k = 0; k < n; k++) {
                            if (grid[i][k] == 1) {
                                count++;
                            }
                        }

                        if (count > 1) {
                            flag = true;
                        }
                    }

                    if (flag) {
                        communication++;
                    }

                }
            }
        }
        return communication;
    }


    public int countTurtles3(int[][] grid) {
        if(grid.length<1){
                return 0;
        }

        int m = grid.length;
        int n = grid[0].length;

        int communication=0;

        int row[] = new int[m];
        int col[] = new int[n];

        for(int i=0; i<m; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                sum+=grid[i][j];
            }
            row[i] = sum;
        }

        for(int j=0; j<n; j++){
            int sum = 0;
            for(int i=0; i<m; i++){
                sum+=grid[i][j];
            }
            col[j] = sum;
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){

                if(!(grid[i][j] == 0)){

                    if(row[i] > 1 || col[j] > 1){
                        communication++;
                    }

                }
            }
        }


        return communication;
    }




    /**
     * 4 4
     * 1 1 0 1
     * 0 1 0 0
     * 1 1 1 1
     * 0 0 0 1
     * ans - 9
     *
     *
     *
     * 4 4
     * 1 1 0 1
     * 0 1 0 0
     * 1 1 1 1
     * 0 0 0 1
     * Ans - 9
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] grid = new int[m][n];

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                grid[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        int result = new CountTheTurtlesThatCommunicate().countTurtles3(grid);
        System.out.println(result);
    }
}
